package com.bloom.app.poc.model271;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class FunctionalGroupTrailer implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String numberOfTransactionSetsIncluded;
	private String groupControlNumber;
	
	public String getNumberOfTransactionSetsIncluded() {
		return numberOfTransactionSetsIncluded;
	}
	public void setNumberOfTransactionSetsIncluded(String numberOfTransactionSetsIncluded) {
		this.numberOfTransactionSetsIncluded = numberOfTransactionSetsIncluded;
	}
	public String getGroupControlNumber() {
		return groupControlNumber;
	}
	public void setGroupControlNumber(String groupControlNumber) {
		this.groupControlNumber = groupControlNumber;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
	

}
