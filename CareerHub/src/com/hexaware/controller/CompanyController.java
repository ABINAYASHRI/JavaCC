package com.hexaware.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


import com.hexaware.entity.Company;
import com.hexaware.dao.*;


public class CompanyController implements CompanyInterface {
	
	ICareerhubInterface clr = new ICareerhubImpl();

	Scanner scan = new Scanner(System.in);

	@Override
	public void viewcompany() throws SQLException{
		List<Company> company = clr.listAvailableCompany();
		for (Company c : company) {
			printcompany(c);

		}
	}

	public void printcompany(Company c) {
//		System.out.println("Company ID: "+c.getcompanyId());
		System.out.println("Company Name: "+c.getcompanyName());
		System.out.println("Company Location: "+c.getcloaction());
		System.out.println("=====================================\n");
		
	}

	@Override
	public void addcompany() throws SQLException {
		Company company = new Company();
		System.out.println("Enter Company Name: ");
		company.setcompanyName(scan.next());
		System.out.println("Enter Company Location: ");
		company.setcloaction(scan.next());
		System.out.println();
		clr.addcompany();
	}

}
