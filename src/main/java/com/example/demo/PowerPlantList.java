package com.example.demo;

public class PowerPlantList {
	private String ppCode;
	private String ppName;
	private int noOfUnit;
	private double installedCapacity;
	private double maxCapacity;
	private String gridCode;
	private String gridDesc;
	private String status;
	private String ownerCode;
	private String ownerName;
	private String shortName;
	private String genAreaCode;
	private String genAreaName;
	private int ppId;
	public String getPpCode() {
		return ppCode;
	}
	public void setPpCode(String ppCode) {
		this.ppCode = ppCode;
	}
	public String getPpName() {
		return ppName;
	}
	public void setPpName(String ppName) {
		this.ppName = ppName;
	}
	public int getNoOfUnit() {
		return noOfUnit;
	}
	public void setNoOfUnit(int noOfUnit) {
		this.noOfUnit = noOfUnit;
	}
	public double getInstalledCapacity() {
		return installedCapacity;
	}
	public void setInstalledCapacity(double installedCapacity) {
		this.installedCapacity = installedCapacity;
	}
	public double getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(double maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	public String getGridCode() {
		return gridCode;
	}
	public void setGridCode(String gridCode) {
		this.gridCode = gridCode;
	}
	public String getGridDesc() {
		return gridDesc;
	}
	public void setGridDesc(String gridDesc) {
		this.gridDesc = gridDesc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
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
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getGenAreaCode() {
		return genAreaCode;
	}
	public void setGenAreaCode(String genAreaCode) {
		this.genAreaCode = genAreaCode;
	}
	public String getGenAreaName() {
		return genAreaName;
	}
	public void setGenAreaName(String genAreaName) {
		this.genAreaName = genAreaName;
	}
	public int getPpId() {
		return ppId;
	}
	public void setPpId(int ppId) {
		this.ppId = ppId;
	}
	@Override
	public String toString() {
		return "PowerPlantList [ppCode=" + ppCode + ", ppName=" + ppName + ", noOfUnit=" + noOfUnit
				+ ", installedCapacity=" + installedCapacity + ", maxCapacity=" + maxCapacity + ", gridCode=" + gridCode
				+ ", gridDesc=" + gridDesc + ", status=" + status + ", ownerCode=" + ownerCode + ", ownerName="
				+ ownerName + ", shortName=" + shortName + ", genAreaCode=" + genAreaCode + ", genAreaName="
				+ genAreaName + ", ppId=" + ppId + "]";
	}
	public PowerPlantList(String ppCode, String ppName, int noOfUnit, double installedCapacity, double maxCapacity,
			String gridCode, String gridDesc, String status, String ownerCode, String ownerName, String shortName,
			String genAreaCode, String genAreaName, int ppId) {
		super();
		this.ppCode = ppCode;
		this.ppName = ppName;
		this.noOfUnit = noOfUnit;
		this.installedCapacity = installedCapacity;
		this.maxCapacity = maxCapacity;
		this.gridCode = gridCode;
		this.gridDesc = gridDesc;
		this.status = status;
		this.ownerCode = ownerCode;
		this.ownerName = ownerName;
		this.shortName = shortName;
		this.genAreaCode = genAreaCode;
		this.genAreaName = genAreaName;
		this.ppId = ppId;
	}
	public PowerPlantList() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
