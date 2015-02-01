package com.bloom.app.poc;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

import javax.xml.transform.stream.StreamSource;

import org.milyn.Smooks;
import org.milyn.SmooksException;
import org.milyn.container.ExecutionContext;
import org.milyn.event.report.HtmlReportGenerator;
import org.milyn.io.StreamUtils;
import org.xml.sax.SAXException;

import com.bloom.app.poc.model271.Response271;


public class App271 
{
	private static byte[] messageIn = readInputMessage();

    private final Smooks smooks;

    protected App271() throws IOException, SAXException {
        // Instantiate Smooks with the config...
        smooks = new Smooks("smooks-271-config.xml");
    }

    protected org.milyn.payload.JavaResult runSmooksTransform(ExecutionContext executionContext) throws IOException, SAXException, SmooksException {
    	try {
            Locale defaultLocale = Locale.getDefault();
            Locale.setDefault(new Locale("en", "IE"));

            org.milyn.payload.JavaResult javaResult = new org.milyn.payload.JavaResult();

            // Configure the execution context to generate a report...
            executionContext.setEventListener(new HtmlReportGenerator("target/report/report271.html"));

            // Filter the input message to the outputWriter, using the execution context...
            smooks.filterSource(executionContext, new StreamSource(new ByteArrayInputStream(messageIn)), javaResult);

            Locale.setDefault(defaultLocale);

            return javaResult;
        } finally {
            smooks.close();
        }
    }

    public static void main(String[] args) throws IOException, SAXException, SmooksException {
        System.out.println("\n\n==============Message In==============");
        System.out.println(new String(messageIn));
        System.out.println("======================================\n");

        pause("The EDI input stream can be seen above.  Press 'enter' to see how this stream is transformed the Order Object graph...");

        App271 app = new App271();
        ExecutionContext executionContext = app.smooks.createExecutionContext();
        org.milyn.payload.JavaResult result = app.runSmooksTransform(executionContext);


        System.out.println("\n==============EDI as Java Object Graph=============");
        Response271 response = (Response271) result.getBean("response271");
        System.out.println(response);
        System.out.println("======================================\n\n");

        pause("And that's it!  Press 'enter' to finish...");
    }

    private static byte[] readInputMessage() {
        try {
            return StreamUtils.readStream(new FileInputStream("271-input-message_small.edi"));
        } catch (IOException e) {
            e.printStackTrace();
            return "<no-message/>".getBytes();
        }
    }

    private static void pause(String message) {
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
