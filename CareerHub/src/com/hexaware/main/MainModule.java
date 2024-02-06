package com.hexaware.main;

import java.sql.SQLException;

import java.util.Scanner;
import com.hexaware.controller.*;

public class MainModule {

	public static void main(String[] args) throws SQLException {
		
		System.out.println("===============================");
		System.out.println("=====WELCOME TO CAREER HUB=====");
		System.out.println("===============================");

//		CareerhubInterface chc = new CareerhubController();
		JobListingInterface jlc = new JobListingController();
		CompanyInterface cc = new CompanyController();
		ApplicantInterface ac = new AplicantController();
		JobApplicationInterface jac= new JobApplicationController();
		
		
		
		Scanner sc = new Scanner(System.in);
		String ch = null;
		do {
			System.out.println("Enter your choice");
			System.out.println("1. To view Joblisting");
			System.out.println("2. To insert JobListing");
			System.out.println("3. To view a Company");
			System.out.println("4. To insert a Company");
			System.out.println("5. To view  Applicant");
			System.out.println("6. To insert Applicant");
			System.out.println("7. To view JobApplication");
			System.out.println("8. To insert JobApplication");
						
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				jlc.viewjoblisting();
				break;
			}
			case 2: {
				jlc.addjoblisting();
				break;
			}
			case 3: {
				cc.viewcompany();
				break;
			}
			case 4: {
				cc.addcompany();
				break;
			}
			case 5: {
				ac.viewapplicant();
				break;
			}
			case 6: {
				ac.addapplicant();
				break;
			}
			case 7: {
				jac.viewjobapplication();
				break;
			}
			case 8: {
				jac.addjobapplication();
				break;
			}
			default: {
				System.out.println("Enter a valid Choice !!!");
				break;
			}
			}
			System.out.println("Do u wnt to continue ? Y or y");
			ch = sc.next();

		} while (ch.equals("Y") || ch.equals("y"));
		System.out.println("Thanks for using our system !!!");
		System.exit(0);

	}

}