package 프린세스메이커;
import java.util.Scanner;
import java.util.Random;

public class MiniGame {
    public void ethics_game(String[] args) {
        System.out.println();
    }

    public void writing_game(String[] args){
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
        
        Random R1 = new Random();
        Scanner writing_in = new Scanner(System.in);
        int writing_rnd = R1.nextInt(10);

        System.out.printf("다음 문장을 받아적어주세요.");
        System.out.println(writing_arr[writing_rnd]);
        String user_sentence = writing_in.nextLine();

        if (writing_arr[writing_rnd].equals(user_sentence))
            System.out.println("정답입니다.");
        else
            System.out.println("오답입니다.");

    }

    public void math_game(String[] args){
        Random R2 = new Random();
        int math_score = 0;
        Scanner math_in = new Scanner(System.in);
        System.out.println("다음 구구단을 보고 정답을 입력해주세요.");

        for(int i = 0; i <= 10; ++i){
            int math_rnd_1 = R2.nextInt(10);
            int math_rnd_2 = R2.nextInt(10);

            System.out.printf(math_rnd_1 + " × " + math_rnd_2 + " = ");
            int math_ans = math_in.nextInt();

            if (math_ans == math_rnd_1 * math_rnd_2){
                System.out.println("정답입니다.");
                math_score += 10;
                System.out.println("내 점수는 : " + math_score + "점");
            }
            else{
                System.out.println("오답입니다.");
                System.out.println("내 점수는 : " + math_score + "점");
            }
        }

        if (math_score >= 90) {
            System.out.println("제니퍼 교수: 역시 공주님이세요! 이러다가 저처럼 교수되시겠어요. 호호");
        }
        else if (math_score >= 70) {
            System.out.println("제니퍼 교수: 괜찮아요 공주님. 실수정도야 누구나 하는거 아니겠어요?");
        }
        else if (math_score >= 50) {
            System.out.println("제니퍼 교수: ...");
            System.out.println("제니퍼 교수: 수학 수업 자주 들으러 오세요 공주님");
        }
        else {
            System.out.println("제니퍼 교수: ...");
            System.out.println("제니퍼 교수: 다음엔 꼭 공부해오세요 공주님!!");
        }
    }

    public void makeUp_game(String[] args){
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

        
        for(int i = 0; i < 0;){
            System.out.println("피부색을 결정하는 물약을 골라주세요!");
            System.out.println("1번 : " + skin_arr[0]);
            System.out.println("2번 : " + skin_arr[1]);
            System.out.println("3번 : " + skin_arr[2]);
            System.out.println("4번 : " + skin_arr[3]);

            System.out.printf("내가 고른 피부색은? : ");
            user_skin = makeUp_in.nextInt();

            if (user_skin == 0){
                System.out.println("번호를 다시 입력해주세요!");
                continue;
            }
            else
                System.out.println(skin_arr[user_skin-1]+"을 고르셨습니다!");
                break;
        }

        for(int i = 0; i < 0;){
            System.out.println("눈 색을 결정하는 물약을 골라주세요!");
            System.out.println("1번 : " + eyes_arr[0]);
            System.out.println("2번 : " + eyes_arr[1]);
            System.out.println("3번 : " + eyes_arr[2]);
            System.out.println("4번 : " + eyes_arr[3]);

            System.out.printf("내가 고른 눈 색은? : ");
            user_eyes = makeUp_in.nextInt();

            if (user_skin == 0){
                System.out.println("번호를 다시 입력해주세요!");
                continue;
            }
            else
                System.out.println(eyes_arr[user_eyes-1]+"를 고르셨습니다!");
                break;
        }

        for(int i = 0; i < 0;){
            System.out.println("머리색을 결정하는 물약을 골라주세요!");
            System.out.println("1번 : " + hair_arr[0]);
            System.out.println("2번 : " + hair_arr[1]);
            System.out.println("3번 : " + hair_arr[2]);
            System.out.println("4번 : " + hair_arr[3]);

            System.out.printf("내가 고른 머리색은? : ");
            user_skin = makeUp_in.nextInt();

            if (user_skin == 0){
                System.out.println("번호를 다시 입력해주세요!");
                continue;
            }
            else
                System.out.println(hair_arr[user_hair-1]+"을 고르셨습니다!");
                break;
        }

        for(int i = 0; i < 0;){
            System.out.println("네일색을 결정하는 물약을 골라주세요!");
            System.out.println("1번 : " + nail_arr[0]);
            System.out.println("2번 : " + nail_arr[1]);
            System.out.println("3번 : " + nail_arr[2]);
            System.out.println("4번 : " + nail_arr[3]);

            System.out.printf("내가 고른 네일색은? : ");
            user_skin = makeUp_in.nextInt();

            if (user_skin == 0){
                System.out.println("번호를 다시 입력해주세요!");
                continue;
            }
            else
                System.out.println(nail_arr[user_nail-1]+"를 고르셨습니다!");
                break;
        }

        for(int i = 0; i < 0;){
            System.out.println("포인트색을 결정하는 물약을 골라주세요!");
            System.out.println("1번 : " + point_arr[0]);
            System.out.println("2번 : " + point_arr[1]);
            System.out.println("3번 : " + point_arr[2]);
            System.out.println("4번 : " + point_arr[3]);

            System.out.printf("내가 고른 포인트색은? : ");
            user_skin = makeUp_in.nextInt();

            if (user_skin == 0){
                System.out.println("번호를 다시 입력해주세요!");
                continue;
            }
            else
                System.out.println(point_arr[user_point-1]+"를 고르셨습니다!");
                break;
        }

    }
}
