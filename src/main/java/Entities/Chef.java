package Entities;

import Enumerations.EspecialidadEnum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Chef {

    private UUID idChef;
    private String nombreChef;
    private EspecialidadEnum especialidad;
    private List<EventoGastronomico> eventos = new ArrayList<>();

    public Chef(String nombreChef) {
        this.nombreChef = nombreChef;
    }

    public UUID getIdChef() {
        return idChef;
    }

    public void setIdChef(UUID idChef) {
        this.idChef = idChef;
    }

    public String getNombreChef() {
        return nombreChef;
    }

    public void setNombreChef(String nombreChef) {
        this.nombreChef = nombreChef;
    }

    public EspecialidadEnum getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(EspecialidadEnum complejidad) {
        this.especialidad = especialidad;
    }

    public List<EventoGastronomico> getEventos() {
        return eventos;
    }

    public void setEventos(List<EventoGastronomico> eventos) {
        this.eventos = eventos;
    }

    public void asignarEvento(EventoGastronomico evento){
        this.eventos.add(evento);
    }

    @Override
    public String toString() {
        return  "Nombre del Chef: " + nombreChef +
                ", Especialidad: " + especialidad +
                ", Eventos: " + eventos;
    }
}