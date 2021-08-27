package com.example.demo;

public class IC_SECT_WISE_MOD {

	private String BILL_CYCLE_CODE;
	private String LOCATION_CODE;
	private String LOCATION_NAME;
	private String SECT_CODE;
	private String SECT_NAME;
	private String BILLED_AMT;
	private String COLL_AMT;
	private String REC_AMT;
	private String EQ_MONTH;
	private String SECT_MOD_ID;
	public IC_SECT_WISE_MOD() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_SECT_WISE_MOD(String bILL_CYCLE_CODE, String lOCATION_CODE, String lOCATION_NAME, String sECT_CODE,
			String sECT_NAME, String bILLED_AMT, String cOLL_AMT, String rEC_AMT, String eQ_MONTH, String sECT_MOD_ID) {
		super();
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
		LOCATION_CODE = lOCATION_CODE;
		LOCATION_NAME = lOCATION_NAME;
		SECT_CODE = sECT_CODE;
		SECT_NAME = sECT_NAME;
		BILLED_AMT = bILLED_AMT;
		COLL_AMT = cOLL_AMT;
		REC_AMT = rEC_AMT;
		EQ_MONTH = eQ_MONTH;
		SECT_MOD_ID = sECT_MOD_ID;
	}
	public String getBILL_CYCLE_CODE() {
		return BILL_CYCLE_CODE;
	}
	public void setBILL_CYCLE_CODE(String bILL_CYCLE_CODE) {
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
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
	public String getBILLED_AMT() {
		return BILLED_AMT;
	}
	public void setBILLED_AMT(String bILLED_AMT) {
		BILLED_AMT = bILLED_AMT;
	}
	public String getCOLL_AMT() {
		return COLL_AMT;
	}
	public void setCOLL_AMT(String cOLL_AMT) {
		COLL_AMT = cOLL_AMT;
	}
	public String getREC_AMT() {
		return REC_AMT;
	}
	public void setREC_AMT(String rEC_AMT) {
		REC_AMT = rEC_AMT;
	}
	public String getEQ_MONTH() {
		return EQ_MONTH;
	}
	public void setEQ_MONTH(String eQ_MONTH) {
		EQ_MONTH = eQ_MONTH;
	}
	public String getSECT_MOD_ID() {
		return SECT_MOD_ID;
	}
	public void setSECT_MOD_ID(String sECT_MOD_ID) {
		SECT_MOD_ID = sECT_MOD_ID;
	}
	@Override
	public String toString() {
		return "IC_SECT_WISE_MOD [BILL_CYCLE_CODE=" + BILL_CYCLE_CODE + ", LOCATION_CODE=" + LOCATION_CODE
				+ ", LOCATION_NAME=" + LOCATION_NAME + ", SECT_CODE=" + SECT_CODE + ", SECT_NAME=" + SECT_NAME
				+ ", BILLED_AMT=" + BILLED_AMT + ", COLL_AMT=" + COLL_AMT + ", REC_AMT=" + REC_AMT + ", EQ_MONTH="
				+ EQ_MONTH + ", SECT_MOD_ID=" + SECT_MOD_ID + "]";
	}

	
	
	
	
	
}
