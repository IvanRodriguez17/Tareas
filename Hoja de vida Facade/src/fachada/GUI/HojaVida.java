/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada.GUI;

import fachada.logica.Persona;
import fachada.logica.Validacion;
import fachada.persistencia.Fachada;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author ivanr
 */
public class HojaVida extends JFrame implements ActionListener{

    private JPanel formulario;
    private JLabel lblTexto;
    private JLabel lblCedula;
    private JLabel lblNombres;
    private JLabel lblApellidos;
    private JLabel lblDireccion;
    private JLabel lblTelefono;
    private JLabel lblfNacimiento;
    private JLabel lblsNacimiento;
    private JLabel lblEstadoCivil;
    private JLabel lblfondo;
    private Image imagenFondo;
    private ImageIcon propiedadesFondo;
    private JTextField txtCedula;
    private JTextField txtNombres;
    private JTextField txtApellidos;
    private JTextField txtDireccion;
    private JTextField txtTelefono;
    private JTextField txtfNacimiento;
    private JTextField txtsNacimiento;
    private JTextField txtEstadoCivil;
    private JButton btnGuardar;
    private JButton btnRegresar;

    public HojaVida() {

        setSize(1200, 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Modelos de programacion FACADE");
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);

        formulario = new JPanel();
        formulario.setBounds(50, 0, 1100, 800);
        formulario.setLayout(null);
        formulario.setBackground(Color.red);
        add(formulario);

        lblTexto = new JLabel("Diligencie todos los espacios con su respectiva informacion ");
        lblTexto.setOpaque(false);
        lblTexto.setFont(new Font("Magneto Negrita", Font.BOLD, 24));
        lblTexto.setBounds(50, 50, 900, 100);
        formulario.add(lblTexto);

        lblCedula = new JLabel("Cedula");
        lblCedula.setBorder(BorderFactory.createLineBorder(Color.black));
        lblCedula.setOpaque(false);
        lblCedula.setFont(new Font("Magneto Negrita", Font.BOLD, 24));
        lblCedula.setBounds(50, 200, 200, 50);
        formulario.add(lblCedula);

        txtCedula = new JTextField();
        txtCedula.setBorder(BorderFactory.createLineBorder(Color.black));
        txtCedula.setOpaque(true);
        txtCedula.setFont(new Font("Lucida Fax", Font.PLAIN, 24));
        txtCedula.setHorizontalAlignment(SwingConstants.CENTER);
        txtCedula.setBounds(250, 200, 250, 50);
        formulario.add(txtCedula);

        lblNombres = new JLabel("Nombres");
        lblNombres.setBorder(BorderFactory.createLineBorder(Color.black));
        lblNombres.setOpaque(false);
        lblNombres.setFont(new Font("Magneto Negrita", Font.BOLD, 24));
        lblNombres.setBounds(550, 200, 200, 50);
        formulario.add(lblNombres);

        txtNombres = new JTextField();
        txtNombres.setBorder(BorderFactory.createLineBorder(Color.black));
        txtNombres.setOpaque(true);
        txtNombres.setFont(new Font("Lucida Fax", Font.PLAIN, 24));
        txtNombres.setHorizontalAlignment(SwingConstants.CENTER);
        txtNombres.setBounds(750, 200, 250, 50);
        formulario.add(txtNombres);
        
        lblApellidos = new JLabel("Apellidos");
        lblApellidos.setBorder(BorderFactory.createLineBorder(Color.black));
        lblApellidos.setOpaque(false);
        lblApellidos.setFont(new Font("Magneto Negrita", Font.BOLD, 24));
        lblApellidos.setBounds(50, 300, 200, 50);
        formulario.add(lblApellidos);

        txtApellidos = new JTextField();
        txtApellidos.setBorder(BorderFactory.createLineBorder(Color.black));
        txtApellidos.setOpaque(true);
        txtApellidos.setFont(new Font("Lucida Fax", Font.PLAIN, 24));
        txtApellidos.setHorizontalAlignment(SwingConstants.CENTER);
        txtApellidos.setBounds(250, 300, 250, 50);
        formulario.add(txtApellidos);
        
        lblDireccion = new JLabel("Direccion");
        lblDireccion.setBorder(BorderFactory.createLineBorder(Color.black));
        lblDireccion.setOpaque(false);
        lblDireccion.setFont(new Font("Magneto Negrita", Font.BOLD, 24));
        lblDireccion.setBounds(550, 300, 200, 50);
        formulario.add(lblDireccion);
        
        txtDireccion = new JTextField();
        txtDireccion.setBorder(BorderFactory.createLineBorder(Color.black));
        txtDireccion.setOpaque(true);
        txtDireccion.setFont(new Font("Lucida Fax", Font.PLAIN, 24));
        txtDireccion.setHorizontalAlignment(SwingConstants.CENTER);
        txtDireccion.setBounds(750, 300, 250, 50);
        formulario.add(txtDireccion);
        
        lblTelefono = new JLabel("Telefono");
        lblTelefono.setBorder(BorderFactory.createLineBorder(Color.black));
        lblTelefono.setOpaque(false);
        lblTelefono.setFont(new Font("Magneto Negrita", Font.BOLD, 24));
        lblTelefono.setBounds(50, 400, 200, 50);
        formulario.add(lblTelefono);
        
        txtTelefono = new JTextField();
        txtTelefono.setBorder(BorderFactory.createLineBorder(Color.black));
        txtTelefono.setOpaque(true);
        txtTelefono.setFont(new Font("Lucida Fax", Font.PLAIN, 24));
        txtTelefono.setHorizontalAlignment(SwingConstants.CENTER);
        txtTelefono.setBounds(250, 400, 250, 50);
        formulario.add(txtTelefono);
        
        lblfNacimiento = new JLabel("Fecha de Nacimiento");
        lblfNacimiento.setBorder(BorderFactory.createLineBorder(Color.black));
        lblfNacimiento.setOpaque(false);
        lblfNacimiento.setFont(new Font("Magneto Negrita", Font.BOLD, 16));
        lblfNacimiento.setBounds(550, 400, 200, 50);
        formulario.add(lblfNacimiento);

        txtfNacimiento = new JTextField();
        txtfNacimiento.setBorder(BorderFactory.createLineBorder(Color.black));
        txtfNacimiento.setOpaque(true);
        txtfNacimiento.setFont(new Font("Lucida Fax", Font.PLAIN,  24));
        txtfNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
        txtfNacimiento.setBounds(750, 400, 250, 50);
        formulario.add(txtfNacimiento);
        
        lblsNacimiento = new JLabel("Lugar de Nacimiento");
        lblsNacimiento.setBorder(BorderFactory.createLineBorder(Color.black));
        lblsNacimiento.setOpaque(false);
        lblsNacimiento.setFont(new Font("Magneto Negrita", Font.BOLD, 16));
        lblsNacimiento.setBounds(50, 500, 200, 50);
        formulario.add(lblsNacimiento);
        
        txtsNacimiento = new JTextField();
        txtsNacimiento.setBorder(BorderFactory.createLineBorder(Color.black));
        txtsNacimiento.setOpaque(true);
        txtsNacimiento.setFont(new Font("Lucida Fax", Font.PLAIN, 24));
        txtsNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
        txtsNacimiento.setBounds(250, 500, 250, 50);
        formulario.add(txtsNacimiento);
        
        lblEstadoCivil = new JLabel("Estado civil");
        lblEstadoCivil.setBorder(BorderFactory.createLineBorder(Color.black));
        lblEstadoCivil.setOpaque(false);
        lblEstadoCivil.setFont(new Font("Magneto Negrita", Font.BOLD, 16));
        lblEstadoCivil.setBounds(550, 500, 200, 50);
        formulario.add(lblEstadoCivil);
        
        txtEstadoCivil = new JTextField();
        txtEstadoCivil.setBorder(BorderFactory.createLineBorder(Color.black));
        txtEstadoCivil.setOpaque(true);
        txtEstadoCivil.setFont(new Font("Lucida Fax", Font.PLAIN, 24));
        txtEstadoCivil.setHorizontalAlignment(SwingConstants.CENTER);
        txtEstadoCivil.setBounds(750, 500, 250, 50);
        formulario.add(txtEstadoCivil);
        
        btnGuardar = new JButton("Guardar cambios");
        btnGuardar.setBounds(450, 600, 200, 50); 
        btnGuardar.setOpaque(false);
        btnGuardar.setFont(new Font("Lucida Fax", Font.PLAIN, 16));
        btnGuardar.addActionListener(this);
        formulario.add(btnGuardar);

        lblfondo = new JLabel();
        lblfondo.setBounds(0, 0, 1100, 800);
        imagenFondo = new ImageIcon("src//imagenes//fondo.jpg").getImage();
        propiedadesFondo = new ImageIcon(imagenFondo.getScaledInstance(lblfondo.getWidth(), lblfondo.getHeight(), Image.SCALE_DEFAULT));
        lblfondo.setIcon(propiedadesFondo);
        formulario.add(lblfondo);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btnGuardar){
            
            Validacion validar = new Validacion();
            Persona persona = new Persona();
            
            String id = txtCedula.getText();
            String nombres = txtNombres.getText();
            String apellidos = txtApellidos.getText();
            String direccion = txtDireccion.getText();
            String telefono = txtTelefono.getText();
            String fNacimiento = txtfNacimiento.getText();
            String lNacimiento = txtsNacimiento.getText();
            String estadoCivil = txtEstadoCivil.getText();
            
            if (validar.validarEspaciosBlanco(nombres) || validar.validarEspaciosBlanco(apellidos) 
                    || validar.validarEspaciosBlanco(direccion) || validar.validarEspaciosBlanco(telefono) 
                    || validar.validarEspaciosBlanco(fNacimiento) || validar.validarEspaciosBlanco(lNacimiento)
                    || validar.validarEspaciosBlanco(estadoCivil) || validar.validarEspaciosBlanco(id)){
                JOptionPane.showMessageDialog(null, "hay algun espacio en blanco");
            }else{
                if(validar.validarNumeros(id) == false){
                    JOptionPane.showMessageDialog(null, "la cedula tener solo numeros");
                }else{
                    persona.insertarDatos(id, nombres, apellidos, fNacimiento, lNacimiento, direccion, telefono, estadoCivil);
                    Fachada.insertarNuevaHojaVida(persona);
                    JOptionPane.showMessageDialog(null, "Se ha guardado exitosamente el registro");
                    new PaginaPrincipal();
                    this.hide();
                }
            }
            
            
        }
    }

}
