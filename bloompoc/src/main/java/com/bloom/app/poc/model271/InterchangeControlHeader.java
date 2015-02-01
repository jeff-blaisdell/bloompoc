package com.bloom.app.poc.model271;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class InterchangeControlHeader implements Serializable {

	private static final long serialVersionUID = 1L;

	private String authorizationInformationQualifier;
	private String authorizationInformation;
	private String securityInformationQualifier;
	private String securityInformation;
	private String interchangeIDQualifierSender;
	private String interchangeSenderID;
	private String interchangeIDQualifierReceiver;
	private String interchangeReceiverID;
	private String interchangeDate; //YYMMDD
	private String interchangeTime; // HHMM
	private String interchangeControlStandardsIdentifier;
	private String interchangeControlVersionNumber;
	private String interchangeControlNumber;
	private String acknowledgmentRequested;
	private String usageIndicator;
	private String componentElementSeparator;

	public String getAuthorizationInformationQualifier() {
		return authorizationInformationQualifier;
	}

	public void setAuthorizationInformationQualifier(String authorizationInformationQualifier) {
		this.authorizationInformationQualifier = authorizationInformationQualifier;
	}

	public String getAuthorizationInformation() {
		return authorizationInformation;
	}

	public void setAuthorizationInformation(String authorizationInformation) {
		this.authorizationInformation = authorizationInformation;
	}

	public String getSecurityInformationQualifier() {
		return securityInformationQualifier;
	}

	public void setSecurityInformationQualifier(String securityInformationQualifier) {
		this.securityInformationQualifier = securityInformationQualifier;
	}

	public String getSecurityInformation() {
		return securityInformation;
	}

	public void setSecurityInformation(String securityInformation) {
		this.securityInformation = securityInformation;
	}

	public String getInterchangeIDQualifierSender() {
		return interchangeIDQualifierSender;
	}

	public void setInterchangeIDQualifierSender(String interchangeIDQualifierSender) {
		this.interchangeIDQualifierSender = interchangeIDQualifierSender;
	}

	public String getInterchangeSenderID() {
		return interchangeSenderID;
	}

	public void setInterchangeSenderID(String interchangeSenderID) {
		this.interchangeSenderID = interchangeSenderID;
	}

	public String getInterchangeIDQualifierReceiver() {
		return interchangeIDQualifierReceiver;
	}

	public void setInterchangeIDQualifierReceiver(String interchangeIDQualifierReceiver) {
		this.interchangeIDQualifierReceiver = interchangeIDQualifierReceiver;
	}

	public String getInterchangeReceiverID() {
		return interchangeReceiverID;
	}

	public void setInterchangeReceiverID(String interchangeReceiverID) {
		this.interchangeReceiverID = interchangeReceiverID;
	}

	public String getInterchangeDate() {
		return interchangeDate;
	}

	public void setInterchangeDate(String interchangeDate) {
		this.interchangeDate = interchangeDate;
	}

	public String getInterchangeTime() {
		return interchangeTime;
	}

	public void setInterchangeTime(String interchangeTime) {
		this.interchangeTime = interchangeTime;
	}

	public String getInterchangeControlStandardsIdentifier() {
		return interchangeControlStandardsIdentifier;
	}

	public void setInterchangeControlStandardsIdentifier(String interchangeControlStandardsIdentifier) {
		this.interchangeControlStandardsIdentifier = interchangeControlStandardsIdentifier;
	}

	public String getInterchangeControlVersionNumber() {
		return interchangeControlVersionNumber;
	}

	public void setInterchangeControlVersionNumber(String interchangeControlVersionNumber) {
		this.interchangeControlVersionNumber = interchangeControlVersionNumber;
	}

	public String getInterchangeControlNumber() {
		return interchangeControlNumber;
	}

	public void setInterchangeControlNumber(String interchangeControlNumber) {
		this.interchangeControlNumber = interchangeControlNumber;
	}

	public String getAcknowledgmentRequested() {
		return acknowledgmentRequested;
	}

	public void setAcknowledgmentRequested(String acknowledgmentRequested) {
		this.acknowledgmentRequested = acknowledgmentRequested;
	}

	public String getUsageIndicator() {
		return usageIndicator;
	}

	public void setUsageIndicator(String usageIndicator) {
		this.usageIndicator = usageIndicator;
	}

	public String getComponentElementSeparator() {
		return componentElementSeparator;
	}

	public void setComponentElementSeparator(String componentElementSeparator) {
		this.componentElementSeparator = componentElementSeparator;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
