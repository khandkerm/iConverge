package com.example.demo;

public class GenArea {
	private String genAreaCode;
	private String genAreaName;
	public String getGenAreaCode() {
		return genAreaCode;
	}
	public void setGenAreaCode(String genAreaCode) {
		this.genAreaCode = genAreaCode;
	}
	public String getGenAreaName() {
		return genAreaName;
	}
	public void setGenAreaName(String genAreaName) {
		this.genAreaName = genAreaName;
	}
	@Override
	public String toString() {
		return "GenArea [genAreaCode=" + genAreaCode + ", genAreaName=" + genAreaName + "]";
	}
	public GenArea(String genAreaCode, String genAreaName) {
		super();
		this.genAreaCode = genAreaCode;
		this.genAreaName = genAreaName;
	}
	public GenArea() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
