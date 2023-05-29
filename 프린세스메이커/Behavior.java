package princessMaker;

import java.util.Random;
import java.util.Scanner;

public class Behavior {
	String name;

	Behavior(Character user) {
		this.name = user.name; // �����ڿ��� �̸� �޾ƿ�
	}

	// 1. �����ϱ�
	public void study() {
		Scanner in = new Scanner(System.in);
		System.out.println("�����ϱ⸦ �����ϼ̽��ϴ�");
		System.out.println("���� ������ �� �ϳ��� �Է��ϼ���");
		System.out.println("1.���� ���� 2.��ǥ ���� 3.�۾��� ���� 4.���� ����");
		System.out.print("�ൿ �Է� : ");
		int num = in.nextInt(); // �ൿ �Է� ����

		if (num == 1) {
			ethics();
		} else if (num == 2) {
			presentation();
		} else if (num == 3) {
			writing();
		} else if (num == 4) {
			math();
		}
	}

	// 1-1. ���� ����
	public void ethics() {
		System.out.println("-- ���� ���� �ð��Դϴ� --");
		System.out.println("���߸� ����: ���ִ� ������ ������ �ٴڿ� �ȹ�������?");
		System.out.println("���� �̴ϰ��� Ÿ�� !");

		// ���� MiniGame class
		MiniGame ethicsGame = new MiniGame();
		int ethic_score = ethicsGame.ethics_game();

		if (ethic_score == 3) {
			Character.plusMorality(3);
		} else if (ethic_score == 2) {
			Character.plusMorality(2);
		} else if (ethic_score == 1) {
			Character.plusMorality(1);
		} else {
			Character.plusMorality(0);
		}

		GameMain.plusdayTime(4);
	}

	// 1-2. ��ǥ ����
	public void presentation() {
		Scanner in = new Scanner(System.in);

		System.out.println("-- ��ǥ ���� �ð� --");
		System.out.println("���� �� ����: ��ǥ ������ �ϵ��� �ϰڼ���. ����");
		System.out.println("���� �� ����: " + name + " ����, �ѹ� ���غ��ðԳ�?");
		System.out.println();

		String user_presentation = in.next();
		System.out.println(name + " ����: " + user_presentation);

		System.out.println("��ǥ ������ ���� ���� �Ͱ��� �Ǿ���.");

		Character.plusIntelligence(3);
		GameMain.plusdayTime(4);
	}

	// 1-3. �۾��� ����
	public void writing() {
		System.out.println("-- �۾��� ���� �ð� --");
		System.out.println("�۽��� ����: ���ִ� �޾ƾ��� �Ͻ� �غ� �Ǽ̳���?");

		MiniGame writeGame = new MiniGame();
		int writing_score = writeGame.writing_game();

		if (writing_score == 3) {
			Character.plusIntelligence(3);
		} else if (writing_score == 2) {
			Character.plusIntelligence(2);
		} else if (writing_score == 1) {
			Character.plusIntelligence(1);
		} else {
			Character.plusIntelligence(0);
		}

		GameMain.plusdayTime(4);
	}

	// 1-4. ���� ����
	public void math() {

		System.out.println("-- ���� ���� �ð� --");
		System.out.println("������ ����: " + name + " ���ִ� �����ؿ�����? ���� ������ Ǯ��ô�.");

		System.out.println("���� �̴ϰ��� Ÿ�� !");

		MiniGame mathGame = new MiniGame();
		int math_score = mathGame.math_game();

		if (math_score >= 90) {
			System.out.println("������ ����: ���� ���ִ��̼���! �̷��ٰ� ��ó�� �����ǽðھ��. ȣȣ");
			Character.plusIntelligence(4);
		} else if (math_score >= 70) {
			System.out.println("������ ����: �����ƿ� ���ִ�. �Ǽ������� ������ �ϴ°� �ƴϰھ��?");
			Character.plusIntelligence(3);
		} else if (math_score >= 50) {
			System.out.println("������ ����: ...");
			System.out.println("������ ����: ���� ���� ���� ������ ������ ���ִ�");
			Character.plusIntelligence(2);
		} else {
			System.out.println("������ ����: ...");
			System.out.println("������ ����: ������ �� �����ؿ����� ���ִ�!!");
			Character.plusIntelligence(1);
		}

		Character.plusCharm(1);
		GameMain.plusdayTime(4);
	}

	// 2. �����ϱ�
	public void read() {
		Scanner in = new Scanner(System.in);

		System.out.println("���ִ� å�濡 ���Դ�.");
		System.out.print("���� å�� �����ðڽ��ϱ�? 1.�������� 2.�ڽ��ְ� ���ϱ� 3.���� �׷��� ������");
		int book = in.nextInt();

		// 2-1. ��������
		if (book == 1) {
			System.out.println(name + " ���ִ� �������� å�� ���������.");
			System.out.println();

			System.out.println("������ ���塷�� �������� �ڽŵ��� ����ϰ� �����ϴ� �ΰ��� ���Ѱ� �����ǾƸ� �޲ٸ� �ڱ�鸸�� ������ ���� ��Ȱ�Ѵٴ� �̾߱��. "
					+ "�������� ������ ���ָ� �ӿ��� ����� ���ϴµ� �� �밡�� �ϵ� ���� �ʴ� �ΰ��� �� ���Ѿư��ٰ� �����ϰ� �ݶ��� ����Ų��.");
			System.out.println();

			System.out.println(name + " ����: (��.. �������� �ݶ��̶�.. �ణ �Ҹ� ��ġ�°�)");

			System.out.println("å�� ���� ���� ���� �����ϸ鼭 �б� �����ߴ�.");
			System.out.println();

			System.out.println("��� ������ ����ϴ�. �׷��� � ������ �ٸ� �����麸�� ���� ����ϴ�.");
			System.out.println("�ٱ��� �ִ� �������� ������ ���� ���ٰ� �ΰ��� ���� ���Ҵ�. �ΰ��� �󱼿��� �ٽ� ������ �󱼷�, "
					+ "�׸��� �� �ٽ� ������ �󱼿��� �ΰ��� �󱼷� ������ �Ű��. �׷��� ���� ������ ���� �ΰ����� �������� ���� �а��� ���� ������.");
			System.out.println();
		}

		// 2-2. �ڽ��ְ� ���ϱ�
		else if (book == 2) {
			System.out.println(name + " ���ִ� �ڽ��ְ� ���ϱ� å�� ���������.");
			System.out.println();

			System.out.println("�̷а� ���� ������ ��ȭ�ο� å���� ȥ�ڼ� �� �� �ֵ��� �����ִ� ��ħ���Դϴ�. "
					+ "���ϱ⸦ ��� �Ʒ����� �ڼ��� �Ұ��Ͽ� ȥ�ڼ��� ����� ������ �� �ֽ��ϴ�. " + "������ ���� �������� �������� ��̺��� û�ҳ���� ��� Ȱ���� �� �ֽ��ϴ�. "
					+ "����, �⺻ ����� ���� ������ ���, û�ҳ� �� ������ Ȱ���� �� �ֽ��ϴ�.");
			System.out.println();

			System.out.println("å�� ���� ���� ���� �����ϸ鼭 �б� �����ߴ�.");
			System.out.println();

			System.out.println("��� ����� �����Ŀ� ���� ȭ������ �޶����� �����ε���, " + "��� ����� ���� �ľ��صξ�� ���� �� �� �ڽŰ� �ְ� ���� �� �ֽ��ϴ�.");
			System.out.println("�ڽ��ְ� ���ϱ⿡�� �����ؾ� �Ұ��� ���� �ϱ� ���� �ϴ� ���� �߿��� ���� �ƴ϶�, ��� ����� "
					+ "�˾Ƶ�� ���� ���ؾ� �Ѵٰ��Դϴ�. ���ϴ� ����� ���ϱ� ���ٸ� ��� ����� �����ϱ� ���� "
					+ "Ȯ���� ������? ������, �ʹ� ���ܸ���ϰ� ���ϴ� ���� ��� ������� ����������� "
					+ "�ٰ��� Ȯ���� ������ �� �ִ�ϴ�. ���� ������ �ٽɰ� ������ �������� ���ظ� �����Ѵ�ϴ�.");
			System.out.println();
		}

		else if (book == 3) {
			System.out.println(name + " ���ִ� ���� �׷��� ������ å�� ���������.");
			System.out.println();

			System.out.println(name + " ����: (���� ���� �����ϴ� ���̾�.. ���� �� �о�߰ڴ�.)");
			System.out.println();

			System.out.println("å�� ���� ���� ���� �����ϸ鼭 �б� �����ߴ�.");
			System.out.println();

			System.out
					.println("���ó� ���� ū ���� �����̳� ������ �ƴ϶� �ٸ� ������κ��� ������� ���ϰ� ���� �ʿ�� ������ ������ " + "�����κ��� �������� ���� ���ϴ� ���Դϴ�.");
			System.out.println("�״밡 �Ǵܰ� �ൿ�� ȥ���� ���� ������ �װ��� ���� ������ ����� ���忡 �� �ִ°��� ���� �����϶�.");
			System.out.println();
		}

		System.out.println("-- å�� ��� �о����ϴ�. --");
		System.out.println(name + " ����: (���� å�� ������ �Ӹ��� �ȶ������� ����̾�! �� ������ ����ϵ��� ���İ��� ����?)");
		System.out.print("���İ��� ���ðڽ��ϱ�? yes/no : ");
		String write_essay = in.next();

		// ���İ�
		if (write_essay.equals("yes")) { // Objects ��ü�� �����ϱ�
			System.out.println(name + " ����: (���� �� ������ ����ϵ��� ���İ��� ���°� ���ھ�!)");
			System.out.println();

			System.out.print("���İ� �ۼ�: ");
			in.nextLine();
			StringBuilder book_essay = new StringBuilder();
			String line;
			while (!(line = in.nextLine()).isEmpty()) {
				book_essay.append(line);
				book_essay.append("\n");
			}
			System.out.println();
			System.out.println(book_essay);

			Character.plusIntelligence(4);
			Character.plusCharm(2);
		} else {
			System.out.println(name + " ����: (��.. �׳� ������ ����.)");

			Character.plusIntelligence(2);
			Character.plusCharm(1);
		}

		GameMain.plusdayTime(4);
	}

	// 3. ��ϱ�
	public void exercise() {
		Scanner in = new Scanner(System.in);

		System.out.println("ũ���� �����׵� Ʈ���̳�: ���ִ� �ܹ��� ì�� �����? �ƴ϶� ���� ���� �����ּ���.");
		System.out.println("ũ���� �����׵� Ʈ���̳�: ������ ��� ������ � �Ͻǰǰ���?");
		System.out.println();

		System.out.print("��� ������ ��Ͻðڽ��ϱ�? 1.��ü 2.��ü");
		int routine = in.nextInt();

		if (routine == 1) {
			System.out.println("ũ���� �����׵� Ʈ���̳�: ��ü ��ƾ�� ��ü������ �̵�-��-��� �Դϴ�.");
			System.out.println("-- ��ü ��� �����մϴ� --");
			System.out.println("ũ���� �����׵� Ʈ���̳�: ��ü �������� �ϰڽ��ϴ�. ��� �Ѹ� 10ȸ ���ּ���.");
			System.out.println(name + " ����: ��, ��, ��, ��");
			System.out.println();

			System.out.println("-- ��Ǯ�ٿ� � �ⱸ ������ �̵��մϴ� --");
			System.out.println("ũ���� �����׵� Ʈ���̳�: �� ��Ǯ�ٿ� 3��Ʈ 10ȸ �����մϴ�.");
			System.out.println(name + " ����: �� �� �� ��");
			System.out.println();

			System.out.println("-- ���� �� � �ⱸ ������ �̵��մϴ� --");
			System.out.println("ũ���� �����׵� Ʈ���̳�: �� ���� �� 3��Ʈ 10ȸ �����մϴ�.");
			System.out.println(name + " ����: �� �� ������...");
			System.out.println("ũ���� �����׵� Ʈ���̳�: �ټ�! ����! ..");
			System.out.println();

			System.out.println("-- Ʈ���̼��� �������ٿ� � �ⱸ ������ �̵��մϴ� --");
			System.out.println("ũ���� �����׵� Ʈ���̳�: �� �������Դϴ� ���ִ�. 3��Ʈ 10ȸ �����մϴ�.");
			System.out.println(name + " ����: ����.. �� �̻���...");
			System.out.println("ũ���� �����׵� Ʈ���̳�: no pain, no gain! �̴�� �����ϸ� �ƹ��͵� �ȵ˴ϴ� ���ִ�.");
			System.out.println();

			System.out.println("-- ��ü ��� ���ƽ��ϴ� --");

			System.out.println("ũ���� �����׵� Ʈ���̳�: ���ִ�, �����ϼ̽��ϴ�. ���� �ڱ� ���� �ü� ���� �ϰ� �ֹ��ð��.. ��Ϸ� �� ���ǰ���? ");
			System.out.println(name + " ����: (��..�Ѥ�)");
		} else if (routine == 2) {
			System.out.println("ũ���� �����׵� Ʈ���̳�: ��ü ��ƾ�� ��ü������ �����-�� �Դϴ�.");
			System.out.println("-- ��ü ��� �����մϴ� --");
			System.out.println("ũ���� �����׵� Ʈ���̳�: ��ü �������� �ϰڽ��ϴ�. �⺻ ����Ʈ 10ȸ ���ּ���.");
			System.out.println(name + " ����: ���X ���X");
			System.out.println();

			System.out.println("-- ���� ������ � �ⱸ ������ �̵��մϴ� --");
			System.out.println("ũ���� �����׵� Ʈ���̳�: �� ���� ������ 3��Ʈ 10ȸ �����մϴ�.");
			System.out.println(name + " ����: �� �� �� ��");
			System.out.println();

			System.out.println("-- ���� �ͽ��ټ� � �ⱸ ������ �̵��մϴ� --");
			System.out.println("ũ���� �����׵� Ʈ���̳�: �� ���� �ͽ��ټ� 3��Ʈ 10ȸ �����մϴ�.");
			System.out.println(name + " ����: �� �� ������...");
			System.out.println("ũ���� �����׵� Ʈ���̳�: �ټ�! ����! .. ���� �� �Խ��ϴ� ���ִ�.");
			System.out.println();

			System.out.println("-- �� ������ � �ⱸ ������ �̵��մϴ� --");
			System.out.println("ũ���� �����׵� Ʈ���̳�: �� �������Դϴ� ���ִ�. 3��Ʈ 10ȸ �����մϴ�.");
			System.out.println(name + " ����: ����.. �� �̻���...");
			System.out.println("ũ���� �����׵� Ʈ���̳�: no pain, no gain! �̴�� �����ϸ� �ƹ��͵� �ȵ˴ϴ� ���ִ�.");
			System.out.println();

			System.out.println("-- ��ü ��� ���ƽ��ϴ� --");

			System.out.println("ũ���� �����׵� Ʈ���̳�: ���ִ�, �����ϼ̽��ϴ�. ���� �ڱ� ���� �ü� ���� �ϰ� �ֹ��ð��.. ��Ϸ� �� ���ǰ���? ");
			System.out.println(name + " ����: (��..�Ѥ�)");
		}

		Character.plusHealth(3);
		Character.plusCharm(2);
		GameMain.plusdayTime(4);
	}

	// 4. ȭ���ϱ�
	public void makeUp() {
		System.out.println("-- ���ְ� ȭ��� �տ� �ɾҴ� --");
		System.out.println("ȭ�� �̴ϰ��� Ÿ�� !");

		// ȭ�� miniGame class
		MiniGame makeupGame = new MiniGame();
		makeupGame.makeUp_game();

	}

	// 5. ���ڱ�
	public void sleep() {
		// ���� �ð� ���� -> ���� �ð� ���� ü�� ����
		System.out.println("-- ���ְ� ħ�뿡 ������ --");

		// ������ ���� �ð� ���� (1~10 ����)
		Random random = new Random();
		int sleepTime = random.nextInt(10) + 1;

		Character.plusHealth(sleepTime);

		System.out.println("���ִ� " + sleepTime + "�ð� ������");
	}

}
