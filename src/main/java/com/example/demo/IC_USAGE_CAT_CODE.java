package com.example.demo;

public class IC_USAGE_CAT_CODE {
	private String USAGE_CAT_CODE;
	private String USAGE_CAT_NAME;
	public IC_USAGE_CAT_CODE() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_USAGE_CAT_CODE(String uSAGE_CAT_CODE, String uSAGE_CAT_NAME) {
		super();
		USAGE_CAT_CODE = uSAGE_CAT_CODE;
		USAGE_CAT_NAME = uSAGE_CAT_NAME;
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
	@Override
	public String toString() {
		return "IC_USAGE_CAT_CODE [USAGE_CAT_CODE=" + USAGE_CAT_CODE + ", USAGE_CAT_NAME=" + USAGE_CAT_NAME + "]";
	}

	
}
