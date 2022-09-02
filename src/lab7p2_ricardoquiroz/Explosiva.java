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
public class Explosiva extends Planta{
    private int magexp;

    public Explosiva() {
    }

    public Explosiva(int magexp, String nombre, String rango, int ataque, int vida) {
        super(nombre, rango, ataque, vida);
        this.magexp = magexp;
    }

    public int getMagexp() {
        return magexp;
    }

    public void setMagexp(int magexp) {
        this.magexp = magexp;
    }

    @Override
    public String toString() {
        return super.toString() + "Explosiva{" + "magexp=" + magexp + '}';
    }
    
    
    
    
}
