/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXAMEN;

import java.util.ArrayList;

/**
 *
 * @author pascu
 */
public class Carta {
    private ArrayList<Menu> menus;
    private ArrayList<Plat> plats;
    private ArrayList<Beguda> begudes;
    
    public Carta() {
        this.menus = new ArrayList<>();
        this.plats = new ArrayList<>();
        this.begudes = new ArrayList<>();
    }
    
    public boolean afegeixMenu(Menu m) {
        if(!(this.menus.contains(m)))
            return this.menus.add(m);
        return false;
    }
    
    public boolean eliminaMenu(String nom) {
        return this.menus.removeIf(menu -> menu.equals(nom));
    }
    
    public boolean afegeixPlat(Plat p) {
        for(Plat plat : this.plats)
            if(plat.nom.equals(p.nom))
                return false;
        return plats.add(p);
    }
    
    public boolean eliminaPlat(String nom) {
        return plats.removeIf(plat -> plat.getNom().equals(nom));
    }
    
    public boolean afegeixBeguda(Beguda b) {
        for(Beguda beguda : this.begudes)
            if(beguda.nom.equals(b.nom))
                return false;
        return begudes.add(b);
    }
    
    public boolean eliminaBeguda(String nom) {
        return begudes.removeIf(beguda -> beguda.getNom().equals(nom));
    }
}



