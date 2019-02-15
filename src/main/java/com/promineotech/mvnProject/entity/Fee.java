package com.promineotech.mvnProject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fee {
	
	 private Long id; 
	 private Float feeAmount;
	 private String bookId; 
	 private String userName;
	 
	 
	 
	public Float getFeeAmount() {
		return feeAmount;
	}
	
	
	public void setFeeAmount(Float feeAmount) {
		this.feeAmount = feeAmount;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	} 

}
