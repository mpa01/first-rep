/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXAMEN;

/**
 *
 * @author pascu
 */
public interface UtilBeure {
    public double IVA = 0.21;
    public double PREU_BEGUDA = 1;
    
    public abstract double calculaPreu();
    
    public abstract boolean esBegudaAlcoholica();
}
