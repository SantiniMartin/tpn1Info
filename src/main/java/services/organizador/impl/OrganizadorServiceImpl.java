package services.organizador.impl;

import Entities.EventoGastronomico;
import Entities.Organizador;
import services.evento.EventoService;
import services.evento.impl.EventoServiceImpl;
import services.organizador.OrganizadorService;

public class OrganizadorServiceImpl implements OrganizadorService {

    EventoService eventoService = new EventoServiceImpl();
    Organizador organizador = new Organizador();

    @Override
    public void crearEvento() {
        EventoGastronomico evento = eventoService.crearEvento();
        organizador.añadirEventoALista(evento);
    }

    @Override
    public void asignarChefAEvento() {

    }

    @Override
    public void listarEventos() {
        organizador.getListaDeEventos();
        for (EventoGastronomico evento: organizador.getListaDeEventos()){
            System.out.println("Evento: " + evento);
        }
    }
}
