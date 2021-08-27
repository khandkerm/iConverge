package com.example.demo;

public class DynamicMenu {
	
	String PARENT="";
	String MOD_ID="";
	String MOD_APP="";
	String EXT="";
	String ROOTLEAF="";
	String MOD_NAME="";
	String MTYPE="";
	String MOD_CODE="";
	public DynamicMenu(String pARENT, String mOD_ID, String mOD_APP, String eXT, String rOOTLEAF, String mOD_NAME,
			String mTYPE, String mOD_CODE) {
		super();
		PARENT = pARENT;
		MOD_ID = mOD_ID;
		MOD_APP = mOD_APP;
		EXT = eXT;
		ROOTLEAF = rOOTLEAF;
		MOD_NAME = mOD_NAME;
		MTYPE = mTYPE;
		MOD_CODE = mOD_CODE;
	}
	public String getPARENT() {
		return PARENT;
	}
	public void setPARENT(String pARENT) {
		PARENT = pARENT;
	}
	public String getMOD_ID() {
		return MOD_ID;
	}
	public void setMOD_ID(String mOD_ID) {
		MOD_ID = mOD_ID;
	}
	public String getMOD_APP() {
		return MOD_APP;
	}
	public void setMOD_APP(String mOD_APP) {
		MOD_APP = mOD_APP;
	}
	public String getEXT() {
		return EXT;
	}
	public void setEXT(String eXT) {
		EXT = eXT;
	}
	public String getROOTLEAF() {
		return ROOTLEAF;
	}
	public void setROOTLEAF(String rOOTLEAF) {
		ROOTLEAF = rOOTLEAF;
	}
	public String getMOD_NAME() {
		return MOD_NAME;
	}
	public void setMOD_NAME(String mOD_NAME) {
		MOD_NAME = mOD_NAME;
	}
	public String getMTYPE() {
		return MTYPE;
	}
	public void setMTYPE(String mTYPE) {
		MTYPE = mTYPE;
	}
	public String getMOD_CODE() {
		return MOD_CODE;
	}
	public void setMOD_CODE(String mOD_CODE) {
		MOD_CODE = mOD_CODE;
	}
	@Override
	public String toString() {
		return "DynamicMenu [PARENT=" + PARENT + ", MOD_ID=" + MOD_ID + ", MOD_APP=" + MOD_APP + ", EXT=" + EXT
				+ ", ROOTLEAF=" + ROOTLEAF + ", MOD_NAME=" + MOD_NAME + ", MTYPE=" + MTYPE + ", MOD_CODE=" + MOD_CODE
				+ "]";
	}
	
	

}
