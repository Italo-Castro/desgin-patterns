package org.example;

import org.example.model.GerenciadorLog;

import java.util.Date;

public abstract class ManipulaLog {

    protected  abstract  GerenciadorLog gerenciaLog();

    public void montaLog(String mensagem) {
        gerenciaLog().executaLog(new Date().getTime() +" - " + mensagem);
    }

}
