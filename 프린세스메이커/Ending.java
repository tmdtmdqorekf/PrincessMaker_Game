package princessMaker;

public class Ending {

	public Ending() {
		// ������
	}

	public void EndCheck() {
		if (Character.health >= 100 && Character.charm <= 50 && Character.intelligence <= 50
				&& Character.morality >= 50) {
			kniteEnd();
		} else if (Character.health >= 80 && Character.charm <= 40 && Character.intelligence <= 40
				&& Character.morality >= 40) {
			guardEnd();
		} else if (Character.health >= 60 && Character.charm <= 30 && Character.intelligence <= 30
				&& Character.morality >= 60) {
			gateEnd();
		} else if (Character.health >= 50 && Character.charm >= 100 && Character.intelligence <= 50
				&& Character.morality >= 50) {
			princessEnd();
		} else if (Character.health <= 40 && Character.charm >= 80 && Character.intelligence <= 40
				&& Character.morality >= 40) {
			royalEnd();
		} else if (Character.health <= 30 && Character.charm >= 60 && Character.intelligence <= 30
				&& Character.morality >= 60) {
			maidEnd();
		} else if (Character.health >= 50 && Character.charm <= 50 && Character.intelligence >= 100
				&& Character.morality >= 50) {
			professerEnd();
		} else if (Character.health <= 40 && Character.charm <= 40 && Character.intelligence >= 80
				&& Character.morality >= 40) {
			writerEnd();
		} else if (Character.health <= 50 && Character.charm <= 50 && Character.intelligence >= 60
				&& Character.morality <= 30) {
			trickEnd();
		} else if (Character.health <= 50 && Character.charm <= 30 && Character.intelligence <= 50
				&& Character.morality >= 80) {
			nunEnd();
		} else if (Character.health <= 40 && Character.charm >= 60 && Character.intelligence <= 40
				&& Character.morality >= 60) {
			merchantEnd();
		} else if (Character.health <= 30 && Character.charm <= 50 && Character.intelligence <= 30
				&& Character.morality <= 30) {
			thiefEnd();
		} else {
			noEnd();
		}
	}

	public void kniteEnd() {
		System.out.println("����� �밨�� ��簡 �Ǿ����ϴ�!");
		System.out.println("��ħ�� �Ǵ��� ����ġ�� �ձ��� ���� ��, ������ ����� �޾ҽ��ϴ�.");
		System.out.println("����� �������μ� ������ ������ ���� ��� �Ǿ����ϴ�.");
	}

	public void guardEnd() {
		System.out.println("����� ������� ���ϰ� �Ǿ����ϴ�!");
		System.out.println("�ձ��� ��ȭ�� ��Ű�� ���� �㳷 ���� ���� ������, �� ���θ� �����޾ҽ��ϴ�.");
		System.out.println("����� �밨�ϰ� ������ ������μ� ������ ���� ���Դϴ�.");
	}

	public void gateEnd() {
		System.out.println("����� �����Ⱑ �Ǿ����ϴ�!");
		System.out.println("������ ��Ű�� ������ �����ϴ� ������ �ð� �Ǿ����ϴ�.");
		System.out.println("�ձ��� ������ ���� ����ϸ�, ����鿡�� �ŷڸ� �ִ� ������μ� ���� ������ϴ�.");
	}

	public void princessEnd() {
		System.out.println("����� ���ְ� �Ǿ����ϴ�!");
		System.out.println("�Ǹ��� ���ڿ��� �θ�ƽ�� ��ȥ���� ���� �ձ��� ������ �Ǿ����ϴ�.");
		System.out.println("����� �Ƹ��ٿ� �պ�μ� ���ε��� ����� ������ �ް� �Ǿ����ϴ�.");
	}

	public void royalEnd() {
		System.out.println("����� �ı��� �Ǿ����ϴ�!");
		System.out.println("���� �翡�� �׸� ��ð� �׸� ���� �漺�� ���ϴ� ���� �����߽��ϴ�.");
		System.out.println("����� ���� ���� ������ �ı����μ� ���߿����� ������ �������ϴ�.");
	}

	public void maidEnd() {
		System.out.println("����� �óడ �Ǿ����ϴ�!");
		System.out.println("�ձÿ��� ���ָ� ��ð� ����� �ϻ��� ��� �Ǿ����ϴ�.");
		System.out.println("����� ������ �������� ������ �ŷڸ� ���, ���߿��� ���� �Ŷ��� Ī���� �޾ҽ��ϴ�.");
	}

	public void professerEnd() {
		System.out.println("����� ���� ������ ������ �Ǿ����ϴ�!");
		System.out.println("Ź���� ���İ� �������� ���� �л��鿡�� ����ħ�� ���ϸ� ������ �濡 ���� �Ǿ����ϴ�.");
		System.out.println("����� ö���� ������ ���� � ���丵���� ���� �л����� ����� ������ �޾ҽ��ϴ�.");
	}

	public void writerEnd() {
		System.out.println("����� �۰��� �Ǿ����ϴ�!");
		System.out.println("���� �Ҽ����� ���� �Ҽ����� �پ��� ��ǰ�� ���� �������� ���� ������ϴ�.");
		System.out.println("����� ��ǰ�� ���� ����鿡�� ������ ������ �ָ� �������� ������ ��ġ�� ���ϰ� �Ǿ����ϴ�.");
	}

	public void trickEnd() {
		System.out.println("����� ������ �Ǿ����ϴ�!");
		System.out.println("������ �ؾ��� ������� ���̰�, �ο� ���� ��� ����� ���迡 ���� �鿴���ϴ�.");
		System.out.println("������ �ᱹ�� �ڽŵ� ���Ӵ��� ���迡 ������ ������ ��ħ�� �°� �Ǿ����ϴ�.");
	}

	public void nunEnd() {
		System.out.println("����� ����� ���డ �Ǿ����ϴ�!");
		System.out.println("�žӽɰ� û���� �������� ���������� ��ȭ�ο� ���� ��� �Ͽ� �����Ͽ����ϴ�.");
		System.out.println("����� �žӽɰ� �γ����� ���� ����鿡�� ����� ���θ� �־����ϴ�.");
	}

	public void merchantEnd() {
		System.out.println("����� ���� ������ �Ǿ����ϴ�!");
		System.out.println("�ߵ��ư��� ��� ������ �����Ͽ� ���� �θ� �����Ͽ����ϴ�.");
		System.out.println("����� �������� �ŷڸ� ������ �ձ� ������ ū �⿩�� �ϰ� �Ǿ����ϴ�.");
	}

	public void thiefEnd() {
		System.out.println("����� ������ �Ǿ����ϴ�!");
		System.out.println("������ ��, ��ο� �״ÿ��� ������� ����ǰ�� ��ġ�� �Ͽ� �ŷ�Ǿ����ϴ�.");
		System.out.println("������ ��и��� ��� ���� ����� �Ҿȿ� ��������, �ᱹ���� ��ȸ�� ���� ���� �ɸ��� �Ǿ����ϴ�.");
		System.out.println("����� ���������� ������ ���� ������ Ȥ�� �ùٸ� ���� �������� ����ϰ� �˴ϴ�.");
	}

	public static void noEnd() {
		System.out.println("����� ������ �Ǿ����ϴ�!");
		System.out.println("���� ������ �����ϸ� �ڽ��� ������ ���� �о߸� ã�� ���߽��ϴ�.");
		System.out.println("������ �׷��ٰ� �ؼ� �������� �ʾҽ��ϴ�. �� ���� �̷��� ���� ����ϸ� ���ο� ��ȸ�� ��ٸ��� ���Դϴ�.");
		System.out.println("����� ������ ���ɼ��� ������ ������� ǰ�� �ִ� �����Դϴ�.");
	}

}