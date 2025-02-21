import java.util.Scanner;

/* La Dirección General de Tráfico necesita un programa que mida el índice alcohólico;
   dado el tipo de vehículo que conduce un conductor, determine si da positivo en el control de alcoholemia o no.
   La tasa máxima de alcohol según el tipo de vehículo se resume en la siguiente tabla:

   Vehículo Indicador Tasa máxima
   Camión       C         0.3
   Autobús      A         0.3
   Turismo      T         0.5
   Motocicleta  M         0.3
*/

public class IndiceAlcho {
  public static void main(String[] args) {
    // Variables
    Double indiceAlchool = 0.0;
    String tipoVehiculo;

    /*  Creamos Espacios En Memoria Para La Entrada De Informacion 
     * Pedimos La Informacion Al Usuario
     * Almacenamos La Informacion
    */

    // Tipo Vehiculo
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Digita El Tipo De Vehiculo: \n C - Para Camion \n A - Para Autobus \n T - Para Turimo \n M - Para Motocicleta");
    tipoVehiculo = Scanner.nextLine();
    tipoVehiculo = tipoVehiculo.toLowerCase();
    
    // Indice De Alchool
    Scanner Scanner2 = new Scanner(System.in);
    System.out.println("Digita El Indice De Alchool: ");
    indiceAlchool = Scanner2.nextDouble();

    switch (tipoVehiculo){
      case "c":
        if (indiceAlchool >= 0.3) {
          System.out.println("Tipo Vehiculo: " + tipoVehiculo);
          System.out.println("Indice Alchool: " + indiceAlchool + " POSITIVO");
        } else {
          System.out.println("Tipo Vehiculo: " + tipoVehiculo);
          System.out.println("Indice Alchool: " + indiceAlchool +" NEGATIVO");
        }
        break;
      case "a": 
        if (indiceAlchool > 0.3) {
          System.out.println("Tipo Vehiculo: " + tipoVehiculo);
          System.out.println("Indice Alchool: " + indiceAlchool + " POSITIVO");
        } else {
          System.out.println("Tipo Vehiculo: " + tipoVehiculo);
          System.out.println("Indice Alchool: " + indiceAlchool +" NEGATIVO");
        }
        break;
      case "t":
        if (indiceAlchool > 0.5) {
          System.out.println("Tipo Vehiculo: " + tipoVehiculo);
          System.out.println("Indice Alchool: " + indiceAlchool + " POSITIVO");
        } else {
          System.out.println("Tipo Vehiculo: " + tipoVehiculo);
          System.out.println("Indice Alchool: " + indiceAlchool +" NEGATIVO");
        }
        break;
      case "m":
        if (indiceAlchool > 0.3) {
          System.out.println("Tipo Vehiculo: " + tipoVehiculo);
          System.out.println("Indice Alchool: " + indiceAlchool + " POSITIVO");
        } else {
          System.out.println("Tipo Vehiculo: " + tipoVehiculo);
          System.out.println("Indice Alchool: " + indiceAlchool +" NEGATIVO");
        }
        break;
      }
    Scanner.close();
    Scanner2.close();
  }
}
