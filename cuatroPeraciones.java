import java.util.Scanner;

// Pedir al usuario un valor. Si el valor es positivo, pedir un segundo valor y calcular la suma, resta y producto de ambos.
// Mostrar los resultados por pantalla.

public class cuatroPeraciones {    

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Introduce Un Numero Entero");
        double numero1 = Scanner.nextInt();

        if (numero1 > 0) {
          Scanner Scanner2 = new Scanner(System.in);
            
          System.out.println("Introduzca otro numero");
          Double numero2 = Scanner.nextDouble();

          // Operaciones
          // Suma
          Double resulsuma = numero1 + numero2;
          Double resulresta = numero1 - numero2;
          Double resultpor = numero1 * numero2;
          double resultdiv = numero1 / numero2;

        System.out.println("La Suma De: " + numero1 + " + " + numero2 + " es:" + resulsuma);
        System.out.println("La Resta De: " + numero1 + " - " + numero2 + " es :" + resulresta);
        System.out.println("La Multiplicacion De: " + numero1 + " * " + numero2 + " es: " + resultpor);
        System.out.println("La Division De: " + numero1 + " / " + numero2 + " es :" + resultdiv);
        
        Scanner2.close();
        }
        else {
          System.out.println("El Numero Es menor De Cero. Numero Invalido");
        }        
        Scanner.nextLine();
        Scanner.close();
    }
}
