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
public class Disparo extends Planta{
    String nombrepro, color;

    public Disparo() {
    }

    public Disparo(String nombrepro, String color, String nombre, String rango, int ataque, int vida) {
        super(nombre, rango, ataque, vida);
        this.nombrepro = nombrepro;
        this.color = color;
    }

    public String getNombrepro() {
        return nombrepro;
    }

    public void setNombrepro(String nombrepro) {
        this.nombrepro = nombrepro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "Disparo{" + "nombrepro=" + nombrepro + ", color=" + color + '}';
    }
    
    
    
    
}
