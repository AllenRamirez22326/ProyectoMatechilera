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

    public Sesiones(){
        this.usuarios = new ArrayList<User>();
    }

    public boolean registrar(String nombre, String password) throws FileNotFoundException{
        String path = "Registro.csv";
        String line = "";
        try (BufferedReader buff = new BufferedReader(new FileReader(path))) {
            while((line = buff.readLine()) != null){
                String[] a = line.split(",");
                //System.out.print(a);
                usuarios.add(new User(a[0], a[1]));         
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
            usuarios.add(new User(nombre, password));
            System.out.print(usuarios.size());
            File csvFile = new File("Registro.csv");
            PrintWriter out = new PrintWriter(csvFile);
            for(User usuario : usuarios){
                out.write(usuario.getNombre() + ", " + usuario.getPassword() + "\n");
            }
        out.flush();
        out.close();
        return true;
        }
        }

        ////////////////LOGIIIN

    public boolean login(String n, String p)throws FileNotFoundException{
        String path = "Registro.csv";
        String line = "";
        try (BufferedReader buff = new BufferedReader(new FileReader(path))) {
            while((line = buff.readLine()) != null){
                String[] a = line.split(",");
                usuarios.add(new User(a[0], a[1]));        
      
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Existe el nombre de usuario??
        boolean existe = false;
        for (User user : usuarios) {
            System.out.println(user.getNombre().equals(n) + " " + user.getNombre() + " " + user.getPassword().equals(p) + " " + user.getPassword());
            if (user.getNombre().equals(n) && user.getPassword().equals(p)){
                return true;
            }
        }
        return existe;
    }
    
}
