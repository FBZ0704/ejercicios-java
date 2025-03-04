import java.util.Scanner;

/* En una empresa cada empleado debe teclear un código identificador de 3 cifras en la entrada. 
   Escribir un programa que muestre por pantalla la categoría del empleado teniendo en cuenta que:
· Si el código es divisible por 2, por 3 y por 5, la categoría del empleado es “Director general”.
· Si el código es divisible por 3 y por 5 pero no por 2, la categoría del empleado es “Directivo”.
· Si el código es divisible por 2, pero no por 3 ni por 5, la categoría del empleado es “Staff”.
· Si el código no es divisible por 2, ni por 3 ni por 5, la categoría del empleado es “Seguridad”.
Recuerde que: Un numero X es divisible por otro Y; si X mod Y = 0.
*/

public class TeclearCodigo {
  public static void main(String[] args) {
    // Variables
    int clave = 0;

    /*  Creamos Espacio En Memoria Para La Entrada De Informacion 
     * Pedimos La Informacion Al Usuario
     * Almacenamos La Informacion
    */
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Digite Su Clave: ");
    clave = Scanner.nextInt();

    // Determinamos La Categoria
    System.out.println("Clave: " + clave);
    if (clave % 2 == 0 && clave % 3 == 0 && clave %5 == 0) {
      System.out.println("Categoria:  DIRECTOR GENERAL");
    } else if (clave % 3 == 00 && clave % 5 == 0 && clave % 2 != 0) {
      System.out.println("Categoria:  DIRECTIVO");
    } else if (clave % 2 == 0 && clave % 3 != 0 && clave % 5 != 0) {
      System.out.println("Categoria:  STAFF");
    } else if (clave % 2 != 0 && clave % 3 != 0 && clave % 5 != 0) {
      System.out.println("Caregoria:  SEGURIDAD");
    } else {
      System.out.println("Codigo No Valido");
    }
    Scanner.close();
  }
}
