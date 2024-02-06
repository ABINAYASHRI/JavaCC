package com.hexaware.dao;

import java.sql.SQLException;
import java.util.List;

import com.hexaware.entity.Applicant;
import com.hexaware.entity.Company;

public interface ICareerhubInterface {

	List<Company> listAvailableCompany() throws SQLException;

	void addcompany()throws SQLException;

	List<Applicant> listAvailableApplicants();

	
	

}
