package princessMaker;

public class GameLauncher {
	public static void main(String[] args) {
		GameMain play = new GameMain();
		play.GamePlay();
		Ending End = new Ending();
		End.EndCheck();
	}
}
