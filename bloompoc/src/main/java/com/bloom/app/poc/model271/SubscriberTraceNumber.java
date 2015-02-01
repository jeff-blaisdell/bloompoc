package com.bloom.app.poc.model271;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class SubscriberTraceNumber implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String traceTypeCode;
	private String traceNumberFromRequest;
	private String originatingCompanyIdentifier;
	private String referenceIdentification;
	
	public String getTraceTypeCode() {
		return traceTypeCode;
	}
	public void setTraceTypeCode(String traceTypeCode) {
		this.traceTypeCode = traceTypeCode;
	}
	public String getTraceNumberFromRequest() {
		return traceNumberFromRequest;
	}
	public void setTraceNumberFromRequest(String traceNumberFromRequest) {
		this.traceNumberFromRequest = traceNumberFromRequest;
	}
	public String getOriginatingCompanyIdentifier() {
		return originatingCompanyIdentifier;
	}
	public void setOriginatingCompanyIdentifier(String originatingCompanyIdentifier) {
		this.originatingCompanyIdentifier = originatingCompanyIdentifier;
	}
	public String getReferenceIdentification() {
		return referenceIdentification;
	}
	public void setReferenceIdentification(String referenceIdentification) {
		this.referenceIdentification = referenceIdentification;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
