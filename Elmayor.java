import java.util.Scanner;

//Calcular el mayor de dos números enteros introducidos por teclado.

public class Elmayor {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Introduzca Un Numero");
        int numero1 = Scanner.nextInt();

        Scanner Scanner2 = new Scanner(System.in);
        System.out.println("Introduzca Otro Numero");
        int numero2 = Scanner2.nextInt();

        if (numero1 > numero2) {
            System.out.println(" El Numero " + numero1 + " Es mayor Que El Numero " + numero2);
        }else if (numero1 < numero2) {
            System.out.println(" El Numero " + numero1 + " Es menor Que El Numero " + numero2);
        }

        
        }

    }

