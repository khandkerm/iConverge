package com.example.demo;

public class DemandPhaseList {
	private String dpCode;
	private String demandPhase;
	private int srlNo;
	private String status;
	private int dpId;
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
	public int getDpId() {
		return dpId;
	}
	public void setDpId(int dpId) {
		this.dpId = dpId;
	}
	@Override
	public String toString() {
		return "DemandPhaseList [dpCode=" + dpCode + ", demandPhase=" + demandPhase + ", srlNo=" + srlNo + ", status="
				+ status + ", dpId=" + dpId + "]";
	}
	public DemandPhaseList(String dpCode, String demandPhase, int srlNo, String status, int dpId) {
		super();
		this.dpCode = dpCode;
		this.demandPhase = demandPhase;
		this.srlNo = srlNo;
		this.status = status;
		this.dpId = dpId;
	}
	public DemandPhaseList() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
