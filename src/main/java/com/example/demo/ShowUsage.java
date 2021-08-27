package com.example.demo;

public class ShowUsage {
	private int usageCatId;
	private String usageCatCode;
	private String usageCatName;
	private String usageType;
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
		return "ShowUsage [usageCatId=" + usageCatId + ", usageCatCode=" + usageCatCode + ", usageCatName="
				+ usageCatName + ", usageType=" + usageType + ", lineTypeName=" + lineTypeName + ", areaName="
				+ areaName + "]";
	}
	public ShowUsage(int usageCatId, String usageCatCode, String usageCatName, String usageType, String lineTypeName,
			String areaName) {
		super();
		this.usageCatId = usageCatId;
		this.usageCatCode = usageCatCode;
		this.usageCatName = usageCatName;
		this.usageType = usageType;
		this.lineTypeName = lineTypeName;
		this.areaName = areaName;
	}
	public ShowUsage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
