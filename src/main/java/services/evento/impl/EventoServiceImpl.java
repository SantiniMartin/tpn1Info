package services.evento.impl;

import Entities.EventoGastronomico;
import services.evento.EventoService;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.UUID;

public class EventoServiceImpl implements EventoService {

    Scanner sc = new Scanner(System.in);
    @Override
    public EventoGastronomico crearEvento(){
        System.out.println("Ingrese el nombre del evento: ");
        String nombreEvento = sc.nextLine();
        System.out.println("Ingrese una descipcion del evento: ");
        String descripcionEvento = sc.nextLine();
        System.out.println("Ingrese el año del evento: ");
        int anioEvento = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el mes del evento: ");
        int mesEvento = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el día del evento: ");
        int diaEvento = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la hora del evento: ");
        int horaEvento = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el minuto del evento: ");
        int minutoEvento = sc.nextInt();
        sc.nextLine();
        LocalDateTime fechaHoraEvento = LocalDateTime.of(anioEvento, mesEvento, diaEvento, horaEvento, minutoEvento);
        System.out.println("Ingrese la ubicación del evento: ");
        String ubicacionEvento = sc.nextLine();
        System.out.println("Ingrese la capacidad del evento: ");
        int capacidadEvento = sc.nextInt();
        sc.nextLine();
        EventoGastronomico nuevoEvento = new EventoGastronomico(nombreEvento, descripcionEvento,fechaHoraEvento, ubicacionEvento, capacidadEvento);
        nuevoEvento.setIdEvento(UUID.randomUUID());
        return nuevoEvento;
    }
}
