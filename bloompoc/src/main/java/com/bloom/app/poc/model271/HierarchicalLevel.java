package com.bloom.app.poc.model271;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class HierarchicalLevel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String hierarchicalIDNumber;
	private String hierarchicalParentIDNumber;
	private String hierarchicalLevelCode;
	private String hierarchicalChildCode;
	
	private IndividualOrOrganizationalName individualOrOrganizationalName;				// NM1
	private InformationSourceContactInformation informationSourceContactInformation;	// PER
	
	public String getHierarchicalIDNumber() {
		return hierarchicalIDNumber;
	}
	public void setHierarchicalIDNumber(String hierarchicalIDNumber) {
		this.hierarchicalIDNumber = hierarchicalIDNumber;
	}
	public String getHierarchicalParentIDNumber() {
		return hierarchicalParentIDNumber;
	}
	public void setHierarchicalParentIDNumber(String hierarchicalParentIDNumber) {
		this.hierarchicalParentIDNumber = hierarchicalParentIDNumber;
	}
	public String getHierarchicalLevelCode() {
		return hierarchicalLevelCode;
	}
	public void setHierarchicalLevelCode(String hierarchicalLevelCode) {
		this.hierarchicalLevelCode = hierarchicalLevelCode;
	}
	public String getHierarchicalChildCode() {
		return hierarchicalChildCode;
	}
	public void setHierarchicalChildCode(String hierarchicalChildCode) {
		this.hierarchicalChildCode = hierarchicalChildCode;
	}
	
	public IndividualOrOrganizationalName getIndividualOrOrganizationalName() {
		return individualOrOrganizationalName;
	}
	public void setIndividualOrOrganizationalName(IndividualOrOrganizationalName individualOrOrganizationalName) {
		this.individualOrOrganizationalName = individualOrOrganizationalName;
	}
	public InformationSourceContactInformation getInformationSourceContactInformation() {
		return informationSourceContactInformation;
	}
	public void setInformationSourceContactInformation(InformationSourceContactInformation informationSourceContactInformation) {
		this.informationSourceContactInformation = informationSourceContactInformation;
	}
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
	

}
