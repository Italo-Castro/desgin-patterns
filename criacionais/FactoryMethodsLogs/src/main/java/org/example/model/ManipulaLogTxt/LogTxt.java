package org.example.model.ManipulaLogTxt;



import org.example.model.GerenciadorLog;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class LogTxt implements GerenciadorLog {

    @Override
    public void executaLog(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("arquivo.txt"))) {
            writer.write(message);
            System.out.println("Arquivo gravado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao gravar o arquivo: " + e.getMessage());
        }
    }
}
