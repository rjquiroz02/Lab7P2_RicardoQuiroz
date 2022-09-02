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
public class Clasico extends Zombie{
    private int anosexp;
    private Bandera bandera;

    public Clasico() {
    }

    public Clasico(int anosexp, Bandera bandera, String nombre, int ataque, int vida) {
        super(nombre, ataque, vida);
        this.anosexp = anosexp;
        this.bandera = bandera;
    }

    public int getAnosexp() {
        return anosexp;
    }

    public void setAnosexp(int anosexp) {
        this.anosexp = anosexp;
    }

    public Bandera getBandera() {
        return bandera;
    }

    public void setBandera(Bandera bandera) {
        this.bandera = bandera;
    }

    @Override
    public String toString() {
        return "Clasico{" + "anosexp=" + anosexp + ", bandera=" + bandera + '}';
    }
    
    
    
    
    
    
    
}
