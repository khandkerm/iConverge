package com.example.demo;

public class LoginModel {
	private String p_User_Id;
	private String p_Password;
	private String location;
	public LoginModel() {

		// TODO Auto-generated constructor stub
	}
	public LoginModel(String p_User_Id, String p_Password,String location) {
		super();
		this.p_User_Id = p_User_Id;
		this.p_Password = p_Password;
		this.location = location;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getP_User_Id() {
		return p_User_Id;
	}
	public void setP_User_Id(String p_User_Id) {
		this.p_User_Id = p_User_Id;
	}
	public String getP_Password() {
		return p_Password;
	}
	public void setP_Password(String p_Password) {
		this.p_Password = p_Password;
	}
	@Override
	public String toString() {
		return "LoginModel [p_User_Id=" + p_User_Id + ", p_Password=" + p_Password + ", location=" + location + "]";
	}
	
	

}
