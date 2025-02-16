import java.util.Scanner;

// Escribir un programa que solicite un valor entero al usuario y determine si es positivo o negativo. 

public class Posnegati {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Introduce Un Numero Entero");

        int numero = Scanner.nextInt();
        if (numero > 0) {
            System.out.println("El numero: " + numero + "Es Positivo");
        }else{
            System.out.println("El Numero: " + numero + "Es Negativo");
        }
        Scanner.nextLine();
        Scanner.close();
    }
}

