package com.app.tester;
import java.sql.*;
import java.util.Scanner;

import static com.app.utils.DBUtils.openConnection;

public class TestprepConnection {

	public static void main(String[] args) {
		try(    Scanner sc = new Scanner(System.in);
				Connection cn=openConnection();//get db connection
				//Statement st=cn.createStatement();//create prepassed statement to hold sql
				PreparedStatement pst = cn.prepareStatement("select * from users where email=? and password=?");
				//execute select query and get the 
				//ResultSet rst = st.executeQuery("select * from users order by email desc")
				) {
			//resultset processing 
			//cursor --> before the 1st row
			System.out.println("enteer email and password");
			//set in parameters void setType(int paramindex,type value
			pst.setString(1,sc.next());
			pst.setString(2,sc.next());
			//execution methods -3
			//executeQuery
			try(ResultSet rst = pst.executeQuery()) {
			if(rst.next())
				System.out.println("Login succesfull ! hello" + rst.getString(4)+" "+ rst.getString(5));
			else
				System.out.println("failed login both invalid");
			}
			
//			while (rst.next()) {
//				
//			     System.out.printf(" id %d first_name %s last_name %s email %s"
//			     		+ "	password %s dob %s status %b role %s %n",rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getDate(6),rst.getBoolean(7),rst.getString(8));	
//				/*| id | first_name | last_name | email   
//				| password | dob        | status | role*/
//			}
////			System.out.println("connected to DB "+cn);//implementation class instance 
//		}//JVM : pst.close() cn.close() scannerclose
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
