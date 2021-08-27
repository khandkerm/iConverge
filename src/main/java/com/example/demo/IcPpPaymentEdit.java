package com.example.demo;

public class IcPpPaymentEdit {
	private String billCycleCode;
	private String ppName;
	private String enrgPuchansed;
	private int payAmount;
	private String status;
	public String getBillCycleCode() {
		return billCycleCode;
	}
	public void setBillCycleCode(String billCycleCode) {
		this.billCycleCode = billCycleCode;
	}
	public String getPpName() {
		return ppName;
	}
	public void setPpName(String ppName) {
		this.ppName = ppName;
	}
	public String getEnrgPuchansed() {
		return enrgPuchansed;
	}
	public void setEnrgPuchansed(String enrgPuchansed) {
		this.enrgPuchansed = enrgPuchansed;
	}
	public int getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(int payAmount) {
		this.payAmount = payAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "IcPpPaymentEdit [billCycleCode=" + billCycleCode + ", ppName=" + ppName + ", enrgPuchansed="
				+ enrgPuchansed + ", payAmount=" + payAmount + ", status=" + status + "]";
	}
	public IcPpPaymentEdit(String billCycleCode, String ppName, String enrgPuchansed, int payAmount, String status) {
		super();
		this.billCycleCode = billCycleCode;
		this.ppName = ppName;
		this.enrgPuchansed = enrgPuchansed;
		this.payAmount = payAmount;
		this.status = status;
	}
	public IcPpPaymentEdit() {
		super();
		// TODO Auto-generated constructor stub
	}	
}
