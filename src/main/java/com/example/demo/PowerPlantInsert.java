package com.example.demo;

public class PowerPlantInsert {
	private String powerPointCode;
	private String powerPointName;
	private double noOfUnit;
	private double installenCapacity;
	private String gridCode;
	private String ownerCode;
	private String genAreaCode;
	private double maxCapacity;
	private String shortName;
	private String status;
	public String getPowerPointCode() {
		return powerPointCode;
	}
	public void setPowerPointCode(String powerPointCode) {
		this.powerPointCode = powerPointCode;
	}
	public String getPowerPointName() {
		return powerPointName;
	}
	public void setPowerPointName(String powerPointName) {
		this.powerPointName = powerPointName;
	}
	public double getNoOfUnit() {
		return noOfUnit;
	}
	public void setNoOfUnit(double noOfUnit) {
		this.noOfUnit = noOfUnit;
	}
	public double getInstallenCapacity() {
		return installenCapacity;
	}
	public void setInstallenCapacity(double installenCapacity) {
		this.installenCapacity = installenCapacity;
	}
	public String getGridCode() {
		return gridCode;
	}
	public void setGridCode(String gridCode) {
		this.gridCode = gridCode;
	}
	public String getOwnerCode() {
		return ownerCode;
	}
	public void setOwnerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}
	public String getGenAreaCode() {
		return genAreaCode;
	}
	public void setGenAreaCode(String genAreaCode) {
		this.genAreaCode = genAreaCode;
	}
	public double getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(double maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "PowerPlantInsert [powerPointCode=" + powerPointCode + ", powerPointName=" + powerPointName
				+ ", noOfUnit=" + noOfUnit + ", installenCapacity=" + installenCapacity + ", gridCode=" + gridCode
				+ ", ownerCode=" + ownerCode + ", genAreaCode=" + genAreaCode + ", maxCapacity=" + maxCapacity
				+ ", shortName=" + shortName + ", status=" + status + "]";
	}
	public PowerPlantInsert(String powerPointCode, String powerPointName, double noOfUnit, double installenCapacity,
			String gridCode, String ownerCode, String genAreaCode, double maxCapacity, String shortName,
			String status) {
		super();
		this.powerPointCode = powerPointCode;
		this.powerPointName = powerPointName;
		this.noOfUnit = noOfUnit;
		this.installenCapacity = installenCapacity;
		this.gridCode = gridCode;
		this.ownerCode = ownerCode;
		this.genAreaCode = genAreaCode;
		this.maxCapacity = maxCapacity;
		this.shortName = shortName;
		this.status = status;
	}
	public PowerPlantInsert() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
