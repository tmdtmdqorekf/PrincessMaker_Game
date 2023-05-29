package princessMaker;

import java.util.Scanner;

public class GameMain {

	static int dayTime = 0; // 날짜 체크 hour 기준

	public static void plusdayTime(int dayTime) {
		GameMain.dayTime += dayTime;
	}

	public void GamePlay() {
		Scanner in = new Scanner(System.in);

		System.out.println("프린세스 메이커 게임을 시작합니다 !");
		System.out.print("사용자의 이름을 입력해주세요 : ");
		String username = in.next();

		Character user = new Character(username);
		// 행동 클래스 객체 생성
		Behavior behavior = new Behavior(user);

		System.out.printf("%s공주님 환영합니다 , 당신의 성장을 응원합니다!\n", user.getName());

		while (dayTime < 240) {

			System.out.println("----------------------------------");
			System.out.println("진행시간 : " + dayTime / 24 + "일 " + dayTime % 24 + "시간\n");
			System.out.println("현재 " + user.getName() + " 공주님의 능력치입니다");
			System.out.println("체력 : " + Character.health);
			System.out.println("매력 : " + Character.charm);
			System.out.println("지력 : " + Character.intelligence);
			System.out.println("도덕성 : " + Character.morality);
			System.out.println("----------------------------------");

			System.out.println("다음 선택지 중 하나를 입력하세요");
			System.out.println("1.공부하기 2.독서하기 3.운동하기 4.화장하기 5.잠자기 6.프로그램 종료");
			System.out.print("행동 입력 : ");
			int num = in.nextInt(); // 행동 입력 받음

			if (num == 1) {
				// 공부하기 메서드
				behavior.study();
			} else if (num == 2) {
				// 독서하기 메서드
				behavior.read();
			} else if (num == 3) {
				// 운동하기 메서드
				behavior.exercise();
			} else if (num == 4) {
				// 화장하기 메서드
				behavior.makeUp();
			} else if (num == 5) {
				// 잠자기 메서드
			} else if (num == 6) {
				System.out.println("프린세스 메이커 게임 종료");
				break;
			}
		}
		in.close();
	}

}
