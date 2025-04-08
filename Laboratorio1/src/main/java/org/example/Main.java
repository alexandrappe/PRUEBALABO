package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionMusical tienda = new GestionMusical();
        int opcion;

        do {
            System.out.println("\nSISTEMA DE TIENDA MUSICAL");
            System.out.println("1. Registrar nuevo artista");
            System.out.println("2. Registrar nuevo disco");
            System.out.println("3. Registrar venta de un disco");
            System.out.println("4. Mostrar discos con más de X unidades vendidas");
            System.out.println("5. Mostrar artista con más ventas");
            System.out.println("6. Mostrar todos los artistas");
            System.out.println("7. Mostrar todos los discos");
            System.out.println("8. Mostrar ventas por disco");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del artista: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Género del artista: ");
                    String genero = scanner.nextLine();
                    int id = tienda.generarIdArtista();
                    tienda.agregarArtista(new Artista(id, nombre, genero, "", 0));
                    System.out.println("El artista fue registrado.");
                    break;

                case 2:
                    if (!tienda.hayArtistasRegistrados()) {
                        System.out.println("No hay artistas registrados. Primero registre un artista.");
                        break;
                    }

                    tienda.mostrarArtistas();
                    System.out.print("ID del artista para el disco: ");
                    int idArtista = scanner.nextInt();
                    scanner.nextLine();
                    Artista artista = tienda.buscarArtistaPorId(idArtista);
                    if (artista == null) {
                        System.out.println("El artista no fue encontrado.");
                        break;
                    }
                    System.out.print("Título del disco: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Género del disco: ");
                    String generoMusical = scanner.nextLine();
                    tienda.agregarDisco(new Disco(artista, titulo, generoMusical, 0));
                    System.out.println("El disco fue registrado.");
                    break;

                case 3:
                    if (!tienda.hayArtistasRegistrados()) {
                        System.out.println("No hay artistas registrados. Primero registre un artista.");
                        break;
                    }

                    System.out.print("Título del disco vendido: ");
                    String tituloVenta = scanner.nextLine();
                    System.out.print("Cantidad vendida: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine();
                    tienda.registrarVenta(tituloVenta, cantidad);
                    break;

                case 4:
                    if (!tienda.hayDiscosRegistrados()) {
                        System.out.println("No hay discos registrados. Primero registre un disco.");
                        break;
                    }

                    System.out.print("Ingrese el mínimo de unidades vendidas: ");
                    int minVentas = scanner.nextInt();
                    scanner.nextLine();
                    tienda.mostrarDiscosPopulares(minVentas);
                    break;


                case 5:
                    tienda.artistaConMasVentas();
                    break;

                case 6:
                    tienda.mostrarArtistas();
                    break;

                case 7:
                    tienda.mostrarDiscos();
                    break;

                case 8:
                    tienda.mostrarVentasPorDisco();
                    break;

                case 9:
                    System.out.println("Gracias por usar el sistema :D");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 8);

        scanner.close();
    }
}
