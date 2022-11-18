import java.util.ArrayList;

public class User {
    private String nombre;
    private int nivel;
    private ArrayList<Problema> problemasCorrctos;
    private ArrayList<Problema> problemasIncorrctos;
    

    public User() {
        problemasCorrctos = new ArrayList<Problema>();
        problemasIncorrctos = new ArrayList<Problema>();
    }

    public User(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.problemasCorrctos = new ArrayList<Problema>();
        this.problemasIncorrctos = new ArrayList<Problema>();
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

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", nivel='" + getNivel() + "'" +
            ", problemasCorrctos='" + getProblemasCorrctos() + "'" +
            "}";
    }

    
}
