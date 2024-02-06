package com.hexaware.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.hexaware.dao.ICareerhubImpl;
import com.hexaware.dao.ICareerhubInterface;
import com.hexaware.entity.Applicant;

public class AplicantController implements ApplicantInterface {
	ICareerhubInterface clr = new ICareerhubImpl();

	Scanner scan = new Scanner(System.in);

	@Override
	public void viewapplicant() throws SQLException{
		List<Applicant> app = clr.listAvailableApplicants();
		for (Applicant c : app) {
			printapplicants(c);

		}
	}

	public void printapplicants(Applicant a) {
//		System.out.println("Company ID: "+c.getcompanyId());
		System.out.println("Applicant FirstName: "+a.getfName());
		System.out.println("Applicant LastNAme: "+a.getlName());
		System.out.println("Applicant Email: "+a.getemail());
		System.out.println("Applicant Phone: "+a.getphone());
		System.out.println("Applicant Resume: "+a.getresume());
		System.out.println("=====================================\n");
		
	}

	public void addapplicant() throws SQLException {
		Applicant app = new Applicant();
		System.out.println("Enter First Name: ");
		app.setfName(scan.next());
		System.out.println("Enter Last Name: ");
		app.setlName(scan.next());
		System.out.println();
		System.out.println("Enter Email: ");
		app.setlName(scan.next());
		System.out.println("Enter Phone: ");
		app.setlName(scan.next());
		clr.addcompany();
	}

	

}
