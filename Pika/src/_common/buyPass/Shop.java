package _common.buyPass;

public class Shop {

	// 아이디와 패스워드를 입력하고 일치하면 구매목록에 추가
	/*
	 * 아이디 : admin 비밀번호 : 7777 class : shop - 생성자를 통해 쇼핑몰 이름을 선언 Method : login -
	 * 로그인, buy - 로그인 성공 시 String 값으로 물품을 입력 받아 물품이름 출력, current - 쇼핑몰 이름과 현재 로그인한
	 * 계정 출력
	 */

	String name; // 사용자명
	String id; // 사용자 아이디
	String password; // 사용자 비밀번호
	String product; // 상품

	Shop(String name) {
		this.name = name; // 생성자를 통해 할당
	}

	String login(String id, String password) {

		// 문자열을 리턴하는 메소드로 만듦
		// 로그인이 성공하면 리턴값으로 return = "로그인 성공" 문자열을 리턴한다.

		String result = "";

		if (id.equals("admin") && password.equals("7777")) {
			this.id = id;
			this.password = password;
			result = "로그인 성공";
		} else {
			this.id = "로그인 되지 않음";
			this.password = "로그인  실패";
		}

		return result;

	}

	void buy(String product) {

		// login() 메소드에서 id가 입력이 안되거나 id에 "로그인 되지 않음" 문자열이 할당되었다면 구매 불가능.
		// 그렇지 않다면 (login 메소드에서 id에 id가 입력이 되었다면) buy()메소드에서 입력받은 product 문자열을 출력.
		/* 로그인 시에만 구매 가능하다 */

		if (id == null || id.equals("로그인 되지 않음")) {
			System.out.println("구매가 불가능");
		} else {
			this.product = product;
			System.out.println("구매한 물건은 : " + product);
		}
	}

	void current() {
		System.out.println("쇼핑몰" + name + "의 현재상황");
		System.out.println("로그인한 계정 : " + id);
	}

}
