package com.bloom.app.poc.model271;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class FunctionalGroupHeader implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String functionalIdentifierCode;
	private String applicationSendersCode;
	private String applicationReceiversCode;
	private String date; //CCYYMMDD - Use this date for the functional group creation date
	private String time; //  Creation Time
	private String groupControlNumber; //Must be identical to GE02
	private String responsibleAgencyCode; //X - Accredited Standards Committee X12
	private String versionReleaseIndustryIdentifierCode; //005010X092 
	
	public String getFunctionalIdentifierCode() {
		return functionalIdentifierCode;
	}
	public void setFunctionalIdentifierCode(String functionalIdentifierCode) {
		this.functionalIdentifierCode = functionalIdentifierCode;
	}
	public String getApplicationSendersCode() {
		return applicationSendersCode;
	}
	public void setApplicationSendersCode(String applicationSendersCode) {
		this.applicationSendersCode = applicationSendersCode;
	}
	public String getApplicationReceiversCode() {
		return applicationReceiversCode;
	}
	public void setApplicationReceiversCode(String applicationReceiversCode) {
		this.applicationReceiversCode = applicationReceiversCode;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getGroupControlNumber() {
		return groupControlNumber;
	}
	public void setGroupControlNumber(String groupControlNumber) {
		this.groupControlNumber = groupControlNumber;
	}
	public String getResponsibleAgencyCode() {
		return responsibleAgencyCode;
	}
	public void setResponsibleAgencyCode(String responsibleAgencyCode) {
		this.responsibleAgencyCode = responsibleAgencyCode;
	}
	public String getVersionReleaseIndustryIdentifierCode() {
		return versionReleaseIndustryIdentifierCode;
	}
	public void setVersionReleaseIndustryIdentifierCode(String versionReleaseIndustryIdentifierCode) {
		this.versionReleaseIndustryIdentifierCode = versionReleaseIndustryIdentifierCode;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
