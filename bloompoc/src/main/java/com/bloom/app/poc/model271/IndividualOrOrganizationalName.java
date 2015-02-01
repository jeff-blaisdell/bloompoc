package com.bloom.app.poc.model271;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

//
// NM1*PR*2*PACIFICARE OF CALIFORNIA*****FI*952931460~
//
public class IndividualOrOrganizationalName implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String entityIdentifierCode;
	private String entityTypeQualifier;
	private String nameLastOrOrganizationName;
	private String nameFirst;
	private String nameMiddle;
	private String namePrefix;
	private String nameSuffix;
	private String identificationCodeQualifier;
	private String identificationCode;
	
	public String getEntityIdentifierCode() {
		return entityIdentifierCode;
	}
	public void setEntityIdentifierCode(String entityIdentifierCode) {
		this.entityIdentifierCode = entityIdentifierCode;
	}
	public String getEntityTypeQualifier() {
		return entityTypeQualifier;
	}
	public void setEntityTypeQualifier(String entityTypeQualifier) {
		this.entityTypeQualifier = entityTypeQualifier;
	}
	public String getNameLastOrOrganizationName() {
		return nameLastOrOrganizationName;
	}
	public void setNameLastOrOrganizationName(String nameLastOrOrganizationName) {
		this.nameLastOrOrganizationName = nameLastOrOrganizationName;
	}
	public String getNameFirst() {
		return nameFirst;
	}
	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}
	public String getNameMiddle() {
		return nameMiddle;
	}
	public void setNameMiddle(String nameMiddle) {
		this.nameMiddle = nameMiddle;
	}
	public String getNamePrefix() {
		return namePrefix;
	}
	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}
	public String getNameSuffix() {
		return nameSuffix;
	}
	public void setNameSuffix(String nameSuffix) {
		this.nameSuffix = nameSuffix;
	}
	public String getIdentificationCodeQualifier() {
		return identificationCodeQualifier;
	}
	public void setIdentificationCodeQualifier(String identificationCodeQualifier) {
		this.identificationCodeQualifier = identificationCodeQualifier;
	}
	public String getIdentificationCode() {
		return identificationCode;
	}
	public void setIdentificationCode(String identificationCode) {
		this.identificationCode = identificationCode;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
