package _common.buyPass;

import java.util.Scanner;

public class ShopTest {
	public static void main(String[] args) {

		// 현재 상황을 출력해주는 current메소드
		// buy 메소드를 통해 product 입력 및 출력

		System.out.println("비밀번호를 입력하세요	>>	");
		// 비밀번호 7777 입력 시 로그인 성공
		Scanner sc = new Scanner(System.in);

		String pass = sc.nextLine();


		Shop s1 = new Shop("Test마트");
		
		//출력
		
		System.out.println(s1.login("admin", pass));
		s1.current();
		s1.buy("사과");
		s1.buy("복숭아");
	}
}