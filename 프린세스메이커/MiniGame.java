package PrincessMaker_Game;

import java.util.Scanner;
import java.util.Random;

public class MiniGame {
    public int ethics_game() {

        System.out.println("윤리적 이론 퀴즈 게임을 시작합니다.");
        System.out.println("퀴즈에 대한 답을 입력해주세요.");

        // 윤리적 이론 퀴즈 문제와 정답 배열
        String[] questions = {
                "1. 윤리적 이론 중 행동 결과에 초점을 둔 이론은?",
                "2. 윤리적 이론 중 의무와 귀인을 중시하는 이론은?",
                "3. 윤리적 이론 중 가장 큰 행복을 추구하는 이론은?",
                "4. 윤리적 이론 중 사회적 계약에 기반을 둔 이론은?",
                "5. 윤리적 이론 중 사회적 공동체의 이익을 추구하는 이론은?",
                "6. 윤리적 이론 중 개인의 자아실현을 중시하는 이론은?"
        };
        String[] answers = {
                "결과주의 윤리학",
                "의무론",
                "궁극적 가치 이론",
                "사회계약론",
                "공공선량주의",
                "자기실현주의"
        };

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

        // 피부색 결정
        String[] skin_arr = new String[4];
        int user_skin = 0;
        skin_arr[0] = "분홍색 물약";
        skin_arr[1] = "파란색 물약";
        skin_arr[2] = "노란색 물약";
        skin_arr[3] = "초록색 물약";

        // 눈색 결정
        String[] eyes_arr = new String[4];
        int user_eyes = 0;
        eyes_arr[0] = "분홍색 별가루";
        eyes_arr[1] = "초록색 별가루";
        eyes_arr[2] = "노란색 별가루";

        // 머리색 결정
        String[] hair_arr = new String[4];
        int user_hair = 0;
        hair_arr[0] = "분홍색 물감";
        hair_arr[1] = "초록색 물감";
        hair_arr[2] = "노란색 물감";

        System.out.println("공주는 세상에서 제일 아름다운 왕비로 변신하고자 한다.");
        System.out.println("물약을 잘 제조하여 변신 마법에 성공하도록 하자!");

        while (true) {
            System.out.println("피부색을 결정하는 물약을 골라주세요!");
            System.out.println("1 : " + skin_arr[0]);
            System.out.println("2 : " + skin_arr[1]);
            System.out.println("3 : " + skin_arr[2]);

            System.out.print("내가 고른 피부색은? : ");
            user_skin = makeUp_in.nextInt();

            if (user_skin == 0) {
                System.out.println("번호를 다시 입력해주세요!");
            } else {
                System.out.println(skin_arr[user_skin - 1] + "을 고르셨습니다!");
                break;
            }
        }

        while (true) {
            System.out.println("눈 색을 결정하는 물약을 골라주세요!");
            System.out.println("1 : " + eyes_arr[0]);
            System.out.println("2 : " + eyes_arr[1]);
            System.out.println("3 : " + eyes_arr[2]);

            System.out.print("내가 고른 눈 색은? : ");
            user_eyes = makeUp_in.nextInt();

            if (user_eyes == 0) {
                System.out.println("번호를 다시 입력해주세요!");
            } else {
                System.out.println(eyes_arr[user_eyes - 1] + "를 고르셨습니다!");
                break;
            }
        }

        while (true) {
            System.out.println("머리색을 결정하는 물약을 골라주세요!");
            System.out.println("1 : " + hair_arr[0]);
            System.out.println("2 : " + hair_arr[1]);
            System.out.println("3 : " + hair_arr[2]);

            System.out.print("내가 고른 머리색은? : ");
            user_hair = makeUp_in.nextInt();

            if (user_hair == 0) {
                System.out.println("번호를 다시 입력해주세요!");
            } else {
                System.out.println(hair_arr[user_hair - 1] + "을 고르셨습니다!");
                break;
            }
        }

        System.out.println("-------변신 물약 완료!-------");
        System.out.println("공주는 변신 물약을 마시기 시작했다.");

        if (user_skin == 1 && user_eyes == 1 && user_hair == 1) {
            System.out.println("펑!");
            System.out.println("공주는 아쉽게도 그대로였다!");
            System.out.println("아무래도 공주를 상징하는 분홍색 물약들만 넣다보니 그대로 상태가 유지된 것 같다.");
        }
        else if (user_skin == 1 && user_eyes == 1 && user_hair == 2) {
            System.out.println("펑!");
            System.out.println("공주가 마녀 수련생으로 변신하였다!");
            System.out.println("머리색이 초록색이라 다른 사람들이 무서워하지 않도록 조심해야겠다.");
        }
        else if (user_skin == 1 && user_eyes == 1 && user_hair == 3) {
            System.out.println("펑!");
            System.out.println("공주가 프로 일탈러로 변신하였다!");
            System.out.println("공주의 탈색한 머리색은 반항심을 보여주기에 충분했다.");
        }
        else if (user_skin == 1 && user_eyes == 2 && user_hair == 1) {
            System.out.println("펑!");
            System.out.println("공주가 늑대인간으로 변신하였다!");
            System.out.println("공주의 초록색 눈빛이 늑대인간의 유전자를 보여주기에 충분했다.");
        }
        else if (user_skin == 1 && user_eyes == 2 && user_hair == 2) {
            System.out.println("펑!");
            System.out.println("공주가 마녀와 늑대인간의 혼혈로 변신하였다!");
        }
        else if (user_skin == 1 && user_eyes == 2 && user_hair == 3) {
            System.out.println("펑!");
            System.out.println("공주가 마녀와 늑대인간의 혼혈인 아기로 변신하였다!");
        }
        else if (user_skin == 1 && user_eyes == 3 && user_hair == 1) {
            System.out.println("펑!");
            System.out.println("공주는 세상에서 가장 아름다운 진정한 여왕으로 변신하였다!");
        }
        else if (user_skin == 1 && user_eyes == 3 && user_hair == 2) {
            System.out.println("펑!");
            System.out.println("공주는 마녀 아기로 변신하였다!");
        }
        else if (user_skin == 1 && user_eyes == 3 && user_hair == 3) {
            System.out.println("펑!");
            System.out.println("공주는 5살 아기로 변신하였다!");
        }
        else if (user_skin == 2 && user_eyes == 1 && user_hair == 1) {
            System.out.println("펑!");
            System.out.println("공주는 개구리로 변신하였다!");
        }
        else if (user_skin == 2 && user_eyes == 1 && user_hair == 2) {
            System.out.println("펑!");
            System.out.println("공주는 사악한 눈을 가진 개구리로 변신하였다!");
        }
        else if (user_skin == 2 && user_eyes == 1 && user_hair == 3) {
            System.out.println("펑!");
            System.out.println("공주는 무리에서 일탈한 개구리로 변신하였다!");
        }
        else if (user_skin == 2 && user_eyes == 2 && user_hair == 1) {
            System.out.println("펑!");
            System.out.println("공주는 여자 개구리로 변신하였다!");
        }
        else if (user_skin == 2 && user_eyes == 2 && user_hair == 2) {
            System.out.println("펑!");
            System.out.println("공주는 진정한 마녀로 변신하였다!");
            System.out.println("이 세상을 물약으로 파괴시킬 것이 분명해보였다!");
        }
        else if (user_skin == 2 && user_eyes == 2 && user_hair == 3) {
            System.out.println("펑!");
            System.out.println("공주는 진정한 마녀의 아기로 변신했다!");
            System.out.println("싹수가 좋지 않다.");
        }
        else if (user_skin == 2 && user_eyes == 3 && user_hair == 1) {
            System.out.println("펑!");
            System.out.println("공주는 여자 애기 개구리로 변신했다!");
        }
        else if (user_skin == 2 && user_eyes == 3 && user_hair == 2) {
            System.out.println("펑!");
            System.out.println("공주는 마녀 애기 개구리로 변신했다!");
        }
        else if (user_skin == 2 && user_eyes == 3 && user_hair == 3) {
            System.out.println("펑!");
            System.out.println("공주는 갓 태어난 마녀 애기 개구리로 변신했다!");
        }
        else if (user_skin == 3 && user_eyes == 1 && user_hair == 1) {
            System.out.println("펑!");
            System.out.println("공주는 용감한 전사로 변신하였다!");
            System.out.println("그 황금빛 머리카락과 강렬한 눈빛은 싸움을 준비하는데 충분했다.");
        }
        else if (user_skin == 3 && user_eyes == 1 && user_hair == 2) {
            System.out.println("펑!");
            System.out.println("공주는 용감한 전사의 딸로 변신하였다!");
            System.out.println("상속받은 용맹함과 귀여운 눈빛은 모두를 매료시켰다.");
        }
        else if (user_skin == 3 && user_eyes == 1 && user_hair == 3) {
            System.out.println("펑!");
            System.out.println("공주는 카리스마 있는 여왕으로 변신하였다!");
            System.out.println("머리의 은빛과 황금빛은 그녀의 위엄을 상징했다.");
        }
        else if (user_skin == 3 && user_eyes == 2 && user_hair == 1) {
            System.out.println("펑!");
            System.out.println("공주는 어둠을 지배하는 여왕으로 변신하였다!");
            System.out.println("검은 머리와 차분한 눈빛은 그녀의 힘을 상징했다.");
        }
        else if (user_skin == 3 && user_eyes == 2 && user_hair == 2) {
            System.out.println("펑!");
            System.out.println("공주는 거대한 용으로 변신하였다!");
            System.out.println("불꽃을 뿜는 날개와 함께, 공주는 위협적인 존재가 되었다.");
        }
        else if (user_skin == 3 && user_eyes == 2 && user_hair == 3) {
            System.out.println("펑!");
            System.out.println("공주는 마녀와 용의 혼혈로 변신하였다!");
            System.out.println("마법과 힘을 모두 가진 공주, 그녀는 무자비한 힘으로 세계를 지배할 수 있을 것이다.");
        }
        else if (user_skin == 3 && user_eyes == 3 && user_hair == 1) {
            System.out.println("펑!");
            System.out.println("공주는 요정으로 변신하였다!");
            System.out.println("그녀의 빛나는 눈과 아름다운 피부, 그리고 날개로 인해 공주는 신비롭고 아름다운 존재가 되었다.");
        }
        else if (user_skin == 3 && user_eyes == 3 && user_hair == 2) {
            System.out.println("펑!");
            System.out.println("공주는 요정과 마녀의 혼혈로 변신하였다!");
            System.out.println("마법과 신비로움을 모두 갖춘 그녀는 세계를 놀라게 할 것이다.");
        }
        else if (user_skin == 3 && user_eyes == 3 && user_hair == 3) {
            System.out.println("펑!");
            System.out.println("공주는 신비한 요정의 아기로 변신했다!");
            System.out.println("싱그러운 미소와 마법적인 눈동자를 가진 그녀, 그녀의 탄생은 신화로 남을 것이다.");
        }
    }
}