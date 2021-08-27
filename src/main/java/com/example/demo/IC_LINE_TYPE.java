package com.example.demo;

public class IC_LINE_TYPE {
	
	private String LINE_TYPE;
	private String LINE_TYPE_NAME;
	private String STATUS;
	private String LINE_TYPE_ID;
	public IC_LINE_TYPE() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_LINE_TYPE(String lINE_TYPE, String lINE_TYPE_NAME, String sTATUS, String lINE_TYPE_ID) {
		super();
		LINE_TYPE = lINE_TYPE;
		LINE_TYPE_NAME = lINE_TYPE_NAME;
		STATUS = sTATUS;
		LINE_TYPE_ID = lINE_TYPE_ID;
	}
	public String getLINE_TYPE() {
		return LINE_TYPE;
	}
	public void setLINE_TYPE(String lINE_TYPE) {
		LINE_TYPE = lINE_TYPE;
	}
	public String getLINE_TYPE_NAME() {
		return LINE_TYPE_NAME;
	}
	public void setLINE_TYPE_NAME(String lINE_TYPE_NAME) {
		LINE_TYPE_NAME = lINE_TYPE_NAME;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getLINE_TYPE_ID() {
		return LINE_TYPE_ID;
	}
	public void setLINE_TYPE_ID(String lINE_TYPE_ID) {
		LINE_TYPE_ID = lINE_TYPE_ID;
	}
	@Override
	public String toString() {
		return "IC_LINE_TYPE [LINE_TYPE=" + LINE_TYPE + ", LINE_TYPE_NAME=" + LINE_TYPE_NAME + ", STATUS=" + STATUS
				+ ", LINE_TYPE_ID=" + LINE_TYPE_ID + "]";
	}
	
	
	

}
