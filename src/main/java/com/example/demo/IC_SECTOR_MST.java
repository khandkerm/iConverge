package com.example.demo;

public class IC_SECTOR_MST {

	private String SECT_CODE;
	private String SECT_NAME;
	private String GROSS_FLAG;
	private String STATUS;
	private String SECT_ID;

	public IC_SECTOR_MST() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IC_SECTOR_MST(String sECT_CODE, String sECT_NAME, String gROSS_FLAG, String sTATUS, String sECT_ID) {
		super();
		SECT_CODE = sECT_CODE;
		SECT_NAME = sECT_NAME;
		GROSS_FLAG = gROSS_FLAG;
		STATUS = sTATUS;
		SECT_ID = sECT_ID;
	}

	public IC_SECTOR_MST(String sECT_CODE, String sECT_NAME) {
		// TODO Auto-generated constructor stub
		SECT_CODE = sECT_CODE;
		SECT_NAME = sECT_NAME;
	}

	public String getSECT_CODE() {
		return SECT_CODE;
	}

	public void setSECT_CODE(String sECT_CODE) {
		SECT_CODE = sECT_CODE;
	}

	public String getSECT_NAME() {
		return SECT_NAME;
	}

	public void setSECT_NAME(String sECT_NAME) {
		SECT_NAME = sECT_NAME;
	}

	public String getGROSS_FLAG() {
		return GROSS_FLAG;
	}

	public void setGROSS_FLAG(String gROSS_FLAG) {
		GROSS_FLAG = gROSS_FLAG;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	public String getSECT_ID() {
		return SECT_ID;
	}

	public void setSECT_ID(String sECT_ID) {
		SECT_ID = sECT_ID;
	}

	@Override
	public String toString() {
		return "IC_SECTOR_MST [SECT_CODE=" + SECT_CODE + ", SECT_NAME=" + SECT_NAME + ", GROSS_FLAG=" + GROSS_FLAG
				+ ", STATUS=" + STATUS + ", SECT_ID=" + SECT_ID + "]";
	}

}