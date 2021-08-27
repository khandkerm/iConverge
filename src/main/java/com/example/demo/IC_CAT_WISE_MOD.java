package com.example.demo;

public class IC_CAT_WISE_MOD {
	
	private String BILL_CYCLE_CODE;
	private String LOCATION_CODE;
	private String LOCATION_NAME;
	private String USAGE_CAT_CODE;
	private String USAGE_CAT_NAME;
	private String NEW_CONS;
	private String PD_CONS;	
	private String TOT_CONS;
	private String TD_CONS;
	private String ACTIVE_CONS;
	private String BILLED_CONS;	
	private String BILLED_UNIT;
	private String BILLED_AMT;
	private String COLL_AMT;
	private String REC_AMT;
	private String BILLING_RATE;
	private String EQ_MONTH;
	private String CAT_MOD_ID;
	public IC_CAT_WISE_MOD() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_CAT_WISE_MOD(String bILL_CYCLE_CODE, String lOCATION_CODE, String lOCATION_NAME, String uSAGE_CAT_CODE,
			String uSAGE_CAT_NAME, String nEW_CONS, String pD_CONS, String tOT_CONS, String tD_CONS, String aCTIVE_CONS,
			String bILLED_CONS, String bILLED_UNIT, String bILLED_AMT, String cOLL_AMT, String rEC_AMT,
			String bILLING_RATE, String eQ_MONTH, String cAT_MOD_ID) {
		super();
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
		LOCATION_CODE = lOCATION_CODE;
		LOCATION_NAME = lOCATION_NAME;
		USAGE_CAT_CODE = uSAGE_CAT_CODE;
		USAGE_CAT_NAME = uSAGE_CAT_NAME;
		NEW_CONS = nEW_CONS;
		PD_CONS = pD_CONS;
		TOT_CONS = tOT_CONS;
		TD_CONS = tD_CONS;
		ACTIVE_CONS = aCTIVE_CONS;
		BILLED_CONS = bILLED_CONS;
		BILLED_UNIT = bILLED_UNIT;
		BILLED_AMT = bILLED_AMT;
		COLL_AMT = cOLL_AMT;
		REC_AMT = rEC_AMT;
		BILLING_RATE = bILLING_RATE;
		EQ_MONTH = eQ_MONTH;
		CAT_MOD_ID = cAT_MOD_ID;
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
	public String getUSAGE_CAT_CODE() {
		return USAGE_CAT_CODE;
	}
	public void setUSAGE_CAT_CODE(String uSAGE_CAT_CODE) {
		USAGE_CAT_CODE = uSAGE_CAT_CODE;
	}
	public String getUSAGE_CAT_NAME() {
		return USAGE_CAT_NAME;
	}
	public void setUSAGE_CAT_NAME(String uSAGE_CAT_NAME) {
		USAGE_CAT_NAME = uSAGE_CAT_NAME;
	}
	public String getNEW_CONS() {
		return NEW_CONS;
	}
	public void setNEW_CONS(String nEW_CONS) {
		NEW_CONS = nEW_CONS;
	}
	public String getPD_CONS() {
		return PD_CONS;
	}
	public void setPD_CONS(String pD_CONS) {
		PD_CONS = pD_CONS;
	}
	public String getTOT_CONS() {
		return TOT_CONS;
	}
	public void setTOT_CONS(String tOT_CONS) {
		TOT_CONS = tOT_CONS;
	}
	public String getTD_CONS() {
		return TD_CONS;
	}
	public void setTD_CONS(String tD_CONS) {
		TD_CONS = tD_CONS;
	}
	public String getACTIVE_CONS() {
		return ACTIVE_CONS;
	}
	public void setACTIVE_CONS(String aCTIVE_CONS) {
		ACTIVE_CONS = aCTIVE_CONS;
	}
	public String getBILLED_CONS() {
		return BILLED_CONS;
	}
	public void setBILLED_CONS(String bILLED_CONS) {
		BILLED_CONS = bILLED_CONS;
	}
	public String getBILLED_UNIT() {
		return BILLED_UNIT;
	}
	public void setBILLED_UNIT(String bILLED_UNIT) {
		BILLED_UNIT = bILLED_UNIT;
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
	public String getBILLING_RATE() {
		return BILLING_RATE;
	}
	public void setBILLING_RATE(String bILLING_RATE) {
		BILLING_RATE = bILLING_RATE;
	}
	public String getEQ_MONTH() {
		return EQ_MONTH;
	}
	public void setEQ_MONTH(String eQ_MONTH) {
		EQ_MONTH = eQ_MONTH;
	}
	public String getCAT_MOD_ID() {
		return CAT_MOD_ID;
	}
	public void setCAT_MOD_ID(String cAT_MOD_ID) {
		CAT_MOD_ID = cAT_MOD_ID;
	}
	@Override
	public String toString() {
		return "IC_CAT_WISE_MOD [BILL_CYCLE_CODE=" + BILL_CYCLE_CODE + ", LOCATION_CODE=" + LOCATION_CODE
				+ ", LOCATION_NAME=" + LOCATION_NAME + ", USAGE_CAT_CODE=" + USAGE_CAT_CODE + ", USAGE_CAT_NAME="
				+ USAGE_CAT_NAME + ", NEW_CONS=" + NEW_CONS + ", PD_CONS=" + PD_CONS + ", TOT_CONS=" + TOT_CONS
				+ ", TD_CONS=" + TD_CONS + ", ACTIVE_CONS=" + ACTIVE_CONS + ", BILLED_CONS=" + BILLED_CONS
				+ ", BILLED_UNIT=" + BILLED_UNIT + ", BILLED_AMT=" + BILLED_AMT + ", COLL_AMT=" + COLL_AMT
				+ ", REC_AMT=" + REC_AMT + ", BILLING_RATE=" + BILLING_RATE + ", EQ_MONTH=" + EQ_MONTH + ", CAT_MOD_ID="
				+ CAT_MOD_ID + "]";
	}
	
	
	

}
