import java.util.Scanner;

/* La compañía que gestiona la autopista ha decidido cambiar las tarifas de peaje.
   Estas tarifas dependen del tipo de vehículo (camión o automóvil) que desee utilizar la autopista, del número de
   pasajeros que lleve y de la hora del día: en las horas de alta congestión los automóviles con tres pasajeros o más
   no pagan peaje, los camiones pagan 50 euros; en las horas menos congestionadas el peaje para los automóviles
   es de 25 euros y para los camiones es de 30 euros independientemente del número de pasajeros.
   Escriba un programa que leyendo el tipo de vehículo, tipo de hora (si la hora es de alta congestión o no) y el
   número de pasajeros, calcule la tarifa que le debe cobrar a un vehículo.
*/

public class Peaje {

  // Metodo main
  public static void main(String[] args) {
    // Variables
    int tipoVehiculo;
    int tipoHora;
    int nroPasajeros;
    int tarifaCamion_g = 50;
    int tarifaCamion_ng = 30;
    int tarifaAuto = 25;

    /*  Creamos Espacios En Memoria Para La Entrada De Informacion 
     * Pedimos La Informacion Al Usuario
     * Almacenamos La Informacion
     */
    Scanner Scanner3 = new Scanner(System.in);
    System.out.println("Digita El Tipo De Vehiculo: \n 1 - Para Camion \n 2 - Para Automovil");
    tipoVehiculo = Scanner3.nextInt();
    
    Scanner Scanner2 = new Scanner(System.in);
    System.out.println("Digita Tipo Hora: \n 1 - Para Congestion \n 2 - Para No Congestion");
    tipoHora = Scanner2.nextInt();

    Scanner Scanner = new Scanner(System.in);
    System.out.println("Digita El Numero De Pasajeros: ");
    nroPasajeros = Scanner.nextInt();

    if (tipoHora == 1) {
      if (tipoVehiculo == 1) {
        System.out.println("Tarifa Para Camion: " + tarifaCamion_g + " Euros");
      }
    } else if (tipoHora == 2) {
      if (tipoVehiculo == 1) {
        System.out.println("Tarifa Para Camion: " + tarifaCamion_ng + " Euros");
      }
    }
    
    if (tipoHora == 1) {
      if (tipoVehiculo == 2) {
        if (nroPasajeros >= 3) {
          System.out.println("Tarifa Para Automovil: No Paga Peaje");
        } else {
          System.out.println("Tarifa Para Automovil: " + tarifaAuto + " Euros");
        }
      }
    } else if (tipoHora == 2) {
      if (tipoVehiculo == 2) {
        System.out.println("Tarifa Para Automovil: " + tarifaAuto + " Euros");
      }
    }
    Scanner.close();
    Scanner2.close();
    Scanner3.close();
  }
}
