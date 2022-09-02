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
public class Bandera {
    private String color, direccion;

    public Bandera() {
    }

    public Bandera(String color, String direccion) {
        this.color = color;
        this.direccion = direccion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    

    @Override
    public String toString() {
        return "Bandera{" + "color=" + color + ", direccion=" + direccion + '}';
    }
    
    
    
    
}
