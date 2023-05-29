package princessMaker;

import java.util.Random;
import java.util.Scanner;

public class Behavior {
	String name;

	Behavior(Character user) {
		this.name = user.name; // 생성자에서 이름 받아옴
	}

	// 1. 공부하기
	public void study() {
		Scanner in = new Scanner(System.in);
		System.out.println("공부하기를 선택하셨습니다");
		System.out.println("다음 선택지 중 하나를 입력하세요");
		System.out.println("1.윤리 수업 2.발표 수업 3.글쓰기 수업 4.수학 수업");
		System.out.print("행동 입력 : ");
		int num = in.nextInt(); // 행동 입력 받음

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

	// 1-1. 윤리 수업
	public void ethics() {
		System.out.println("-- 윤리 수업 시간입니다 --");
		System.out.println("로잘린 교수: 공주님 오늘은 쓰레기 바닥에 안버리셨죠?");
		System.out.println("윤리 미니게임 타임 !");

		// 윤리 MiniGame class
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

	// 1-2. 발표 수업
	public void presentation() {
		Scanner in = new Scanner(System.in);

		System.out.println("-- 발표 수업 시간 --");
		System.out.println("스탠 리 교수: 발표 수업을 하도록 하겠수다. 흠흠");
		System.out.println("스탠 리 교수: " + name + " 공주, 한번 말해보시게나?");
		System.out.println();

		String user_presentation = in.next();
		System.out.println(name + " 공주: " + user_presentation);

		System.out.println("발표 수업은 아주 좋은 귀감이 되었다.");

		Character.plusIntelligence(3);
		GameMain.plusdayTime(4);
	}

	// 1-3. 글쓰기 수업
	public void writing() {
		System.out.println("-- 글쓰기 수업 시간 --");
		System.out.println("퍼시픽 교수: 공주님 받아쓰기 하실 준비 되셨나요?");

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

	// 1-4. 수학 수업
	public void math() {

		System.out.println("-- 수학 수업 시간 --");
		System.out.println("제니퍼 교수: " + name + " 공주님 공부해오셨죠? 이제 문제를 풀어봅시다.");

		System.out.println("수학 미니게임 타임 !");

		MiniGame mathGame = new MiniGame();
		int math_score = mathGame.math_game();

		if (math_score >= 90) {
			System.out.println("제니퍼 교수: 역시 공주님이세요! 이러다가 저처럼 교수되시겠어요. 호호");
			Character.plusIntelligence(4);
		} else if (math_score >= 70) {
			System.out.println("제니퍼 교수: 괜찮아요 공주님. 실수정도야 누구나 하는거 아니겠어요?");
			Character.plusIntelligence(3);
		} else if (math_score >= 50) {
			System.out.println("제니퍼 교수: ...");
			System.out.println("제니퍼 교수: 수학 수업 자주 들으러 오세요 공주님");
			Character.plusIntelligence(2);
		} else {
			System.out.println("제니퍼 교수: ...");
			System.out.println("제니퍼 교수: 다음엔 꼭 공부해오세요 공주님!!");
			Character.plusIntelligence(1);
		}

		Character.plusCharm(1);
		GameMain.plusdayTime(4);
	}

	// 2. 독서하기
	public void read() {
		Scanner in = new Scanner(System.in);

		System.out.println("공주는 책방에 들어왔다.");
		System.out.print("무슨 책을 읽으시겠습니까? 1.동물농장 2.자신있게 말하기 3.마더 테레사 위인전");
		int book = in.nextInt();

		// 2-1. 동물농장
		if (book == 1) {
			System.out.println(name + " 공주는 동물농장 책을 꺼내들었다.");
			System.out.println();

			System.out.println("《동물 농장》은 동물들이 자신들을 억압하고 착취하던 인간을 내쫓고 유토피아를 꿈꾸며 자기들만의 농장을 만들어서 생활한다는 이야기다. "
					+ "동물들은 추위와 굶주림 속에서 힘들게 일하는데 그 대가는 일도 하지 않는 인간이 다 빼앗아간다고 생각하고 반란을 일으킨다.");
			System.out.println();

			System.out.println(name + " 공주: (흠.. 동물들의 반란이라.. 약간 소름 끼치는걸)");

			System.out.println("책을 펼쳐 한줄 한줄 집중하면서 읽기 시작했다.");
			System.out.println();

			System.out.println("모든 동물은 평등하다. 그러나 어떤 동물은 다른 동물들보다 더욱 평등하다.");
			System.out.println("바깥에 있던 동물들은 돼지의 얼굴을 보다가 인간의 얼굴을 보았다. 인간의 얼굴에서 다시 돼지의 얼굴로, "
					+ "그리고 또 다시 돼지의 얼굴에서 인간의 얼굴로 눈길을 옮겼다. 그러나 누가 돼지고 누가 인간인지 동물들은 전혀 분간할 수가 없었다.");
			System.out.println();
		}

		// 2-2. 자신있게 말하기
		else if (book == 2) {
			System.out.println(name + " 공주는 자신있게 말하기 책을 꺼내들었다.");
			System.out.println();

			System.out.println("이론과 실제 경험이 조화로운 책으로 혼자서 할 수 있도록 도와주는 지침서입니다. "
					+ "말하기를 어떻게 훈련할지 자세히 소개하여 혼자서도 충분히 연습할 수 있습니다. " + "실험을 통해 검증받은 내용으로 어린이부터 청소년까지 모두 활용할 수 있습니다. "
					+ "또한, 기본 골격은 같기 때문에 어린이, 청소년 등 누구나 활용할 수 있습니다.");
			System.out.println();

			System.out.println("책을 펼쳐 한줄 한줄 집중하면서 읽기 시작했다.");
			System.out.println();

			System.out.println("듣는 사람이 누구냐에 따라서 화술법은 달라지기 마련인데요, " + "듣는 사람을 먼저 파악해두어야 말할 때 더 자신감 있게 말할 수 있습니다.");
			System.out.println("자신있게 말하기에서 조심해야 할것은 내가 하기 쉽게 하는 것이 중요한 것이 아니라, 듣는 사람이 "
					+ "알아듣기 쉽게 말해야 한다것입니다. 말하는 사람이 말하기 쉽다면 듣는 사람이 이해하기 쉬울 "
					+ "확률이 높겠죠? 하지만, 너무 간단명료하게 말하는 것은 듣는 사람에게 설명부족으로 "
					+ "다가갈 확률도 높아질 수 있답니다. 말할 때에는 핵심과 적절한 설명으로 이해를 얻어야한답니다.");
			System.out.println();
		}

		else if (book == 3) {
			System.out.println(name + " 공주는 마더 테레사 위인전 책을 꺼내들었다.");
			System.out.println();

			System.out.println(name + " 공주: (내가 정말 존경하는 분이야.. 여러 번 읽어야겠다.)");
			System.out.println();

			System.out.println("책을 펼쳐 한줄 한줄 집중하면서 읽기 시작했다.");
			System.out.println();

			System.out
					.println("오늘날 가장 큰 병은 결핵이나 나병이 아니라 다른 사람으로부터 사랑받지 못하고 남이 필요로 하지도 않으며 " + "남으로부터 보살핌을 받지 못하는 것입니다.");
			System.out.println("그대가 판단과 행동에 혼란을 느낄 때에는 그것이 가장 가난한 사람의 입장에 서 있는가를 먼저 생각하라.");
			System.out.println();
		}

		System.out.println("-- 책을 모두 읽었습니다. --");
		System.out.println(name + " 공주: (역시 책을 읽으면 머리가 똑똑해지는 기분이야! 이 느낌을 기억하도록 독후감을 쓸까?)");
		System.out.print("독후감을 쓰시겠습니까? yes/no : ");
		String write_essay = in.next();

		// 독후감
		if (write_essay.equals("yes")) { // Objects 객체명 수정하기
			System.out.println(name + " 공주: (역시 이 느낌을 기억하도록 독후감을 쓰는게 낫겠어!)");
			System.out.println();

			System.out.print("독후감 작성: ");
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
			System.out.println(name + " 공주: (음.. 그냥 다음에 쓰자.)");

			Character.plusIntelligence(2);
			Character.plusCharm(1);
		}

		GameMain.plusdayTime(4);
	}

	// 3. 운동하기
	public void exercise() {
		Scanner in = new Scanner(System.in);

		System.out.println("크리스 범스테드 트레이너: 공주님 단백질 챙겨 드셨죠? 아니란 말은 하지 말아주세요.");
		System.out.println("크리스 범스테드 트레이너: 오늘은 어느 부위를 운동 하실건가요?");
		System.out.println();

		System.out.print("어느 부위를 운동하시겠습니까? 1.상체 2.하체");
		int routine = in.nextInt();

		if (routine == 1) {
			System.out.println("크리스 범스테드 트레이너: 상체 루틴은 구체적으로 이두-등-삼두 입니다.");
			System.out.println("-- 상체 운동을 시작합니다 --");
			System.out.println("크리스 범스테드 트레이너: 상체 웜업부터 하겠습니다. 어깨 롤링 10회 해주세요.");
			System.out.println(name + " 공주: 헛, 둘, 헛, 둘");
			System.out.println();

			System.out.println("-- 랫풀다운 운동 기구 앞으로 이동합니다 --");
			System.out.println("크리스 범스테드 트레이너: 자 랫풀다운 3세트 10회 진행합니다.");
			System.out.println(name + " 공주: 후 하 후 하");
			System.out.println();

			System.out.println("-- 덤벨 컬 운동 기구 앞으로 이동합니다 --");
			System.out.println("크리스 범스테드 트레이너: 자 덤벨 컬 3세트 10회 진행합니다.");
			System.out.println(name + " 공주: 끙 차 끄으응...");
			System.out.println("크리스 범스테드 트레이너: 다섯! 여섯! ..");
			System.out.println();

			System.out.println("-- 트라이셉스 프레스다운 운동 기구 앞으로 이동합니다 --");
			System.out.println("크리스 범스테드 트레이너: 자 마지막입니다 공주님. 3세트 10회 진행합니다.");
			System.out.println(name + " 공주: 흐어억.. 더 이상은...");
			System.out.println("크리스 범스테드 트레이너: no pain, no gain! 이대로 포기하면 아무것도 안됩니다 공주님.");
			System.out.println();

			System.out.println("-- 상체 운동을 마쳤습니다 --");

			System.out.println("크리스 범스테드 트레이너: 공주님, 수고하셨습니다. 오늘 자기 전에 냉수 샤워 하고 주무시고요.. 운동하러 또 오실거죠? ");
			System.out.println(name + " 공주: (윽..ㅡㅡ)");
		} else if (routine == 2) {
			System.out.println("크리스 범스테드 트레이너: 하체 루틴은 구체적으로 허벅지-힙 입니다.");
			System.out.println("-- 하체 운동을 시작합니다 --");
			System.out.println("크리스 범스테드 트레이너: 하체 웜업부터 하겠습니다. 기본 스쿼트 10회 해주세요.");
			System.out.println(name + " 공주: 으쌰 으쌰");
			System.out.println();

			System.out.println("-- 레그 프레스 운동 기구 앞으로 이동합니다 --");
			System.out.println("크리스 범스테드 트레이너: 자 레그 프레스 3세트 10회 진행합니다.");
			System.out.println(name + " 공주: 후 하 후 하");
			System.out.println();

			System.out.println("-- 레그 익스텐션 운동 기구 앞으로 이동합니다 --");
			System.out.println("크리스 범스테드 트레이너: 자 레그 익스텐션 3세트 10회 진행합니다.");
			System.out.println(name + " 공주: 끙 차 끄으응...");
			System.out.println("크리스 범스테드 트레이너: 다섯! 여섯! .. 거의 다 왔습니다 공주님.");
			System.out.println();

			System.out.println("-- 힙 어브덕션 운동 기구 앞으로 이동합니다 --");
			System.out.println("크리스 범스테드 트레이너: 자 마지막입니다 공주님. 3세트 10회 진행합니다.");
			System.out.println(name + " 공주: 흐어억.. 더 이상은...");
			System.out.println("크리스 범스테드 트레이너: no pain, no gain! 이대로 포기하면 아무것도 안됩니다 공주님.");
			System.out.println();

			System.out.println("-- 하체 운동을 마쳤습니다 --");

			System.out.println("크리스 범스테드 트레이너: 공주님, 수고하셨습니다. 오늘 자기 전에 냉수 샤워 하고 주무시고요.. 운동하러 또 오실거죠? ");
			System.out.println(name + " 공주: (윽..ㅡㅡ)");
		}

		Character.plusHealth(3);
		Character.plusCharm(2);
		GameMain.plusdayTime(4);
	}

	// 4. 화장하기
	public void makeUp() {
		System.out.println("-- 공주가 화장대 앞에 앉았다 --");
		System.out.println("화장 미니게임 타임 !");

		// 화장 miniGame class
		MiniGame makeupGame = new MiniGame();
		makeupGame.makeUp_game();

	}

	// 5. 잠자기
	public void sleep() {
		// 랜덤 시간 수면 -> 수면 시간 따라 체력 증감
		System.out.println("-- 공주가 침대에 누웠다 --");

		// 랜덤한 수면 시간 생성 (1~10 사이)
		Random random = new Random();
		int sleepTime = random.nextInt(10) + 1;

		Character.plusHealth(sleepTime);

		System.out.println("공주는 " + sleepTime + "시간 잠들었다");
	}

}
