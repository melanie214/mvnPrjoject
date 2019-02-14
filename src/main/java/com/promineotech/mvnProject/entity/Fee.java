package com.promineotech.mvnProject.entity;

public class Fee {
	
	 private Float feeAmount;
	 private String bookId; 
	 private String userName;
	 
	 
	 
	public Float getFeeAmount() {
		return feeAmount;
	}
	
	
	public void setFeeAmount(Float feeAmount) {
		this.feeAmount = feeAmount;
	}
	
	
	public String getBookId() {
		return bookId;
	}
	
	
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	
	
	public String getUserName() {
		return userName;
	}
	
	
	public void setUserName(String userName) {
		this.userName = userName;
	} 

}
