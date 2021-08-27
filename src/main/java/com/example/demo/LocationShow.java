package com.example.demo;

public class LocationShow {
	private int locationID;
	private String locationCode;
	private String locationName;
	private String status;
	public int getLocationID() {
		return locationID;
	}
	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}
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
		return "LocationShow [locationID=" + locationID + ", locationCode=" + locationCode + ", locationName="
				+ locationName + ", status=" + status + "]";
	}
	public LocationShow(int locationID, String locationCode, String locationName, String status) {
		super();
		this.locationID = locationID;
		this.locationCode = locationCode;
		this.locationName = locationName;
		this.status = status;
	}
	public LocationShow() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
