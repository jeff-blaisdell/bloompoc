package com.bloom.app.poc.model271;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class SubscriberCityStateZip implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String cityName;
	private String stateOrProvinceCode;
	private String postalCode;
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateOrProvinceCode() {
		return stateOrProvinceCode;
	}
	public void setStateOrProvinceCode(String stateOrProvinceCode) {
		this.stateOrProvinceCode = stateOrProvinceCode;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
