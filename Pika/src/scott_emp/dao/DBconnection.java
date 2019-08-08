package scott_emp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBconnection {	// 기능
	

	public DBconnection() {
		
	}

	public DBconnection(String empno, String ename) {
		
		String driver 	= "oracle.jdbc.driver.OracleDriver";
		String id 		= "scott";
		String pass 	= "tiger";
		String url		= "jdbc:oracle:thin:@localhost:1521:orcl";
		
		Connection conn;
		Statement stmt;
		
		try {
			Class.forName(driver);
		
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
			
			String 	query =  " 		SELECT ";
					query += " 				JOB ";
					query += " 		  FROM  EMP ";
					query += " 		 WHERE  ENAME =  '" + ename +"' ";
					query += " 		   AND  EMPNO =  '" + empno +"' ";
				   
		    ResultSet rs = stmt.executeQuery(query);
		    
		    
		    String an = "";
		    while (rs.next())
		    {
		    	an = rs.getNString("JOB");
		    	System.out.println("조회된 값 : " + an);
		    }
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
		
		
	
	}
	
	
	public void test(String data) {
		System.out.println(data);
	}
	
	
	
}
