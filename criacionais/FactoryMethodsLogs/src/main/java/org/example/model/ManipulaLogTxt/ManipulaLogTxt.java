package org.example.model.ManipulaLogTxt;

import org.example.ManipulaLog;
import org.example.model.GerenciadorLog;

public class ManipulaLogTxt extends ManipulaLog {

    private String logMensagem;


    public ManipulaLogTxt(String logMensagem) {
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
        new LogTxt().executaLog(this.getLogMensagem());
        return null;
    }


}
