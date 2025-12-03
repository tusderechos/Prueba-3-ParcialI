/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana8;

/**
 *
 * @author Hp
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        Lista lista = new Lista();
        
        int opcion = 37937;
        
        do {            
            System.out.println("\n\n==== MENU ACCIONES ====");
            System.out.println("1. Agregar nodo");
            System.out.println("2. Insertar nodo");
            System.out.println("3. Eliminar nodo (por codigo)");
            System.out.println("4. Mostrar lista");
            System.out.println("5. Buscar nodo (por codigo)");
            System.out.println("6. Mostrar tamano de lista");
            System.out.println("7. Salir");
            
            System.out.println("\nIngrese una opcion para poder continuar: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un codigo: ");
                    int codigo = scanner.nextInt();
                    
                    System.out.println("Ingrese un nombre: ");
                    String nombre = scanner.next();
                    
                    lista.add(new Nodo(codigo, nombre));
                    
                    break;
                case 2:
                    System.out.println("Ingrese una posicion para insertar: ");
                    int posicion = scanner.nextInt();
                    
                    System.out.println("Ingrese un codigo: ");
                    int codigo2 = scanner.nextInt();
                    
                    System.out.println("Ingrese un nombre: ");
                    String nombre2 = scanner.next();
                    
                    try {
                        lista.add(posicion, new Nodo(codigo2, nombre2));
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    
                    break;
                case 3:
                    System.out.println("Ingrese el codigo del nodo a eliminar: ");
                    int codigo3 = scanner.nextInt();
                    
                    if (lista.remove(codigo3)) {
                        System.out.println("Nodo eliminado");
                    } else {
                        System.out.println("No se encontro el nodo");
                    }
                    
                    break;
                case 4:
                    System.out.println("\nContenido de la lista: ");
                    lista.print();
                    break;
                case 5:
                    System.out.println("Ingrese el codigo del nodo para buscar: ");
                    int codigobuscar = scanner.nextInt();
                    
                    Nodo encontrado = lista.get(codigobuscar);
                    
                    if (encontrado != null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("No se encontro el nodo");
                    }
                    
                    break;
                case 6:
                    System.out.println("Tamano actual de la lista: " + lista.size());
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 7);
    }
}
