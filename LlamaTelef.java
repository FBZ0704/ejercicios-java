import java.util.Scanner;

/* Escribir un programa que permita determinar la cantidad total a pagar por una llamada telefónica de N minutos
(introducido por el usuario), teniendo en cuenta lo siguiente:
· Las llamadas de 5 minutos o menos tienen un coste de 10 BsF.
· Cada minuto adicional a partir de los 5 primeros cuesta 2 BsF. */

public class LlamaTelef {
  public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Digite Cuanto Duro La Llamada: ");
    int N = Scanner.nextInt();
    int llamadaMin = 10;
    int llamadaTotal = 0;
    if (N <= 5) {
      System.out.println("La Llamada Cuesta: $" + llamadaMin + " BsF");
    } else if (N > 5) {
      llamadaTotal = ((N - 5) * 2) + llamadaMin;
      System.out.println("La Llamada Cuesta: $" + llamadaTotal + " BsF");
    }
    Scanner.close();
  }
}
