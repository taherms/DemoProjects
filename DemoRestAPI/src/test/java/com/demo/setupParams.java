package com.demo;

public class setupParams {
	private String baseURL = "https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false";
	private String Test1Condition = "Name";
	private String Test1Criteria = "Carbon credits";
	private String Test2Condition = "CanRelist";
	private Boolean Test2Criteria = true;
	private String Test3Condition = "Gallery";
	private String Test3Criteria = "Good position in category";
	public String getBaseURL() {
		return baseURL;
	}
	public String getTest1Condition() {
		return Test1Condition;
	}
	public String getTest1Criteria() {
		return Test1Criteria;
	}
	public String getTest2Condition() {
		return Test2Condition;
	}
	public Boolean getTest2Criteria() {
		return Test2Criteria;
	}
	public String getTest3Condition() {
		return Test3Condition;
	}
	public String getTest3Criteria() {
		return Test3Criteria;
	}
}
