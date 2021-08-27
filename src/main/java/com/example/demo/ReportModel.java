package com.example.demo;

public class ReportModel {
	
	String one,two,three,four,five;



	public ReportModel(String one, String two, String three, String four, String five) {
		super();
		this.one = one;
		this.two = two;
		this.three = three;
		this.four = four;
		this.five = five;
	}

	public ReportModel() {
		// TODO Auto-generated constructor stub
	}

	public String getOne() {
		return one;
	}

	public void setOne(String one) {
		this.one = one;
	}

	public String getTwo() {
		return two;
	}

	public void setTwo(String two) {
		this.two = two;
	}

	public String getThree() {
		return three;
	}

	public void setThree(String three) {
		this.three = three;
	}

	public String getFour() {
		return four;
	}

	public void setFour(String four) {
		this.four = four;
	}

	public String getFive() {
		return five;
	}

	public void setFive(String five) {
		this.five = five;
	}

	@Override
	public String toString() {
		return "ReportModel [one=" + one + ", two=" + two + ", three=" + three + ", four=" + four + ", five=" + five
				+ "]";
	}
	
	

}
