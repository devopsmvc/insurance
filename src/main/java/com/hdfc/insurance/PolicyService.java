package com.hdfc.insurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {
	
	@Autowired
	PolicyRepository PolicyRepository;
	
	public Policy CreatePolicy() {
		Policy e = new Policy(12345, "Mahesh", 98765);
		return e;
		
	}
	
	public Policy UpdatePolicy(Policy Policy) {
		return PolicyRepository.save(Policy);
	}

		

	public Policy ViewPolicy(int PolicyID) {
		return PolicyRepository.findById(PolicyID).get();
	}
	
	public void  DeletePolicy(int PolicyID) {
		PolicyRepository.deleteById(PolicyID);
	}

}
