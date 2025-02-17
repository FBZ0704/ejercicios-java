
import java.util.Scanner;

// Calcular el mayor de tres números enteros introducidos por teclado.

public class Elmayorde3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Introduzca Un Numero");
        int numero1 = Scanner.nextInt();

        Scanner Scanner2 = new Scanner(System.in);
        System.out.println("Introduzca Otro Numero");
        int numero2 = Scanner2.nextInt();

        Scanner Scanner3 = new Scanner(System.in);
        System.out.println("Introduzca Otro Numero");
        int numero3 = Scanner3.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println(" El Numero " + numero1 + " Es Mayor Que Los Otros: " + numero2 + " Y " + numero3);
        }else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println(" El Numero " + numero2 + " Es Mayor Que Los Otros: " + numero1 + " Y " + numero3);
        }else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println( "El Numero " + numero3 + " Es Mayor Que Los Otros: " + numero1 + " Y " + numero2);
        }
        Scanner.nextLine();
        Scanner.close();
        Scanner2.close();
        Scanner3.close();
    }
}
