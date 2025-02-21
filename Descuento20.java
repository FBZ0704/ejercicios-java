import  java.util.Scanner;

/* En un almacén se hace un 20% de descuento a los clientes cuya compra supere los Bs. 1.000
   ¿Cual será la cantidad que pagará una persona por su compra? */

public class Descuento20 {
  public static void main(String[] args) {
    // Variables
    int valorCompra;
    Double descuento = 0.20;

    /*  Creamos Espacios En Memoria Para La Entrada De Informacion 
     * Pedimos La Informacion Al Usuario
     * Almacenamos La Informacion
     */
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Digite El Valor De La Compra: ");
    valorCompra = Scanner.nextInt();

    // Verficamos Si Hay Descuento
    Double valorDesc = valorCompra * descuento;
    if (valorCompra >= 1000) {
      System.out.println("El Valor De La Compra Es: " + valorCompra + " Bs");
      System.out.println("El Valor Del Descuento Es: " + valorDesc + " Bs");
      System.out.println("El Total A Pagar Es: " + (valorCompra - valorDesc) + " Bs");
    } else {
      System.out.println("El Valor De La Compra Es: " + valorCompra + " Bs");
      System.out.println("El Valor Del Descuento Es: 0 Bs");
      System.out.println("El Total A Pagar: " + valorCompra + " Bs");
    }
    Scanner.close();
  }
}
