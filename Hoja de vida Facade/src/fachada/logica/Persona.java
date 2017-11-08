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
public class Persona {
    
    private String cedula;
    private String nombres;
    private String apellidos;
    private String fNacimiento;
    private String lNacimiento;
    private String direccion;
    private String telefono;
    private String estadoCivil;
    
    public void insertarDatos(String cedula, String nombres, String apellidos, String fNacimiento, String lNacimiento
            , String direccion, String telefono, String estadoCivil){
        
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.fNacimiento = fNacimiento;
        this.lNacimiento = lNacimiento;
        this.telefono = telefono;
        this.estadoCivil = estadoCivil;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getfNacimiento() {
        return fNacimiento;
    }

    public String getlNacimiento() {
        return lNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }
}
