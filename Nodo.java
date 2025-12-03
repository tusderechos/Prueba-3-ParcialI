/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana8;

/**
 *
 * @author Hp
 */
public class Nodo {
    
    public int codigo;
    public String nombre;
    public Nodo siguiente; //Para poder apuntar a un siguiente nodo, osea ocupa una conexion a si mismo
    
    public Nodo(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        
        siguiente = null;
    }
    
    @Override
    public String toString() {
        return "Nodo [" + "Codigo: " + codigo + " | Nombre: " + nombre + "]";
    }
} 
