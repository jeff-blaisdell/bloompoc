package com.bloom.app.poc.model271;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class EligibilityOrBenefitInformation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String eligibilityOrBenefitInformation;
	private String coverageLevelCode;
	private String serviceTypeCode;
	private String insuranceTypeCode;
	private String planCoverageDescription;
	private String timePeriodQualifier;
	private String monetaryAmount;
	private String percent;
	private String yesNoConditionOrResponseCode;
	
	public String getEligibilityOrBenefitInformation() {
		return eligibilityOrBenefitInformation;
	}
	public void setEligibilityOrBenefitInformation(String eligibilityOrBenefitInformation) {
		this.eligibilityOrBenefitInformation = eligibilityOrBenefitInformation;
	}
	public String getCoverageLevelCode() {
		return coverageLevelCode;
	}
	public void setCoverageLevelCode(String coverageLevelCode) {
		this.coverageLevelCode = coverageLevelCode;
	}
	public String getServiceTypeCode() {
		return serviceTypeCode;
	}
	public void setServiceTypeCode(String serviceTypeCode) {
		this.serviceTypeCode = serviceTypeCode;
	}
	public String getInsuranceTypeCode() {
		return insuranceTypeCode;
	}
	public void setInsuranceTypeCode(String insuranceTypeCode) {
		this.insuranceTypeCode = insuranceTypeCode;
	}
	public String getPlanCoverageDescription() {
		return planCoverageDescription;
	}
	public void setPlanCoverageDescription(String planCoverageDescription) {
		this.planCoverageDescription = planCoverageDescription;
	}
	public String getTimePeriodQualifier() {
		return timePeriodQualifier;
	}
	public void setTimePeriodQualifier(String timePeriodQualifier) {
		this.timePeriodQualifier = timePeriodQualifier;
	}
	public String getMonetaryAmount() {
		return monetaryAmount;
	}
	public void setMonetaryAmount(String monetaryAmount) {
		this.monetaryAmount = monetaryAmount;
	}
	public String getPercent() {
		return percent;
	}
	public void setPercent(String percent) {
		this.percent = percent;
	}
	public String getYesNoConditionOrResponseCode() {
		return yesNoConditionOrResponseCode;
	}
	public void setYesNoConditionOrResponseCode(String yesNoConditionOrResponseCode) {
		this.yesNoConditionOrResponseCode = yesNoConditionOrResponseCode;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
