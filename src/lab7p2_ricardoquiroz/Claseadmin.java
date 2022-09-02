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
public class Claseadmin {
    private ArrayList<Planta> lplantas = new ArrayList();
    private ArrayList<Zombie> lzombies = new ArrayList();

    public ArrayList<Planta> getLplantas() {
        return lplantas;
    }

    public void setLplantas(ArrayList<Planta> lplantas) {
        this.lplantas = lplantas;
    }

    public ArrayList<Zombie> getLzombies() {
        return lzombies;
    }

    public void setLzombies(ArrayList<Zombie> lzombies) {
        this.lzombies = lzombies;
    }

    @Override
    public String toString() {
        return "lplantas=" + lplantas + ", lzombies=" + lzombies;
    }
    
    
    
    
    
    
}
