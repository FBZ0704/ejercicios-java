import java.util.Scanner;

/* Un alumno desea realizar varias conversiones del sistema ingles de mediciones al sistema métrico decimal.
   Hacer un programa que realice la conversión de metros a pies y de pies a metros.
*/

public class Conversion {
  public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    // Variables
    double pies;
    Double metros;
    Double mts;

    
    int dato = 0;

    while (dato == 0) {
      System.out.println(" Escribe: \n1 - Para Convertir Pies a Metros \n2 - Para Convertir Metros A Pies \n0 - Para Terminar");
      int opcion = Scanner.nextInt();

      if (opcion == 1) {
        Scanner Scanner2 = new Scanner(System.in);
        System.out.println(" Digita La Cantidad De Pies: ");
        pies = Scanner2.nextDouble();
        metros = (pies / 3.28);
        System.out.println("El Resultado Es: " + metros + " mts");
      }else if (opcion == 2) {
         Scanner Scanner2 = new Scanner(System.in);
         System.out.println(" Digita La Cantidad De Metros: ");
         mts = Scanner2.nextDouble();
         pies = mts * 3.28;
         System.out.println("El Resultado Es: " + pies + " pies");
       } else if (opcion == 0){
         dato = 1;
      }

      Scanner.close();
      Scanner2.close();
      }
  }
}
