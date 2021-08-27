package com.example.demo;

public class PowerPlantDropdown {
	private String ppCode;
	private String ppDescr;
	public String getPpCode() {
		return ppCode;
	}
	public void setPpCode(String ppCode) {
		this.ppCode = ppCode;
	}
	public String getPpDescr() {
		return ppDescr;
	}
	public void setPpDescr(String ppDescr) {
		this.ppDescr = ppDescr;
	}
	@Override
	public String toString() {
		return "PowerPlantDropdown [ppCode=" + ppCode + ", ppDescr=" + ppDescr + "]";
	}
	public PowerPlantDropdown(String ppCode, String ppDescr) {
		super();
		this.ppCode = ppCode;
		this.ppDescr = ppDescr;
	}
	public PowerPlantDropdown() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
