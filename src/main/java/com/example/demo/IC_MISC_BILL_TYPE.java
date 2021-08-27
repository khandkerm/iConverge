package com.example.demo;

public class IC_MISC_BILL_TYPE {
	
	private String MSC_BILL_TYPE_CODE;
	private String MSC_BILL_TYPE_NAME;
	private String GROSS_FLAG;
	private String STATUS;
	private String MSC_BILL_TYPE_ID;
	public IC_MISC_BILL_TYPE() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_MISC_BILL_TYPE(String mSC_BILL_TYPE_CODE, String mSC_BILL_TYPE_NAME, String gROSS_FLAG, String sTATUS,
			String mSC_BILL_TYPE_ID) {
		super();
		MSC_BILL_TYPE_CODE = mSC_BILL_TYPE_CODE;
		MSC_BILL_TYPE_NAME = mSC_BILL_TYPE_NAME;
		GROSS_FLAG = gROSS_FLAG;
		STATUS = sTATUS;
		MSC_BILL_TYPE_ID = mSC_BILL_TYPE_ID;
	}
	public String getMSC_BILL_TYPE_CODE() {
		return MSC_BILL_TYPE_CODE;
	}
	public void setMSC_BILL_TYPE_CODE(String mSC_BILL_TYPE_CODE) {
		MSC_BILL_TYPE_CODE = mSC_BILL_TYPE_CODE;
	}
	public String getMSC_BILL_TYPE_NAME() {
		return MSC_BILL_TYPE_NAME;
	}
	public void setMSC_BILL_TYPE_NAME(String mSC_BILL_TYPE_NAME) {
		MSC_BILL_TYPE_NAME = mSC_BILL_TYPE_NAME;
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
	public String getMSC_BILL_TYPE_ID() {
		return MSC_BILL_TYPE_ID;
	}
	public void setMSC_BILL_TYPE_ID(String mSC_BILL_TYPE_ID) {
		MSC_BILL_TYPE_ID = mSC_BILL_TYPE_ID;
	}
	@Override
	public String toString() {
		return "IC_MISC_BILL_TYPE [MSC_BILL_TYPE_CODE=" + MSC_BILL_TYPE_CODE + ", MSC_BILL_TYPE_NAME="
				+ MSC_BILL_TYPE_NAME + ", GROSS_FLAG=" + GROSS_FLAG + ", STATUS=" + STATUS + ", MSC_BILL_TYPE_ID="
				+ MSC_BILL_TYPE_ID + "]";
	}
	
	
	
	
	
	

	
	

}
