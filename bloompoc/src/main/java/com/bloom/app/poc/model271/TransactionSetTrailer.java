package com.bloom.app.poc.model271;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class TransactionSetTrailer implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String numberOfIncludedSegments;
	private String transactionSetControlNumber;
	
	public String getNumberOfIncludedSegments() {
		return numberOfIncludedSegments;
	}
	public void setNumberOfIncludedSegments(String numberOfIncludedSegments) {
		this.numberOfIncludedSegments = numberOfIncludedSegments;
	}
	public String getTransactionSetControlNumber() {
		return transactionSetControlNumber;
	}
	public void setTransactionSetControlNumber(String transactionSetControlNumber) {
		this.transactionSetControlNumber = transactionSetControlNumber;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
