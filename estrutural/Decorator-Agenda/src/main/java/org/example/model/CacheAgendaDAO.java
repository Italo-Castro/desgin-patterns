package org.example.model;

public class CacheAgendaDAO implements AgendaInterface{


    private AgendaInterface agendaInterface;


    public CacheAgendaDAO(AgendaInterface agendaInterface) {
        this.agendaInterface = agendaInterface;
    }

    @Override
    public void inserir(Contato contato) {
        //Poderia ter mais código aqui
        agendaInterface.inserir(contato);
        //Ou Poderia ter mais código aqui

        System.out.println("Busquei e ao buscar adicionei uma logica diferente <- Exemplo");

          /*  Este é o conceito do decorator
            pois eu anexo responsbailidade adicionais a um objeto dinamicamente
        */
    }

    @Override
    public Contato buscar(Integer codigo) {
        //Poderia ter mais código aqui
        return agendaInterface.buscar(codigo);
        //Ou Poderia ter mais código aqui

        /*  Este é o conceito do decorator
            pois eu anexo responsbailidade adicionais a um objeto dinamicamente
        */
    }
}
