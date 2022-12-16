package com.hdfc.insurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicyController {
	
	@Autowired
	PolicyService PolicyService;
	
	@GetMapping("/helloworld")
	public String helloWorld() {  
		return "Hello World"; 
	}
	 
	@GetMapping("/sayhi")
	public String sayhi() {
		return "Hi from Spring Boot";
	}
	
	
	@PostMapping("/CreatePolicy")
	public Policy CreatePolicy() {
		
		return PolicyService.CreatePolicy();
	}
	
	@PutMapping("/UpdatePolicy")
	public Policy UpdatePolicy(@RequestBody Policy Policy) {
		
		return PolicyService.UpdatePolicy(Policy);
	}

	
	@GetMapping("/ViewPolicy/{PolicyID}")
	public Policy ViewPolicyDetails(@PathVariable(value="PolicyID") int PolicyID) {
		return PolicyService.ViewPolicy(PolicyID);
	}
	
	@DeleteMapping("/DeletePolicy/{PolicyID}")
	public void DeletePolicyDetails(@PathVariable(value="PolicyID") int PolicyID) {
		PolicyService.DeletePolicy(PolicyID);
	}


}
