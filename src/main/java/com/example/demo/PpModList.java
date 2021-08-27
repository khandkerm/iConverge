package com.example.demo;

public class PpModList {
	private int ppModId;
	private String billCycleCode;
	private String status;
	private String ppCode;
	private String ppName;
	public int getPpModId() {
		return ppModId;
	}
	public void setPpModId(int ppModId) {
		this.ppModId = ppModId;
	}
	public String getBillCycleCode() {
		return billCycleCode;
	}
	public void setBillCycleCode(String billCycleCode) {
		this.billCycleCode = billCycleCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
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
	@Override
	public String toString() {
		return "PpModList [ppModId=" + ppModId + ", billCycleCode=" + billCycleCode + ", status=" + status + ", ppCode="
				+ ppCode + ", ppName=" + ppName + "]";
	}
	public PpModList(int ppModId, String billCycleCode, String status, String ppCode, String ppName) {
		super();
		this.ppModId = ppModId;
		this.billCycleCode = billCycleCode;
		this.status = status;
		this.ppCode = ppCode;
		this.ppName = ppName;
	}
	public PpModList() {
		super();
		// TODO Auto-generated constructor stub
	}
	 

}
