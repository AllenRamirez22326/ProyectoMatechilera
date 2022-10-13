/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *Función: Esta clase funciona como un controlador, el cual se encarga de leer un csv. Un csv tiene la siguiente forma:
 * Raul;hombre;25
 * Sofia;mujer;24
 * Roberto;hombre;36
 * 1) Primero junta todas las columnas eliminando el "\n" y colocando un ";" en lugar del "\n" dejándonos con algo como esto:
 * Raul;hombre;25;Sofia;mujer;24;Roberto;hombre;36
 * 2) Al tener esta string, podemos utilizar la función split para generar un Array de strings, donde solo debemos mandar como parámetro
 * a la función leercsv(int columna) un entero, el cual será el número de celda del array que queramos.
 * @author NITRO 5
 */
public class CSVReader {
    File file;
    String path;
    String line;
    String cleanline;
        public CSVReader(String archivo){
            file = new File("src\\com.csv\\"+archivo+".csv");
             path=file.getAbsolutePath();
             line= "";
             //Buscamos el archivo usando un absolute path y añadiendo solamente cómo se llama este archivo que queremos leer
        }
       public String leercsv(int column) throws IOException {
        
           try {
               BufferedReader br= new BufferedReader(new FileReader(path));
               String holder="";
               cleanline="";
               
               while((line=br.readLine())!=null){
                   cleanline+=";"+line;
                   //Quitamos los "\n" y los cambiamos por un ";"
               }
               
               
                    
                   String[] values=cleanline.split(";");//Creamos el Arrays de Strings
                   holder=values[column];//Accedemos al valor que deseamos
                   return  holder;
               
               
               
           } catch (FileNotFoundException ex) {
               Logger.getLogger(CSVReader.class.getName()).log(Level.SEVERE, null, ex);
           }
        return"";
       }
       public int tamanio() throws IOException{
           try {
               BufferedReader br= new BufferedReader(new FileReader(path));
               String holder="";
               cleanline="";
               while((line=br.readLine())!=null){
                   cleanline+=";"+line;
               }
               
               
                    
                   String[] values=cleanline.split(";");
                   return (values.length)/3;
               
               
               
           } catch (FileNotFoundException ex) {
               Logger.getLogger(CSVReader.class.getName()).log(Level.SEVERE, null, ex);
           }
        return 0;
       }
}
