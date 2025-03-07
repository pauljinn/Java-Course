package com.learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	Connection con;

	public LoginDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "1234");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean checkCreds(String userName, String password) {
		try {
			PreparedStatement st = con.prepareStatement("select * from user_creds where username = ? and password = ?");
			st.setString(1, userName);
			st.setString(2, password);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				return true;
			}

			else {
				return false;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
