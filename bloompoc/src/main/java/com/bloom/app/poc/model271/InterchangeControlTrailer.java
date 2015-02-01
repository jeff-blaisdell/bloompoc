package com.bloom.app.poc.model271;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class InterchangeControlTrailer implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String numberOfIncludedFunctionalGroups;
	private String interchangeControlNumber;
	
	public String getNumberOfIncludedFunctionalGroups() {
		return numberOfIncludedFunctionalGroups;
	}
	public void setNumberOfIncludedFunctionalGroups(String numberOfIncludedFunctionalGroups) {
		this.numberOfIncludedFunctionalGroups = numberOfIncludedFunctionalGroups;
	}
	public String getInterchangeControlNumber() {
		return interchangeControlNumber;
	}
	public void setInterchangeControlNumber(String interchangeControlNumber) {
		this.interchangeControlNumber = interchangeControlNumber;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
