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
public abstract class Plat implements UtilMenjar {
    protected String nom;
    protected ArrayList<Ingredient> ingredients;

    public Plat(String nom) {
        this.nom = nom;
    }
    
    public  boolean afegeixIngredient(Ingredient i) {
        if(!(ingredients.contains(i)))
            ingredients.add(i);
        return false;
    }
    
    public boolean eliminaIngredient(String nom) {
        return ingredients.remove(cercaIngredients(nom));
    }
    
    public double calculaPreu() {
        return UtilMenjar.PREU_PLAT;
    }
    
    @Override
    public boolean esPerVegetarians() {
        for (Ingredient i : ingredients)
            if (i.isEsVegetaria())
                return true;
        return false;
    }
    
    @Override
    public boolean esPerCeliacs() {
        for (Ingredient i : ingredients)
            if (i.isEsCeliac())
                return true;
        return false;
    }
    
    private Ingredient cercaIngredients(String nom) {
        for (Ingredient i : ingredients) {
            if (i.getNom().equals(nom)) {
                ingredients.remove(i);
            }
        }
        return null;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
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
        final Plat other = (Plat) obj;
        return Objects.equals(this.nom, other.nom);
    }
    
    
   
    @Override
    public String toString() {
        return " Plat: " + nom + "\n\t" + " Ingredients: " + ingredients;
    }
}
