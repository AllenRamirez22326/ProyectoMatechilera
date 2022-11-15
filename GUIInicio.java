import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.color.*;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
public class GUIInicio extends JFrame {

	private JPanel bg;
	private JTextField respuestauser;
	private Juego juego;
	private JLabel mainlabel;
	private User usuario;
	private Problema problema;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIInicio frame = new GUIInicio();
					
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 504);
		bg = new JPanel();
		bg.setBackground(new Color(0,0,0));
		bg.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(bg);
		bg.setLayout(null);
		
		juego = new Juego();
		juego.generarLista("src/prueba.csv");
		
		usuario=new User("Raul",2);
		
		
		JLabel enviartxt = new JLabel("Enviar");
		enviartxt.setBounds(609, 416, 40, 39);
		bg.add(enviartxt);
		enviartxt.setFont(new Font("Roboto Black", Font.PLAIN, 12));
		enviartxt.setForeground(Color.WHITE);
		enviartxt.setVisible(false);
		
		JPanel enviar = new JPanel();
		
		enviar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		enviar.setBounds(609, 416, 42, 41);
		bg.add(enviar);
		enviar.setBackground(new Color(225,173,1));
		enviar.setVisible(false);
		enviar.setLayout(new BorderLayout(0, 0));
		
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel1.setBounds(69, 79, 273, 131);
		bg.add(panel1);
		panel1.setBackground(new Color(40,40,40));
		panel1.setLayout(null);
		
		JPanel selecniv = new JPanel();
		selecniv.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		selecniv.setBounds(28, 24, 216, 77);
		panel1.add(selecniv);
		selecniv.setBackground(new Color(225,173,1));
		selecniv.setLayout(null);
		
		JLabel selecnivtxt = new JLabel("Seleccionar nivel");
		selecnivtxt.setForeground(Color.WHITE);
		selecnivtxt.setHorizontalAlignment(SwingConstants.CENTER);
		selecnivtxt.setFont(new Font("Roboto Black", Font.PLAIN, 15));
		selecnivtxt.setBounds(35, 10, 146, 57);
		selecniv.add(selecnivtxt);
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel2.setBounds(69, 245, 273, 131);
		bg.add(panel2);
		panel2.setBackground(new Color(40,40,40));
		panel2.setLayout(null);
		
		JPanel panel3 = new JPanel();
		panel3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel3.setBounds(393, 79, 347, 297);
		bg.add(panel3);
		panel3.setBackground(new Color(40,40,40));
		panel3.setLayout(null);
		
		JPanel lvl1panel = new JPanel();
		lvl1panel.setLayout(null);
		lvl1panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lvl1panel.setBackground(new Color(225, 173, 1));
		lvl1panel.setBounds(70, 10, 214, 38);
		panel3.add(lvl1panel);
		
		JLabel lvl1 = new JLabel("Primer grado");
		
		lvl1.setHorizontalAlignment(SwingConstants.CENTER);
		lvl1.setForeground(Color.WHITE);
		lvl1.setFont(new Font("Roboto Black", Font.PLAIN, 15));
		lvl1.setBounds(33, 0, 152, 38);
		lvl1panel.add(lvl1);
		
		JPanel lvl2panel = new JPanel();
		
		lvl2panel.setLayout(null);
		lvl2panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lvl2panel.setBackground(new Color(225, 173, 1));
		lvl2panel.setBounds(70, 58, 214, 38);
		panel3.add(lvl2panel);
		
		JLabel segundogrado = new JLabel("Segundo grado");
		segundogrado.setHorizontalAlignment(SwingConstants.CENTER);
		segundogrado.setForeground(Color.WHITE);
		segundogrado.setFont(new Font("Roboto Black", Font.PLAIN, 15));
		segundogrado.setBounds(33, 0, 152, 38);
		lvl2panel.add(segundogrado);
		
		JPanel lvl3panel = new JPanel();
		
		lvl3panel.setLayout(null);
		lvl3panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lvl3panel.setBackground(new Color(225, 173, 1));
		lvl3panel.setBounds(70, 106, 214, 38);
		panel3.add(lvl3panel);
		
		JLabel tercergrado = new JLabel("Tercer grado");
		tercergrado.setHorizontalAlignment(SwingConstants.CENTER);
		tercergrado.setForeground(Color.WHITE);
		tercergrado.setFont(new Font("Roboto Black", Font.PLAIN, 15));
		tercergrado.setBounds(33, 0, 152, 38);
		lvl3panel.add(tercergrado);
		
		JPanel lvl4panel = new JPanel();
		
		lvl4panel.setLayout(null);
		lvl4panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lvl4panel.setBackground(new Color(225, 173, 1));
		lvl4panel.setBounds(70, 154, 214, 38);
		panel3.add(lvl4panel);
		
		JLabel cuartogrado = new JLabel("Cuarto grado");
		cuartogrado.setHorizontalAlignment(SwingConstants.CENTER);
		cuartogrado.setForeground(Color.WHITE);
		cuartogrado.setFont(new Font("Roboto Black", Font.PLAIN, 15));
		cuartogrado.setBounds(33, 0, 152, 38);
		lvl4panel.add(cuartogrado);
		
		JPanel lvl5panel = new JPanel();
		
		lvl5panel.setLayout(null);
		lvl5panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lvl5panel.setBackground(new Color(225, 173, 1));
		lvl5panel.setBounds(70, 202, 214, 38);
		panel3.add(lvl5panel);
		
		JLabel quintogrado = new JLabel("Quinto grado");
		quintogrado.setHorizontalAlignment(SwingConstants.CENTER);
		quintogrado.setForeground(Color.WHITE);
		quintogrado.setFont(new Font("Roboto Black", Font.PLAIN, 15));
		quintogrado.setBounds(33, 0, 152, 38);
		lvl5panel.add(quintogrado);
		
		JPanel modocolor = new JPanel();
		modocolor.setBackground(new Color(255,255,255));
		modocolor.setBounds(736, 10, 42, 43);
		bg.add(modocolor);
		
		JLabel matechiletxt = new JLabel("MATECHILERA");
		matechiletxt.setHorizontalAlignment(SwingConstants.CENTER);
		matechiletxt.setFont(new Font("Noto Sans", Font.BOLD, 18));
		matechiletxt.setForeground(Color.WHITE);
		matechiletxt.setBounds(10, 10, 186, 43);
		bg.add(matechiletxt);
		
		respuestauser = new JTextField();
		respuestauser.setHorizontalAlignment(SwingConstants.CENTER);
		
		respuestauser.setForeground(Color.LIGHT_GRAY);
		respuestauser.setFont(new Font("Roboto Black", Font.PLAIN, 12));
		respuestauser.setText("Ingrese su respuesta");
		respuestauser.setBounds(184, 416, 425, 41);
		respuestauser.setVisible(false);
		bg.add(respuestauser);
		respuestauser.setColumns(10);
		
		mainlabel = new JLabel(" ");
		mainlabel.setHorizontalAlignment(SwingConstants.CENTER);
		mainlabel.setFont(new Font("Roboto Black", Font.PLAIN, 12));
		mainlabel.setForeground(Color.WHITE);
		mainlabel.setBounds(171, 28, 390, 103);
		bg.add(mainlabel);
		
		JPanel nextpanel = new JPanel();
		nextpanel.setBounds(689, 416, 89, 39);
		bg.add(nextpanel);
		nextpanel.setLayout(null);
		
		JLabel nexttxt = new JLabel("Siguiente");
		nexttxt.setBounds(10, 10, 68, 24);
		nexttxt.setFont(new Font("Roboto Black", Font.PLAIN, 12));
		nextpanel.add(nexttxt);
		modocolor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(modocolor.getBackground().getBlue()==255) {
					bg.setBackground(Color.WHITE);
					panel1.setBackground(new Color(215,215,215));
					panel2.setBackground(new Color(215,215,215));
					panel3.setBackground(new Color(215,215,215));
					lvl1panel.setBackground(new Color(11,11,69));
					lvl2panel.setBackground(new Color(11,11,69));
					lvl3panel.setBackground(new Color(11,11,69));
					lvl4panel.setBackground(new Color(11,11,69));
					lvl5panel.setBackground(new Color(11,11,69));
					selecniv.setBackground(new Color(11,11,69));
					matechiletxt.setForeground(Color.BLACK);
					respuestauser.setBackground(Color.BLACK);
					enviar.setBackground(new Color(11,11,69));
					modocolor.setBackground(new Color(0,0,0));
				}
				else if(modocolor.getBackground().getBlue()==0) {
					bg.setBackground(Color.BLACK);
					panel1.setBackground(new Color(40,40,40));
					panel2.setBackground(new Color(40,40,40));
					panel3.setBackground(new Color(40,40,40));
					lvl1panel.setBackground(new Color(225,173,1));
					lvl2panel.setBackground(new Color(225,173,1));
					lvl3panel.setBackground(new Color(225,173,1));
					lvl4panel.setBackground(new Color(225,173,1));
					lvl5panel.setBackground(new Color(225,173,1));
					selecniv.setBackground(new Color(225,173,1));
					matechiletxt.setForeground(Color.WHITE);
					respuestauser.setBackground(Color.WHITE);
					enviar.setBackground(new Color(225,173,1));
					enviartxt.setForeground(Color.WHITE);
					modocolor.setBackground(new Color(255,255,255));
				}
			}
			
		});
		lvl1panel.addMouseListener(new MouseAdapter() {
			public void ocultar() {
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				lvl1panel.setVisible(false);
				lvl2panel.setVisible(false);
				lvl3panel.setVisible(false);
				lvl4panel.setVisible(false);
				lvl5panel.setVisible(false);
				selecniv.setVisible(false);
			}
			public void mouseClicked(MouseEvent e) {
				ocultar();
				enviar.setVisible(true);
				enviartxt.setVisible(true);
				respuestauser.setVisible(true);
				juego.setDificultad(1);
				juego.seleccionarProblema(juego.getDificultad());
			}
		});
		lvl2panel.addMouseListener(new MouseAdapter() {
			
			
			public void ocultar() {
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				lvl1panel.setVisible(false);
				lvl2panel.setVisible(false);
				lvl3panel.setVisible(false);
				lvl4panel.setVisible(false);
				lvl5panel.setVisible(false);
				selecniv.setVisible(false);
			}
			public void mouseClicked(MouseEvent e) {
				ocultar();
				enviar.setVisible(true);
				enviartxt.setVisible(true);
				respuestauser.setVisible(true);
				juego.setDificultad(usuario.getNivel());
				 problema= juego.seleccionarProblema(usuario.getNivel());
				mainlabel.setText(problema.getProblema());
				
			}
				 
		});
		lvl3panel.addMouseListener(new MouseAdapter() {
			
			public void ocultar() {
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				lvl1panel.setVisible(false);
				lvl2panel.setVisible(false);
				lvl3panel.setVisible(false);
				lvl4panel.setVisible(false);
				lvl5panel.setVisible(false);
				selecniv.setVisible(false);
			}
			public void mouseClicked(MouseEvent e) {
				ocultar();
				enviar.setVisible(true);
				enviartxt.setVisible(true);
				respuestauser.setVisible(true);
			}
		});
		lvl4panel.addMouseListener(new MouseAdapter() {
			public void ocultar() {
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				lvl1panel.setVisible(false);
				lvl2panel.setVisible(false);
				lvl3panel.setVisible(false);
				lvl4panel.setVisible(false);
				lvl5panel.setVisible(false);
				selecniv.setVisible(false);
				
			}
			public void mouseClicked(MouseEvent e) {
				ocultar();
				enviar.setVisible(true);
				enviartxt.setVisible(true);
				respuestauser.setVisible(true);
			}
		});
		lvl5panel.addMouseListener(new MouseAdapter() {
			public void ocultar() {
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				lvl1panel.setVisible(false);
				lvl2panel.setVisible(false);
				lvl3panel.setVisible(false);
				lvl4panel.setVisible(false);
				lvl5panel.setVisible(false);
				selecniv.setVisible(false);
			}
			public void mouseClicked(MouseEvent e) {
				ocultar();
				enviar.setVisible(true);
				enviartxt.setVisible(true);
				respuestauser.setVisible(true);
			}
		});
		respuestauser.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				respuestauser.setText("");
				if(modocolor.getBackground().getBlue()==0) {
					respuestauser.setForeground(Color.WHITE);
				}
				else if(modocolor.getBackground().getBlue()==255) {
					respuestauser.setForeground(Color.BLACK);
				}
				
			}
		});
		enviar.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				String resp= respuestauser.getText();
				if(juego.correcto(resp,problema )==true) {
					mainlabel.setForeground(Color.GREEN);
					mainlabel.setText("Correcto");
				}
				else {
					mainlabel.setForeground(Color.RED);
					mainlabel.setText("Incorrecto");
				}
			}
		});
		
	}
}