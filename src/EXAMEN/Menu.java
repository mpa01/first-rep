/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXAMEN;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author pascu
 */
public class Menu implements  UtilMenjar {
    private String nom;
    private ArrayList<Plat> plats;
    
    public Menu (String nom) {
        this.nom = nom; 
    }
    
    public boolean afegeixPlat(Plat p) {
        if(!(plats.contains(p)))
            plats.add(p);
        return false;
    }
    
    public boolean eliminaPlat(String nom) {
        return this.plats.removeIf(menu -> menu.nom.equals(nom));
    }
    
    @Override
    public double calculaPreu() {
        double preu_total = 0;
        for(Plat p: plats) {
            preu_total += p.calculaPreu();
        }
        return preu_total;
    }
    
    @Override
    public boolean esPerVegetarians() {
        return false;
    }
    
    @Override
    public boolean esPerCeliacs() {
        return false;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Plat> getPlats() {
        return plats;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Menu other = (Menu) obj;
        return Objects.equals(this.nom, other.nom);
    }

    @Override
    public String toString() {
        return "Menu{" + "nom=" + nom + ", plats=" + plats + '}';
    }
    
    
}
