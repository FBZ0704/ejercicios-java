import java.util.Scanner;

/*  Una empresa de préstamos decidió cambiar su esquema de cobros así:
· Si el préstamo es de más de 5000 euros, cobra en tres cuotas
· Si el préstamo es de menos de 1000 euros, cobra en una cuota
· Si el préstamo es entre 2000 y 3000 euros cobra en dos cuotas
· En los demás casos cobra en cinco cuotas
Adicionalmente, si es de menos de 4000 euros cobra el 12% de interés, en caso contrario cobra el 10% de interés.
El programa debe decir en cuántas cuotas debe pagar y de cuánto es cada cuota. Para ello, se calcula el valor
total de la deuda con interés y se divide en cuotas iguales.*/

public class Prestamos {
  public static void main(String[] args) {

    // Declaramos Variables
    int cantCuotas = 0;
    double interes = 0.0;
    double valorCuota = 0;
    int valorPrestamo = 0;
    double valorTotalDeuda = 0;

    // Solicitamos Al Usuario El Valor Del Prestamo Y Lo Almacenamos
    Scanner Scanner = new Scanner(System.in);
    System.out.println("POr Favor Digita El Valor Del Prestamo: ");
    valorPrestamo = Scanner.nextInt();

    // Asignamos El Porcentaje
    if (valorPrestamo < 4000) {
      interes = 0.12;
    } else {
      interes = 0.10;
    }

    // Determinamos Cantidad De Cuotas
    if (valorPrestamo > 5000) {
      cantCuotas = 3;
    } else if (valorPrestamo < 1000) {
      cantCuotas = 1;
    } else if (valorPrestamo >= 2000 && valorPrestamo <= 3000) {
      cantCuotas = 2;
    } else if (valorPrestamo >= 1000 && valorPrestamo < 2000) {
      cantCuotas = 5;
    } else if (valorPrestamo > 3000 && valorPrestamo <= 5000) {
      cantCuotas = 5;
    }

    // Calculamos El Valor De La Cuota
    valorTotalDeuda = valorPrestamo + (valorPrestamo * interes);
    valorCuota = valorTotalDeuda / cantCuotas;

    // Resultados
    System.out.println("El Valor Total De La Deuda Con Interes Es: $" + valorTotalDeuda + " Euros");
    System.out.println("La Deuda Se Paga En: " + cantCuotas + " Cuotas");
    System.out.println("El Valor De La Cuota Es De: $" + valorCuota + " Euros");

    Scanner.close();
  }
}
