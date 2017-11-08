/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada.GUI;

import fachada.persistencia.Fachada;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author ivanr
 */
public class Registros extends JFrame implements ActionListener{
    
    private JPanel contenido;
    private ImageIcon fondo;
    private JLabel lblFondo;
    private JLabel lblTitulo;
    private Image propiedadesFondo;
    private JTextArea tabla;
    private JButton btnRegresar;

    public Registros(String id) throws SQLException {

        setSize(800, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);

        contenido =  new JPanel();
        contenido.setBounds(0, 0, 800, 700);
        contenido.setLayout(null);
        add(contenido);

        lblTitulo = new JLabel("Registros Hojas de Vida");
        lblTitulo.setBounds(220, 50, 640, 30);
        lblTitulo.setForeground(new Color(255, 255, 255));
        contenido.add(lblTitulo);

        tabla = new JTextArea("");
        tabla.setBounds(100, 150, 520, 400);
        tabla.setBackground(new Color(0, 0, 0));
        tabla.setForeground(Color.WHITE);
        tabla.setVisible(true);
        contenido.add(tabla);
        llenarTabla(id);

        btnRegresar = new JButton();
        btnRegresar.setBounds(120, 550, 180, 50);
        btnRegresar.setBorder(null);
        btnRegresar.setOpaque(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(this);
        contenido.add(btnRegresar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void llenarTabla(String id) throws SQLException {
        ResultSet persona = Fachada.consultarHojaVida(id);
        if(persona.next()){
            String cedula = persona.getString("cedula");
            String nombre = persona.getString("NOMBRE");
            String apellido = persona.getString("APELLIDO");
            tabla.append("Cedula No: " + cedula + "         Nombres: " + nombre 
                    + "         Apellidos: " + apellido);
        }
    }
}
