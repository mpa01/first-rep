/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXAMEN;

/**
 *
 * @author pascu
 */
public class Espirituosa extends Beguda {
    
    private float graduacio;
    public Espirituosa (float graduacio, String nom) {
        super (nom);
        this.graduacio = graduacio;
    }
    
     @Override
    public double calculaPreu() {
        return UtilBeure.PREU_BEGUDA * (this.esBegudaAlcoholica() ? 2 : 1);
    }
    
    @Override
    public boolean esBegudaAlcoholica() {
        return this.graduacio >= 5;
    }
}
