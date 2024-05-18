package com.tecno3fjava.gestionarmas;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Policia> policias = new ArrayList<>();
    private static ArrayList<Arma> armas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente
            ejecutarOpcion(opcion);
        } while (opcion != 5);
    }

    private static void mostrarMenu() {
        System.out.println("===== Gestión de Armas =====");
        System.out.println("1. Registrar nuevo policía");
        System.out.println("2. Registrar nueva arma");
        System.out.println("3. Mostrar policías y armas");
        System.out.println("4. Usar funcionalidades");
        System.out.println("5. Salir");
        System.out.print("Ingrese una opción: ");
    }

    private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                GestionArmas.registrarPolicia(policias, scanner);
                break;
            case 2:
                GestionArmas.registrarArma(policias, armas, scanner);
                break;
            case 3:
                GestionArmas.mostrarPoliciasYArmas(policias, armas);
                break;
            case 4:
                GestionArmas.usarFuncionalidades(armas, scanner);
                break;
            case 5:
                System.out.println("¡Hasta luego!");
                break;
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
        }
    }
}