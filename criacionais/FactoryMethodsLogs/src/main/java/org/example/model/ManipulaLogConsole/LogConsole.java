package org.example.model.ManipulaLogConsole;



import org.example.model.GerenciadorLog;



public class LogConsole implements GerenciadorLog {

    @Override
    public void executaLog(String message) {
       System.out.println(message);
    }
}
