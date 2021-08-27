package com.example.demo;

public class ActivityInsert {
	private String activityCode;
	private String activityName;
	private String status;
	public String getActivityCode() {
		return activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ActivityInsert [activityCode=" + activityCode + ", activityName=" + activityName + ", status=" + status
				+ "]";
	}
	public ActivityInsert(String activityCode, String activityName, String status) {
		super();
		this.activityCode = activityCode;
		this.activityName = activityName;
		this.status = status;
	}
	public ActivityInsert() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
