package com.example.demo;

public class IC_FORWARD_HEADER_MST {
	
	private String BILL_CYCLE_CODE;
	private String NET_ENRG_GEN_FUEL_TYPE_HEADER;
	private String FRD_HDR_ID;
	public IC_FORWARD_HEADER_MST() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "IC_FORWARD_HEADER_MST [BILL_CYCLE_CODE=" + BILL_CYCLE_CODE + ", NET_ENRG_GEN_FUEL_TYPE_HEADER="
				+ NET_ENRG_GEN_FUEL_TYPE_HEADER + ", FRD_HDR_ID=" + FRD_HDR_ID + "]";
	}
	public String getBILL_CYCLE_CODE() {
		return BILL_CYCLE_CODE;
	}
	public void setBILL_CYCLE_CODE(String bILL_CYCLE_CODE) {
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
	}
	public String getNET_ENRG_GEN_FUEL_TYPE_HEADER() {
		return NET_ENRG_GEN_FUEL_TYPE_HEADER;
	}
	public void setNET_ENRG_GEN_FUEL_TYPE_HEADER(String nET_ENRG_GEN_FUEL_TYPE_HEADER) {
		NET_ENRG_GEN_FUEL_TYPE_HEADER = nET_ENRG_GEN_FUEL_TYPE_HEADER;
	}
	public String getFRD_HDR_ID() {
		return FRD_HDR_ID;
	}
	public void setFRD_HDR_ID(String fRD_HDR_ID) {
		FRD_HDR_ID = fRD_HDR_ID;
	}
	public IC_FORWARD_HEADER_MST(String bILL_CYCLE_CODE, String nET_ENRG_GEN_FUEL_TYPE_HEADER, String fRD_HDR_ID) {
		super();
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
		NET_ENRG_GEN_FUEL_TYPE_HEADER = nET_ENRG_GEN_FUEL_TYPE_HEADER;
		FRD_HDR_ID = fRD_HDR_ID;
	}

}
