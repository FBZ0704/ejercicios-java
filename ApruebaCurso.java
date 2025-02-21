import java.util.Scanner;

/* Determinar si un alumno aprueba a reprueba un curso, sabiendo que aprobara si su promedio de tres
   calificaciones es mayor o igual a 70; reprueba en caso contrario
*/

public class ApruebaCurso {
  public static void main(String[] args) {
    // Variables
    Double nota1, nota2, nota3;
    Double notaDef;
    Double promedio;

    /*  Creamos Espacios En Memoria Para La Entrada De Informacion 
     * Pedimos La Informacion Al Usuario
     * Almacenamos La Informacion
     */
    Scanner Scanner = new Scanner(System.in);
    System.out.println(" Digite La Primera Nota");
    nota1 = Scanner.nextDouble();
        
    Scanner Scanner2 = new Scanner(System.in);
    System.out.println(" Digite La Segunda Nota");
    nota2 = Scanner2.nextDouble();
        
    Scanner Scanner3 = new Scanner(System.in);
    System.out.println(" Digite La Tercera Nota");
    nota3 = Scanner3.nextDouble();
    
    // Calculamos Nota Definitiva
    notaDef = ((nota1 + nota2 + nota3) / 3);
    promedio = (notaDef * 10);
    if (promedio >= 70) {
      System.out.println("Nota Definitiva: " + notaDef);
      System.out.println("Curso APROBADO ");
    } else {
      System.out.println("Nota Definitiva: " + notaDef);
      System.out.println("Curso REPROBADO ");
    }
    
    Scanner.close();
    Scanner2.close();
    Scanner3.close();
  }
}
