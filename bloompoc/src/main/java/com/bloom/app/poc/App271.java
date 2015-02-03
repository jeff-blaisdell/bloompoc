package com.bloom.app.poc;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

import javax.xml.transform.stream.StreamSource;

import org.apache.http.client.ClientProtocolException;
import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;
import org.milyn.Smooks;
import org.milyn.SmooksException;
import org.milyn.container.ExecutionContext;
import org.milyn.event.report.HtmlReportGenerator;
import org.xml.sax.SAXException;

import com.bloom.app.poc.model271.Response271;

public class App271 {
	
	private byte[] messageIn;

	private final Smooks smooks;

	protected App271() throws IOException, SAXException {
		// Instantiate Smooks with the config...
		smooks = new Smooks("smooks-271-config.xml");
	}
	
	public static void main(String[] args) throws IOException, SAXException, SmooksException {
		App271 app = new App271();
		app.processResponse271();
	}
	
	private void processResponse271() throws SmooksException, IOException, SAXException {
		
		messageIn = readInputMessage();
		
		System.out.println("\n\n==============Message In==============");
		System.out.println(new String(messageIn));
		System.out.println("======================================\n");

		pause("The EDI input stream can be seen above.  Press 'enter' to see how this stream is transformed the Order Object graph...");

		ExecutionContext executionContext = smooks.createExecutionContext();
		org.milyn.payload.JavaResult result = runSmooksTransform(executionContext);

		System.out.println("\n==============EDI as Java Object Graph=============");
		Response271 response = (Response271) result.getBean("response271");

		System.out.println(response);
		System.out.println("======================================\n\n");
		System.out.println("DONE !!!\n\n");
		
	}

	protected org.milyn.payload.JavaResult runSmooksTransform(
			ExecutionContext executionContext) throws IOException,
			SAXException, SmooksException {
		try {
			Locale defaultLocale = Locale.getDefault();
			Locale.setDefault(new Locale("en", "IE"));

			org.milyn.payload.JavaResult javaResult = new org.milyn.payload.JavaResult();

			// Configure the execution context to generate a report...
			executionContext.setEventListener(new HtmlReportGenerator(
					"target/report/report271.html"));

			// Filter the input message to the outputWriter, using the execution
			// context...
			smooks.filterSource(executionContext, new StreamSource(new ByteArrayInputStream(messageIn)), javaResult);

			Locale.setDefault(defaultLocale);

			return javaResult;
		} finally {
			smooks.close();
		}
	}

	private byte[] readInputMessage() {
		String response = hitRestService();
		return response.getBytes();
	}
	
	private String hitRestService() {

		StringBuffer output = new StringBuffer();
		try {

			ClientRequest request = new ClientRequest(
					"http://ebjavasamplea-fsjrx-env.elasticbeanstalk.com/rest/eligibility/b");
					//"http://localhost:8080/bloom-0.0.1-SNAPSHOT/rest/eligibility/b");
			request.accept("application/json");
			ClientResponse<String> response = request.get(String.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					new ByteArrayInputStream(response.getEntity().getBytes())));

			String line = null;
			System.out.println("Output from Server .... \n");
			while ((line = br.readLine()) != null) {
				output.append(line + "\n");
			}

		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return output.toString();
	}

	private void pause(String message) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("> " + message);
			in.readLine();
		} catch (IOException e) {
		}
		System.out.println("\n");
	}

	public org.milyn.payload.JavaResult runSmooksTransform() throws IOException, SAXException {
		ExecutionContext executionContext = smooks.createExecutionContext();
		return runSmooksTransform(executionContext);
	}
}
