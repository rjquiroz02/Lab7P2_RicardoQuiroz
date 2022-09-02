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
public class Defensa extends Planta{
    private int altura, ndureza, peso;

    public Defensa() {
    }

    public Defensa(int altura, int ndureza, int peso, String nombre, String rango, int ataque, int vida) {
        super(nombre, rango, ataque, vida);
        this.altura = altura;
        this.ndureza = ndureza;
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getNdureza() {
        return ndureza;
    }

    public void setNdureza(int ndureza) {
        this.ndureza = ndureza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + "Defensa{" + "altura=" + altura + ", ndureza=" + ndureza + ", peso=" + peso + '}';
    }
    
    
    
    
    
}
