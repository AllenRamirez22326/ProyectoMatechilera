import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;

public class GUILogin extends JFrame {

	private JPanel contentPane;
	private JTextField usuario;
	private JPasswordField contra;
	private JTextField dificultad;
	
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUILogin frame = new GUILogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public GUILogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 520);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Sesiones sesion= new Sesiones();
		JLabel head = new JLabel("Iniciar sesión");
		head.setHorizontalAlignment(SwingConstants.CENTER);
		head.setFont(new Font("Roboto Black", Font.PLAIN, 20));
		head.setBounds(229, 10, 174, 83);
		contentPane.add(head);
		
		JLabel nombretxt = new JLabel("Usuario:");
		nombretxt.setHorizontalAlignment(SwingConstants.CENTER);
		nombretxt.setFont(new Font("Roboto Black", Font.PLAIN, 12));
		nombretxt.setBounds(105, 127, 66, 25);
		contentPane.add(nombretxt);
		
		JLabel contrasenatxt = new JLabel("Contraseña:");
		contrasenatxt.setHorizontalAlignment(SwingConstants.CENTER);
		contrasenatxt.setFont(new Font("Roboto Black", Font.PLAIN, 12));
		contrasenatxt.setBounds(105, 174, 66, 25);
		contentPane.add(contrasenatxt);
		
		usuario = new JTextField();
		usuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				usuario.setText("");
			}
		});
		usuario.setForeground(Color.LIGHT_GRAY);
		usuario.setText("Ingrese su usuario");
		usuario.setBounds(196, 131, 197, 19);
		contentPane.add(usuario);
		usuario.setColumns(10);
		
		contra = new JPasswordField();
		contra.setBounds(196, 178, 197, 19);
		contentPane.add(contra);
		
		JPanel registrar = new JPanel();
		
		registrar.setBackground(Color.BLUE);
		registrar.setBounds(105, 280, 104, 33);
		contentPane.add(registrar);
		
		JLabel registrartxt = new JLabel("Registrarme");
		registrartxt.setForeground(Color.WHITE);
		registrartxt.setHorizontalAlignment(SwingConstants.CENTER);
		registrartxt.setFont(new Font("Roboto Black", Font.PLAIN, 12));
		registrar.add(registrartxt);
		
		JLabel mensaje = new JLabel("");
		mensaje.setForeground(Color.RED);
		mensaje.setHorizontalAlignment(SwingConstants.CENTER);
		mensaje.setFont(new Font("Roboto Black", Font.PLAIN, 15));
		mensaje.setBounds(105, 346, 360, 61);
		contentPane.add(mensaje);
		
		JLabel dificultadtxt = new JLabel("Dificultad");
		dificultadtxt.setHorizontalAlignment(SwingConstants.CENTER);
		dificultadtxt.setFont(new Font("Roboto Black", Font.PLAIN, 12));
		dificultadtxt.setBounds(105, 227, 66, 25);
		contentPane.add(dificultadtxt);
		dificultadtxt.setVisible(false);
		
		dificultad = new JTextField();
		dificultad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dificultad.setText("");
			}
		});
		dificultad.setFont(new Font("Roboto Black", Font.PLAIN, 10));
		dificultad.setForeground(Color.LIGHT_GRAY);
		dificultad.setText("Ingrese una dificultad");
		dificultad.setBounds(192, 231, 201, 19);
		contentPane.add(dificultad);
		dificultad.setColumns(10);
		
		JPanel enviar = new JPanel();
		enviar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String passtext= new String(contra.getPassword());
				if(sesion.login(usuario.getText(), passtext)==true){
					
					GUIInicio inicio= new GUIInicio(sesion.usuariogetnombre(),sesion.usuariogetdificultad(), sesion.usuariogetscore(),sesion.usuariogetpassword());
					inicio.setVisible(true);
				}
				else  {
					mensaje.setText("Contraseña o usuario incorrecto");
				}
			}
		});
		enviar.setBackground(Color.BLUE);
		enviar.setBounds(258, 280, 104, 33);
		contentPane.add(enviar);
		
		JLabel iniciarsesiontxt = new JLabel("Iniciar sesión");
		iniciarsesiontxt.setHorizontalAlignment(SwingConstants.CENTER);
		iniciarsesiontxt.setForeground(Color.WHITE);
		iniciarsesiontxt.setFont(new Font("Roboto Black", Font.PLAIN, 12));
		enviar.add(iniciarsesiontxt);
		
		JPanel regresar = new JPanel();
		
		regresar.setBackground(Color.BLUE);
		regresar.setBounds(397, 280, 148, 33);
		contentPane.add(regresar);
		regresar.setVisible(false);
		
		JLabel lblPrefieroIniciarSesin = new JLabel("Prefiero iniciar sesión");
		lblPrefieroIniciarSesin.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrefieroIniciarSesin.setForeground(Color.WHITE);
		lblPrefieroIniciarSesin.setFont(new Font("Roboto Black", Font.PLAIN, 12));
		regresar.add(lblPrefieroIniciarSesin);
		
		JPanel crear = new JPanel();
		crear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String passtext= new String(contra.getPassword());
				try {
					if(sesion.registrar(usuario.getText(), Integer.parseInt(dificultad.getText()),passtext)==true) {
						GUIInicio inicio= new GUIInicio(usuario.getText(),Integer.parseInt(dificultad.getText()),0,passtext);
						inicio.setVisible(true);
					}
					else {
						mensaje.setText("No fue posible crear un usuario");
					}
				} catch (NumberFormatException | FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		crear.setBackground(Color.BLUE);
		crear.setBounds(105, 346, 104, 33);
		contentPane.add(crear);
		crear.setVisible(false);
		
		JLabel crearusuario = new JLabel("Crear usuario");
		crearusuario.setHorizontalAlignment(SwingConstants.CENTER);
		crearusuario.setForeground(Color.WHITE);
		crearusuario.setFont(new Font("Roboto Black", Font.PLAIN, 12));
		crear.add(crearusuario);
		dificultad.setVisible(false);
		
		registrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				head.setText("Crear usuario");
				dificultadtxt.setVisible(true);
				dificultad.setVisible(true);
				enviar.setVisible(false);
				registrar.setVisible(false);
				regresar.setVisible(true);
				mensaje.setText("");
				crear.setVisible(true);
			}
		});
		regresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				regresar.setVisible(false);
				dificultad.setVisible(false);
				dificultadtxt.setVisible(false);
				enviar.setVisible(true);
				registrar.setVisible(true);
				head.setText("Iniciar sesión");
				
			}
		});
	}
}
