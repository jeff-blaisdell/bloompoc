package com.bloom.app.poc.model271;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class SubscriberAddress implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String addressInformationLine1;
	private String addressInformationLine2;
	
	public String getAddressInformationLine1() {
		return addressInformationLine1;
	}
	public void setAddressInformationLine1(String addressInformationLine1) {
		this.addressInformationLine1 = addressInformationLine1;
	}
	public String getAddressInformationLine2() {
		return addressInformationLine2;
	}
	public void setAddressInformationLine2(String addressInformationLine2) {
		this.addressInformationLine2 = addressInformationLine2;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
