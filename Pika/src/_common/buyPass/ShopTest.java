package _common.buyPass;

public class ShopTest {
	public static void main(String[] args) {

		// 생성자를 통해 s1이라는 객체를 생성한다.
		// 이름은 Test마트
		// 로그인 메소드를 통해 로그인
		// 현재 상황을 출력해주는 current메소드
		// buy 메소드를 통해 product 입력 및 출력

		Shop s1 = new Shop("Test마트");

		System.out.println(s1.login("admin", "7777"));
		s1.current();
		s1.buy("사과");
		s1.buy("복숭아");

	}

}
