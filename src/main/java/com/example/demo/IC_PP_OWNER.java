package com.example.demo;

public class IC_PP_OWNER {
	private String OWNER_CODE;
	private String OWNER_NAME;
	private String OWNER_TYPE;
	private String OWNER_TYPE_NAME;
	private String STATUS;
	private String SHORT_NAME;
	private String PP_OWNER_ID;
	public IC_PP_OWNER() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_PP_OWNER(String oWNER_CODE, String oWNER_NAME, String oWNER_TYPE, String oWNER_TYPE_NAME, String sTATUS,
			String sHORT_NAME, String pP_OWNER_ID) {
		super();
		OWNER_CODE = oWNER_CODE;
		OWNER_NAME = oWNER_NAME;
		OWNER_TYPE = oWNER_TYPE;
		OWNER_TYPE_NAME = oWNER_TYPE_NAME;
		STATUS = sTATUS;
		SHORT_NAME = sHORT_NAME;
		PP_OWNER_ID = pP_OWNER_ID;
	}
	public String getOWNER_CODE() {
		return OWNER_CODE;
	}
	public void setOWNER_CODE(String oWNER_CODE) {
		OWNER_CODE = oWNER_CODE;
	}
	public String getOWNER_NAME() {
		return OWNER_NAME;
	}
	public void setOWNER_NAME(String oWNER_NAME) {
		OWNER_NAME = oWNER_NAME;
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
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getSHORT_NAME() {
		return SHORT_NAME;
	}
	public void setSHORT_NAME(String sHORT_NAME) {
		SHORT_NAME = sHORT_NAME;
	}
	public String getPP_OWNER_ID() {
		return PP_OWNER_ID;
	}
	public void setPP_OWNER_ID(String pP_OWNER_ID) {
		PP_OWNER_ID = pP_OWNER_ID;
	}
	@Override
	public String toString() {
		return "IC_PP_OWNER [OWNER_CODE=" + OWNER_CODE + ", OWNER_NAME=" + OWNER_NAME + ", OWNER_TYPE=" + OWNER_TYPE
				+ ", OWNER_TYPE_NAME=" + OWNER_TYPE_NAME + ", STATUS=" + STATUS + ", SHORT_NAME=" + SHORT_NAME
				+ ", PP_OWNER_ID=" + PP_OWNER_ID + "]";
	}
	
	
	
}
