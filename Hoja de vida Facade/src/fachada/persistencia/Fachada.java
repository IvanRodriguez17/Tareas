/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada.persistencia;

import fachada.logica.Persona;
import java.sql.ResultSet;

/**
 *
 * @author ivanr
 */
public class Fachada {
    
    public static void insertarNuevaHojaVida(Persona persona){
        GestorPersona gesPer = new GestorPersona();
        gesPer.insertarNuevoRegistro(persona);
        GestorHoja gestionHojaVida = new GestorHoja();
        gestionHojaVida.insertarRegistro(persona.getCedula());
        
    }
    
    public static ResultSet consultarHojaVida(String idPersona){
        GestorPersona gestionPersona = new GestorPersona();
        return gestionPersona.consultarHojaVida(idPersona);
    }
}
