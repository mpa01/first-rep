/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXAMEN;

/**
 *
 * @author pascu
 */
public class Postre extends Plat {
    private String tipus;
    
    public Postre(String tipus, String nom) {
    super(nom);
    this.tipus = tipus;
    }
    
    @Override
    public double calculaPreu() {
        return UtilMenjar.PREU_PLAT / (this.tipus.equals("cafe") ? 4 : 2);
    }

    @Override
    public String toString() {
        return " Postre{ " + " tipus: " + tipus + '}';
    }
    
    
}
