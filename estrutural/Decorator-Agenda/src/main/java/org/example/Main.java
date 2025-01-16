package org.example;

import org.example.model.AgendaDAO;
import org.example.model.AgendaInterface;
import org.example.model.CacheAgendaDAO;
import org.example.model.Contato;

public class Main {
    public static void main(String[] args) {

        AgendaInterface agenda   = new CacheAgendaDAO(new AgendaDAO());
        agenda.buscar(1);


    }
}