import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Función: Este es el controlador del juego. Se encargará de seleccionar un problema al azar dada una dificultad, generar la lista de problemas,
 * chequear la respuesta, llevar el contador del jugador.
 * @author NITRO 5
 */
public class Juego{
    private ArrayList<Problema> problemasf;
    private int pregunta;
    private int dificultad;
    private Integer vidas;
    private User usuario;
	private Problema problema;
    public Juego(String nombre, int dif, int puntos, String password){
        problemasf= new ArrayList<Problema>();
        pregunta=0;
        vidas=3;
        usuario=new User(nombre,dif,puntos,password);
        problema= new Problema();
    }
    public Integer usuarioCorrecto() {
    	return usuario.totalCorrectos();
    }
    public Integer usurioScore() {
    	return usuario.getScore();
    }
    public int usuarioNivel() {
    	return usuario.getNivel();
    }
    public void limpiarUsuario() {
    	usuario.limpiar();
    }
    public void generarLista(String archivo){
    String path = archivo;
    String line = "";
    try (BufferedReader buff = new BufferedReader(new FileReader(path))) {
        while((line = buff.readLine()) != null){
            String[] a = line.split(",");
            problemasf.add(new Problema(a[0], a[1], Integer.parseInt(a[2]), a[3], a[4]));         
        }
    } catch (IOException e) {
        
        e.printStackTrace();
    }
    }
    public void reiniciar() {
    	vidas=3;
    }
    public Integer getVidas() {
		return vidas;
	}

	public void setVidas(Integer vidas) {
		this.vidas = vidas;
	}
	public void quitarVida() {
		vidas-=1;
	}
	//Tomando en cuenta el nivel del susuario elige problemas de ese nivel o menor para presentarle al usuario
    public Problema seleccionarProblema(int nivel){
        ArrayList<Problema> posiblesProblemas = new ArrayList<Problema>();
        for (Problema problema : problemasf) {
            if (problema.getGrado() <= nivel){
                posiblesProblemas.add(problema);
            }
        }
        Random random= new Random();
        int r= random.nextInt(posiblesProblemas.size());
        return posiblesProblemas.get(r);
    }

    //Determina si la respuesta del usuario está correcta, devuelve true en ese caso o false en el caso contrario
    public boolean correcto(String solucion){
        if (solucion.equals(problema.getSolucion())){
            return true;
        }
        else{
            return false;
        }
    }
    public String tomarSol() {
    	return problema.getSolucion();
    }
    public void addIncorrecto() {
    	usuario.addProblemasIncorrctos(problema);
    }
    public String textoProblema() {
    	return problema.getProblema();
    }
    public void ponerScore() {
    	usuario.setScore(usuario.totalCorrectos());
    }
    public void addCorrecto() {
    	usuario.addProblemasCorrctos(problema);
    }
    public void cambiarProblema() {
    	problema= seleccionarProblema(usuario.getNivel());
    }
    public ArrayList<Problema> getProblemasf() {
        return this.problemasf;
    }

    public void setProblemasf(ArrayList<Problema> problemasf) {
        this.problemasf = problemasf;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }
    
    public int getPregunta() {
        return pregunta;
    }
    public String mejores() {
    	int max=0;
    	int in=0;
    	ArrayList<User> usuarios= new ArrayList<User>();
    	String path = "Registro.csv";
        String line = "";
        try (BufferedReader buff = new BufferedReader(new FileReader(path))) {
            while((line = buff.readLine()) != null){
                String[] a = line.split(",");
                usuarios.add(new User(a[0], Integer.parseInt(a[1]), Integer.parseInt(a[2]), a[3]));
                   
        }
    	
    	
    } catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
        for(User us: usuarios) {
        	if(us.getScore()>max) {
        		max=us.getScore();
        		in=usuarios.indexOf(us);
        	}
        }
        return "1. "+usuarios.get(in).getNombre()+" Score:"+usuarios.get(in).getScore();
    }
    public void setPregunta(int pregunta) {
        this.pregunta = pregunta;
    }
    public void guardarScore() {
    	ArrayList<User> usuarios= new ArrayList<User>();
    	String path = "Registro.csv";
        String line = "";
        try (BufferedReader buff = new BufferedReader(new FileReader(path))) {
            while((line = buff.readLine()) != null){
                String[] a = line.split(",");
                usuarios.add(new User(a[0], Integer.parseInt(a[1]), Integer.parseInt(a[2]), a[3]));
                   
        }
    	
    	
    } catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
        for(User us: usuarios) {
        	if(us.getNombre().equals(usuario.getNombre()) && us.getPassword().equals(usuario.getPassword())) {
        		us.setScore(usuario.getScore());
        	}
        }
        File csvFile = new File("Registro.csv");
        
		try {
		PrintWriter	out = new PrintWriter(csvFile);
		for(User usuario : usuarios){
            out.write(usuario.getNombre() + ","+usuario.getNivel()+ ","+usuario.getScore() + "," + usuario.getPassword() + "\n");
    }
    out.flush();
    out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        
        
    
}
}
