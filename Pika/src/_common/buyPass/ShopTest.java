package _common.buyPass;

import java.util.Scanner;

public class ShopTest {
	public static void main(String[] args) {

		// �����ڸ� ���� s1�̶�� ��ü�� �����Ѵ�.
		// �̸��� Test��Ʈ
		// �α��� �޼ҵ带 ���� �α���
		// ���� ��Ȳ�� ������ִ� current�޼ҵ�
		// buy �޼ҵ带 ���� product �Է� �� ���

		System.out.println("��й�ȣ�� �Է��ϼ���	>>	");
		// ��й�ȣ 7777 �Է� �� �α��� ����
		Scanner sc = new Scanner(System.in);
		
		String pass = sc.nextLine();
		
		
		Shop s1 = new Shop("Test��Ʈ");

		System.out.println(s1.login("admin", pass));
		s1.current();
		s1.buy("���");
		s1.buy("������");

	}

}
