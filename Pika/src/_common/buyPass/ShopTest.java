package _common.buyPass;

import java.util.Scanner;

import scott_emp.dao.DBconnection;

public class ShopTest {
	public static void main(String[] args) {

		// 현재 상황을 출력해주는 current메소드
		// buy 메소드를 통해 product 입력 및 출력

		System.out.println("비밀번호를 입력하세요	>>	");
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("ename : ");
		String ename = sc.nextLine();
		
		
		System.out.print("empno : ");
		String empno = sc.nextLine();

		DBconnection dd = new DBconnection(ename, empno);

		Shop s1 = new Shop("Test마트");

		System.out.println(s1.login(ename, empno));
		s1.current();
		s1.buy("사과");
		s1.buy("복숭아");
	}
}