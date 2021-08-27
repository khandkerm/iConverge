package com.example.demo;

public class InsertPpMod {
	private String billCycleCode;
	private String ppCode;
	private String status;
	public String getBillCycleCode() {
		return billCycleCode;
	}
	public void setBillCycleCode(String billCycleCode) {
		this.billCycleCode = billCycleCode;
	}
	public String getPpCode() {
		return ppCode;
	}
	public void setPpCode(String ppCode) {
		this.ppCode = ppCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "InsertPpMod [billCycleCode=" + billCycleCode + ", ppCode=" + ppCode + ", status=" + status + "]";
	}
	public InsertPpMod(String billCycleCode, String ppCode, String status) {
		super();
		this.billCycleCode = billCycleCode;
		this.ppCode = ppCode;
		this.status = status;
	}
	public InsertPpMod() {
		super();
		// TODO Auto-generated constructor stub
	}
}
