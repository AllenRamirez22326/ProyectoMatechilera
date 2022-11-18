import java.util.ArrayList;

public class User {
    private String nombre;
    private String password;
    private int score;
    private int nivel;
    private ArrayList<Problema> problemasCorrctos;
    private ArrayList<Problema> problemasIncorrctos;
    

    public User() {
        problemasCorrctos = new ArrayList<Problema>();
        problemasIncorrctos = new ArrayList<Problema>();
        nivel = 0;
        nombre = "";
        password = "";
    }

    public User(String nombre, int nivel, int score, String password) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.score = score;
        this.password = password;
    }

    public User(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

        

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public ArrayList<Problema> getProblemasCorrctos() {
        return this.problemasCorrctos;
    }

    public void setProblemasCorrctos(ArrayList<Problema> problemasCorrctos) {
        this.problemasCorrctos = problemasCorrctos;
    }

    public User nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public User nivel(int nivel) {
        setNivel(nivel);
        return this;
    }

    public User problemasCorrctos(ArrayList<Problema> problemasCorrctos) {
        setProblemasCorrctos(problemasCorrctos);
        return this;
    }

    public ArrayList<Problema> getProblemasIncorrctos() {
        return this.problemasIncorrctos;
    }

    public void setProblemasIncorrctos(ArrayList<Problema> problemasIncorrctos) {
        this.problemasIncorrctos = problemasIncorrctos;
    }


    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public User(String nombre, String password, int nivel, ArrayList<Problema> problemasCorrctos, ArrayList<Problema> problemasIncorrctos) {
        this.nombre = nombre;
        this.password = password;
        this.nivel = nivel;
        this.problemasCorrctos = problemasCorrctos;
        this.problemasIncorrctos = problemasIncorrctos;
    }

    public User password(String password) {
        setPassword(password);
        return this;
    }

    public User problemasIncorrctos(ArrayList<Problema> problemasIncorrctos) {
        setProblemasIncorrctos(problemasIncorrctos);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", nivel='" + getNivel() + "'" +
            ", problemasCorrctos='" + getProblemasCorrctos() + "'" +
            "}";
    }

    
}