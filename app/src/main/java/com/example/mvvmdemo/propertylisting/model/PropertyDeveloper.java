package com.example.mvvmdemo.propertylisting.model;

import com.google.gson.annotations.SerializedName;

public class PropertyDeveloper{

	@SerializedName("propertyDeveloperState")
	private String propertyDeveloperState;

	@SerializedName("propertyDeveloperAddress")
	private String propertyDeveloperAddress;

	@SerializedName("propertyDeveloperPincode")
	private int propertyDeveloperPincode;

	@SerializedName("propertyDeveloperCity")
	private String propertyDeveloperCity;

	@SerializedName("propertyDeveloperArea")
	private String propertyDeveloperArea;

	@SerializedName("deletedBy")
	private Object deletedBy;

	@SerializedName("createdAt")
	private String createdAt;

	@SerializedName("propertyDeveloperName")
	private String propertyDeveloperName;

	@SerializedName("deletedAt")
	private Object deletedAt;

	@SerializedName("propertyDeveloperContact")
	private String propertyDeveloperContact;

	@SerializedName("propertyDeveloperId")
	private int propertyDeveloperId;

	@SerializedName("propertyDeveloperDetails")
	private String propertyDeveloperDetails;

	@SerializedName("propertyDeveloperCountry")
	private String propertyDeveloperCountry;

	@SerializedName("updatedAt")
	private Object updatedAt;

	public String getPropertyDeveloperState(){
		return propertyDeveloperState;
	}

	public String getPropertyDeveloperAddress(){
		return propertyDeveloperAddress;
	}

	public int getPropertyDeveloperPincode(){
		return propertyDeveloperPincode;
	}

	public String getPropertyDeveloperCity(){
		return propertyDeveloperCity;
	}

	public String getPropertyDeveloperArea(){
		return propertyDeveloperArea;
	}

	public Object getDeletedBy(){
		return deletedBy;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public String getPropertyDeveloperName(){
		return propertyDeveloperName;
	}

	public Object getDeletedAt(){
		return deletedAt;
	}

	public String getPropertyDeveloperContact(){
		return propertyDeveloperContact;
	}

	public int getPropertyDeveloperId(){
		return propertyDeveloperId;
	}

	public String getPropertyDeveloperDetails(){
		return propertyDeveloperDetails;
	}

	public String getPropertyDeveloperCountry(){
		return propertyDeveloperCountry;
	}

	public Object getUpdatedAt(){
		return updatedAt;
	}

	public void setPropertyDeveloperState(String propertyDeveloperState) {
		this.propertyDeveloperState = propertyDeveloperState;
	}

	public void setPropertyDeveloperAddress(String propertyDeveloperAddress) {
		this.propertyDeveloperAddress = propertyDeveloperAddress;
	}

	public void setPropertyDeveloperPincode(int propertyDeveloperPincode) {
		this.propertyDeveloperPincode = propertyDeveloperPincode;
	}

	public void setPropertyDeveloperCity(String propertyDeveloperCity) {
		this.propertyDeveloperCity = propertyDeveloperCity;
	}

	public void setPropertyDeveloperArea(String propertyDeveloperArea) {
		this.propertyDeveloperArea = propertyDeveloperArea;
	}

	public void setDeletedBy(Object deletedBy) {
		this.deletedBy = deletedBy;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public void setPropertyDeveloperName(String propertyDeveloperName) {
		this.propertyDeveloperName = propertyDeveloperName;
	}

	public void setDeletedAt(Object deletedAt) {
		this.deletedAt = deletedAt;
	}

	public void setPropertyDeveloperContact(String propertyDeveloperContact) {
		this.propertyDeveloperContact = propertyDeveloperContact;
	}

	public void setPropertyDeveloperId(int propertyDeveloperId) {
		this.propertyDeveloperId = propertyDeveloperId;
	}

	public void setPropertyDeveloperDetails(String propertyDeveloperDetails) {
		this.propertyDeveloperDetails = propertyDeveloperDetails;
	}

	public void setPropertyDeveloperCountry(String propertyDeveloperCountry) {
		this.propertyDeveloperCountry = propertyDeveloperCountry;
	}

	public void setUpdatedAt(Object updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "PropertyDeveloper{" +
				"propertyDeveloperState='" + propertyDeveloperState + '\'' +
				", propertyDeveloperAddress='" + propertyDeveloperAddress + '\'' +
				", propertyDeveloperPincode=" + propertyDeveloperPincode +
				", propertyDeveloperCity='" + propertyDeveloperCity + '\'' +
				", propertyDeveloperArea='" + propertyDeveloperArea + '\'' +
				", deletedBy=" + deletedBy +
				", createdAt='" + createdAt + '\'' +
				", propertyDeveloperName='" + propertyDeveloperName + '\'' +
				", deletedAt=" + deletedAt +
				", propertyDeveloperContact='" + propertyDeveloperContact + '\'' +
				", propertyDeveloperId=" + propertyDeveloperId +
				", propertyDeveloperDetails='" + propertyDeveloperDetails + '\'' +
				", propertyDeveloperCountry='" + propertyDeveloperCountry + '\'' +
				", updatedAt=" + updatedAt +
				'}';
	}
}