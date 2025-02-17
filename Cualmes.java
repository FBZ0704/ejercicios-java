import java.util.Scanner;

// Pedir un mes (número) y mostrar el nombre del mes.

public class Cualmes {
  public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Por Favor Indique El Numero Del Mes Que Desea?");
    int mes = Scanner.nextInt();

    switch (mes) {
      case 1:
        System.out.println("El Mes: " + mes + " Corresponde A Enero");
        break;
      case 2:
        System.out.println("El Mes: " + mes + " Corresponde A Febrero");
        break;
      case 3:
        System.out.println("El Mes: " + mes + " Corresponde A Marzo");
        break;
      case 4:
        System.out.println("El Mes: " + mes + " Corresponde A Abril");
        break;
      case 5:
        System.out.println("El Mes: " + mes + " Corresponde A Mayo");
        break;
      case 6:
        System.out.println("El Mes: " + mes + " Corresponde A Junio");
        break;
      case 7:
        System.out.println("El Mes: " + mes + " Corresponde A Julio");
        break;
      case 8:
        System.out.println("El Mes: " + mes + " Corresponde A Agosto");
        break;
      case 9:
        System.out.println("El Mes: " + mes + " Corresponde A Septiembre");
        break;
      case 10:
        System.out.println("El Mes: " + mes + " Corresponde A Octubre");
        break;
      case 11:
        System.out.println("El Mes: " + mes + " Corresponde A Noviembre");
        break;
        case 12:
        System.out.println("El Mes: " + mes + " Corresponde A Diciembre");
        break;
    }
    Scanner.nextLine();
    Scanner.close();
  }
}
