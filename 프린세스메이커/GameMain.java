package princessMaker;

import java.util.Scanner;

public class GameMain {

	static int dayTime = 0; // ��¥ üũ hour ����

	public static void plusdayTime(int dayTime) {
		GameMain.dayTime += dayTime;
	}

	public void GamePlay() {
		Scanner in = new Scanner(System.in);

		System.out.println("�������� ����Ŀ ������ �����մϴ� !");
		System.out.print("������� �̸��� �Է����ּ��� : ");
		String username = in.next();

		Character user = new Character(username);
		// �ൿ Ŭ���� ��ü ����
		Behavior behavior = new Behavior(user);

		System.out.printf("%s���ִ� ȯ���մϴ� , ����� ������ �����մϴ�!\n", user.getName());

		while (dayTime < 240) {

			System.out.println("----------------------------------");
			System.out.println("����ð� : " + dayTime / 24 + "�� " + dayTime % 24 + "�ð�\n");
			System.out.println("���� " + user.getName() + " ���ִ��� �ɷ�ġ�Դϴ�");
			System.out.println("ü�� : " + Character.health);
			System.out.println("�ŷ� : " + Character.charm);
			System.out.println("���� : " + Character.intelligence);
			System.out.println("������ : " + Character.morality);
			System.out.println("----------------------------------");

			System.out.println("���� ������ �� �ϳ��� �Է��ϼ���");
			System.out.println("1.�����ϱ� 2.�����ϱ� 3.��ϱ� 4.ȭ���ϱ� 5.���ڱ� 6.���α׷� ����");
			System.out.print("�ൿ �Է� : ");
			int num = in.nextInt(); // �ൿ �Է� ����

			if (num == 1) {
				// �����ϱ� �޼���
				behavior.study();
			} else if (num == 2) {
				// �����ϱ� �޼���
				behavior.read();
			} else if (num == 3) {
				// ��ϱ� �޼���
				behavior.exercise();
			} else if (num == 4) {
				// ȭ���ϱ� �޼���
				behavior.makeUp();
			} else if (num == 5) {
				// ���ڱ� �޼���
			} else if (num == 6) {
				System.out.println("�������� ����Ŀ ���� ����");
				break;
			}
		}
		in.close();
	}

}
