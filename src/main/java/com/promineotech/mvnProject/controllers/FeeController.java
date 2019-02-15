package com.promineotech.mvnProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.mvnProject.entity.Fee;
import com.promineotech.mvnProject.service.FeeService;

@RestController
public class FeeController {
	
	@Autowired
	FeeService service; 
	
	@RequestMapping(value="/fees", method=RequestMethod.POST)
	public Fee addFee(@RequestBody Fee fee) {
		
		return service.createFee(fee);
	}
	
	@RequestMapping("/fees")
	public Iterable<Fee> getFees() {
		return service.getFees();
	}
	
	@RequestMapping("/fees/{id}")
	public Fee getFee(@PathVariable Long id) {
		return service.getFee(id);
	}
	
	@RequestMapping(value="/fees/{id}" , method=RequestMethod.PUT)
	public Fee updateFee(@PathVariable Long id, @RequestBody Fee fee) {
		return service.updateFee(id, fee); 
	}
	
	@RequestMapping(value="/fees/{id}" , method=RequestMethod.DELETE)
	public void deleteFee(@PathVariable Long id) {
		service.deleteFee(id);
	}
	

}
