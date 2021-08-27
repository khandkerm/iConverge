package com.example.demo;

public class IC_ZONE_TARGET {

	String ZONE_CODE;
	String ZONE_NAME;
	String YEAR_CODE;
	double SYS_LOSS = 0;
	double CI_RATIO = 0;
	double CB_RATIO = 0;
	double EQ_MONTH = 0;
	double SAIDI = 0;
	double SAIFI = 0;
	String REC_STATUS = "";
	String OFFICE_CODE = "";
	int ZONE_TARGET_ID = 0;

	public IC_ZONE_TARGET(String zONE_CODE, String zONE_NAME, String yEAR_CODE, double sYS_LOSS, double cI_RATIO,
			double cB_RATIO, double eQ_MONTH, double sAIDI, double sAIFI, String rEC_STATUS, String oFFICE_CODE,
			int zONE_TARGET_ID) {
		super();
		ZONE_CODE = zONE_CODE;
		ZONE_NAME = zONE_NAME;
		YEAR_CODE = yEAR_CODE;
		SYS_LOSS = sYS_LOSS;
		CI_RATIO = cI_RATIO;
		CB_RATIO = cB_RATIO;
		EQ_MONTH = eQ_MONTH;
		SAIDI = sAIDI;
		SAIFI = sAIFI;
		REC_STATUS = rEC_STATUS;
		OFFICE_CODE = oFFICE_CODE;
		ZONE_TARGET_ID = zONE_TARGET_ID;
	}

	public IC_ZONE_TARGET() {
		// TODO Auto-generated constructor stub
	}

	public String getZONE_CODE() {
		return ZONE_CODE;
	}

	public void setZONE_CODE(String zONE_CODE) {
		ZONE_CODE = zONE_CODE;
	}

	public String getZONE_NAME() {
		return ZONE_NAME;
	}

	public void setZONE_NAME(String zONE_NAME) {
		ZONE_NAME = zONE_NAME;
	}

	public String getYEAR_CODE() {
		return YEAR_CODE;
	}

	public void setYEAR_CODE(String yEAR_CODE) {
		YEAR_CODE = yEAR_CODE;
	}

	public double getSYS_LOSS() {
		return SYS_LOSS;
	}

	public void setSYS_LOSS(double sYS_LOSS) {
		SYS_LOSS = sYS_LOSS;
	}

	public double getCI_RATIO() {
		return CI_RATIO;
	}

	public void setCI_RATIO(double cI_RATIO) {
		CI_RATIO = cI_RATIO;
	}

	public double getCB_RATIO() {
		return CB_RATIO;
	}

	public void setCB_RATIO(double cB_RATIO) {
		CB_RATIO = cB_RATIO;
	}

	public double getEQ_MONTH() {
		return EQ_MONTH;
	}

	public void setEQ_MONTH(double eQ_MONTH) {
		EQ_MONTH = eQ_MONTH;
	}

	public double getSAIDI() {
		return SAIDI;
	}

	public void setSAIDI(double sAIDI) {
		SAIDI = sAIDI;
	}

	public double getSAIFI() {
		return SAIFI;
	}

	public void setSAIFI(double sAIFI) {
		SAIFI = sAIFI;
	}

	public String getREC_STATUS() {
		return REC_STATUS;
	}

	public void setREC_STATUS(String rEC_STATUS) {
		REC_STATUS = rEC_STATUS;
	}

	public String getOFFICE_CODE() {
		return OFFICE_CODE;
	}

	public void setOFFICE_CODE(String oFFICE_CODE) {
		OFFICE_CODE = oFFICE_CODE;
	}

	public int getZONE_TARGET_ID() {
		return ZONE_TARGET_ID;
	}

	public void setZONE_TARGET_ID(int zONE_TARGET_ID) {
		ZONE_TARGET_ID = zONE_TARGET_ID;
	}

	@Override
	public String toString() {
		return "IC_ZONE_TARGET [ZONE_CODE=" + ZONE_CODE + ", ZONE_NAME=" + ZONE_NAME + ", YEAR_CODE=" + YEAR_CODE
				+ ", SYS_LOSS=" + SYS_LOSS + ", CI_RATIO=" + CI_RATIO + ", CB_RATIO=" + CB_RATIO + ", EQ_MONTH="
				+ EQ_MONTH + ", SAIDI=" + SAIDI + ", SAIFI=" + SAIFI + ", REC_STATUS=" + REC_STATUS + ", OFFICE_CODE="
				+ OFFICE_CODE + ", ZONE_TARGET_ID=" + ZONE_TARGET_ID + "]";
	}

}
