import java.util.Scanner;

/* El dueño de una papelería desea un programa que le indique el precio de venta de un artículo dado.
   El precio se calcula de acuerdo con la siguiente fórmula: PVP = precio_coste + ganancia. Donde la ganancia será:
· El 15% si el precio de coste es inferior Bs. 3.
· 50 céntimos si el precio de coste está entre Bs. 3 y Bs. 6.
· El 25% si el precio de coste supera los Bs. 6. */

public class Papeleria {
  public static void main(String[] args) {
    // Declaramos Variables
    Double ganancia = 0.0;
    Double precio_coste;
    String articulo = "";
    Double pvp = 0.0;

    // Asignamos El Nombre Del Articulo
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Por Favor Digita El Nombre Del Articulo: ");
    articulo = Scanner.nextLine();

    // Asignamos El Valor Del Costo Del Articulo
    Scanner Scanner2 = new Scanner(System.in);
    System.out.println("Por Favor Digita El Valor(Costo) Del Articulo: ");
    precio_coste = Scanner2.nextDouble();

    // Calculamos La ganancia
    if (precio_coste < 3) {
      ganancia = precio_coste * 0.15;
      pvp = precio_coste + ganancia;
      System.out.println("El PVP Del Articulo: " + articulo + " Es: " + pvp + " BsF");
    } else if (precio_coste >= 3 && precio_coste <= 6) {
      ganancia = 0.5;
      pvp = precio_coste + ganancia;
      System.out.println("El PVP Del Articulo: " + articulo + " Es: " + pvp + " BsF");
    } else if (precio_coste > 6) {
      ganancia = precio_coste * 0.25;
      pvp = precio_coste + ganancia;
      System.out.println("El PVP Del Articulo: " + articulo + " Es: " + pvp + " BsF");
    }
    Scanner.close();
    Scanner2.close();
  }
}
