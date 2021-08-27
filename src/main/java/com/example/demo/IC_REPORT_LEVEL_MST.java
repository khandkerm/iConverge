package com.example.demo;

public class IC_REPORT_LEVEL_MST {

	private String REPORT_LEVEL_CODE;
	private String REPORT_LEVEL_DESC;
	public IC_REPORT_LEVEL_MST() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_REPORT_LEVEL_MST(String rEPORT_LEVEL_CODE, String rEPORT_LEVEL_DESC) {
		super();
		REPORT_LEVEL_CODE = rEPORT_LEVEL_CODE;
		REPORT_LEVEL_DESC = rEPORT_LEVEL_DESC;
	}
	public String getREPORT_LEVEL_CODE() {
		return REPORT_LEVEL_CODE;
	}
	public void setREPORT_LEVEL_CODE(String rEPORT_LEVEL_CODE) {
		REPORT_LEVEL_CODE = rEPORT_LEVEL_CODE;
	}
	public String getREPORT_LEVEL_DESC() {
		return REPORT_LEVEL_DESC;
	}
	public void setREPORT_LEVEL_DESC(String rEPORT_LEVEL_DESC) {
		REPORT_LEVEL_DESC = rEPORT_LEVEL_DESC;
	}
	@Override
	public String toString() {
		return "IC_REPORT_LEVEL_MST [REPORT_LEVEL_CODE=" + REPORT_LEVEL_CODE + ", REPORT_LEVEL_DESC="
				+ REPORT_LEVEL_DESC + "]";
	}
	
	
	
}
