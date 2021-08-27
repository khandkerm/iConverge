package com.example.demo;

public class IppPaymentList {
	private String billCycleCode;
	private String ppCode;
	private String ppName;
	private String engrPurchased;
	private String payAmount;
	private String payDate;
	private int ppPayId;
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
	public String getPpName() {
		return ppName;
	}
	public void setPpName(String ppName) {
		this.ppName = ppName;
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
	public int getPpPayId() {
		return ppPayId;
	}
	public void setPpPayId(int ppPayId) {
		this.ppPayId = ppPayId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "IppPaymentList [billCycleCode=" + billCycleCode + ", ppCode=" + ppCode + ", ppName=" + ppName
				+ ", engrPurchased=" + engrPurchased + ", payAmount=" + payAmount + ", payDate=" + payDate
				+ ", ppPayId=" + ppPayId + ", status=" + status + "]";
	}
	public IppPaymentList(String billCycleCode, String ppCode, String ppName, String engrPurchased, String payAmount,
			String payDate, int ppPayId, String status) {
		super();
		this.billCycleCode = billCycleCode;
		this.ppCode = ppCode;
		this.ppName = ppName;
		this.engrPurchased = engrPurchased;
		this.payAmount = payAmount;
		this.payDate = payDate;
		this.ppPayId = ppPayId;
		this.status = status;
	}
	public IppPaymentList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
