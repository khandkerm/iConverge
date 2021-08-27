package com.example.demo;

public class IC_PERIOD_MST {
	private String YEAR_CODE;
	private String PERIOD_CODE;
	private String PERIOD_DESC;
	private String PR_ID;
	public IC_PERIOD_MST() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_PERIOD_MST(String yEAR_CODE, String pERIOD_CODE, String pERIOD_DESC, String pR_ID) {
		super();
		YEAR_CODE = yEAR_CODE;
		PERIOD_CODE = pERIOD_CODE;
		PERIOD_DESC = pERIOD_DESC;
		PR_ID = pR_ID;
	}
	public String getYEAR_CODE() {
		return YEAR_CODE;
	}
	public void setYEAR_CODE(String yEAR_CODE) {
		YEAR_CODE = yEAR_CODE;
	}
	public String getPERIOD_CODE() {
		return PERIOD_CODE;
	}
	public void setPERIOD_CODE(String pERIOD_CODE) {
		PERIOD_CODE = pERIOD_CODE;
	}
	public String getPERIOD_DESC() {
		return PERIOD_DESC;
	}
	public void setPERIOD_DESC(String pERIOD_DESC) {
		PERIOD_DESC = pERIOD_DESC;
	}
	public String getPR_ID() {
		return PR_ID;
	}
	public void setPR_ID(String pR_ID) {
		PR_ID = pR_ID;
	}
	@Override
	public String toString() {
		return "IC_PERIOD_MST [YEAR_CODE=" + YEAR_CODE + ", PERIOD_CODE=" + PERIOD_CODE + ", PERIOD_DESC=" + PERIOD_DESC
				+ ", PR_ID=" + PR_ID + "]";
	}
	
	
	
	

}
