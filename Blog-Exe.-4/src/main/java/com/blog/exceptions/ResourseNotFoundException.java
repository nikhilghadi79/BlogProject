package com.blog.exceptions;

public class ResourseNotFoundException extends RuntimeException {

	String resourceName;
	String feildName;
	long feildValue;
	public ResourseNotFoundException(String resourceName, String feildName, long feildValue) {
		super(String.format("%s not found with %s : %s", resourceName,feildName,feildValue));
		this.resourceName = resourceName;
		this.feildName = feildName;
		this.feildValue = feildValue;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getFeildName() {
		return feildName;
	}
	public void setFeildName(String feildName) {
		this.feildName = feildName;
	}
	public long getFeildValue() {
		return feildValue;
	}
	public void setFeildValue(long feildValue) {
		this.feildValue = feildValue;
	}
	
	
}
