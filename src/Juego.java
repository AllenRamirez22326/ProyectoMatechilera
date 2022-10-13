
import java.io.IOException;
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
    private Problema[] problemasf;
    private int pregunta;
    private int dificultad;
    public Juego(){
        problemasf= new Problema[6];
        pregunta=0;
    }
    public void generarLista() throws IOException{
        String problema="";
        String tipo="";
        String grado="0";
        CSVReader rdr= new CSVReader("prueba");
        int guardar=0;
        int iterar=0;
        Problema[] problemas = new Problema[10];
         for(int i=0; i<rdr.tamanio();i++){
            problema=rdr.leercsv(iterar+1);
            tipo=rdr.leercsv(iterar+2);
            grado=rdr.leercsv(iterar+3);
            //Haciendo uso del CSVReader podemos obtener el valor de cada celda, iterando el patrón del total de columnas que tenemos
            problemas[guardar]= new Problema(problema,tipo,Integer.parseInt(grado)); 
            guardar+=1;
            iterar+=3;//Este valor es el número de columnas que tiene nuestro programa
         }     
        problemasf=problemas;
    }
    //En el método seleccionarProblemas() falta agregar el parámetro que será el número de problemas que tengamos, es el valor 6.
    public String seleccionarProblema(){
        
        Random random= new Random();
        int r= random.nextInt(6);
        //Si el el problema random tomado tiene una dificultad mayor a la dificultad
        //que seleccionó el jugador entonces genera otro random hasta que la dificultad
        //del problema sea igual o menor a la del juego.
        while(problemasf[r].getGrado()>dificultad){
            r=random.nextInt(6);
        }
        pregunta=r;//Cambia la pregunta que estamos usando en este momento
        return problemasf[r].getProblema();
        
        
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

    public void setPregunta(int pregunta) {
        this.pregunta = pregunta;
    }
    
}

