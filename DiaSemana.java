import java.util.Scanner;

// Solicitar al usuario la inicial del día de la semana y mostrar el nombre del día completo.
// La letra inicial puede ser Mayuscula O minuscula.
// Usar la x para el miércoles.

public class DiaSemana {
  public static void main(String[] args) {
    System.out.println("Digita La Letra Inicial Para El Dia que Deseas....Usa X para Miercoles");
    Scanner Scanner = new Scanner(System.in);

    String dia = Scanner.nextLine();
    dia = dia.toUpperCase();

    switch (dia) {
      case "L":
        System.out.println("El Dia Es: Lunes");
        break;
      case "M":
        System.out.println("El Dia Es: Martes");
        break;
      case "X":
        System.out.println("El Dia Es: Miercoles");
        break;
      case "J":
        System.out.println("El Dia Es: Jueves");
        break;
      case "V":
        System.out.println("El Dia Es: Viernes");
        break;
      case "S":
        System.out.println("El Dia Es: Sabado");
        break;
      case "D":
        System.out.println("El Dia Es: Domingo");
        break;
    }
    Scanner.close();
  }
}
