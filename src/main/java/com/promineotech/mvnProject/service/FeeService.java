package com.promineotech.mvnProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.mvnProject.entity.Fee;
import com.promineotech.mvnProject.repository.FeeRepository;

@Service 
public class FeeService {
	
	@Autowired
	FeeRepository repo; 
	
	public Fee getFee(Long id) {
		return repo.findOne(id);
	}
	
	public Iterable<Fee> getFees() {
		return repo.findAll();
	}
	
	public void deleteFee(Long id) {
		repo.delete(id);
		
	}
	
	public Fee updateFee(Long id, Fee fee) {
		Fee foundFee= repo.findOne(id);
		if (foundFee != null) {
			foundFee.setFeeAmount(fee.getFeeAmount());
			foundFee.setBookId(fee.getBookId());
			foundFee.setUserName(fee.getUserName());
			repo.save(foundFee);
		}
		return foundFee; 
	}
	
	public Fee createFee(Fee fee) {
		return repo.save(fee);
	}
	
	
	

}
