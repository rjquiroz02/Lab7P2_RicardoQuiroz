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
public class Zombie {
    private String nombre;
    private int ataque, vida;

    public Zombie() {
    }

    public Zombie(String nombre, int ataque, int vida) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return "Zombie{" + "nombre=" + nombre + ", ataque=" + ataque + ", vida=" + vida + '}';
    }
    
    
    
    
    
}
