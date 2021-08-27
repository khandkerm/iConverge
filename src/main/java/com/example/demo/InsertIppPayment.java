package com.example.demo;

public class InsertIppPayment {
	private String billCycleCode;
	private String ppCode;
	private String engrPurchased;
	private String payAmount;
	private String payDate;
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
	public String getEngrPurchased() {
		return engrPurchased;
	}
	public void setEngrPurchased(String engrPurchased) {
		this.engrPurchased = engrPurchased;
	}
	public String getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayDate() {
		return payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "InsertIppPayment [billCycleCode=" + billCycleCode + ", ppCode=" + ppCode + ", engrPurchased="
				+ engrPurchased + ", payAmount=" + payAmount + ", payDate=" + payDate + ", status=" + status + "]";
	}
	public InsertIppPayment(String billCycleCode, String ppCode, String engrPurchased, String payAmount, String payDate,
			String status) {
		super();
		this.billCycleCode = billCycleCode;
		this.ppCode = ppCode;
		this.engrPurchased = engrPurchased;
		this.payAmount = payAmount;
		this.payDate = payDate;
		this.status = status;
	}
	public InsertIppPayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
