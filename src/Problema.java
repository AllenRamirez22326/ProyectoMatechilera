/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NITRO 5
 */
public class Problema {
    private String problema;
    private String tipo;
    private int grado;
    public Problema(){
        problema="";
        tipo="";
        grado=0;
    }
    public Problema(String problema, String tipo, int grado){
        this.problema=problema;
        this.tipo=tipo;
        this.grado=grado;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "Problema{" + "problema=" + problema + ", tipo=" + tipo + ", grado=" + grado + '}';
    }
    
}
