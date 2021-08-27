package com.example.demo;

public class IC_PP_OWNER_TYPE {
	
	private String OWNER_TYPE_ID;
	private String OWNER_TYPE;
	private String OWNER_TYPE_NAME;
	private String SHORT_NAME;
	public IC_PP_OWNER_TYPE() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_PP_OWNER_TYPE(String oWNER_TYPE_ID, String oWNER_TYPE, String oWNER_TYPE_NAME, String sHORT_NAME) {
		super();
		OWNER_TYPE_ID = oWNER_TYPE_ID;
		OWNER_TYPE = oWNER_TYPE;
		OWNER_TYPE_NAME = oWNER_TYPE_NAME;
		SHORT_NAME = sHORT_NAME;
	}
	public String getOWNER_TYPE_ID() {
		return OWNER_TYPE_ID;
	}
	public void setOWNER_TYPE_ID(String oWNER_TYPE_ID) {
		OWNER_TYPE_ID = oWNER_TYPE_ID;
	}
	public String getOWNER_TYPE() {
		return OWNER_TYPE;
	}
	public void setOWNER_TYPE(String oWNER_TYPE) {
		OWNER_TYPE = oWNER_TYPE;
	}
	public String getOWNER_TYPE_NAME() {
		return OWNER_TYPE_NAME;
	}
	public void setOWNER_TYPE_NAME(String oWNER_TYPE_NAME) {
		OWNER_TYPE_NAME = oWNER_TYPE_NAME;
	}
	public String getSHORT_NAME() {
		return SHORT_NAME;
	}
	public void setSHORT_NAME(String sHORT_NAME) {
		SHORT_NAME = sHORT_NAME;
	}
	@Override
	public String toString() {
		return "IC_PP_OWNER_TYPE [OWNER_TYPE_ID=" + OWNER_TYPE_ID + ", OWNER_TYPE=" + OWNER_TYPE + ", OWNER_TYPE_NAME="
				+ OWNER_TYPE_NAME + ", SHORT_NAME=" + SHORT_NAME + "]";
	}
	
	

}
