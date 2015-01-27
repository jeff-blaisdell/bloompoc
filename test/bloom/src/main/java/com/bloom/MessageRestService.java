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
 
		String result = "ISA*00*          *00*          *ZZ*SENSITIVEDATA  *01*SENSITIVE      " 
				+ "*120801*0400*^*00501*100000094*1*T*:~GS*HC*SENSIT*SENSITIVE*20120801*0400*94*X*005010X222A1~"
				+ "ST*837*100000094*005010X222A1~BHT*0019*00*100000094*20120801*0400*CH~"
				+ "NM1*41*1*PROVIDER*DEMO****46*1856269260~PER*IC*ClearEHR.com*EM*troy@clearehr.com~"
				+ "NM1*40*2*BLUE CROSS BLUE SHIELD OF TEXAS (HCSC)*****46*84980~HL*1**20*1~"
				+ "NM1*85*1*Provider*Demo****XX*1856269260~N3*Address 1*Address 2~N4*Houston*TX*77027~"
				+ "REF*SY*123456789~HL*2*1*22*0~SBR*P*18*216000******ZZ~NM1*IL*1*Client5*Demo****MI*12054054~"
				+ "N3*1234 lucky lane~N4*Houston*TX*77007~DMG*D8*19790302*F~"
				+ "NM1*PR*2*BLUE CROSS BLUE SHIELD OF TEXAS (HCSC)*****PI*84980~"
				+ "CLM*28*500***12:B:1*Y*A*Y*Y~AMT*F5*200~HI*BK:V242~LX*1~SV1*HC:59400*500*UN*1***1~"
				+ "DTP*472*RD8*20120731-20120731~SE*24*100000094~GE*1*94~IEA*1*100000094~";
		
 
		return Response.status(200).entity(result).build();
 
	} 
 
}