package 프린세스메이커;

import java.util.Scanner;

public class GameLauncher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int dayTime = 0; //날짜 체크 hour 기준

        System.out.println("프린세스 메이커 게임을 시작합니다 !");
        System.out.print("사용자의 이름을 입력해주세요 : ");
        String username = in.next();

        Character user = new Character(username);
        //행동 클래스 객체 생성

        System.out.printf("%s님 환영합니다 , 당신의 성장을 응원합니다!",username);
        System.out.print("다음 선택지 중 하나를 선택하세요");

        while(dayTime < 240){
            System.out.println("1.공부하기 2.독서하기 3.운동하기 4.화장하기 5.잠자기 6.프로그램 종료");
            System.out.print("행동 입력 : ");
            int num = in.nextInt(); //행동 입력 받음

            if(num == 1){
                //공부하기 메서드
            }else if(num == 2){
                //독서하기 메서드
            }else if(num == 3){
                //운동하기 메서드
            }else if(num == 4){
                //화장하기 메서드
            }else if(num == 5){
                //잠자기 메서드
            }else if(num == 6){
                break;
                // 1.break 후 현재 스탯값에 따라 엔딩 출력되게 함
                // 2.날짜와 현재 스탯 기본값으로 초기화 한 후 게임이 재 시작되게 함
            }

            //엔딩 클래스 static method로 실행함 
            
            if(user.health >= 100 && user.charm <= 50 && user.intelligence <= 50 && user.morality >= 50){
                Ending.kniteEnd();
            }else if(user.health >= 80 && user.charm <= 40 && user.intelligence <= 40 && user.morality >= 40){
                Ending.guardEnd();
            }else if(user.health >= 60 && user.charm <= 30 && user.intelligence <= 30 &&user.morality >= 60){
                Ending.gateEnd();
            }else if(user.health >= 50 && user.charm >= 100 && user.intelligence <= 50 && user.morality >= 50){
                Ending.princessEnd();
            }else if(user.health <= 40 && user.charm >= 80 && user.intelligence <= 40 && user.morality >= 40){
                Ending.royalEnd();
            }else if(user.health <= 30 && user.charm >= 60 && user.intelligence <= 30 && user.morality >= 60){
                Ending.maidEnd();
            }else if(user.health >= 50 && user.charm <= 50 && user.intelligence >= 100 && user.morality >= 50){
                Ending.professerEnd();
            }else if(user.health <= 40 && user.charm <= 40 && user.intelligence >= 80 && user.morality >= 40){
                Ending.writerEnd();
            }else if(user.health <= 50 && user.charm <= 50 && user.intelligence >= 60 && user.morality <= 30){
                Ending.trickEnd();
            }else if(user.health <= 50 && user.charm <= 30 && user.intelligence <= 50 && user.morality >= 80){
                Ending.nunEnd();
            }else if(user.health <= 40 && user.charm >= 60 && user.intelligence <= 40 && user.morality >= 60){
                Ending.merchantEnd();
            }else if(user.health <= 30 && user.charm <= 50 && user.intelligence <= 30 && user.morality <= 30){
                Ending.thiefEnd();
            }else{
                Ending.noEnd();
            }
        }
        in.close();
    }
}
