package com.example.demo;

public class LocationInsert {
	private String locationCode;
	private String locationName;
	private String status;
	public String getLocationCode() {
		return locationCode;
	}
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "LocationInsert [locationCode=" + locationCode + ", locationName=" + locationName + ", status=" + status
				+ "]";
	}
	public LocationInsert(String locationCode, String locationName, String status) {
		super();
		this.locationCode = locationCode;
		this.locationName = locationName;
		this.status = status;
	}
	public LocationInsert() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
