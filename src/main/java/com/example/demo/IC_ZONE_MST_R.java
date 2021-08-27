package com.example.demo;

public class IC_ZONE_MST_R {
	
	private String  ZONE_CODE;
	private String  ZONE_NAME;
	public IC_ZONE_MST_R() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_ZONE_MST_R(String zONE_CODE, String zONE_NAME) {
		super();
		ZONE_CODE = zONE_CODE;
		ZONE_NAME = zONE_NAME;
	}
	public String getZONE_CODE() {
		return ZONE_CODE;
	}
	public void setZONE_CODE(String zONE_CODE) {
		ZONE_CODE = zONE_CODE;
	}
	public String getZONE_NAME() {
		return ZONE_NAME;
	}
	public void setZONE_NAME(String zONE_NAME) {
		ZONE_NAME = zONE_NAME;
	}
	@Override
	public String toString() {
		return "IC_ZONE_MST [ZONE_CODE=" + ZONE_CODE + ", ZONE_NAME=" + ZONE_NAME + "]";
	}
	
	

}
