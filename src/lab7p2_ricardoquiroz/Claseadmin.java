/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_ricardoquiroz;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author rjqer
 */
public class Claseadmin {
    private ArrayList<Planta> lplantas = new ArrayList();
    private ArrayList<Zombie> lzombies = new ArrayList();
    private File archivo = null;
    
    public Claseadmin(String path){
        archivo = new File(path);
    }
    
    public File getArchivo(){
        return archivo;
    }
    
    public void setArchivo(File archivo){
        this.archivo=archivo;
    }

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
    
    //ex
    public void setPlanta(Planta p){
        this.lplantas.add(p);
    }
    
    public void setZombie(Zombie z){
        this.lzombies.add(z);
    }
    
    public void escribirArchivo(){
        
    }
    
    public void cargarArchivo(){
        
    }
    
}
