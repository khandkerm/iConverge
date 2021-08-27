package com.example.demo;

public class IC_CIRCLE_MST_R {
	private String CIRCLE_CODE;
	private String CIRCLE_NAME;
	public IC_CIRCLE_MST_R() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_CIRCLE_MST_R(String cIRCLE_CODE, String cIRCLE_NAME) {
		super();
		CIRCLE_CODE = cIRCLE_CODE;
		CIRCLE_NAME = cIRCLE_NAME;
	}
	public String getCIRCLE_CODE() {
		return CIRCLE_CODE;
	}
	public void setCIRCLE_CODE(String cIRCLE_CODE) {
		CIRCLE_CODE = cIRCLE_CODE;
	}
	public String getCIRCLE_NAME() {
		return CIRCLE_NAME;
	}
	public void setCIRCLE_NAME(String cIRCLE_NAME) {
		CIRCLE_NAME = cIRCLE_NAME;
	}
	@Override
	public String toString() {
		return "IC_CIRCLE_MST [CIRCLE_CODE=" + CIRCLE_CODE + ", CIRCLE_NAME=" + CIRCLE_NAME + "]";
	}

}
