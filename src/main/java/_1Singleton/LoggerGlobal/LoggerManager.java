package _1Singleton.LoggerGlobal;

import java.util.ArrayList;
import java.util.List;

public class LoggerManager {
    private static LoggerManager instance;
    private List<String> loggers = new ArrayList<>();

    public static LoggerManager getInstance(){
        if(instance == null)
            instance = new LoggerManager();
        return instance;
    }

    public void addLog(String messageLog){
        loggers.add(messageLog);
    }

    public void printLogs(){
        loggers.forEach(l -> System.out.println(l));
    }
}
