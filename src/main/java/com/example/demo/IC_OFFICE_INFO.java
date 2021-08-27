package com.example.demo;

public class IC_OFFICE_INFO {

	String OFFICE_CODE;
	String OFFICE_DESC;

	public IC_OFFICE_INFO(String oFFICE_CODE, String oFFICE_DESC) {
		super();
		OFFICE_CODE = oFFICE_CODE;
		OFFICE_DESC = oFFICE_DESC;
	}

	public String getOFFICE_CODE() {
		return OFFICE_CODE;
	}

	public void setOFFICE_CODE(String oFFICE_CODE) {
		OFFICE_CODE = oFFICE_CODE;
	}

	public String getOFFICE_DESC() {
		return OFFICE_DESC;
	}

	public void setOFFICE_DESC(String oFFICE_DESC) {
		OFFICE_DESC = oFFICE_DESC;
	}

	@Override
	public String toString() {
		return "IC_OFFICE_INFO [OFFICE_CODE=" + OFFICE_CODE + ", OFFICE_DESC=" + OFFICE_DESC + "]";
	}

}
