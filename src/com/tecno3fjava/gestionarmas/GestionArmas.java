package com.tecno3fjava.gestionarmas;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionArmas {

    public static void registrarPolicia(ArrayList<Policia> policias, Scanner scanner) {
        System.out.print("Ingrese el nombre del policía: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del policía: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese el legajo del policía: ");
        int legajo = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente
        Policia policia = new Policia(nombre, apellido, legajo);
        policias.add(policia);
        System.out.println("Policía registrado correctamente.");
    }

    public static void registrarArma(ArrayList<Policia> policias, ArrayList<Arma> armas, Scanner scanner) {
        System.out.print("Ingrese el nombre del policía (existente) al que pertenece el arma: ");
        String nombrePolicia = scanner.nextLine();
        Policia policia = buscarPolicia(nombrePolicia, policias);
        if (policia == null) {
            System.out.println("No se encontró un policía con ese nombre.");
            return;
        }

        System.out.print("Ingrese la cantidad de municiones: ");
        int cantidadMuniciones = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        System.out.print("Ingrese el alcance en metros: ");
        double alcanceMetros = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        System.out.print("Ingrese la marca: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese el calibre: ");
        int calibre = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        System.out.print("Ingrese el estado (NUEVA, EN MANTENIMIENTO, EN USO): ");
        String estado = scanner.nextLine();

        System.out.print("¿Es un arma corta (1) o larga (2)? ");
        int tipoArma = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        if (tipoArma == 1) {
            System.out.print("¿Es automática? (true/false): ");
            boolean esAutomatica = scanner.nextBoolean();
            scanner.nextLine(); // Consumir el salto de línea pendiente
            ArmaCorta armaCorta = new ArmaCorta(policia, cantidadMuniciones, alcanceMetros, marca, calibre, estado, esAutomatica);
            armas.add(armaCorta);
            System.out.println("Arma corta registrada correctamente.");
        } else if (tipoArma == 2) {
            System.out.print("¿Tiene sello RENAR? (true/false): ");
            boolean tieneRenar = scanner.nextBoolean();
            scanner.nextLine(); // Consumir el salto de línea pendiente

            System.out.print("Ingrese la descripción de uso: ");
            String descripcionUso = scanner.nextLine();

            System.out.print("Ingrese el nivel (1-5): ");
            int nivel = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente

            ArmaLarga armaLarga = new ArmaLarga(policia, cantidadMuniciones, alcanceMetros, marca, calibre, estado, tieneRenar, descripcionUso, nivel);
            armas.add(armaLarga);
            System.out.println("Arma larga registrada correctamente.");
        } else {
            System.out.println("Opción inválida. No se registró el arma.");
        }
    }

    private static Policia buscarPolicia(String nombre, ArrayList<Policia> policias) {
        for (Policia policia : policias) {
            if (policia.getNombre().equalsIgnoreCase(nombre)) {
                return policia;
            }
        }
        return null;
    }

    public static void mostrarPoliciasYArmas(ArrayList<Policia> policias, ArrayList<Arma> armas) {
        System.out.println("===== Policías Registrados =====");
        for (Policia policia : policias) {
            System.out.println(policia);
        }

        System.out.println("\n===== Armas Registradas =====");
        for (Arma arma : armas) {
            System.out.println(arma);
        }
    }

    public static void usarFuncionalidades(ArrayList<Arma> armas, Scanner scanner) {
        System.out.print("Ingrese el índice del arma (0, 1, 2, ...): ");
        int indiceArma = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        if (indiceArma >= 0 && indiceArma < armas.size()) {
            Arma arma = armas.get(indiceArma);

            System.out.println("Arma seleccionada: " + arma);

            if (arma instanceof ArmaCorta) {
                ArmaCorta armaCorta = (ArmaCorta) arma;
                System.out.println("¿Puede disparar a más de 200 metros? " + armaCorta.disparaMas200m());
            } else if (arma instanceof ArmaLarga) {
                ArmaLarga armaLarga = (ArmaLarga) arma;
                System.out.println("¿Está en condiciones para ser usada? " + armaLarga.enCondiciones());

                System.out.print("Ingrese el índice de otra arma larga para compararlas: ");
                int indiceOtraArma = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea pendiente

                if (indiceOtraArma >= 0 && indiceOtraArma < armas.size()) {
                    Arma otraArma = armas.get(indiceOtraArma);
                    if (otraArma instanceof ArmaLarga) {
                        ArmaLarga otraArmaLarga = (ArmaLarga) otraArma;
                        int comparacion = armaLarga.compareTo(otraArmaLarga);
                        if (comparacion < 0) {
                            System.out.println("La otra arma larga tiene mayor nivel que la seleccionada.");
                        } else if (comparacion > 0) {
                            System.out.println("La arma larga seleccionada tiene mayor nivel que la otra.");
                        } else {
                            System.out.println("Ambas armas largas tienen el mismo nivel.");
                        }
                    } else {
                        System.out.println("La otra arma no es un arma larga.");
                    }
                } else {
                    System.out.println("Índice de arma inválido.");
                }
            }
        } else {
            System.out.println("Índice de arma inválido.");
        }
    }
}