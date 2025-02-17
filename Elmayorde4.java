import java.util.Scanner;

public class Elmayorde4 {
   public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Introduzca Un Numero");
        int numero1 = Scanner.nextInt();

        Scanner Scanner2 = new Scanner(System.in);
        System.out.println("Introduzca Un Segundo Numero");
        int numero2 = Scanner2.nextInt();

        Scanner Scanner3 = new Scanner(System.in);
        System.out.println("Introduzca Un Tercer Numero");
        int numero3 = Scanner3.nextInt();

        Scanner Scanner4 = new Scanner(System.in);
        System.out.println("Introduzca Un Cuarto Numero");
        int numero4 = Scanner4.nextInt();

        if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4) {
            System.out.println(" El Numero " + numero1 + " Es Mayor Que Los Otros Tres: " + numero2 + ", " + numero3 + ", " + numero4);
        }else if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4) {
            System.out.println(" El Numero " + numero2 + " Es Mayor Que Los Otros Tres: " + numero1 + ", " + numero3 + ", " + numero4);
          } else if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4) {
            System.out.println("El Numero " + numero3 + " Es Mayor Que Los Otros Tres: " + numero1 + ", " + numero2 + ", " + numero4);
          } else {
            System.out.println("El Numero " + numero4 + " Es Mayor Que Los Otros Tres: " + numero1 + ", " + numero2 + "; " + numero3);
          }
        
          Scanner.nextLine();
          Scanner.close();
          Scanner2.close();
          Scanner3.close();
          Scanner4.close();
    }
}

