package com.example.demo;

public class UsageCatCode {
	private String usageCatCode;
	private String usageCatName;
	private String status;
	private String usageType;
	private String lineType;
	private String areaCode;
	public String getUsageCatCode() {
		return usageCatCode;
	}
	public void setUsageCatCode(String usageCatCode) {
		this.usageCatCode = usageCatCode;
	}
	public String getUsageCatName() {
		return usageCatName;
	}
	public void setUsageCatName(String usageCatName) {
		this.usageCatName = usageCatName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUsageType() {
		return usageType;
	}
	public void setUsageType(String usageType) {
		this.usageType = usageType;
	}
	public String getLineType() {
		return lineType;
	}
	public void setLineType(String lineType) {
		this.lineType = lineType;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	@Override
	public String toString() {
		return "UsageCatCode [usageCatCode=" + usageCatCode + ", usageCatName=" + usageCatName + ", status=" + status
				+ ", usageType=" + usageType + ", lineType=" + lineType + ", areaCode=" + areaCode + "]";
	}
	public UsageCatCode(String usageCatCode, String usageCatName, String status, String usageType, String lineType,
			String areaCode) {
		super();
		this.usageCatCode = usageCatCode;
		this.usageCatName = usageCatName;
		this.status = status;
		this.usageType = usageType;
		this.lineType = lineType;
		this.areaCode = areaCode;
	}
	public UsageCatCode() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
