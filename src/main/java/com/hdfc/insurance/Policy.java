package com.hdfc.insurance;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Policy {
	
	
	@Id
	private int PolicyID;
	
	private String PolicyName;
	
	private double PolicyNumber;
	
	
	//Private //public //protected //default
	
	public Policy() {
		
		
	}
	
	public Policy(int PolicyID, String PolicyName, double PolicyNumber) {
		
		this.PolicyID=PolicyID;
		this.PolicyName=PolicyName;
		this.PolicyNumber=PolicyNumber;
	}

	public int getPolicyID() { 
		return PolicyID;
	}

	public void setPolicyID(int PolicyID) {
		this.PolicyID = PolicyID;
	}

	public String getPolicyName() {
		return PolicyName;
	}

	public void setPolicyName(String PolicyName) {
		this.PolicyName = PolicyName;
	}

	public double getPolicyNumber() {
		return PolicyNumber;
	}

	public void setPolicyNumber(double PolicyNumber) {
		this.PolicyNumber = PolicyNumber;
	}
	
	
	
}
