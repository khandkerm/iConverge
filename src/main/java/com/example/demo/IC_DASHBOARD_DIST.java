package com.example.demo;

public class IC_DASHBOARD_DIST {

	private String zone;
	private String circle;
	private String div;
	private String loc;
//	private String Feeder;
	private String report;
	private String bill;
	public IC_DASHBOARD_DIST() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_DASHBOARD_DIST(String zone, String circle, String div, String loc, String report, String bill) {
		super();
		this.zone = zone;
		this.circle = circle;
		this.div = div;
		this.loc = loc;
		this.report = report;
		this.bill = bill;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getCircle() {
		return circle;
	}
	public void setCircle(String circle) {
		this.circle = circle;
	}
	public String getDiv() {
		return div;
	}
	public void setDiv(String div) {
		this.div = div;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	public String getBill() {
		return bill;
	}
	public void setBill(String bill) {
		this.bill = bill;
	}
	@Override
	public String toString() {
		return "IC_DASHBOARD_DIST [zone=" + zone + ", circle=" + circle + ", div=" + div + ", loc=" + loc + ", report="
				+ report + ", bill=" + bill + "]";
	}
	
	
}
