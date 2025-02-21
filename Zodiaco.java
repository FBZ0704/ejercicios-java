import java.util.Scanner;

/* Construir un programa que calcule y presente por pantalla el signo del zodiaco a partir de la introducción por
   teclado del día y mes de nacimiento como números enteros.

   Capricornio del........ 22 de diciembre al 20 de enero
   Acuario del............ 21 de enero al 19 de febrero
   Piscis del............. 20 de febrero al 20 de marzo
   Aries del.............. 21 de marzo al 19 de abril
   Tauro del.............. 20 de abril al 20 de mayo
   Géminis del............ 21 de mayo al 21 de junio
   Cáncer del............. 22 de junio al 21 de julio
   Leo del................ 22 de julio al 21 de agosto
   Virgo del.............. 22 de agosto al 22 de septiembre
   Libra del.............. 23 de septiembre al 22 de octubre
   Escorpio del........... 23 de octubre al 21 de noviembre
   Sagitario del.......... 22 de noviembre al 21 de diciembre
   */

public class Zodiaco {
  public static void main(String[] args) {
    // Variables
    int dia, mes;

    /*  Creamos Espacios En Memoria Para La Entrada De Informacion 
     * Pedimos La Informacion Al Usuario
     * Almacenamos La Informacion
     */
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Por Favor Digite Su Dia De nacimiento: ");
    dia = Scanner.nextInt();

    Scanner Scanner2 = new Scanner(System.in);
    System.out.println("Por Favor Digite El Mes De Su Nacimiento: ");
    mes = Scanner.nextInt();

    // Determinamos el Signo Zoodiacal
    switch (mes) {
      case 1:
        if (dia >= 21) {
          System.out.println("Tu Signo Zodiacal Es: Acuario");
        } else {
          System.out.println("Tu Signo Zodiacal Es: Capricornio");
        }
        break;
      case 2:
        if (dia >= 20) {
          System.out.println("Tu Signo Zodiacal Es: Piscis");
        } else {
          System.out.println("Tu Signo Zodiacal Es: Acuario");
        }
        break;
      case 3:
        if (dia >= 21) {
          System.out.println("Tu Signo Zodiacal Es: Aries");
        } else {
          System.out.println("Tu Signo Zodiacal Es: Piscis");
        }
        break;
      case 4:
        if (dia >= 20) {
          System.out.println("Tu Signo Zodiacal Es: Tauro");
        } else {
          System.out.println("Tu Signo Zodiacal Es: Aries");
        }
        break;
      case 5:
        if (dia >= 21) {
          System.out.println("Tu Signo Zodiacal Es: Geminis");
        } else {
          System.out.println("Tu Signo Zodiacal Es: Tauro");
        }
        break;
      case 6:
        if (dia >= 22) {
          System.out.println("Tu Signo Zodiacal Es: Cancer");
        } else {
          System.out.println("Tu Signo Zodiacal Es: Geminis");
        }
        break;
      case 7:
        if (dia >= 22) {
          System.out.println("Tu Signo Zodiacal Es: Leo");
        } else {
          System.out.println("Tu Signo Zodiacal Es: Cancer");
        }
        break;
      case 8:
        if (dia >= 21) {
          System.out.println("Tu Signo Zodiacal Es: Virgo");
        } else {
          System.out.println("Tu Signo Zodiacal Es: Leo");
        }
        break;
      case 9:
        if (dia >= 23) {
          System.out.println("Tu Signo Zodiacal Es: Libra");
        } else {
          System.out.println("Tu Signo Zodiacal Es: Virgo");
        }
        break;
      case 10:
        if (dia >= 23) {
          System.out.println("Tu Signo Zodiacal Es: Escorpion");
        } else {
          System.out.println("Tu Signo Zodiacal Es: Libra");
        }
        break;
      case 11:
        if (dia >= 23) {
          System.out.println("Tu Signo Zodiacal Es: Sagitario");
        } else {
          System.out.println("Tu Signo Zodiacal Es: Escorpion");
        }
        break;
      case 12:
        if (dia >= 22) {
          System.out.println("Tu Signo Zodiacal Es: Capricornio");
        } else {
          System.out.println("Tu Signo Zodiacal Es: Sagitario");
        }
        break;
    }
    Scanner.close();
    Scanner2.close();
  }
}
