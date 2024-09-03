package Entities;
import java.util.UUID;

public class Reseña {

    private UUID idReseña;
    private String comentario;
    private Participante autorReseña;
    private EventoGastronomico eventoReseñado;
    private int calificacionEvento;

    public Reseña(UUID idReseña, String comentario, Participante autorReseña, EventoGastronomico eventoReseñado, int calificacionEvento) {
        this.idReseña = idReseña;
        this.comentario = comentario;
        this.autorReseña = autorReseña;
        this.eventoReseñado = eventoReseñado;
        this.calificacionEvento = calificacionEvento;
    }

    public UUID getIdReseña() {
        return idReseña;
    }

    public void setIdReseña(UUID idReseña) {
        this.idReseña = idReseña;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Participante getAutorReseña() {
        return autorReseña;
    }

    public void setAutorReseña(Participante autorReseña) {
        this.autorReseña = autorReseña;
    }

    public EventoGastronomico getEventoReseñado() {
        return eventoReseñado;
    }

    public void setEventoReseñado(EventoGastronomico eventoReseñado) {
        this.eventoReseñado = eventoReseñado;
    }

    public int getCalificacionEvento() {
        return calificacionEvento;
    }

    public void setCalificacionEvento(int calificacionEvento) {
        this.calificacionEvento = calificacionEvento;
    }
}