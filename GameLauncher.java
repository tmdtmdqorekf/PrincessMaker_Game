package 프린세스메이커;

public class GameLauncher {
    public static void main(String[] args) {
        GameMain play = new GameMain();
        play.GamePlay();
        Ending End = new Ending();
        End.EndCheck();
    }
}
