package services.chef.impl;

import Entities.Chef;
import Enumerations.EspecialidadEnum;
import services.chef.ChefService;

import java.util.Scanner;

public class ChefServiceImpl implements ChefService {
    Scanner sc = new Scanner(System.in);

    @Override
    public Chef crearChef() {

        System.out.println("Ingrese el nombre: ");
        String nombreChef = sc.nextLine();
        Chef nuevoChef = new Chef(nombreChef);

        int index = 1;
        for (EspecialidadEnum especialidadEnum: EspecialidadEnum.values()){
            System.out.println(index + ": " + especialidadEnum);
            index++;
        }
        System.out.println("Ingrese una opción para la especialidad del Chef: ");
//        System.out.println("1) Pasteleria");
//        System.out.println("2) Charcuteria");
//        System.out.println("3) Cocina Vegetariana");
//        System.out.println("4) Cocina Molecular");
//        System.out.println("5) Cocina Fusion");
//        System.out.println("6) Cocina Al Vacío");
//        System.out.println("7) Panaderia Artesanal");
//        System.out.println("8) Cocina a la Parilla");
//        System.out.println("9) Cocina Dietetica");
//        System.out.println("10) Cocina de Autor");
        int numeroEspecialidad = sc.nextInt();

        nuevoChef.setEspecialidad(
            switch (numeroEspecialidad){
                case 1 -> EspecialidadEnum.PASTELERIA;
                case 2 -> EspecialidadEnum.CHARCUTERIA;
                case 3 -> EspecialidadEnum.COCINA_VEGETARIANA;
                case 4 -> EspecialidadEnum.COCINA_MOLECULAR;
                case 5 -> EspecialidadEnum.COCINA_FUSION;
                case 6 -> EspecialidadEnum.COCINA_AL_VACIO;
                case 7 -> EspecialidadEnum.PANADERIA_ARTESANAL;
                case 8 -> EspecialidadEnum.COCINA_A_LA_PARRILLA;
                case 9 -> EspecialidadEnum.COCINA_DIETETICA;
                case 10 -> EspecialidadEnum.COCINA_DE_AUTOR;
                default -> null;
            }
        );
        return nuevoChef;
    }
}