/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada.persistencia;

import fachada.logica.Persona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ivanr
 */
public class GestorPersona extends GestorTabla{

    public GestorPersona() {
        super();
        crearTabla();
    }

    @Override
    public void crearTabla() {
        try {
            String consulta = "CREATE TABLE IF NOT EXISTS Persona"
                    + "("
                    + "cedula INT(11) NOT NULL, "
                    + "NOMBRE VARCHAR(30) NOT NULL, "
                    + "APELLIDO VARCHAR(30) NOT NULL, "
                    + "direccion varchar(40) not null,"
                    + "fNacimiento varchar(30) not null,"
                    + "lNacimiento varchar(30) not null,"
                    + "telefono varchar(15) not null,"
                    + "estadoCivil varchar(20) not null,"
                    + "PRIMARY KEY(cedula)"
                    + ");";
            Statement declaracion = gestorBD.getConector().createStatement();
            declaracion.execute(consulta);
        } catch (SQLException sqlExcepcion) {
            System.err.println("Error al crear la tabla en la base de datos: "
                    + "\n\t Descripción: " + sqlExcepcion.getMessage()
                    + "\n\t Localización: " + sqlExcepcion.getLocalizedMessage()
                    + "\n\t Resultado SQL: " + sqlExcepcion.getSQLState());
        }
    }

    public void insertarNuevoRegistro(Persona persona) {
        try {
            String consulta = "Insert into Persona values (" + persona.getCedula() + ",'" + persona.getNombres() + "', "
                    + "'" + persona.getApellidos() + "','" + persona.getDireccion() + "','" + persona.getfNacimiento()+ "','" + persona.getlNacimiento() + "',"
                    + "'" + persona.getTelefono() + "','" + persona.getEstadoCivil() + "');";
            Statement declaracion = gestorBD.getConector().createStatement();
            declaracion.execute(consulta);
        } catch (SQLException sqlExcepcion) {
            System.err.println("Error al crear la tabla en la base de datos: "
                    + "\n\t Descripción: " + sqlExcepcion.getMessage()
                    + "\n\t Localización: " + sqlExcepcion.getLocalizedMessage()
                    + "\n\t Resultado SQL: " + sqlExcepcion.getSQLState());
        }

    }
    
    public ResultSet consultarHojaVida(String cedulaPersona){
        try{
             //Consulta de datos generales de la hoja de vida
            String consulta = "select p.cedula, p.nombre, p.apellido, p.direccion, p.fechaNacimiento,p.lugarNacimiento,"
                    + "p.telefono, p.estadoCivil, rf.cedula as cedulaf,"
                    + "from (((persona p inner join hojavida h on p.cedula = h.cedulaPersona) inner join"
                    + "where p.cedula = '"+ cedulaPersona +"';";
            Statement declaracion = gestorBD.getConector().createStatement();
            return declaracion.executeQuery(consulta);
        }
        catch (SQLException sqlExcepcion) {
            System.err.println("Error al crear la tabla en la base de datos: "
                    + "\n\t Descripción: " + sqlExcepcion.getMessage()
                    + "\n\t Localización: " + sqlExcepcion.getLocalizedMessage()
                    + "\n\t Resultado SQL: " + sqlExcepcion.getSQLState());
            return null;
        }
    }
    
}
