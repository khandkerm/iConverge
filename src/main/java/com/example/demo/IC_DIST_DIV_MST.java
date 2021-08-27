package com.example.demo;

public class IC_DIST_DIV_MST {
	private String DIV_CODE;
	private String DIV_NAME;
	public IC_DIST_DIV_MST() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_DIST_DIV_MST(String dIV_CODE, String dIV_NAME) {
		super();
		DIV_CODE = dIV_CODE;
		DIV_NAME = dIV_NAME;
	}
	public String getDIV_CODE() {
		return DIV_CODE;
	}
	public void setDIV_CODE(String dIV_CODE) {
		DIV_CODE = dIV_CODE;
	}
	public String getDIV_NAME() {
		return DIV_NAME;
	}
	public void setDIV_NAME(String dIV_NAME) {
		DIV_NAME = dIV_NAME;
	}
	@Override
	public String toString() {
		return "IC_DIST_DIV_MST [DIV_CODE=" + DIV_CODE + ", DIV_NAME=" + DIV_NAME + "]";
	}
	
	


}
