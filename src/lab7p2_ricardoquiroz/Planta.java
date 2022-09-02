/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_ricardoquiroz;

/**
 *
 * @author rjqer
 */
public class Planta {
    private String nombre, rango;
    private int ataque, vida;

    public Planta() {
    }

    public Planta(String nombre, String rango, int ataque, int vida) {
        this.nombre = nombre;
        this.rango = rango;
        this.ataque = ataque;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Planta{" + "nombre=" + nombre + ", rango=" + rango + ", ataque=" + ataque + ", vida=" + vida + '}';
    }
    
    
    
    
}
