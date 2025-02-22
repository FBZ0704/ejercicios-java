import java.util.Scanner;
// import java.math;

// Realizar un programa que solicite dos números enteros, los ordene en forma ascendente y los imprima.

public class OrdenAsc {
  public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    System.out.println(" Ingrese UN Numero Entero: ");
    int num1 = Scanner.nextInt();

    Scanner Scanner2 = new Scanner(System.in);
    System.out.println(" Ingrese Otro Numero Entero: ");
    int num2 = Scanner2.nextInt();

    if (num1 > num2) {
      System.out.println("Lista Ascendente \n" + num1 + "\n" + num2);
    }else if (num2 > num1) {
      System.out.println("Lista Ascendente \n" + num2 + "\n" + num1);
  }
  Scanner.close();
  Scanner2.close();
  }
}
