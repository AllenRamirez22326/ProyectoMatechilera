public class Prueba{
    public static void main(String[] args) {

        //Crear instancia de Juego y leer bases de datos
        Juego juego = new Juego();
        juego.generarLista("prueba.csv");
        
        //¿Cual es tu nivel?
        int nivel = 2;

        //¿Cual es tu nombre?
        String nombre = "Wichito";

        //Crear instancia de usuario
        User usuario = new User(nombre, nivel);

        //Obtener problema al azar en función del nivel que tiene el usuario
        Problema problema = juego.seleccionarProblema(usuario.getNivel());

        //Mostrar problema al usuario
        System.out.println(problema.getProblema());

        //Pedir respuesta al usuario
        String solucion = "12.5";
        
        //Evaluar la respuesta del usuario, cambiar su contador de correctas e incorrectas
        if (juego.correcto(solucion, problema)){
            System.out.print("Correcto!");
            usuario.getProblemasCorrctos().add(problema);
        }
        else{
            System.out.print("\nincorrecto!");
            System.out.print("\n\nRetroalimentación:");
            System.out.print("\n"+problema.getRetroalimentacion());
            usuario.getProblemasIncorrctos().add(problema);
        }
            
        //Retroalimentación, se empieza a realizar luego de 5 problemas. 
        //Se crea un objeto retroalimentación y se aplican los métodos para verificar el trabajo del usuairo
        Retroalimentacion retroalmintacion = new Retroalimentacion();
        
        //Se realiza la retroalimentación con respecto al nivel
        retroalmintacion.evaluarNivel(usuario);

        //Se realiza la retroalimentación respecto a la categoria con más correctas o más incorrectas
        retroalmintacion.evaluarCategoria(usuario, true);


    }
}