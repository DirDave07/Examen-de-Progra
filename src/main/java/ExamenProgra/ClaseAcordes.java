package ExamenProgra;

//Aquí van todas mis librerías
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author dofh0
 */
public class ClaseAcordes {
    //Declaramos nuestras variables e instanciamos nuestro Scanner
    String notas = "";
    Scanner sim = new Scanner(System.in);
    //Aquí iniciamos nuestro proceso para solicitar datos al usuario
    public String pedir_notas(){
       notas = JOptionPane.showInputDialog(null, "Bienvenido a nuestro repositorio identificador de notas fundamentales de acordes! \n Inserte la nota principal del acorde mayor que desea encontrar: \n(Notas disponibles: A,B,C,D,E,F,G   =   La,Si,Do,Re,Mi,Fa,Sol)"); 
       return notas;
       //Nos quedamos con el dato de la variable "notas" con el fin de reutilizarlo después
    }
    //Hacemos un nuevo proceso para complementar el dato según la información que solicite
    public void encontrar_acorde(){
        //Procedemos a dividir nuestra información con un "según"
        switch(notas){
           //Todos los casos vienen con todas las formas de escribir la misma nota musical
           case "A", "a", "La", "la":
               JOptionPane.showMessageDialog(null, "Las notas fundamentales del acorde de La Mayor son: \n A - E - C# / La - Mi - Do#"); 
               //Mostramos resultados
               break;
           case "B", "b", "Si", "si":
               JOptionPane.showMessageDialog(null, "Las notas fundamentales del acorde de Si Mayor son: \n D# - F# - B / Re# - Fa# - Si");
               break;
           case "C", "c", "Do", "do":
               JOptionPane.showMessageDialog(null, "Las notas fundamentales del acorde de Do Mayor son: \n C - E - G / Do - Mi - Sol"); 
               break;
           case "D", "d", "Re", "re":
               JOptionPane.showMessageDialog(null, "Las notas fundamentales del acorde de Re Mayor son: \n D - F# - A / Re - Fa# - La"); 
               break;
           case "E", "e", "Mi", "mi":
               JOptionPane.showMessageDialog(null, "Las notas fundamentales del acorde de Mi Mayor son: \n E - G# - B / Mi - Sol# - Si"); 
               break;
           case "F", "f", "Fa", "fa":
               JOptionPane.showMessageDialog(null, "Las notas fundamentales del acorde de Fa Mayor son: \n A - F - C / Fa - La - Do"); 
               break;
           case "G", "g", "Sol", "sol":
               JOptionPane.showMessageDialog(null, "Las notas fundamentales del acorde de Sol Mayor son: \n G - B - D / Sol - Si - Re"); 
               break;
           default: JOptionPane.showMessageDialog(null, "Por favor inserte una de las notas que corresponda a un acorde soportado por nuestro programa.");
           //Para evitar excepciones declaramos una opción por defecto
            break;
       }
    }
    //Iniciamos otro proceso que servirá para reproducir las veces que sea necesario nuestro programa
    public boolean repetir(boolean siono){
        //Declaramos la cadena donde irá la información insertada por el usuario
        String opc = JOptionPane.showInputDialog(null, "¿Desea volver a reproducir nuestro maravilloso programa? (S/N): "); 
        //Comparamos con el caracter que responde negativamente a repetir nuestro programa
        if(opc.equalsIgnoreCase("N")){
           /*Si la opción seleccionada por el usuario fue "no" 
             la variable binaria que mantiene al ciclo activo responde negativamente
             terminando con el ciclo y el programa
            */
           siono = false;
           //Mostramos un mensaje de despedida
           JOptionPane.showMessageDialog(null, "Corre a encintar las notas de tus instrumentos \nPuedes volver a consultar los acordes cuando gustes!!!");
        }
        //Retornamos el valor del dato insertado por el usuario
        return siono;
    }
}
