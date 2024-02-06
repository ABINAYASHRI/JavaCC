package com.hexaware.entity;

public class Company {
	
	public Company() {};
	
	private int companyId;
	private String companyName;
	private String cloaction;
	
	public int getcompanyId() {
		return companyId;
	}
	public void setcompanyId(int companyId) {
		this.companyId = companyId;
	}
	
	public String getcompanyName() {
		return companyName;
	}
	public void setcompanyName(String companyName) {
		this.companyName=companyName;
	}
	
	
	public String getcloaction() {
		return cloaction;
	}
	
	public void setcloaction(String cloaction) {
		this.cloaction = cloaction;
	}
	public void setCompanyDetails(int companyId, String companyName, String cloaction) {
		this.companyId=companyId;
		this.companyName=companyName;
		this.cloaction=cloaction;
		
	}
	
}
