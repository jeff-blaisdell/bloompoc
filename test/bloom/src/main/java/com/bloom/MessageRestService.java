package com.bloom;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/eligibility")
public class MessageRestService { 
	
	@GET
	@Path("/{param}")
	public Response eligibility(@PathParam("param") String msg) {
 
		String result = "ISA*00* *00* *01*091712414 *ZZ*TPNAME *030124*0900*U*00401*100000001*0*P*^~\n"
				+ "GS*HB*952931460*TPNAME*20030124*0900*1*X*004010X092~\n"
				+ "ST*271*0001~\n"
				+ "BHT*0022*11*100000001*20030124*0900~\n"
				+ "HL*1**20*1~\n"
				+ "NM1*PR*2*PACIFICARE OF CALIFORNIA*****FI*952931460~\n"
				+ "PER*IC*EDI SUPPORT*TE*8002037729~\n"
				+ "SE*42*0001~\n"
				+ "GE*1*0001~\n"
				+ "IEA*1*100000001~\n"
				;
		
 
		return Response.status(200).entity(result).build();
 
	} 
 
}