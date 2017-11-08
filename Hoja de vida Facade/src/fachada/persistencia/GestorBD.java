/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ivanr
 */
public class GestorBD {
    private static String nombreBD = "HojaDeVida";
    private static String usuario = "root";
    private static String clave = "iarp1003";
    private static String url = "jdbc:mysql://localhost/";
    private static String ubicacionControlador = "com.mysql.jdbc.Driver";
    
    private static Connection conector;

    public static Connection getConector() {
        return conector;
    }
    
    private static GestorBD BaseDatos;

    private GestorBD() {
        inicializarGestion();
    }

    public static GestorBD getBaseDatos() {
        if (BaseDatos == null) {
            BaseDatos = new GestorBD();
        }
        return BaseDatos;
    }
    
    private void inicializarGestion() {
        conectarBD("");
        crearBD(nombreBD);
        conectarBD(nombreBD);
    }
    
    private void conectarBD(String nombreBD) {
        try {
            Class.forName(ubicacionControlador).newInstance();
            conector = DriverManager.getConnection(url + nombreBD, usuario, clave);
        } catch (ClassNotFoundException classNotFoundException) {
            System.err.println("Error al encontrar la clase controladora: "
                    + "\nt\t Descripción: " + classNotFoundException.getMessage() 
                    + "\n\t Localización: " + classNotFoundException.getLocalizedMessage());
        } catch (InstantiationException | IllegalAccessException excepcionDeEjemplificacion) {
            System.err.println("Error al ejemplificarla la clase controladora: "
                    + "\n\t Descripción: " + excepcionDeEjemplificacion.getMessage() 
                    + "\n\t Localización: " + excepcionDeEjemplificacion.getLocalizedMessage());
        } catch (SQLException sqlExcepcion) {
            System.err.println("Error al ejemplificarla la clase controladora: "
                    + "\n\t Descripción: " + sqlExcepcion.getMessage() 
                    + "\n\t Localización: " + sqlExcepcion.getLocalizedMessage() 
                    + "\n\t Resultado SQL: " + sqlExcepcion.getSQLState());
        }
    }
    
    private void crearBD(String nombreBD) {
        try {
            String consulta = "CREATE DATABASE IF NOT EXISTS " + nombreBD + ";";
            Statement declaracion = conector.createStatement();
            declaracion.execute(consulta);
        } catch (SQLException sqlExcepcion) {
            System.err.println("Error al crear la base de datos: "
                    + "\n\t Descripción: " + sqlExcepcion.getMessage() 
                    + "\n\t Localización: " + sqlExcepcion.getLocalizedMessage() 
                    + "\n\t Resultado SQL: " + sqlExcepcion.getSQLState());
        }
    }
}
