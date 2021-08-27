package com.example.demo;

public class PeriodList {
	private String yearCode;
	private String periodCode;
	private String periodDescr;
	private String fromDate;
	private String toDate;
	private String status;
	private int prId;
	public String getYearCode() {
		return yearCode;
	}
	public void setYearCode(String yearCode) {
		this.yearCode = yearCode;
	}
	public String getPeriodCode() {
		return periodCode;
	}
	public void setPeriodCode(String periodCode) {
		this.periodCode = periodCode;
	}
	public String getPeriodDescr() {
		return periodDescr;
	}
	public void setPeriodDescr(String periodDescr) {
		this.periodDescr = periodDescr;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPrId() {
		return prId;
	}
	public void setPrId(int prId) {
		this.prId = prId;
	}
	@Override
	public String toString() {
		return "PeriodList [yearCode=" + yearCode + ", periodCode=" + periodCode + ", periodDescr=" + periodDescr
				+ ", fromDate=" + fromDate + ", toDate=" + toDate + ", status=" + status + ", prId=" + prId + "]";
	}
	public PeriodList(String yearCode, String periodCode, String periodDescr, String fromDate, String toDate,
			String status, int prId) {
		super();
		this.yearCode = yearCode;
		this.periodCode = periodCode;
		this.periodDescr = periodDescr;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.status = status;
		this.prId = prId;
	}
	public PeriodList() {
		super();
		// TODO Auto-generated constructor stub
	}

}
