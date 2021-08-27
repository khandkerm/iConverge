package com.example.demo;

public class IC_LOC_MOD {

	private String BILL_CYCLE_CODE;
	private String LOCATION_CODE;
	private String LOCATION_NAME;
	private String NET_IMPORT_KWH;
	private String NET_GEN_KWH;
	private String STATUS;
	private String SYS_LOSS;
	private String CI_RATIO;
	private String SYS_LOSS_WO_REB;
	private String CI_RATIO_WO_REB;
	private String BILLING_RATE;
	private String LOC_MOD_ID;
	public IC_LOC_MOD() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_LOC_MOD(String bILL_CYCLE_CODE, String lOCATION_CODE, String lOCATION_NAME, String nET_IMPORT_KWH,
			String nET_GEN_KWH, String sTATUS, String sYS_LOSS, String cI_RATIO, String sYS_LOSS_WO_REB,
			String cI_RATIO_WO_REB, String bILLING_RATE, String lOC_MOD_ID) {
		super();
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
		LOCATION_CODE = lOCATION_CODE;
		LOCATION_NAME = lOCATION_NAME;
		NET_IMPORT_KWH = nET_IMPORT_KWH;
		NET_GEN_KWH = nET_GEN_KWH;
		STATUS = sTATUS;
		SYS_LOSS = sYS_LOSS;
		CI_RATIO = cI_RATIO;
		SYS_LOSS_WO_REB = sYS_LOSS_WO_REB;
		CI_RATIO_WO_REB = cI_RATIO_WO_REB;
		BILLING_RATE = bILLING_RATE;
		LOC_MOD_ID = lOC_MOD_ID;
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
	public String getNET_IMPORT_KWH() {
		return NET_IMPORT_KWH;
	}
	public void setNET_IMPORT_KWH(String nET_IMPORT_KWH) {
		NET_IMPORT_KWH = nET_IMPORT_KWH;
	}
	public String getNET_GEN_KWH() {
		return NET_GEN_KWH;
	}
	public void setNET_GEN_KWH(String nET_GEN_KWH) {
		NET_GEN_KWH = nET_GEN_KWH;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getSYS_LOSS() {
		return SYS_LOSS;
	}
	public void setSYS_LOSS(String sYS_LOSS) {
		SYS_LOSS = sYS_LOSS;
	}
	public String getCI_RATIO() {
		return CI_RATIO;
	}
	public void setCI_RATIO(String cI_RATIO) {
		CI_RATIO = cI_RATIO;
	}
	public String getSYS_LOSS_WO_REB() {
		return SYS_LOSS_WO_REB;
	}
	public void setSYS_LOSS_WO_REB(String sYS_LOSS_WO_REB) {
		SYS_LOSS_WO_REB = sYS_LOSS_WO_REB;
	}
	public String getCI_RATIO_WO_REB() {
		return CI_RATIO_WO_REB;
	}
	public void setCI_RATIO_WO_REB(String cI_RATIO_WO_REB) {
		CI_RATIO_WO_REB = cI_RATIO_WO_REB;
	}
	public String getBILLING_RATE() {
		return BILLING_RATE;
	}
	public void setBILLING_RATE(String bILLING_RATE) {
		BILLING_RATE = bILLING_RATE;
	}
	public String getLOC_MOD_ID() {
		return LOC_MOD_ID;
	}
	public void setLOC_MOD_ID(String lOC_MOD_ID) {
		LOC_MOD_ID = lOC_MOD_ID;
	}
	@Override
	public String toString() {
		return "IC_LOC_MOD [BILL_CYCLE_CODE=" + BILL_CYCLE_CODE + ", LOCATION_CODE=" + LOCATION_CODE
				+ ", LOCATION_NAME=" + LOCATION_NAME + ", NET_IMPORT_KWH=" + NET_IMPORT_KWH + ", NET_GEN_KWH="
				+ NET_GEN_KWH + ", STATUS=" + STATUS + ", SYS_LOSS=" + SYS_LOSS + ", CI_RATIO=" + CI_RATIO
				+ ", SYS_LOSS_WO_REB=" + SYS_LOSS_WO_REB + ", CI_RATIO_WO_REB=" + CI_RATIO_WO_REB + ", BILLING_RATE="
				+ BILLING_RATE + ", LOC_MOD_ID=" + LOC_MOD_ID + "]";
	}

	
	
}
