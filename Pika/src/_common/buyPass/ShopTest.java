package _common.buyPass;

public class ShopTest {
	public static void main(String[] args) {

		// �����ڸ� ���� s1�̶�� ��ü�� �����Ѵ�.
		// �̸��� Test��Ʈ
		// �α��� �޼ҵ带 ���� �α���
		// ���� ��Ȳ�� ������ִ� current�޼ҵ�
		// buy �޼ҵ带 ���� product �Է� �� ���

		Shop s1 = new Shop("Test��Ʈ");

		System.out.println(s1.login("admin", "7777"));
		s1.current();
		s1.buy("���");
		s1.buy("������");

	}

}
