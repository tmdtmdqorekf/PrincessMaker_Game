package princessMaker;

public class Character {

	String name;
	static int health = 10;
	static int intelligence = 10;
	static int charm = 10;
	static int morality = 10;

	public Character(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public static void plusHealth(int health) {
		Character.health += health;
	}

	public static void plusIntelligence(int intelligence) {
		Character.intelligence += intelligence;
	}

	public static void plusCharm(int charm) {
		Character.charm += charm;
	}

	public static void plusMorality(int morality) {
		Character.morality += morality;
	}
}
