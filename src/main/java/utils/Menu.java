package utils;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    public static void mostrarMenu(){
        int index = 1;
        String[] menuOpciones = {
                "Crear evento: ",
                "Crear participante: ",
                "Inscribirse a un evento: ",
                "Crear Chef para un evento: ",
                "Gestionar Chef: ",
                "Listar eventos: ",
                "Crear reseña: ",
                "Exportar eventos no disponibles: ",
                "Salir: "
        };
        System.out.println("=========================================");
        System.out.println("\t\t\tMENÚ DE OPCIONES");
        for (String opcion: menuOpciones){
            System.out.println(index + ")" + opcion);
            index++;
        }
        System.out.println("=========================================");
    }
}