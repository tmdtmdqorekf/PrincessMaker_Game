package princessMaker;

import java.util.Random;
import java.util.Scanner;

public class MiniGame {
	public int ethics_game() {

		System.out.println("윤리적 이론 퀴즈 게임을 시작합니다.");
		System.out.println("퀴즈에 대한 답을 입력해주세요.");

		// 윤리적 이론 퀴즈 문제와 정답 배열
		String[] questions = { "1. 윤리적 이론 중 행동 결과에 초점을 둔 이론은?", "2. 윤리적 이론 중 의무와 귀인을 중시하는 이론은?",
				"3. 윤리적 이론 중 가장 큰 행복을 추구하는 이론은?", "4. 윤리적 이론 중 사회적 계약에 기반을 둔 이론은?",
				"5. 윤리적 이론 중 사회적 공동체의 이익을 추구하는 이론은?", "6. 윤리적 이론 중 개인의 자아실현을 중시하는 이론은?", };
		String[] answers = { "결과주의 윤리학", "의무론", "궁극적 가치 이론", "사회계약론", "공공선량주의", "자기실현주의", };

		int ethics_score = 0;
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		for (int i = 0; i < 3; i++) {
			int randomIndex = random.nextInt(questions.length); // 랜덤한 인덱스 선택
			System.out.println("\n" + questions[randomIndex]);
			String userAnswer = scanner.nextLine();

			if (userAnswer.equals(answers[randomIndex])) {
				System.out.println("정답입니다!");
				ethics_score++;
			} else {
				System.out.println("틀렸습니다. 정답은 " + answers[randomIndex] + "입니다.");
			}
		}

		System.out.println("\n게임이 종료되었습니다.");
		System.out.println("점수: " + ethics_score + "/" + questions.length / 2);

		return ethics_score;
	}

	public int writing_game() {
		String[] writing_arr = new String[10];
		writing_arr[0] = "낮말은 새가 듣고 밤말은 쥐가 듣는다.";
		writing_arr[1] = "늦게 배운 도둑질에 날 새는 줄 모른다.";
		writing_arr[2] = "떡 줄 사람은 꿈도 안 꾸는데 김칫국부터 마신다.";
		writing_arr[3] = "굼벵이도 구르는 재주가 있다.";
		writing_arr[4] = "고기는 씹어야 맛이요 말은 해야 맛이라.";
		writing_arr[5] = "간에 붙었다 쓸개에 붙었다 한다.";
		writing_arr[6] = "가지 많은 나무에 바람 잘 날이 없다.";
		writing_arr[7] = "가는 말이 고와야 오는 말이 곱다.";
		writing_arr[8] = "개구리 올챙이 적 생각 못 한다.";
		writing_arr[9] = "강 건너 불 구경.";

		int writing_score = 0;
		Random R1 = new Random();
		Scanner writing_in = new Scanner(System.in);

		for (int i = 1; i < 4; i++) {
			int writing_rnd = R1.nextInt(writing_arr.length);
			System.out.println("다음 문장을 받아 적어주세요.");
			System.out.println(i + "번. " + writing_arr[writing_rnd]);
			System.out.print("입력: ");
			String user_sentence = writing_in.nextLine();

			if (writing_arr[writing_rnd].equals(user_sentence)) {
				System.out.println("정답입니다!");
				writing_score++;
			} else {
				System.out.println("오답입니다.");
			}
		}

		return writing_score;
	}

	public int math_game() {
		Random R2 = new Random();
		int math_score = 0;
		Scanner math_in = new Scanner(System.in);
		System.out.println("다음 구구단을 보고 정답을 입력해주세요.");

		for (int i = 0; i <= 10; ++i) {
			int math_rnd_1 = R2.nextInt(10);
			int math_rnd_2 = R2.nextInt(10);

			System.out.printf(math_rnd_1 + " × " + math_rnd_2 + " = ");
			int math_ans = math_in.nextInt();

			if (math_ans == math_rnd_1 * math_rnd_2) {
				System.out.println("정답입니다.");
				math_score += 10;
				System.out.println("내 점수는 : " + math_score + "점");
			} else {
				System.out.println("오답입니다.");
				System.out.println("내 점수는 : " + math_score + "점");
			}
		}

		return math_score;
	}

	public void makeUp_game() {
		Scanner makeUp_in = new Scanner(System.in);

		String[] skin_arr = new String[4];
		int user_skin = 0;
		skin_arr[0] = "분홍색 물약";
		skin_arr[1] = "파란색 물약";
		skin_arr[2] = "노란색 물약";
		skin_arr[3] = "초록색 물약";

		String[] eyes_arr = new String[4];
		int user_eyes = 0;
		eyes_arr[0] = "분홍색 별가루";
		eyes_arr[1] = "파란색 별가루";
		eyes_arr[2] = "노란색 별가루";
		eyes_arr[3] = "초록색 별가루";

		String[] hair_arr = new String[4];
		int user_hair = 0;
		hair_arr[0] = "분홍색 물감";
		hair_arr[1] = "파란색 물감";
		hair_arr[2] = "노란색 물감";
		hair_arr[3] = "초록색 물감";

		String[] nail_arr = new String[4];
		int user_nail = 0;
		nail_arr[0] = "분홍색 파츠";
		nail_arr[1] = "파란색 파츠";
		nail_arr[2] = "노란색 파츠";
		nail_arr[3] = "초록색 파츠";

		String[] point_arr = new String[4];
		int user_point = 0;
		point_arr[0] = "분홍색 별무리";
		point_arr[1] = "파란색 별무리";
		point_arr[2] = "노란색 별무리";
		point_arr[3] = "초록색 별무리";

		for (int i = 0; i < 0;) {
			System.out.println("피부색을 결정하는 물약을 골라주세요!");
			System.out.println("1번 : " + skin_arr[0]);
			System.out.println("2번 : " + skin_arr[1]);
			System.out.println("3번 : " + skin_arr[2]);
			System.out.println("4번 : " + skin_arr[3]);

			System.out.printf("내가 고른 피부색은? : ");
			user_skin = makeUp_in.nextInt();

			if (user_skin == 0) {
				System.out.println("번호를 다시 입력해주세요!");
				continue;
			} else
				System.out.println(skin_arr[user_skin - 1] + "을 고르셨습니다!");
			break;
		}

		for (int i = 0; i < 0;) {
			System.out.println("눈 색을 결정하는 물약을 골라주세요!");
			System.out.println("1번 : " + eyes_arr[0]);
			System.out.println("2번 : " + eyes_arr[1]);
			System.out.println("3번 : " + eyes_arr[2]);
			System.out.println("4번 : " + eyes_arr[3]);

			System.out.printf("내가 고른 눈 색은? : ");
			user_eyes = makeUp_in.nextInt();

			if (user_skin == 0) {
				System.out.println("번호를 다시 입력해주세요!");
				continue;
			} else
				System.out.println(eyes_arr[user_eyes - 1] + "를 고르셨습니다!");
			break;
		}

		for (int i = 0; i < 0;) {
			System.out.println("머리색을 결정하는 물약을 골라주세요!");
			System.out.println("1번 : " + hair_arr[0]);
			System.out.println("2번 : " + hair_arr[1]);
			System.out.println("3번 : " + hair_arr[2]);
			System.out.println("4번 : " + hair_arr[3]);

			System.out.printf("내가 고른 머리색은? : ");
			user_skin = makeUp_in.nextInt();

			if (user_skin == 0) {
				System.out.println("번호를 다시 입력해주세요!");
				continue;
			} else
				System.out.println(hair_arr[user_hair - 1] + "을 고르셨습니다!");
			break;
		}

		for (int i = 0; i < 0;) {
			System.out.println("네일색을 결정하는 물약을 골라주세요!");
			System.out.println("1번 : " + nail_arr[0]);
			System.out.println("2번 : " + nail_arr[1]);
			System.out.println("3번 : " + nail_arr[2]);
			System.out.println("4번 : " + nail_arr[3]);

			System.out.printf("내가 고른 네일색은? : ");
			user_skin = makeUp_in.nextInt();

			if (user_skin == 0) {
				System.out.println("번호를 다시 입력해주세요!");
				continue;
			} else
				System.out.println(nail_arr[user_nail - 1] + "를 고르셨습니다!");
			break;
		}

		for (int i = 0; i < 0;) {
			System.out.println("포인트색을 결정하는 물약을 골라주세요!");
			System.out.println("1번 : " + point_arr[0]);
			System.out.println("2번 : " + point_arr[1]);
			System.out.println("3번 : " + point_arr[2]);
			System.out.println("4번 : " + point_arr[3]);

			System.out.printf("내가 고른 포인트색은? : ");
			user_skin = makeUp_in.nextInt();

			if (user_skin == 0) {
				System.out.println("번호를 다시 입력해주세요!");
				continue;
			} else
				System.out.println(point_arr[user_point - 1] + "를 고르셨습니다!");
			break;
		}
	}
}
