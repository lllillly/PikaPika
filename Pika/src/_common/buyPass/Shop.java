package _common.buyPass;

public class Shop {

	// ���̵�� �н����带 �Է��ϰ� ��ġ�ϸ� ���Ÿ�Ͽ� �߰�
	/*
	 * ���̵� : admin ��й�ȣ : 7777 class : shop - �����ڸ� ���� ���θ� �̸��� ���� Method : login -
	 * �α���, buy - �α��� ���� �� String ������ ��ǰ�� �Է� �޾� ��ǰ�̸� ���, current - ���θ� �̸��� ���� �α�����
	 * ���� ���
	 */

	String name; // ����ڸ�
	String id; // ����� ���̵�
	String password; // ����� ��й�ȣ
	String product; // ��ǰ

	Shop(String name) {
		this.name = name; // �����ڸ� ���� �Ҵ�
	}

	String login(String id, String password) {

		// ���ڿ��� �����ϴ� �޼ҵ�� ����
		// �α����� �����ϸ� ���ϰ����� return = "�α��� ����" ���ڿ��� �����Ѵ�.

		String result = "";

		if (id.equals("admin") && password.equals("7777")) {
			this.id = id;
			this.password = password;
			result = "�α��� ����";
		} else {
			this.id = "�α��� ���� ����";
			this.password = "�α���  ����";
		}

		return result;

	}

	void buy(String product) {

		// login() �޼ҵ忡�� id�� �Է��� �ȵǰų� id�� "�α��� ���� ����" ���ڿ��� �Ҵ�Ǿ��ٸ� ���� �Ұ���.
		// �׷��� �ʴٸ� (login �޼ҵ忡�� id�� id�� �Է��� �Ǿ��ٸ�) buy()�޼ҵ忡�� �Է¹��� product ���ڿ��� ���.
		/* �α��� �ÿ��� ���� �����ϴ� */

		if (id == null || id.equals("�α��� ���� ����")) {
			System.out.println("���Ű� �Ұ���");
		} else {
			this.product = product;
			System.out.println("������ ������ : " + product);
		}
	}

	void current() {
		System.out.println("���θ�" + name + "�� �����Ȳ");
		System.out.println("�α����� ���� : " + id);
	}

}
