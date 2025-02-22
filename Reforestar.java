import java.util.Scanner;

/* El gobierno del estado de Bolívar desea reforestar un bosque que mide determinado número de hectáreas.
   Si la superficie del terreno excede a 1 millón de metros cuadrados, entonces decidirá sembrar de la siguiente manera:
   Porcentaje de la superficie del bosque                       Tipo de árbol
                  70%                                             araguaney
                  20%                                             samán
                  10%                                             ceiba
   Si la superficie del terreno es menor o igual a un millón de metros cuadrados, entonces decidirá sembrar de la
   siguiente manera:
   Porcentaje de la superficie del bosque                       Tipo de árbol
                  50%                                             araguaney
                  30%                                             samán
                  20%                                             ceiba
   El gobierno desea saber el número de araguaneyes, samanes y ceibas que tendrá que sembrar en el bosque, si
   se sabe que en 10 m2 caben 8 araguaneyes, en 15 m2 caben 15 samanes y en 18 m2 caben 10 ceibas. También
   se sabe que una hectárea equivale a 10.000 m2.
   */

public class Reforestar {
  public static void main(String[] args) {
    // Variables
    Double siembraAragua = 0.0;
    Double siembraSamanes = 0.0;
    Double siembraCeibas = 0.0;
    Double totalAragua, totalSamanes, totalCeibas;
    Double siembraTotal = 0.0;

    Scanner Scanner = new Scanner(System.in);
    System.out.println(" Por Favor Indique La Cantidad De Hectareas A Reforestar: ");
    Double areaTotal = Scanner.nextDouble();
    areaTotal = areaTotal * 10000;

    if (areaTotal > 1000000) {
      siembraAragua = areaTotal * 0.70;
      siembraSamanes = areaTotal * 0.20;
      siembraCeibas = areaTotal * 0.10;
    } else if (areaTotal <= 1000000) {
      siembraAragua = areaTotal * 0.50;
      siembraSamanes = areaTotal * 0.30;
      siembraCeibas = areaTotal * 0.20;
    }

    // Calculamos La Siembra De Arboles
    totalAragua = siembraAragua / 8;
    totalSamanes = siembraSamanes / 15;
    totalCeibas = siembraCeibas / 10;
    siembraTotal = totalAragua + totalSamanes + totalCeibas;
    System.out.println("La Reforestacion Queda Asi: \n Araguaney: " + totalAragua + "Plantas\nSamanes: " + totalSamanes
        + "Plantas\nCeibas: " + totalCeibas + "Plantas");
        System.out.println("Siembra Total De Arboles: " + siembraTotal + " Arboles");
    Scanner.close();
  }
}
