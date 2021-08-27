package com.example.demo;

public class IC_USER_TYPE_MST {
	
	private String USERS_TYPE;
	private String USER_TYPE_DESC;
	private String STATUS;
	private String USER_TYPE_ID;
	public IC_USER_TYPE_MST() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_USER_TYPE_MST(String uSERS_TYPE, String uSER_TYPE_DESC, String sTATUS, String uSER_TYPE_ID) {
		super();
		USERS_TYPE = uSERS_TYPE;
		USER_TYPE_DESC = uSER_TYPE_DESC;
		STATUS = sTATUS;
		USER_TYPE_ID = uSER_TYPE_ID;
	}
	public String getUSERS_TYPE() {
		return USERS_TYPE;
	}
	public void setUSERS_TYPE(String uSERS_TYPE) {
		USERS_TYPE = uSERS_TYPE;
	}
	public String getUSER_TYPE_DESC() {
		return USER_TYPE_DESC;
	}
	public void setUSER_TYPE_DESC(String uSER_TYPE_DESC) {
		USER_TYPE_DESC = uSER_TYPE_DESC;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getUSER_TYPE_ID() {
		return USER_TYPE_ID;
	}
	public void setUSER_TYPE_ID(String uSER_TYPE_ID) {
		USER_TYPE_ID = uSER_TYPE_ID;
	}
	@Override
	public String toString() {
		return "IC_USER_TYPE_MST [USERS_TYPE=" + USERS_TYPE + ", USER_TYPE_DESC=" + USER_TYPE_DESC + ", STATUS="
				+ STATUS + ", USER_TYPE_ID=" + USER_TYPE_ID + "]";
	}

	
	
}
