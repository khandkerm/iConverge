package com.example.demo;

public class UsagArea {
	private String areaCode;
	private String areaName;
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	@Override
	public String toString() {
		return "UsagArea [areaCode=" + areaCode + ", areaName=" + areaName + "]";
	}
	public UsagArea(String areaCode, String areaName) {
		super();
		this.areaCode = areaCode;
		this.areaName = areaName;
	}
	public UsagArea() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
