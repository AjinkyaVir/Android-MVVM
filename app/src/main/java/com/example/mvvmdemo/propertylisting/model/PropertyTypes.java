package com.example.mvvmdemo.propertylisting.model;

import com.google.gson.annotations.SerializedName;

public class PropertyTypes{

	@SerializedName("createdAt")
	private String createdAt;

	@SerializedName("propertyTypeName")
	private String propertyTypeName;

	@SerializedName("deletedAt")
	private Object deletedAt;

	@SerializedName("propertyTypesId")
	private int propertyTypesId;

	@SerializedName("deletedBy")
	private Object deletedBy;

	@SerializedName("updatedAt")
	private Object updatedAt;

	public String getCreatedAt(){
		return createdAt;
	}

	public String getPropertyTypeName(){
		return propertyTypeName;
	}

	public Object getDeletedAt(){
		return deletedAt;
	}

	public int getPropertyTypesId(){
		return propertyTypesId;
	}

	public Object getDeletedBy(){
		return deletedBy;
	}

	public Object getUpdatedAt(){
		return updatedAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public void setPropertyTypeName(String propertyTypeName) {
		this.propertyTypeName = propertyTypeName;
	}

	public void setDeletedAt(Object deletedAt) {
		this.deletedAt = deletedAt;
	}

	public void setPropertyTypesId(int propertyTypesId) {
		this.propertyTypesId = propertyTypesId;
	}

	public void setDeletedBy(Object deletedBy) {
		this.deletedBy = deletedBy;
	}

	public void setUpdatedAt(Object updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "PropertyTypes{" +
				"createdAt='" + createdAt + '\'' +
				", propertyTypeName='" + propertyTypeName + '\'' +
				", deletedAt=" + deletedAt +
				", propertyTypesId=" + propertyTypesId +
				", deletedBy=" + deletedBy +
				", updatedAt=" + updatedAt +
				'}';
	}
}