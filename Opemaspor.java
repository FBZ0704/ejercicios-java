import java.util.Scanner;

// Pedir al usuario un valor. Si el valor es positivo, pedir un segundo valor y calcular la suma, resta y producto de ambos.
// Mostrar los resultados por pantalla.

public class Opemaspor {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Introduce Un Numero Entero");
        
        int numero1 = Scanner.nextInt();
        if (numero1 > 0) {
            Scanner Scanner2 = new Scanner(System.in);
            System.out.println("Introduzca otro numero");
            int numero2 = Scanner2.nextInt();

            // Operaciones
            // Suma
            int resulsuma = numero1 + numero2;
            int resulresta = numero1 - numero2;
            int resultpor = numero1 * numero2;

        System.out.println("La Suma De: " + numero1 + " + " + numero2 + " es:" + resulsuma);
        System.out.println("La Resta De: " + numero1 + " - " + numero2 + " es :" + resulresta);
        System.out.println("La Multiplicacion De: " + numero1 + " * "  + numero2 + " es: " + resultpor);

        Scanner2.close();
        }
        else{
            System.out.println("El Numero Es menor De Cero. Numero Invalido");
        }

        Scanner.nextLine();
        Scanner.close();
    }
}
