package org.example.model.ManipulaLogConsole;

import org.example.ManipulaLog;
import org.example.model.GerenciadorLog;

public class ManipulaLogConsole extends ManipulaLog {

    private String logMensagem;

    public ManipulaLogConsole(String logMensagem) {
        this.logMensagem = logMensagem;
    }

    public String getLogMensagem() {
        return logMensagem;
    }

    public void setLogMensagem(String logMensagem) {
        this.logMensagem = logMensagem;
    }

    @Override
    protected GerenciadorLog gerenciaLog() {
        new LogConsole().executaLog(this.getLogMensagem());
        return null;
    }


}
