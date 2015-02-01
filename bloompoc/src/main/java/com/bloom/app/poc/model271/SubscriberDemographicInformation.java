package com.bloom.app.poc.model271;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class SubscriberDemographicInformation implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	private String dateTimePeriodFormatQualifier;   // D8 - CCYYMMDD
	private String dateTimePeriod;					// Subscriber Birth Date
	private String genderCode;						// M/F/U  unknown
	
	public String getDateTimePeriodFormatQualifier() {
		return dateTimePeriodFormatQualifier;
	}
	public void setDateTimePeriodFormatQualifier(String dateTimePeriodFormatQualifier) {
		this.dateTimePeriodFormatQualifier = dateTimePeriodFormatQualifier;
	}
	public String getDateTimePeriod() {
		return dateTimePeriod;
	}
	public void setDateTimePeriod(String dateTimePeriod) {
		this.dateTimePeriod = dateTimePeriod;
	}
	public String getGenderCode() {
		return genderCode;
	}
	public void setGenderCode(String genderCode) {
		this.genderCode = genderCode;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}


}
