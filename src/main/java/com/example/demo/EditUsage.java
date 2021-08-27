package com.example.demo;

public class EditUsage {
	private int usageCatId;
	private String usageCatCode;
	private String usageCatName;
	private String usageType;
	private String usageTypeCode;
	private String usageLineCode;
	private String lineTypeName;
	private String areaName;
	public int getUsageCatId() {
		return usageCatId;
	}
	public void setUsageCatId(int usageCatId) {
		this.usageCatId = usageCatId;
	}
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
	public String getUsageType() {
		return usageType;
	}
	public void setUsageType(String usageType) {
		this.usageType = usageType;
	}
	public String getUsageTypeCode() {
		return usageTypeCode;
	}
	public void setUsageTypeCode(String usageTypeCode) {
		this.usageTypeCode = usageTypeCode;
	}
	public String getUsageLineCode() {
		return usageLineCode;
	}
	public void setUsageLineCode(String usageLineCode) {
		this.usageLineCode = usageLineCode;
	}
	public String getLineTypeName() {
		return lineTypeName;
	}
	public void setLineTypeName(String lineTypeName) {
		this.lineTypeName = lineTypeName;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	@Override
	public String toString() {
		return "EditUsage [usageCatId=" + usageCatId + ", usageCatCode=" + usageCatCode + ", usageCatName="
				+ usageCatName + ", usageType=" + usageType + ", usageTypeCode=" + usageTypeCode + ", usageLineCode="
				+ usageLineCode + ", lineTypeName=" + lineTypeName + ", areaName=" + areaName + "]";
	}
	public EditUsage(int usageCatId, String usageCatCode, String usageCatName, String usageType, String usageTypeCode,
			String usageLineCode, String lineTypeName, String areaName) {
		super();
		this.usageCatId = usageCatId;
		this.usageCatCode = usageCatCode;
		this.usageCatName = usageCatName;
		this.usageType = usageType;
		this.usageTypeCode = usageTypeCode;
		this.usageLineCode = usageLineCode;
		this.lineTypeName = lineTypeName;
		this.areaName = areaName;
	}
	public EditUsage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
