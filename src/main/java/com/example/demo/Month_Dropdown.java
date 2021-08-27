package com.example.demo;

public class Month_Dropdown {

	private String BILL_CYCLE_CODE;
	private String BILL_CYCLE_DESC;
	public Month_Dropdown() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Month_Dropdown(String bILL_CYCLE_CODE, String bILL_CYCLE_DESC) {
		super();
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
		BILL_CYCLE_DESC = bILL_CYCLE_DESC;
	}
	public String getBILL_CYCLE_CODE() {
		return BILL_CYCLE_CODE;
	}
	public void setBILL_CYCLE_CODE(String bILL_CYCLE_CODE) {
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
	}
	public String getBILL_CYCLE_DESC() {
		return BILL_CYCLE_DESC;
	}
	public void setBILL_CYCLE_DESC(String bILL_CYCLE_DESC) {
		BILL_CYCLE_DESC = bILL_CYCLE_DESC;
	}
	@Override
	public String toString() {
		return "Month_Dropdown [BILL_CYCLE_CODE=" + BILL_CYCLE_CODE + ", BILL_CYCLE_DESC=" + BILL_CYCLE_DESC + "]";
	}
	
}
