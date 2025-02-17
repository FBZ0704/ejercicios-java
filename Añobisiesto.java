import java.util.Scanner;

// Un año es bisiesto si es divisible por 4 y no es por 100, o si es divisible por 400. Escribe un programa que lea un año y devuelva si es bisiesto o no.

public class Añobisiesto {
  public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
        System.out.println("Por Favor Indique El Año Que Desea Probar?");
        
        float bisiesto = Scanner.nextInt();
        
        if ((bisiesto % 4 == 0 && bisiesto % 100 != 0) || (bisiesto % 400 == 0) ) {
          System.out.println("El Año: " + bisiesto + " Es Bisiesto");
        } else {
          System.out.println(" El Año: " + bisiesto + " No Es Bisiesto");
        }

        Scanner.nextInt();
        Scanner.close();
  }
}
