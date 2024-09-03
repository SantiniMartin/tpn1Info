package Entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class EventoGastronomico {

    private UUID idEvento;
    private String nombre;
    private String descripcion;
    private LocalDateTime fechaHora;
    private String ubicacion;
    private int capacidad;
    private Chef chefEncargado;
    private List<Participante> participantesDelEvento = new LinkedList<>();
    private List<Reseña> reseñas = new ArrayList<>();

    public EventoGastronomico(String nombre, String descripcion, LocalDateTime fechaHora, String ubicacion, int capacidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaHora = fechaHora;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
    }

    public UUID getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(UUID idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Chef getChefEncargado() {
        return chefEncargado;
    }

    public void setChefEncargado(Chef chefEncargado) {
        this.chefEncargado = chefEncargado;
    }

    public List<Participante> getParticipantesDelEvento() {
        return participantesDelEvento;
    }

    public List<Reseña> getReseñas() {
        return reseñas;
    }

    public boolean hayLugar(){
        return capacidad > participantesDelEvento.size();
    }

    public void reseñaEvento(Reseña reseña){
        reseñas.add(reseña);
    }

    @Override
    public String toString() {
        return "idEvento: " + idEvento +
                ", Dombre: " + nombre +
                ", Descripcion: " + descripcion +
                ", Fecha y hora: " + fechaHora +
                ", Ubicacion: " + ubicacion +
                ", Capacidad: " + capacidad +
                ", Chef encargado: " + chefEncargado +
                ", Participantes del evento: " + participantesDelEvento +
                ", reseñas=" + reseñas;
    }
}