package com.example.mvvmdemo.propertylisting.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class PropertyListingModel extends ResultItem {

	@SerializedName("msg")
	private String msg;

	@SerializedName("result")
	private List<ResultItem> result;

	@SerializedName("status")
	private String status;

	public String getMsg(){
		return msg;
	}

	public List<ResultItem> getResult(){
		return result;
	}

	public String getStatus(){
		return status;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "PropertyListingModel{" +
				"msg='" + msg + '\'' +
				", result=" + result +
				", status='" + status + '\'' +
				'}';
	}
}