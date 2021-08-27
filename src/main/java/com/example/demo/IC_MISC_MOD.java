package com.example.demo;

public class IC_MISC_MOD {
	private String BILL_CYCLE_CODE;
	private String LOCATION_CODE;
	private String LOCATION_NAME;
	private String MSC_TYPE_CODE;
	private String MSC_BILL_TYPE_NAME;
	private String BILLED_AMT;
	private String COLL_AMT;
	private String REC_AMT;
	private String MSC_MOD_ID;
	public IC_MISC_MOD() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_MISC_MOD(String bILL_CYCLE_CODE, String lOCATION_CODE, String lOCATION_NAME, String mSC_TYPE_CODE,
			String mSC_BILL_TYPE_NAME, String bILLED_AMT, String cOLL_AMT, String rEC_AMT, String mSC_MOD_ID) {
		super();
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
		LOCATION_CODE = lOCATION_CODE;
		LOCATION_NAME = lOCATION_NAME;
		MSC_TYPE_CODE = mSC_TYPE_CODE;
		MSC_BILL_TYPE_NAME = mSC_BILL_TYPE_NAME;
		BILLED_AMT = bILLED_AMT;
		COLL_AMT = cOLL_AMT;
		REC_AMT = rEC_AMT;
		MSC_MOD_ID = mSC_MOD_ID;
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
	public String getMSC_TYPE_CODE() {
		return MSC_TYPE_CODE;
	}
	public void setMSC_TYPE_CODE(String mSC_TYPE_CODE) {
		MSC_TYPE_CODE = mSC_TYPE_CODE;
	}
	public String getMSC_BILL_TYPE_NAME() {
		return MSC_BILL_TYPE_NAME;
	}
	public void setMSC_BILL_TYPE_NAME(String mSC_BILL_TYPE_NAME) {
		MSC_BILL_TYPE_NAME = mSC_BILL_TYPE_NAME;
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
	public String getMSC_MOD_ID() {
		return MSC_MOD_ID;
	}
	public void setMSC_MOD_ID(String mSC_MOD_ID) {
		MSC_MOD_ID = mSC_MOD_ID;
	}
	@Override
	public String toString() {
		return "IC_MISC_MOD [BILL_CYCLE_CODE=" + BILL_CYCLE_CODE + ", LOCATION_CODE=" + LOCATION_CODE
				+ ", LOCATION_NAME=" + LOCATION_NAME + ", MSC_TYPE_CODE=" + MSC_TYPE_CODE + ", MSC_BILL_TYPE_NAME="
				+ MSC_BILL_TYPE_NAME + ", BILLED_AMT=" + BILLED_AMT + ", COLL_AMT=" + COLL_AMT + ", REC_AMT=" + REC_AMT
				+ ", MSC_MOD_ID=" + MSC_MOD_ID + "]";
	}
	
	

}
