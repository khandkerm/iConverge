package com.example.demo;

import org.springframework.format.annotation.DateTimeFormat;

public class IC_YEAR_MST {

	String YR_ID;
	String YEAR_CODE;
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	String FROM_DATE;
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	String TO_DATE;
	String STATUS;

	public IC_YEAR_MST(String yR_ID, String yEAR_CODE, String fROM_DATE, String tO_DATE, String sTATUS) {
		super();
		YR_ID = yR_ID;
		YEAR_CODE = yEAR_CODE;
		FROM_DATE = fROM_DATE;
		TO_DATE = tO_DATE;
		STATUS = sTATUS;
	}

	public IC_YEAR_MST() {
		// TODO Auto-generated constructor stub
	}

	public String getYR_ID() {
		return YR_ID;
	}

	public void setYR_ID(String yR_ID) {
		YR_ID = yR_ID;
	}

	public String getYEAR_CODE() {
		return YEAR_CODE;
	}

	public void setYEAR_CODE(String yEAR_CODE) {
		YEAR_CODE = yEAR_CODE;
	}

	public String getFROM_DATE() {
		return FROM_DATE;
	}

	public void setFROM_DATE(String fROM_DATE) {
		FROM_DATE = fROM_DATE;
	}

	public String getTO_DATE() {
		return TO_DATE;
	}

	public void setTO_DATE(String tO_DATE) {
		TO_DATE = tO_DATE;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	@Override
	public String toString() {
		return "IC_YEAR_MST [YR_ID=" + YR_ID + ", YEAR_CODE=" + YEAR_CODE + ", FROM_DATE=" + FROM_DATE + ", TO_DATE="
				+ TO_DATE + ", STATUS=" + STATUS + "]";
	}

}
