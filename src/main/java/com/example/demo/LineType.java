package com.example.demo;

public class LineType {
	private String lineType;
	private String lineTypeName;
	public String getLineType() {
		return lineType;
	}
	public void setLineType(String lineType) {
		this.lineType = lineType;
	}
	public String getLineTypeName() {
		return lineTypeName;
	}
	public void setLineTypeName(String lineTypeName) {
		this.lineTypeName = lineTypeName;
	}
	@Override
	public String toString() {
		return "LineType [lineType=" + lineType + ", lineTypeName=" + lineTypeName + "]";
	}
	public LineType(String lineType, String lineTypeName) {
		super();
		this.lineType = lineType;
		this.lineTypeName = lineTypeName;
	}
	public LineType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
