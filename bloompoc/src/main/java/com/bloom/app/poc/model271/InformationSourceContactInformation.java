package com.bloom.app.poc.model271;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class InformationSourceContactInformation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String contactFunctionCode;
	private String name;
	private String communicationNumberQualifier;
	private String communicationNumber;
	
	public String getContactFunctionCode() {
		return contactFunctionCode;
	}
	public void setContactFunctionCode(String contactFunctionCode) {
		this.contactFunctionCode = contactFunctionCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCommunicationNumberQualifier() {
		return communicationNumberQualifier;
	}
	public void setCommunicationNumberQualifier(String communicationNumberQualifier) {
		this.communicationNumberQualifier = communicationNumberQualifier;
	}
	public String getCommunicationNumber() {
		return communicationNumber;
	}
	public void setCommunicationNumber(String communicationNumber) {
		this.communicationNumber = communicationNumber;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
