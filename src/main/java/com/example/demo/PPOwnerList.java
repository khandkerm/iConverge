package com.example.demo;

public class PPOwnerList {
	private String ownerCode;
	private String ownerName;
	public String getOwnerCode() {
		return ownerCode;
	}
	public void setOwnerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	@Override
	public String toString() {
		return "PPOwnerList [ownerCode=" + ownerCode + ", ownerName=" + ownerName + "]";
	}
	public PPOwnerList(String ownerCode, String ownerName) {
		super();
		this.ownerCode = ownerCode;
		this.ownerName = ownerName;
	}
	public PPOwnerList() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
