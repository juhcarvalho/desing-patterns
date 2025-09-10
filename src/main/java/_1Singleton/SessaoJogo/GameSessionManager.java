package _1Singleton.SessaoJogo;

public class GameSessionManager {
    private static GameSessionManager instance;

    private static int MAX_POINT_FOR_LEVEL = 100;

    private int point;

    private int level;

    private int life;

    public static GameSessionManager getInstance(){
        if (instance == null) {
            instance = new GameSessionManager();
        }
        return instance;
    }

    public void startGame() {
        System.out.println("The game has started!");
        point = 0;
        life = 5;
        level = 1;
    }

    /* Sempre que chegar a quantidade máxima de pontos por nivel
       o usuário sobre de level e subtrai essa quantidade da pontuação atual.
      O processo se repete até que a pontuação seja menos que a quantidade máxima.
    * */
    public synchronized void addPoints(int points) {
        boolean isLevelUp = false;
        point += points;

        while (point > MAX_POINT_FOR_LEVEL) {
            level++;
            point -= MAX_POINT_FOR_LEVEL;
            isLevelUp = true;
        }

        if (isLevelUp)
            System.out.println("You Level Up to " + level);
    }

    public synchronized void lifeDown() throws Exception {
        if (life > 0) {
            life--;
            System.out.println("You lost! You have " + life + "lifes!");
        }else {
            throw new Exception("Game Over!");
        }
    }

    public void getStatusGame () {
        System.out.println(" ------------  GAME STATUS --------------------- ");
        System.out.println("Your level is: " + level);
        System.out.println("You have:");
        System.out.println(life + " lifes and " + point + " points");
        System.out.println(" ---------------------------------------------- ");
    }

}
