package fachada.GUI;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ivanr
 */
public class PaginaPrincipal extends JFrame implements ActionListener {

    private JPanel contenido;
    private JLabel fondo;
    private JButton btnIniciar;
    private JButton btnConsultar;
    private Image imagenFondo;
    private ImageIcon propiedadesFondo;
    
    
    public PaginaPrincipal(){
        
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Modelos de programacion FACADE");
        setLocationRelativeTo(null);
        setLayout(null);

        contenido =  new JPanel();
        contenido.setBounds(0, 0, 600, 400);
        contenido.setLayout(null);
        add(contenido);
                
        btnIniciar = new JButton("Llenar Hoja de Vida");
        btnIniciar.setBounds(200, 150, 200, 50); 
        btnIniciar.setOpaque(false);
        btnIniciar.addActionListener(this);
        contenido.add(btnIniciar);
        
        btnConsultar = new JButton("Consultar Hojas de Vida");
        btnConsultar.setBounds(200, 300, 200, 50); 
        btnConsultar.setOpaque(false);
        btnConsultar.addActionListener(this);
        contenido.add(btnConsultar);
        
        fondo = new JLabel();
        fondo.setBounds(0, 0, 600, 400);
        imagenFondo = new ImageIcon("src//imagenes//fondo.jpg").getImage();
        propiedadesFondo= new ImageIcon(imagenFondo.getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        fondo.setIcon(propiedadesFondo);
        contenido.add(fondo);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnIniciar){
            new HojaVida();
            this.hide();
        }
        if(e.getSource() == btnConsultar){
            try {
                new Registros("1");
                this.hide();
            } catch (SQLException ex) {
                Logger.getLogger(PaginaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
