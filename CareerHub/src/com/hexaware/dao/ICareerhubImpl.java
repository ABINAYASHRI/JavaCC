package com.hexaware.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.entity.Applicant;
import com.hexaware.entity.Company;
import com.hexaware.util.DBconnection;

public class ICareerhubImpl implements ICareerhubInterface {

	@Override
	public List<Company> listAvailableCompany() throws SQLException {
		List<Company> lsCust = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rSet = null;
		try {
			con = DBconnection.getConnection();
			String query = " SELECT * FROM Company";
			pstmt = con.prepareStatement(query);
			rSet = pstmt.executeQuery();
			while (rSet.next()) {
				Company cst = new Company();
				cst.setCompanyDetails(rSet.getInt(1), rSet.getString(2), rSet.getString(3));
				lsCust.add(cst);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (con != null) {
				con.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
		}
		return lsCust;
	}

	public void addcompany(Company comp) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		
			con = DBconnection.getConnection();
			String query = "INSERT INTO Company (companyName, clocation)VALUES (?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, comp.getcompanyName());
			pstmt.setString(2, comp.getcloaction());
			try {
				pstmt = con.prepareStatement(query);
				int qryResult = pstmt.executeUpdate();
				if(qryResult == 1) {
						System.out.println("New data inserted");
					} else {
						System.out.println("Something went wrong on inserting");
					}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			}
		
		
	}

	public void addapllicant(Applicant app) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		
			con = DBconnection.getConnection();
			String query = "INSERT INTO Company (fName, lName, email, phone, resume)VALUES (?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, app.getfName());
			pstmt.setString(2, app.getlName());
			pstmt.setString(3, app.getemail());
			pstmt.setString(4, app.getphone());
			pstmt.setString(5, app.getresume());
			try {
				pstmt = con.prepareStatement(query);
				int qryResult = pstmt.executeUpdate();
				if(qryResult == 1) {
						System.out.println("New data inserted");
					} else {
						System.out.println("Something went wrong on inserting");
					}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			}
		
	}

	@Override
	public List<Applicant> listAvailableApplicants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addcompany() throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
