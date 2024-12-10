package org.example;

import org.example.model.ManipulaLogConsole.ManipulaLogConsole;
import org.example.model.ManipulaLogTxt.ManipulaLogTxt;

public class Main {
    public static void main(String[] args) {
        ManipulaLog manipulaLogTxt = new ManipulaLogTxt("Log gravado no arquivo txt");
        manipulaLogTxt.gerenciaLog();


        ManipulaLog manipulaLogConsole= new ManipulaLogConsole("Log printado no console");
        manipulaLogConsole.gerenciaLog();
    }




}