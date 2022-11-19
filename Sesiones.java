
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.spi.URLStreamHandlerProvider;
import java.util.ArrayList;

public class Sesiones {
    private ArrayList<User> usuarios;
    private int ind;
    public Sesiones(){
        this.usuarios = new ArrayList<User>();
        ind=0;
    }

    public boolean registrar(String nombre, int nivel,String password) throws FileNotFoundException{
        String path = "Registro.csv";
        String line = "";
        try (BufferedReader buff = new BufferedReader(new FileReader(path))) {
            while((line = buff.readLine()) != null){
                String[] a = line.split(",");
                //System.out.print(a);
                usuarios.add(new User(a[0], Integer.parseInt(a[1]), Integer.parseInt(a[2]),a[3]));         
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Existe el nombre de usuario??
        boolean existe = false;
        for (User user : usuarios) {
            if (user.getNombre().equals(nombre)){
                existe = true;
            }
            else{
                existe = false;
            }
        }
        
        if (existe){
            return false;
        }
        else {
            usuarios.add(new User(nombre, nivel,0,password));
            File csvFile = new File("Registro.csv");
            PrintWriter out = new PrintWriter(csvFile);
            for(User usuario : usuarios){
                out.write(usuario.getNombre() + ","+usuario.getNivel()+ ","+usuario.getScore() + "," + usuario.getPassword() + "\n");
        }
        out.flush();
        out.close();
        return true;
        }
        
        
       
        }
    public String usuariogetnombre() {
    	return usuarios.get(ind).getNombre();
    }
    public Integer usuariogetdificultad() {
    	return usuarios.get(ind).getNivel();
    }
    public String usuariogetpassword() {
    	return usuarios.get(ind).getPassword();
    }
    public Integer usuariogetscore() {
    	return usuarios.get(ind).getScore();
    }
    
    public String getUsuarios() {
    	String str= "";
    	for(User user: usuarios) {
    		str+=user.toString()+"\n";
    	}
    	return str;
    }
    public boolean login(String n, String p){
        String path = "Registro.csv";
        String line = "";
        try (BufferedReader buff = new BufferedReader(new FileReader(path))) {
            while((line = buff.readLine()) != null){
                String[] a = line.split(",");
                usuarios.add(new User(a[0], Integer.parseInt(a[1]), Integer.parseInt(a[2]), a[3]));
                   
        }
        //System.out.print(n);
        for (User user : usuarios) {
            //System.out.println(user.getPassword().equals(p));
            if (user.getNombre().equals(n) && user.getPassword().equals(p)){
            	ind=usuarios.indexOf(user);
            return true;
            }
        }       
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    
}