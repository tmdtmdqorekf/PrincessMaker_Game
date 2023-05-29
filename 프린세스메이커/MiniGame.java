package princessMaker;

import java.util.Random;
import java.util.Scanner;

public class MiniGame {
	public int ethics_game() {

		System.out.println("������ �̷� ���� ������ �����մϴ�.");
		System.out.println("��� ���� ���� �Է����ּ���.");

		// ������ �̷� ���� ������ ���� �迭
		String[] questions = { "1. ������ �̷� �� �ൿ ����� ������ �� �̷���?", "2. ������ �̷� �� �ǹ��� ������ �߽��ϴ� �̷���?",
				"3. ������ �̷� �� ���� ū �ູ�� �߱��ϴ� �̷���?", "4. ������ �̷� �� ��ȸ�� ��࿡ ����� �� �̷���?",
				"5. ������ �̷� �� ��ȸ�� ����ü�� ������ �߱��ϴ� �̷���?", "6. ������ �̷� �� ������ �ھƽ����� �߽��ϴ� �̷���?", };
		String[] answers = { "������� ������", "�ǹ���", "�ñ��� ��ġ �̷�", "��ȸ����", "������������", "�ڱ��������", };

		int ethics_score = 0;
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		for (int i = 0; i < 3; i++) {
			int randomIndex = random.nextInt(questions.length); // ������ �ε��� ����
			System.out.println("\n" + questions[randomIndex]);
			String userAnswer = scanner.nextLine();

			if (userAnswer.equals(answers[randomIndex])) {
				System.out.println("�����Դϴ�!");
				ethics_score++;
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�. ������ " + answers[randomIndex] + "�Դϴ�.");
			}
		}

		System.out.println("\n������ ����Ǿ����ϴ�.");
		System.out.println("����: " + ethics_score + "/" + questions.length / 2);

		return ethics_score;
	}

	public int writing_game() {
		String[] writing_arr = new String[10];
		writing_arr[0] = "������ ���� ��� �㸻�� �㰡 ��´�.";
		writing_arr[1] = "�ʰ� ��� �������� �� ���� �� �𸥴�.";
		writing_arr[2] = "�� �� ����� �޵� �� �ٴµ� ��ĩ������ ���Ŵ�.";
		writing_arr[3] = "�����̵� ������ ���ְ� �ִ�.";
		writing_arr[4] = "���� �þ�� ���̿� ���� �ؾ� ���̶�.";
		writing_arr[5] = "���� �پ��� ������ �پ��� �Ѵ�.";
		writing_arr[6] = "���� ���� ������ �ٶ� �� ���� ����.";
		writing_arr[7] = "���� ���� ��;� ���� ���� ����.";
		writing_arr[8] = "������ ��ì�� �� ���� �� �Ѵ�.";
		writing_arr[9] = "�� �ǳ� �� ����.";

		int writing_score = 0;
		Random R1 = new Random();
		Scanner writing_in = new Scanner(System.in);

		for (int i = 1; i < 4; i++) {
			int writing_rnd = R1.nextInt(writing_arr.length);
			System.out.println("���� ������ �޾� �����ּ���.");
			System.out.println(i + "��. " + writing_arr[writing_rnd]);
			System.out.print("�Է�: ");
			String user_sentence = writing_in.nextLine();

			if (writing_arr[writing_rnd].equals(user_sentence)) {
				System.out.println("�����Դϴ�!");
				writing_score++;
			} else {
				System.out.println("�����Դϴ�.");
			}
		}

		return writing_score;
	}

	public int math_game() {
		Random R2 = new Random();
		int math_score = 0;
		Scanner math_in = new Scanner(System.in);
		System.out.println("���� �������� ���� ������ �Է����ּ���.");

		for (int i = 0; i <= 10; ++i) {
			int math_rnd_1 = R2.nextInt(10);
			int math_rnd_2 = R2.nextInt(10);

			System.out.printf(math_rnd_1 + " �� " + math_rnd_2 + " = ");
			int math_ans = math_in.nextInt();

			if (math_ans == math_rnd_1 * math_rnd_2) {
				System.out.println("�����Դϴ�.");
				math_score += 10;
				System.out.println("�� ������ : " + math_score + "��");
			} else {
				System.out.println("�����Դϴ�.");
				System.out.println("�� ������ : " + math_score + "��");
			}
		}

		return math_score;
	}

	public void makeUp_game() {
		Scanner makeUp_in = new Scanner(System.in);

		String[] skin_arr = new String[4];
		int user_skin = 0;
		skin_arr[0] = "��ȫ�� ����";
		skin_arr[1] = "�Ķ��� ����";
		skin_arr[2] = "����� ����";
		skin_arr[3] = "�ʷϻ� ����";

		String[] eyes_arr = new String[4];
		int user_eyes = 0;
		eyes_arr[0] = "��ȫ�� ������";
		eyes_arr[1] = "�Ķ��� ������";
		eyes_arr[2] = "����� ������";
		eyes_arr[3] = "�ʷϻ� ������";

		String[] hair_arr = new String[4];
		int user_hair = 0;
		hair_arr[0] = "��ȫ�� ����";
		hair_arr[1] = "�Ķ��� ����";
		hair_arr[2] = "����� ����";
		hair_arr[3] = "�ʷϻ� ����";

		String[] nail_arr = new String[4];
		int user_nail = 0;
		nail_arr[0] = "��ȫ�� ����";
		nail_arr[1] = "�Ķ��� ����";
		nail_arr[2] = "����� ����";
		nail_arr[3] = "�ʷϻ� ����";

		String[] point_arr = new String[4];
		int user_point = 0;
		point_arr[0] = "��ȫ�� ������";
		point_arr[1] = "�Ķ��� ������";
		point_arr[2] = "����� ������";
		point_arr[3] = "�ʷϻ� ������";

		for (int i = 0; i < 0;) {
			System.out.println("�Ǻλ��� �����ϴ� ������ ����ּ���!");
			System.out.println("1�� : " + skin_arr[0]);
			System.out.println("2�� : " + skin_arr[1]);
			System.out.println("3�� : " + skin_arr[2]);
			System.out.println("4�� : " + skin_arr[3]);

			System.out.printf("���� �� �Ǻλ���? : ");
			user_skin = makeUp_in.nextInt();

			if (user_skin == 0) {
				System.out.println("��ȣ�� �ٽ� �Է����ּ���!");
				continue;
			} else
				System.out.println(skin_arr[user_skin - 1] + "�� ���̽��ϴ�!");
			break;
		}

		for (int i = 0; i < 0;) {
			System.out.println("�� ���� �����ϴ� ������ ����ּ���!");
			System.out.println("1�� : " + eyes_arr[0]);
			System.out.println("2�� : " + eyes_arr[1]);
			System.out.println("3�� : " + eyes_arr[2]);
			System.out.println("4�� : " + eyes_arr[3]);

			System.out.printf("���� �� �� ����? : ");
			user_eyes = makeUp_in.nextInt();

			if (user_skin == 0) {
				System.out.println("��ȣ�� �ٽ� �Է����ּ���!");
				continue;
			} else
				System.out.println(eyes_arr[user_eyes - 1] + "�� ���̽��ϴ�!");
			break;
		}

		for (int i = 0; i < 0;) {
			System.out.println("�Ӹ����� �����ϴ� ������ ����ּ���!");
			System.out.println("1�� : " + hair_arr[0]);
			System.out.println("2�� : " + hair_arr[1]);
			System.out.println("3�� : " + hair_arr[2]);
			System.out.println("4�� : " + hair_arr[3]);

			System.out.printf("���� �� �Ӹ�����? : ");
			user_skin = makeUp_in.nextInt();

			if (user_skin == 0) {
				System.out.println("��ȣ�� �ٽ� �Է����ּ���!");
				continue;
			} else
				System.out.println(hair_arr[user_hair - 1] + "�� ���̽��ϴ�!");
			break;
		}

		for (int i = 0; i < 0;) {
			System.out.println("���ϻ��� �����ϴ� ������ ����ּ���!");
			System.out.println("1�� : " + nail_arr[0]);
			System.out.println("2�� : " + nail_arr[1]);
			System.out.println("3�� : " + nail_arr[2]);
			System.out.println("4�� : " + nail_arr[3]);

			System.out.printf("���� �� ���ϻ���? : ");
			user_skin = makeUp_in.nextInt();

			if (user_skin == 0) {
				System.out.println("��ȣ�� �ٽ� �Է����ּ���!");
				continue;
			} else
				System.out.println(nail_arr[user_nail - 1] + "�� ���̽��ϴ�!");
			break;
		}

		for (int i = 0; i < 0;) {
			System.out.println("����Ʈ���� �����ϴ� ������ ����ּ���!");
			System.out.println("1�� : " + point_arr[0]);
			System.out.println("2�� : " + point_arr[1]);
			System.out.println("3�� : " + point_arr[2]);
			System.out.println("4�� : " + point_arr[3]);

			System.out.printf("���� �� ����Ʈ����? : ");
			user_skin = makeUp_in.nextInt();

			if (user_skin == 0) {
				System.out.println("��ȣ�� �ٽ� �Է����ּ���!");
				continue;
			} else
				System.out.println(point_arr[user_point - 1] + "�� ���̽��ϴ�!");
			break;
		}
	}
}
