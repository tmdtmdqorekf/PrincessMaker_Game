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

        System.out.println("%s님 환영합니다 , 당신의 성장을 응원합니다!");
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

            //엔딩 클래스 1.객체 2.static 택 1 
            
            if(Character.health >= 100 && Character.charm <= 50 && Character.intelligence <= 50 && Character.morality >= 50){
                //기사 엔딩
            }else if(Character.health >= 80 && Character.charm <= 40 && Character.intelligence <= 40 && Character.morality >= 40){
                //경비병 엔딩
            }else if(Character.health >= 60 && Character.charm <= 30 && Character.intelligence <= 30 &&Character.morality >= 60){
                //문지기 엔딩
            }else if(Character.health >= 50 && Character.charm >= 100 && Character.intelligence <= 50 && Character.morality >= 50){
                //공주 엔딩
            }else if(Character.health <= 40 && Character.charm >= 80 && Character.intelligence <= 40 && Character.morality >= 40){
                //후궁 엔딩
            }else if(Character.health <= 30 && Character.charm >= 60 && Character.intelligence <= 30 && Character.morality >= 60){
                //시녀 엔딩
            }else if(Character.health >= 50 && Character.charm <= 50 && Character.intelligence >= 100 && Character.morality >= 50){
                //교수 엔딩
            }else if(Character.health <= 40 && Character.charm <= 40 && Character.intelligence >= 80 && Character.morality >= 40){
                //작가 엔딩
            }else if(Character.health <= 50 && Character.charm <= 50 && Character.intelligence >= 60 && Character.morality <= 30){
                //사기꾼 엔딩
            }else if(Character.health <= 50 && Character.charm <= 30 && Character.intelligence <= 50 && Character.morality >= 80){
                //수녀 엔딩
            }else if(Character.health <= 40 && Character.charm >= 60 && Character.intelligence <= 40 && Character.morality >= 60){
                //상인 엔딩
            }else if(Character.health <= 30 && Character.charm <= 50 && Character.intelligence <= 30 && Character.morality <= 30){
                //도둑 엔딩
            }else{
                //무직
            }
        }
        in.close();
    }
}
