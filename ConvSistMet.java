import java.util.Scanner;

/* Un alumno desea realizar varias conversiones del sistema ingles de mediciones al sistema métrico decimal.
   Hacer un programa que realice la conversión de metros a pies y de pies a metros.
*/

public class ConvSistMet {
  public static void main(String[] args) {
    // Variables
    double pies;
    Double metros;
    Double mts;

      Scanner Scanner = new Scanner(System.in);
      System.out.println(" Escribe: \n1 - Para Convertir Pies a Metros \n2 - Para Convertir Metros A Pies \n0 - Para Terminar");
      int opcion = Scanner.nextInt();

      if (opcion > 0) {
        if (opcion == 1) {
          Scanner Scanner2 = new Scanner(System.in);
          System.out.println(" Digita La Cantidad De Pies: ");
          pies = Scanner2.nextDouble();
          metros = (pies / 3.28);
          System.out.println("El Resultado Es: " + metros + " mts");
          Scanner2.close();
        } else if (opcion == 2) {
          Scanner Scanner2 = new Scanner(System.in);
          System.out.println(" Digita La Cantidad De Metros: ");
          mts = Scanner2.nextDouble();
          pies = mts * 3.28;
          System.out.println("El Resultado Es: " + pies + " pies");
          Scanner2.close();
        }
        Scanner.close();
      }
  }
}
