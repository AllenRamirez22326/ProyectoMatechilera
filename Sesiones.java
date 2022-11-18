import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Sesiones {
    private ArrayList<User> usuarios;

    public Sesiones(){
        this.usuarios = new ArrayList<User>();
    }

    public boolean registrar(String nombre, String password, int nivel) throws FileNotFoundException{
        String path = "Registro.csv";
        String line = "";
        int cont = 0;
        try (BufferedReader buff = new BufferedReader(new FileReader(path))) {
            while((line = buff.readLine()) != null){
                String[] a = line.split(",");
                //System.out.print(a);
                if (cont > 0 )
                usuarios.add(new User(a[0], Integer.parseInt(a[3]), Integer.parseInt(a[2]), a[1]));
                cont++;         
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
            usuarios.add(new User(nombre, nivel, 0, password));
            System.out.print(usuarios.size());
            File csvFile = new File("Registro.csv");
            PrintWriter out = new PrintWriter(csvFile);
            for(User usuario : usuarios){
                out.write(usuario.getNombre() + "," + usuario.getPassword() + "\n");
            }
        out.flush();
        out.close();
        return true;
        }
        }

        ////////////////LOGIIIN

    public boolean login(String n, String p){
        String path = "Registro.csv";
        String line = "";
        int cont = 0;
        try (BufferedReader buff = new BufferedReader(new FileReader(path))) {
            while((line = buff.readLine()) != null){
                String[] a = line.split(",");
                if (cont > 0)
                usuarios.add(new User(a[0], Integer.parseInt(a[3]), Integer.parseInt(a[2]), a[1]));
                cont++;    
        }
        //System.out.print(n);
        for (User user : usuarios) {
            //System.out.println(user.getPassword().equals(p));
            if (user.getNombre().equals(n) && user.getPassword().equals(p)){
            return true;
            }
        }       
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }


    
}
