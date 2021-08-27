package com.example.demo;

public class IC_CIRCLE_MST {

	String CIRCLE_CODE, CIRCLE_DESC;

	public IC_CIRCLE_MST(String cIRCLE_CODE, String cIRCLE_DESC) {
		super();
		CIRCLE_CODE = cIRCLE_CODE;
		CIRCLE_DESC = cIRCLE_DESC;
	}

	public String getCIRCLE_CODE() {
		return CIRCLE_CODE;
	}

	public void setCIRCLE_CODE(String cIRCLE_CODE) {
		CIRCLE_CODE = cIRCLE_CODE;
	}

	public String getCIRCLE_DESC() {
		return CIRCLE_DESC;
	}

	public void setCIRCLE_DESC(String cIRCLE_DESC) {
		CIRCLE_DESC = cIRCLE_DESC;
	}

	@Override
	public String toString() {
		return "IC_CIRCLE_MST [CIRCLE_CODE=" + CIRCLE_CODE + ", CIRCLE_DESC=" + CIRCLE_DESC + "]";
	}

}
