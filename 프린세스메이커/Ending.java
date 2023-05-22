package 프린세스메이커;

public class Ending {

    public Ending(){
        //생성자
    }
    
    public void EndCheck(){
    if(Character.health >= 100 && Character.charm <= 50 && Character.intelligence <= 50 && Character.morality >= 50){
        kniteEnd();
    }else if(Character.health >= 80 && Character.charm <= 40 && Character.intelligence <= 40 && Character.morality >= 40){
        guardEnd();
    }else if(Character.health >= 60 && Character.charm <= 30 && Character.intelligence <= 30 && Character.morality >= 60){
        gateEnd();
    }else if(Character.health >= 50 && Character.charm >= 100 && Character.intelligence <= 50 && Character.morality >= 50){
        princessEnd();
    }else if(Character.health <= 40 && Character.charm >= 80 && Character.intelligence <= 40 && Character.morality >= 40){
        royalEnd();
    }else if(Character.health <= 30 && Character.charm >= 60 && Character.intelligence <= 30 && Character.morality >= 60){
        maidEnd();
    }else if(Character.health >= 50 && Character.charm <= 50 && Character.intelligence >= 100 && Character.morality >= 50){
        professerEnd();
    }else if(Character.health <= 40 && Character.charm <= 40 && Character.intelligence >= 80 && Character.morality >= 40){
        writerEnd();
    }else if(Character.health <= 50 && Character.charm <= 50 && Character.intelligence >= 60 && Character.morality <= 30){
        trickEnd();
    }else if(Character.health <= 50 && Character.charm <= 30 && Character.intelligence <= 50 && Character.morality >= 80){
        nunEnd();
    }else if(Character.health <= 40 && Character.charm >= 60 && Character.intelligence <= 40 && Character.morality >= 60){
        merchantEnd();
    }else if(Character.health <= 30 && Character.charm <= 50 && Character.intelligence <= 30 && Character.morality <= 30){
        thiefEnd();
    }else{
        noEnd();
        }
    }
    public void kniteEnd(){
        System.out.println("당신은 용감한 기사가 되었습니다!");
        System.out.println("마침내 악당을 물리치고 왕국을 구한 후, 공주의 사랑을 받았습니다.");
        System.out.println("당신은 영웅으로서 무한한 영광과 명예를 얻게 되었습니다.");
    }

    public void guardEnd(){
        System.out.println("당신은 경비병으로 일하게 되었습니다!");
        System.out.println("왕국의 평화를 지키기 위해 밤낮 없이 수비에 나섰고, 그 공로를 인정받았습니다.");
        System.out.println("당신은 용감하고 충직한 경비병으로서 영원히 기억될 것입니다.");
    }

    public void gateEnd(){
        System.out.println("당신은 문지기가 되었습니다!");
        System.out.println("성문을 지키고 출입을 통제하는 역할을 맡게 되었습니다.");
        System.out.println("왕국의 안전을 위해 노력하며, 사람들에게 신뢰를 주는 문지기로서 명성을 얻었습니다.");
    }
    
    public void princessEnd(){
        System.out.println("당신은 공주가 되었습니다!");
        System.out.println("훌륭한 왕자와의 로맨틱한 결혼식을 갖고 왕국의 여왕이 되었습니다.");
        System.out.println("당신은 아름다운 왕비로서 국민들의 사랑과 존경을 받게 되었습니다.");
    }

    public void royalEnd(){
        System.out.println("당신은 후궁이 되었습니다!");
        System.out.println("왕의 곁에서 그를 모시고 그를 위해 충성을 다하는 삶을 선택했습니다.");
        System.out.println("당신은 왕을 위한 충직한 후궁으로서 궁중에서의 위세를 높였습니다.");
    }

    public void maidEnd(){
        System.out.println("당신은 시녀가 되었습니다!");
        System.out.println("왕궁에서 공주를 모시고 섬기는 일상을 살게 되었습니다.");
        System.out.println("당신은 섬세한 도움으로 왕족의 신뢰를 얻고, 궁중에서 가장 신랄한 칭찬을 받았습니다.");
    }

    public void professerEnd(){
        System.out.println("당신은 귀족 가문의 교수가 되었습니다!");
        System.out.println("탁월한 지식과 교양으로 많은 학생들에게 가르침을 전하며 교육의 길에 서게 되었습니다.");
        System.out.println("당신은 철저한 교육과 진심 어린 멘토링으로 많은 학생들의 사랑과 존경을 받았습니다.");
    }
    
    public void writerEnd(){
        System.out.println("당신은 작가가 되었습니다!");
        System.out.println("단편 소설부터 장편 소설까지 다양한 작품을 통해 세계적인 명성을 얻었습니다.");
        System.out.println("당신의 작품은 많은 사람들에게 감동과 영감을 주며 영구적인 문학적 가치를 지니게 되었습니다.");
    }
    
    public void trickEnd(){
        System.out.println("당신은 사기꾼이 되었습니다!");
        System.out.println("교묘한 솜씨로 사람들을 속이고, 부와 명예를 얻는 사기의 세계에 발을 들였습니다.");
        System.out.println("하지만 결국은 자신도 속임당할 위험에 빠지며 비참한 마침을 맞게 되었습니다.");
    }
    
    public void nunEnd(){
        System.out.println("당신은 경건한 수녀가 되었습니다!");
        System.out.println("신앙심과 청렴한 마음으로 수도원에서 평화로운 삶을 사는 일에 전념하였습니다.");
        System.out.println("당신의 신앙심과 인내력은 많은 사람들에게 희망과 위로를 주었습니다.");
    }
    
    public void merchantEnd(){
        System.out.println("당신은 귀족 상인이 되었습니다!");
        System.out.println("잘돌아가는 상업 제국을 구축하여 많은 부를 축적하였습니다.");
        System.out.println("당신은 귀족들의 신뢰를 얻으며 왕국 경제에 큰 기여를 하게 되었습니다.");
    }
    
    public void thiefEnd(){
        System.out.println("당신은 도둑이 되었습니다!");
        System.out.println("술취한 밤, 어두운 그늘에서 사람들의 소지품을 훔치는 일에 매료되었습니다.");
        System.out.println("하지만 비밀리에 사는 삶은 위험과 불안에 가득차며, 결국에는 사회의 법과 벌에 걸리게 되었습니다.");
        System.out.println("당신은 마지막으로 도둑의 길을 떠날지 혹은 올바른 삶을 선택할지 고민하게 됩니다.");
    }
    
    public static void noEnd(){
        System.out.println("당신은 무직이 되었습니다!");
        System.out.println("여러 직업을 경험하며 자신의 역량과 관심 분야를 찾지 못했습니다.");
        System.out.println("하지만 그렇다고 해서 포기하지 않았습니다. 더 나은 미래를 위해 노력하며 새로운 기회를 기다리는 중입니다.");
        System.out.println("당신은 내일의 가능성과 무궁한 잠재력을 품고 있는 존재입니다.");
    }
    
}