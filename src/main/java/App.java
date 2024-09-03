import Entities.Chef;
import services.chef.ChefService;
import services.chef.impl.ChefServiceImpl;
import services.organizador.OrganizadorService;
import services.organizador.impl.OrganizadorServiceImpl;
import utils.Menu;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static OrganizadorService organizadorService = new OrganizadorServiceImpl();
    private static ChefService chefService = new ChefServiceImpl();
    private static List<Chef> chefParaEventos = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {

            Menu.mostrarMenu();
            System.out.println("Ingrese una opción");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    //Crear evento
                    organizadorService.crearEvento();
                    break;
                case 2:
                    //Crear participante
                    break;
                case 3:
                    //Inscribirse a un evento
                    break;
                case 4:
                    //Crear Chef
                    Chef nuevoChef = chefService.crearChef();
                    chefParaEventos.add(nuevoChef);
                    break;
                case 5:
                    //Gestionar Chef
                    int index = 1;
                    for (Chef chef: chefParaEventos){
                        System.out.println(index + ") " + chef);
                    }
                    organizadorService.asignarChefAEvento();
                    break;
                case 6:
                    //Listar eventos
                    organizadorService.listarEventos();
                    break;
                case 7:
                    //Crear reseña a evento
                    break;
                case 8:
                    //Exportar eventos no disponibles por cupo lleno
                    break;
                default:
                    System.out.println("Ingresó una opción incorrecta.");
                    break;
                //Falta una opción de crear reseña y que se le asigne a un evento
            }

        }while (opcion != 9);
    }
}