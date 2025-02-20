import java.util.Scanner;

// Dada la fecha de hoy, calcular la fecha del día siguiente. Suponer que el año no es bisiesto.

public class Diasiguiente {
  public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Por Favor Digita La Fecha De Hoy (dd/mm/aaaa): ");
    String fecha = Scanner.nextLine();

    // Separamos Las fechas
    String[] datos = fecha.split("/");
    String dia = datos[0];
    String mes = datos[1];
    String año = datos[2];

    // Convertimos los datos de la fecha en valores numericos
    int dato1 = Integer.valueOf(dia);
    int dato2 = Integer.valueOf(mes);
    int dato3 = Integer.valueOf(año);

    // calculamos la fecha del dia siguiente
    dato1 = dato1 + 1;

     //Resultado
     System.out.println("Mañana Sera: " + dato1 + "/" + dato2 + "/" + dato3);
    
     Scanner.close();
  }
}