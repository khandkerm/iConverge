package com.example.demo;

public class IC_FUEL_TYPE {
	
	private String FUEL_CODE;
	private String FUEL_NAME;
	private String STATUS;
	private String UNIT;
	private String FUEL_ID;
	public IC_FUEL_TYPE() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_FUEL_TYPE(String fUEL_CODE, String fUEL_NAME, String sTATUS, String uNIT, String fUEL_ID) {
		super();
		FUEL_CODE = fUEL_CODE;
		FUEL_NAME = fUEL_NAME;
		STATUS = sTATUS;
		UNIT = uNIT;
		FUEL_ID = fUEL_ID;
	}
	public String getFUEL_CODE() {
		return FUEL_CODE;
	}
	public void setFUEL_CODE(String fUEL_CODE) {
		FUEL_CODE = fUEL_CODE;
	}
	public String getFUEL_NAME() {
		return FUEL_NAME;
	}
	public void setFUEL_NAME(String fUEL_NAME) {
		FUEL_NAME = fUEL_NAME;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getUNIT() {
		return UNIT;
	}
	public void setUNIT(String uNIT) {
		UNIT = uNIT;
	}
	public String getFUEL_ID() {
		return FUEL_ID;
	}
	public void setFUEL_ID(String fUEL_ID) {
		FUEL_ID = fUEL_ID;
	}
	@Override
	public String toString() {
		return "IC_FUEL_TYPE [FUEL_CODE=" + FUEL_CODE + ", FUEL_NAME=" + FUEL_NAME + ", STATUS=" + STATUS + ", UNIT="
				+ UNIT + ", FUEL_ID=" + FUEL_ID + "]";
	}
	
	
	
	
}
