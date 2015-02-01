package com.bloom.app.poc.model271;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class DependentEligibilityBenefitDate implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String dateTimeQualifier;
	private String dateTimePeriodFormatQualifier;
	private String dateTimePeriod;
	
	public String getDateTimeQualifier() {
		return dateTimeQualifier;
	}
	public void setDateTimeQualifier(String dateTimeQualifier) {
		this.dateTimeQualifier = dateTimeQualifier;
	}
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
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
