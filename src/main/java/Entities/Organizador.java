package Entities;

import services.evento.EventoService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Organizador {


    private List<EventoGastronomico> listaDeEventos = new ArrayList<>();

    public List<EventoGastronomico> getListaDeEventos() {
        return listaDeEventos;
    }

    public void setListaDeEventos(List<EventoGastronomico> listaDeEventos) {
        this.listaDeEventos = listaDeEventos;
    }

    public void añadirEventoALista(EventoGastronomico eventoGastronomico){
        this.listaDeEventos.add(eventoGastronomico);
    }

    public boolean asignarChefAEvento(Chef chefAsignadoAEvento, UUID idEvento){
        EventoGastronomico eventoGastronomico = this.listaDeEventos.stream()
                .filter(evento -> evento.getIdEvento().equals(idEvento))
                .findAny()
                .orElse(null);

        if (eventoGastronomico == null){
            return false;
        }else {
            eventoGastronomico.setChefEncargado(chefAsignadoAEvento);
            chefAsignadoAEvento.asignarEvento(eventoGastronomico);
            return true;
        }
    }
}