package com.example.demo;

public class GridList {
	private String gridCode;
	private String gridName;
	public String getGridCode() {
		return gridCode;
	}
	public void setGridCode(String gridCode) {
		this.gridCode = gridCode;
	}
	public String getGridName() {
		return gridName;
	}
	public void setGridName(String gridName) {
		this.gridName = gridName;
	}
	@Override
	public String toString() {
		return "GridList [gridCode=" + gridCode + ", gridName=" + gridName + "]";
	}
	public GridList(String gridCode, String gridName) {
		super();
		this.gridCode = gridCode;
		this.gridName = gridName;
	}
	public GridList() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
