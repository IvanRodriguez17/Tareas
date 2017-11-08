/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada.logica;

/**
 *
 * @author ivanr
 */
public class Validacion {
    public boolean validarEspaciosBlanco(String valor) {
        if (valor.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean validarNumeros(String cadena) {
        try {
            Long.parseLong(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
