package _1Singleton;

import _1Singleton.LoggerGlobal.LoggerManager;
import _1Singleton.SessaoJogo.GameSessionManager;

public class AppSingleton {
    public static void main(String[] args) {

        /* Executar o App Logger Global */
        runLoggerManagerApp();

        /* Executar o App Sessão de Jogo */
        runGameSessionManagerApp();

    }

    /* Gerenciador de Logger Global */
    public static void runLoggerManagerApp() {
        LoggerManager loggerManager = LoggerManager.getInstance();
        loggerManager.addLog("abc");

        LoggerManager loggerManager2 = LoggerManager.getInstance();
        loggerManager2.addLog("def");
        loggerManager2.addLog("ghi");
        loggerManager2.printLogs();
    }

    /* Gerenciador de Sessão de Jogo */
    public static void runGameSessionManagerApp() {

        GameSessionManager gameSession = GameSessionManager.getInstance();
        //Iniciar o Jogo
        gameSession.startGame();

        //Avança no jogo e ganha pontos
        gameSession.addPoints(20);
        gameSession.addPoints(80);
        gameSession.addPoints(20);
        gameSession.addPoints(120);
        gameSession.addPoints(300);

        //Visualiza status do jogo
        gameSession.getStatusGame();

    }
}
