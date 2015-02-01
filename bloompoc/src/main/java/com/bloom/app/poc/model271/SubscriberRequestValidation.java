package com.bloom.app.poc.model271;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class SubscriberRequestValidation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String yesNoConditionOrResponseCode;
	private String agencyQualifierCode;
	private String rejectReasonCode;
	private String followupActionCode;
	
	public String getYesNoConditionOrResponseCode() {
		return yesNoConditionOrResponseCode;
	}
	public void setYesNoConditionOrResponseCode(String yesNoConditionOrResponseCode) {
		this.yesNoConditionOrResponseCode = yesNoConditionOrResponseCode;
	}
	public String getAgencyQualifierCode() {
		return agencyQualifierCode;
	}
	public void setAgencyQualifierCode(String agencyQualifierCode) {
		this.agencyQualifierCode = agencyQualifierCode;
	}
	public String getRejectReasonCode() {
		return rejectReasonCode;
	}
	public void setRejectReasonCode(String rejectReasonCode) {
		this.rejectReasonCode = rejectReasonCode;
	}
	public String getFollowupActionCode() {
		return followupActionCode;
	}
	public void setFollowupActionCode(String followupActionCode) {
		this.followupActionCode = followupActionCode;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
