package com.hexaware.entity;

import java.util.Date;

//import java.sql.Date;

public class JobListing {
	
	private int jobid;
	private int cmpnyid;
	private String jtitle;
	private String jdesc;
	private String jloc;
	private double salary;
	private String jtype;
	private Date jpostdtae;
	public int getJobid() {
		return jobid;
	}
	public void setJobid(int jobid) {
		this.jobid = jobid;
	}
	public int getCmpnyid() {
		return cmpnyid;
	}
	public void setCmpnyid(int cmpnyid) {
		this.cmpnyid = cmpnyid;
	}
	public String getJtitle() {
		return jtitle;
	}
	public void setJtitle(String jtitle) {
		this.jtitle = jtitle;
	}
	public String getJdesc() {
		return jdesc;
	}
	public void setJdesc(String jdesc) {
		this.jdesc = jdesc;
	}
	public String getJloc() {
		return jloc;
	}
	public void setJloc(String jloc) {
		this.jloc = jloc;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getJtype() {
		return jtype;
	}
	public void setJtype(String jtype) {
		this.jtype = jtype;
	}
	public Date getJpostdtae() {
		return jpostdtae;
	}
	public void setJpostdtae(Date jpostdtae) {
		this.jpostdtae = jpostdtae;
	}

}
