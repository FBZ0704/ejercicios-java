import java.util.Scanner;

/* Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
· Si trabaja 40 horas o menos se le paga Bs. 16 por hora.
· Si trabaja más de 40 horas se le paga Bs. 16 por cada una de las primeras 40 horas y Bs. 20 por cada hora
extra.
*/

public class SalarioObrero {
  public static void main(String[] args) {
    // Variables
    double valorHora = 16;
    double valorHoraExtra = 20;
    double horasTrabajadas;
    double horasNormales = 0;
    double horasExtras = 0;
    double salario = 0;

    /*  Creamos Los Espacios En Memoria Para La Entrada De Informacion 
     * Pedimos La Informacion Al Usuario
     * Almacenamos La Informacion
    */
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Digita El Valor De Las Horas Trabajadas: ");
    horasTrabajadas = Scanner.nextInt();

    // Calculamos Las Horas Trabajadas
    if (horasTrabajadas > 40) {
      horasNormales = 40;
      horasExtras = horasTrabajadas - horasNormales;
      salario = (horasNormales * valorHora) + (horasExtras * valorHoraExtra);
    } else {
      horasNormales = horasTrabajadas;
      salario = horasNormales * valorHora;
    }
    System.out.println("Horas Trabajadas: " + horasTrabajadas);
    System.out.println("Horas Normales: " + horasNormales);
    System.out.println("Horas Extras: " + horasExtras);
    System.out.println("El Salario Es: " + salario);
    Scanner.close();
  }
}
