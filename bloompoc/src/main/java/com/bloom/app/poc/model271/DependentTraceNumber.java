package com.bloom.app.poc.model271;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class DependentTraceNumber implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String traceTypeCode;
	private String referenceIdentificationTraceNumber;	// agreed to by trading partners
	private String originatingCompanyIdentifier;		// agreed to by trading partners
	private String referenceIdentification;				// agreed to by trading partners
	
	public String getTraceTypeCode() {
		return traceTypeCode;
	}
	public void setTraceTypeCode(String traceTypeCode) {
		this.traceTypeCode = traceTypeCode;
	}
	public String getReferenceIdentificationTraceNumber() {
		return referenceIdentificationTraceNumber;
	}
	public void setReferenceIdentificationTraceNumber(String referenceIdentificationTraceNumber) {
		this.referenceIdentificationTraceNumber = referenceIdentificationTraceNumber;
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
