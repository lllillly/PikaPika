
package signup;

import java.util.Scanner;

import scott_emp.dao.DBconnection;

public class Signup_crud_controller {
public static void main(String[] args) {
		
		System.out.println("웹페이지 ");
	
		
		Scanner sc = new Scanner(System.in);
        System.out.print("ID : ");
		String data1 = sc.nextLine();
		
		System.out.println();
		
		System.out.print("PASS : ");
		String data2 = sc.nextLine();
		
		DBconnection db = new DBconnection(data1, data2);
		
	
}
		
	}
	
