/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada.persistencia;

/**
 *
 * @author ivanr
 */
public abstract class GestorTabla {
    
    protected GestorBD gestorBD;
    
    protected GestorTabla(){
        gestorBD = GestorBD.getBaseDatos();
    }
    
    public abstract void crearTabla();
}
