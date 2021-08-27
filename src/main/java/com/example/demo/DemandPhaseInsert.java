package com.example.demo;

public class DemandPhaseInsert {
	private String dpCode;
	private String demandPhase;
	private int srlNo;
	private String status;
	public String getDpCode() {
		return dpCode;
	}
	public void setDpCode(String dpCode) {
		this.dpCode = dpCode;
	}
	public String getDemandPhase() {
		return demandPhase;
	}
	public void setDemandPhase(String demandPhase) {
		this.demandPhase = demandPhase;
	}
	public int getSrlNo() {
		return srlNo;
	}
	public void setSrlNo(int srlNo) {
		this.srlNo = srlNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "DemandPhaseInsert [dpCode=" + dpCode + ", demandPhase=" + demandPhase + ", srlNo=" + srlNo + ", status="
				+ status + "]";
	}
	public DemandPhaseInsert(String dpCode, String demandPhase, int srlNo, String status) {
		super();
		this.dpCode = dpCode;
		this.demandPhase = demandPhase;
		this.srlNo = srlNo;
		this.status = status;
	}
	public DemandPhaseInsert() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
