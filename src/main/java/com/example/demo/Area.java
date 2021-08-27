package com.example.demo;

public class Area {
	private String areaCode;
	private String areaName;
	private String status;
	private int areaId;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAreaId() {
		return areaId;
	}
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}
	@Override
	public String toString() {
		return "Area [areaCode=" + areaCode + ", areaName=" + areaName + ", status=" + status + ", areaId=" + areaId
				+ "]";
	}
	public Area(String areaCode, String areaName, String status, int areaId) {
		super();
		this.areaCode = areaCode;
		this.areaName = areaName;
		this.status = status;
		this.areaId = areaId;
	}
	public Area() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
