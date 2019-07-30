package _common.buyPass;

import java.util.Scanner;

import scott_emp.dao.DBconnection;

/**
 * @author hyojin
 * 데이터베이스에 접근하여 ID과 PASS가 일치하면 해당 사원의 모든 정보를 조회하는 공통기능
 *
 */
public class Info_select_common {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ename : ");
		String ename = sc.nextLine();
		
		System.out.print("empno : ");
		String empno = sc.nextLine();
		
		DBconnection dd = new DBconnection(ename, empno);
	}

}
