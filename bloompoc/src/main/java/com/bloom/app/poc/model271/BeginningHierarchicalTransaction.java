package com.bloom.app.poc.model271;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class BeginningHierarchicalTransaction implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String hierarchicalStructureCode;   
	private String transactionSetPurposeCode;
	private String referenceIdentification;
	private String date;  // BHT04 R 157 CCYYMMDD - Transaction Set Creation Date.
	private String time;  // BHT05 R 157 HHMMSS - Transaction Set Creation Time.
	private String transactionTypeCode;   // Not used
	
	public String getHierarchicalStructureCode() {
		return hierarchicalStructureCode;
	}
	public void setHierarchicalStructureCode(String hierarchicalStructureCode) {
		this.hierarchicalStructureCode = hierarchicalStructureCode;
	}
	public String getTransactionSetPurposeCode() {
		return transactionSetPurposeCode;
	}
	public void setTransactionSetPurposeCode(String transactionSetPurposeCode) {
		this.transactionSetPurposeCode = transactionSetPurposeCode;
	}
	public String getReferenceIdentification() {
		return referenceIdentification;
	}
	public void setReferenceIdentification(String referenceIdentification) {
		this.referenceIdentification = referenceIdentification;
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
	public String getTransactionTypeCode() {
		return transactionTypeCode;
	}
	public void setTransactionTypeCode(String transactionTypeCode) {
		this.transactionTypeCode = transactionTypeCode;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
