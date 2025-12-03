/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana8;

/**
 *
 * @author Hp
 */
public class Lista {
    
    private Nodo Inicio = null;
    private int Size = 0;
    
    public boolean isEmpty() {
        return Inicio == null;
    }
    
    public void add(Nodo objeto) {
        if (objeto == null) {
            return;
        }
        
        Nodo temp = Inicio;
        
        while (temp != null) {
            if (temp.codigo == objeto.codigo) {
                System.out.println("Ya existe ese codigo");
                return;
            }
            temp = temp.siguiente;
        }
        
        if (isEmpty()) {
            Inicio = objeto;
        } else {
            temp = Inicio;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            
            temp.siguiente = objeto;
        }
        
        Size++;
    }
    
    public void print() {
        Nodo temp = Inicio;
        while(temp != null) {
            System.out.println(temp);
            temp = temp.siguiente;
        }
    }
    
    public Nodo get(int code) {
        Nodo temp = Inicio;
        while(temp != null) {
            if (temp.codigo == code) {
                return temp;
            }
            
            temp = temp.siguiente;
        }
        
        return null;
    }
    
    public boolean remove(int code) {
        if (isEmpty()) {
            return false;
        }
        
        if (Inicio.codigo == code) {
            Inicio = Inicio.siguiente;
            Size--;
            return true;
        }
        
        Nodo temp = Inicio;
        
        while (temp.siguiente != null) {
            if (temp.siguiente.codigo == code) {
                temp.siguiente = temp.siguiente.siguiente;
                Size--;
                return true;
            }
            
            temp = temp.siguiente;
        }
        
        return false;
    }
    
    public int size() {
        return Size;
    }
    
    public void add(int indice, Nodo objeto) {
        if (indice < 0 || indice > Size) {
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }
        
        Nodo temp = Inicio;
        
        while (temp != null) {
            if (temp.codigo == objeto.codigo) {
                System.out.println("Ya existe ese codigo");
                return;
            }
            temp = temp.siguiente;
        }
        
        if (indice == 0) {
            objeto.siguiente = Inicio;
            Inicio = objeto;
        } else {
            temp = Inicio;
            
            for (int i = 1; i < indice - 1; i++) {
                temp = temp.siguiente;
            }
            
            objeto.siguiente = temp.siguiente;
            temp.siguiente = objeto;
        }
        
        Size++;
    }
}
