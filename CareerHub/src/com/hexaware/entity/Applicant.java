package com.hexaware.entity;

public class Applicant {
	private int applicantId;
	private String fName;
	private String lName;
	private String phone;
	private String resume;
	private String email;
	
	
	public int getapplicantId() {
		return applicantId;
		}
	
	public String getfName() {return fName;}
	public String getlName() {return lName;}
	public String getphone() {return phone;}
	public String getemail() {return email;}
	public String getresume() {return resume;}
	
	public void setapplicantId(int applicantId) {
		this.applicantId = applicantId;
		}
	public void setfName(String fName) {
		this.fName = fName;
		}
	public void setlName(String lName) {
		this.lName = lName;
		}
	public void setphone(String phone) {
		this.phone = phone;
		}
	public void setresume(String resume) {
		this.resume = resume;
		}

}
