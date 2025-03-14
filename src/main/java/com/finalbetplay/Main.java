package com.finalbetplay;

import java.util.Scanner;

import com.finalbetplay.views.viewEquipos;
import com.finalbetplay.views.viewEstadio;
import com.finalbetplay.views.viewJugador;
import com.finalbetplay.views.viewPermiso;
import com.finalbetplay.views.viewRol;
import com.finalbetplay.views.viewUsuario;

public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        while(true){
            System.out.println("LIGA BETPLAY \n ");
            System.out.println("1. GESTION DE EQUIPOS: ");
            System.out.println("2. GESTION DE ESTADIOS: ");
            System.out.println("3. GESTION DE JUGADORES: ");
            System.out.println("4. GESTION DE PERMISOS: ");
            System.out.println("5. GESTION DE ROLES: ");
            System.out.println("6. GESTION DE USUARIOS");
            System.out.println("7. SALIR");


            System.out.println("\n Cuál es tú eleccion: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    
                    viewEquipos vistaEquipos = new viewEquipos();
                    vistaEquipos.startEquipos();
                    break;

                case 2:
                    
                    viewEstadio vistaEstadio = new viewEstadio();
                    vistaEstadio.startEstadio();
                    break;

                case 3:
                    viewJugador vistaJugador = new viewJugador();
                    vistaJugador.startJugador();
                    break;

                case 4: 
                    viewPermiso vistaPermiso = new viewPermiso();
                    vistaPermiso.startPermiso();
                    break;

                case 5:
                    viewRol vistaRol = new viewRol();
                    vistaRol.startRol();
                    break;

                case 6:
                    viewUsuario vistaUsuario = new viewUsuario();
                    vistaUsuario.startUsuario();
                    break;

                case 7:
                    System.out.println("ADIOS! ");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida, elige una opción que esté en el menú: ");
            }
        }
        
    }
}