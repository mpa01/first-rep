/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXAMEN;

import java.util.Objects;

/**
 *
 * @author pascu
 */
public abstract class Beguda implements UtilBeure {
    protected String nom;
    
    public Beguda(String nom) {
        this.nom = nom;
    }
    
    @Override
    public double calculaPreu() {
        return UtilBeure.PREU_BEGUDA;
    }

    public String getNom() {
        return nom;
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
        final Beguda other = (Beguda) obj;
        return Objects.equals(this.nom, other.nom);
    }
    
    
}
