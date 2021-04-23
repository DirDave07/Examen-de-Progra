package ExamenProgra;

/**
 *
 * @author David Flores, Joel González
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Aquí mandamos a llamar e instanciamos nuestra clase  
        ClaseAcordes acorde = new ClaseAcordes();
        //Declaramos el booleano con el que se ciclará el programa las veces que sea necesario
        boolean siono = true;
        //Iniciamos el ciclo entrando una vez al contenido
        do{
        //Inicializamos el método "pedir notas"
        acorde.pedir_notas();
        //Termina el método anterior e inicia el próximo llamado "encontrar acorde"
        acorde.encontrar_acorde();
        //Ambos procesos fueron llevados a cabo desde la instancia "acorde" de la clase "ClaseAcordes"
        }while(acorde.repetir(siono) == true);
        /*Finalizamos el ciclo con valores también de la instancia "acorde" de
          la clase "ClaseAcordes", con la finalidad de no alterar el orden de nuestro código
          en el Main Class
        */
    }
}
