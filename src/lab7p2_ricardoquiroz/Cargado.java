/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_ricardoquiroz;

import java.util.ArrayList;

/**
 *
 * @author rjqer
 */
public class Cargado extends Zombie{
    private int tamano, edad, nenojo;
    private ArrayList<String> listap = new ArrayList();

    public Cargado() {
    }

    public Cargado(int tamano, int edad, int nenojo, String nombre, int ataque, int vida) {
        super(nombre, ataque, vida);
        this.tamano = tamano;
        this.edad = edad;
        this.nenojo = nenojo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNenojo() {
        return nenojo;
    }

    public void setNenojo(int nenojo) {
        this.nenojo = nenojo;
    }

    public ArrayList<String> getListap() {
        return listap;
    }

    public void setListap(ArrayList<String> listap) {
        this.listap = listap;
    }

    @Override
    public String toString() {
        return "Cargado{" + "tamano=" + tamano + ", edad=" + edad + ", nenojo=" + nenojo + ", listap=" + listap + '}';
    }
    
    
    
    
    
    
}
