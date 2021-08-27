package com.example.demo;

public class IC_LOCATION_MASTER {
	
	private String LOCATION_CODE;
	private String LOCATION_NAME;
	public IC_LOCATION_MASTER() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_LOCATION_MASTER(String lOCATION_CODE, String lOCATION_NAME) {
		super();
		LOCATION_CODE = lOCATION_CODE;
		LOCATION_NAME = lOCATION_NAME;
	}
	public String getLOCATION_CODE() {
		return LOCATION_CODE;
	}
	public void setLOCATION_CODE(String lOCATION_CODE) {
		LOCATION_CODE = lOCATION_CODE;
	}
	public String getLOCATION_NAME() {
		return LOCATION_NAME;
	}
	public void setLOCATION_NAME(String lOCATION_NAME) {
		LOCATION_NAME = lOCATION_NAME;
	}
	@Override
	public String toString() {
		return "IC_LOCATION_MASTER [LOCATION_CODE=" + LOCATION_CODE + ", LOCATION_NAME=" + LOCATION_NAME + "]";
	}
	
	

}
