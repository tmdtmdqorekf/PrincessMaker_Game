package 프린세스메이커;

public class Character {
    
    String name; //private?
    int health;
    int intelligence;
    int charm;
    int morality;

    public Character(String name){
        this.name = name;
        this.health = 10;
        this.intelligence = 10;
        this.charm = 10;
        this.morality = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getCharm() {
        return this.charm;
    }

    public void setCharm(int charm) {
        this.charm = charm;
    }

    public int getMorality() {
        return this.morality;
    }

    public void setMorality(int morality) {
        this.morality = morality;
    }
}
