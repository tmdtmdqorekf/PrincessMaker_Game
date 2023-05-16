package 프린세스메이커;

import java.util.Scanner;

public class Behavior {

    // 1. 공부하기
    public static void study(Character character) {
        ethics(character);
        presentation(character);
        writing(character);
        math(character); // MiniGame 객체도 추가해야함
    }

    // 1-1. 윤리 수업
    public static void ethics(Character character) {
        System.out.println("-- 윤리 수업 시간입니다 --");
        System.out.println("로잘린 교수: 공주님 오늘은 쓰레기 바닥에 안버리셨죠?");
        System.out.println("윤리 미니게임 타임 !");

        // 윤리 MiniGame class
    }

    // 1-2. 발표 수업
    public static void presentation(Character character) {
        Scanner in = new Scanner(System.in);

        System.out.println("-- 발표 수업 시간 --");
        System.out.println("스탠 리 교수: 발표 수업을 하도록 하겠수다. 흠흠");
        System.out.println("스탠 리 교수: " + character.getName() + " 공주, 한번 말해보시게나?");

        String user_presentation = in.next();
        System.out.println(character.getName() + " 공주: " + user_presentation);

        System.out.println("발표 수업은 아주 좋은 귀감이 되었다.");
    }

    // 1-3. 글쓰기 수업
    public static void writing(Character character) {
        System.out.println("-- 글쓰기 수업 시간 --");
        System.out.println("퍼시픽 교수: 공주님 받아쓰기 하실 준비 되셨나요?");

//        쓰기 MiniGame class
//
//        아래는 대충 이런 식으로 구현하라는 뜻

//        String sentence = "아무말1";
//        String user_sentence = in.next();
//
//        if (sentence == user_sentence) { // String 비교로 다시 짜기
//            System.out.println("정답");
//        }
    }

    // 1-4. 수학 수업
    public static void math(Character character) {
        Scanner in = new Scanner(System.in);

        System.out.println("-- 수학 수업 시간 --");
        System.out.println("제니퍼 교수: " + character.getName() + " 공주님 공부해오셨죠? 이제 문제를 풀어봅시다.");

        System.out.println("수학 미니게임 타임 !");

        // 수학 MiniGame class

        // MiniGame class 에서 결과 score return 받기
        int score = MiniGame.calculateScore(); // 메서드명은 수정 예정
        if (score >= 90) {
            System.out.println("제니퍼 교수: 역시 공주님이세요! 이러다가 저처럼 교수되시겠어요. 호호");
        } else if (score >= 70) {
            System.out.println("제니퍼 교수: 괜찮아요 공주님. 실수정도야 누구나 하는거 아니겠어요?");
        } else if (score >= 50) {
            System.out.println("제니퍼 교수: ...");
            System.out.println("제니퍼 교수: 수학 수업 자주 들으러 오세요 공주님");
        } else {
            System.out.println("제니퍼 교수: ...");
            System.out.println("제니퍼 교수: 다음엔 꼭 공부해오세요 공주님!!");
        }
        character.setIntelligence(character.getIntelligence() + 5);
    }

    // 2. 독서하기
    public static void read(Character character) {
        // 책 선택 -> 유명 구절 출력
    }

    // 3. 운동하기
    public static void exercise(Character character) {
        // 부위 (상체, 하체, 등등..) 선택 -> 루틴 출력
    }

    // 4. 화장하기
    public static void makeUp(Character character) {

        // 화장 miniGame class

    }

    // 5. 잠자기
    public static void sleep(Character character) {
        // 랜덤 시간 수면 -> 수면 시간 따라 체력 증감
    }

    // 6. 프로그램 종료
    public static void finish() {

    }
}