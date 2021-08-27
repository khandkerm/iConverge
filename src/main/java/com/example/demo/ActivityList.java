package com.example.demo;

public class ActivityList {
	private int activityId;
	private String activityCode;
	private String activityName;
	private String status;
	public int getActivityId() {
		return activityId;
	}
	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}
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
		return "ActivityList [activityId=" + activityId + ", activityCode=" + activityCode + ", activityName="
				+ activityName + ", status=" + status + "]";
	}
	public ActivityList(int activityId, String activityCode, String activityName, String status) {
		super();
		this.activityId = activityId;
		this.activityCode = activityCode;
		this.activityName = activityName;
		this.status = status;
	}
	public ActivityList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
