package com.example.demo;

public class IC_USAGE_AREA {
	
	private String AREA_CODE;
	private String AREA_NAME;
	private String STATUS;
	private String AREA_ID;
	public IC_USAGE_AREA(String aREA_CODE, String aREA_NAME, String sTATUS, String aREA_ID) {
		super();
		AREA_CODE = aREA_CODE;
		AREA_NAME = aREA_NAME;
		STATUS = sTATUS;
		AREA_ID = aREA_ID;
	}
	public IC_USAGE_AREA() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAREA_CODE() {
		return AREA_CODE;
	}
	public void setAREA_CODE(String aREA_CODE) {
		AREA_CODE = aREA_CODE;
	}
	public String getAREA_NAME() {
		return AREA_NAME;
	}
	public void setAREA_NAME(String aREA_NAME) {
		AREA_NAME = aREA_NAME;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getAREA_ID() {
		return AREA_ID;
	}
	public void setAREA_ID(String aREA_ID) {
		AREA_ID = aREA_ID;
	}
	@Override
	public String toString() {
		return "IC_USAGE_AREA [AREA_CODE=" + AREA_CODE + ", AREA_NAME=" + AREA_NAME + ", STATUS=" + STATUS
				+ ", AREA_ID=" + AREA_ID + "]";
	}

}
