/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ivanr
 */
public class GestorHoja extends GestorTabla{
    
    public GestorHoja() {
        super();
        crearTabla();
    }

    @Override
    public void crearTabla() {
        try {
            String consulta = "create table if not exists HojaVida("
                    + "idHojaVida INT(3) AUTO_INCREMENT,"
                    + "cedulaPersona INT(11) NOT NULL,"
                    + "PRIMARY KEY(idHojaVida),"
                    + "FOREIGN KEY (cedulaPersona) references Persona(cedula)"
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

    public void insertarRegistro(String cedulaPersona) {
        try {
            String consulta = "insert into HojaVida (cedulaPersona) "
                    + "values('" + cedulaPersona + "');";
            Statement declaracion = gestorBD.getConector().createStatement();
            declaracion.execute(consulta);
        } catch (SQLException sqlExcepcion) {
            System.err.println("Error al crear la tabla en la base de datos: "
                    + "\n\t Descripción: " + sqlExcepcion.getMessage()
                    + "\n\t Localización: " + sqlExcepcion.getLocalizedMessage()
                    + "\n\t Resultado SQL: " + sqlExcepcion.getSQLState());
        }
    }

    public int obtenerCantidadRegistros() {
        try {
            int registros;
            ResultSet rs;
            String consulta = "Select count(*) from HojaVida;";
            Statement declaracion = gestorBD.getConector().createStatement();
            rs = declaracion.executeQuery(consulta);
            if (rs.next()) {
                registros = Integer.parseInt(rs.getString(1));
                return registros;
            } else {
                registros = 0;
            }
        } catch (SQLException sqlExcepcion) {
            System.err.println("Error al crear la tabla en la base de datos: "
                    + "\n\t Descripción: " + sqlExcepcion.getMessage()
                    + "\n\t Localización: " + sqlExcepcion.getLocalizedMessage()
                    + "\n\t Resultado SQL: " + sqlExcepcion.getSQLState());
        }
        return 0;
    }
}
