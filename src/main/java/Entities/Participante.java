package Entities;

import Enumerations.InteresesCulinariosEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Participante {

    private UUID idParticipante;
    private String nombreApellido;
    private InteresesCulinariosEnum interesCulinario;
    private List<EventoGastronomico> historialDeEventos = new ArrayList<>();

    public Participante(UUID idParticipante, String nombreApellido, InteresesCulinariosEnum interesCulinario, List<EventoGastronomico> historialDeEventos) {
        this.idParticipante = idParticipante;
        this.nombreApellido = nombreApellido;
        this.interesCulinario = interesCulinario;
        this.historialDeEventos = historialDeEventos;
    }

    public UUID getIdParticipante() {
        return idParticipante;
    }

    public void setIdParticipante(UUID idParticipante) {
        this.idParticipante = idParticipante;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public InteresesCulinariosEnum getInteresCulinario() {
        return interesCulinario;
    }

    public void setInteresCulinario(InteresesCulinariosEnum interesCulinario) {
        this.interesCulinario = interesCulinario;
    }

    public List<EventoGastronomico> getHistorialDeEventos() {
        return historialDeEventos;
    }

    public void setHistorialDeEventos(List<EventoGastronomico> historialDeEventos) {
        this.historialDeEventos = historialDeEventos;
    }

    private void registarAEvento(EventoGastronomico evento){
            this.historialDeEventos.add(evento);
    }
}