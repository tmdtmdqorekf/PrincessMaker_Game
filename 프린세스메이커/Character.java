package 프린세스메이커;

public class Character {
    
    String name; //private?
    static int health = 10;
    static int intelligence = 10;
    static int charm = 10;
    static int morality = 10;

    public Character(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getHealth() {
        return health;
    }

    public static void setHealth(int health) {
        Character.health = health;
    }

    public static int getIntelligence() {
        return intelligence;
    }

    public static void setIntelligence(int intelligence) {
        Character.intelligence = intelligence;
    }

    public static int getCharm() {
        return charm;
    }

    public static void setCharm(int charm) {
        Character.charm = charm;
    }

    public static int getMorality() {
        return morality;
    }

    public static void setMorality(int morality) {
        Character.morality = morality;
    }
}
