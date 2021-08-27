package com.example.demo;

public class IC_ZONE_MST {

	String ZONE_CODE, ZONE_DESC;

	public IC_ZONE_MST(String zONE_CODE, String zONE_DESC) {
		super();
		ZONE_CODE = zONE_CODE;
		ZONE_DESC = zONE_DESC;
	}

	public String getZONE_CODE() {
		return ZONE_CODE;
	}

	public void setZONE_CODE(String zONE_CODE) {
		ZONE_CODE = zONE_CODE;
	}

	public String getZONE_DESC() {
		return ZONE_DESC;
	}

	public void setZONE_DESC(String zONE_DESC) {
		ZONE_DESC = zONE_DESC;
	}

	@Override
	public String toString() {
		return "IC_ZONE_MST [ZONE_CODE=" + ZONE_CODE + ", ZONE_DESC=" + ZONE_DESC + "]";
	}

}
