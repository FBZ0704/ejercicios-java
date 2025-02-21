import java.util.Scanner;

/*  Calcular el salario neto de un trabajador de una empresa cuyo trabajo se paga por horas. 
  Introducir por teclado el número de horas y el precio de la hora. El cálculo se realiza del siguiente modo:
· Las primeras 35 horas de cada semana se pagan a la tarifa normal (suponer 4 semanas al mes).
· Las horas extras se pagan un 50% más que las normales.
· Los impuestos a deducir a los trabajadores varían en función de su sueldo mensual 
  (considerando las horas extras trabajadas):
o Si el sueldo es menor de € 600, libre de impuestos.
o Si el sueldo está entre € 600 y € 1000, los impuestos son el 20%.
o Si el sueldo es mayor de € 1000, el 30%.
*/

public class SalarioNeto {
  public static void main(String[] args) {
    // Variables
    double valorHora = 0;
    double valorHoraExtra = 0;
    double horasNormales = 0;
    double horasExtras = 0;
    int htSemana = 1;
    double salarioBruto = 0;
    double salarioNeto = 0;
    double impuestos = 0;
    
    
    /*  Creamos Los Espacios En Memoria Para La Entrada De Informacion 
     * Pedimos La Informacion Al Usuario
     * Almacenamos La Informacion
    */
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Digita El Valor De La Hora: ");
    valorHora = Scanner.nextInt();
    valorHoraExtra = valorHora * 1.5;

    Scanner Scanner1 = new Scanner(System.in);
    System.out.println("Digita El Numero De Horas trabajadas En La Semana 1: ");
    int semana1 = Scanner1.nextInt();

    Scanner Scanner2 = new Scanner(System.in);
    System.out.println("Digita El Numero De Horas trabajadas En La Semana 2: ");
    int semana2 = Scanner2.nextInt();

    Scanner Scanner3 = new Scanner(System.in);
    System.out.println("Digita El Numero De Horas trabajadas En La Semana 3: ");
    int semana3 = Scanner3.nextInt();

    Scanner Scanner4 = new Scanner(System.in);
    System.out.println("Digita El Numero De Horas trabajadas En La Semana 4: ");
    int semana4 = Scanner4.nextInt();

    // Calculamos Las Horas Semanales Trabajadas
    for (int i = 1; i <= 4; i++) {
      switch (htSemana) {
        case 1:
          if (semana1 >= 35) {
            horasNormales = horasNormales + 35;
            horasExtras = horasExtras + (semana1 - 35);
          } else if (semana1 < 35) {
            horasNormales = horasNormales + semana1;
          }
          break;
        case 2:
          if (semana2 >= 35) {
            horasNormales = horasNormales + 35;
            horasExtras = horasExtras + (semana2 - 35);
          } else if (semana2 < 35) {
            horasNormales = horasNormales + semana2;
          }

          break;
        case 3:
          if (semana3 >= 35) {
            horasNormales = horasNormales + 35;
            horasExtras = horasExtras + (semana3 - 35);
          } else if (semana3 < 35) {
            horasNormales = horasNormales + semana3;
          }

          break;
        case 4:
          if (semana4 >= 35) {
            horasNormales = horasNormales + 35;
            horasExtras = horasExtras + (semana4 - 35);
          } else if (semana4 < 35) {
            horasNormales = horasNormales + semana4;
          }

          break;
      }
      htSemana++;
    }
    
    // Salario Neto A Pagar
    salarioBruto = (horasNormales * valorHora) + (horasExtras * valorHoraExtra);

    System.out.println("Valor De La Hora: $" + valorHora);
    System.out.println("Numero De Horas trabajadas En La Semana 1: " + semana1 + " Horas");
    System.out.println("Numero De Horas trabajadas En La Semana 2: " + semana2 + " Horas");
    System.out.println("Numero De Horas trabajadas En La Semana 3: " + semana3 + " Horas");
    System.out.println("Numero De Horas trabajadas En La Semana 4: " + semana4 + " Horas");
    System.out.println("Horas Normales Trabajadas: " + horasNormales);
    System.out.println("Horas Extras Trabajadas: " + horasExtras);
    System.out.println("Valor Horas Normales Trabajadas: " + (horasNormales * valorHora));
    System.out.println("Valor Horas Extras Trabajadas: " + (horasExtras * valorHoraExtra));

    // Calculamos El salario Bruto Y El Salario Neto
    if (salarioBruto > 1000) {
      impuestos = salarioBruto * 0.30;
      salarioNeto = salarioBruto - impuestos;
    }else if (salarioBruto >= 600 && salarioBruto <= 1000) {
      impuestos = salarioBruto * 0.20;
      salarioNeto = salarioBruto - impuestos;
    } else if (salarioBruto < 600) {
      salarioNeto = salarioBruto;
    }


    System.out.println("Total A Pagar: \n");
    System.out.println("Salario Bruto: \n" + salarioBruto + " Euros");
    System.out.println("Impuestos: \n" + impuestos + " Euros");
    System.out.println("Salario Neto:  \n" + salarioNeto + " Euros");
    
    Scanner.close();
    Scanner1.close();
    Scanner2.close();
    Scanner3.close();
    Scanner4.close();
  }
}
