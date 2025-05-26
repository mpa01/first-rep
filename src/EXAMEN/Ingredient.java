/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXAMEN;

/**
 *
 * @author pascu
 */
public class Ingredient {
    protected String nom;
    protected boolean esVegetaria;
    protected boolean esCeliac;

    public Ingredient(String nom, boolean esVegetaria, boolean esCeliac) {
        this.nom = nom;
        this.esVegetaria = esVegetaria;
        this.esCeliac = esCeliac;
    }

    public String getNom() {
        return nom;
    }

    public boolean isEsVegetaria() {
        return esVegetaria;
    }

    public boolean isEsCeliac() {
        return esCeliac;
    }

    @Override
    public String toString() {
        return "Ingredient{" + "nom=" + nom + ", esVegetaria=" + esVegetaria + ", esCeliac=" + esCeliac + '}';
    }
    
}
