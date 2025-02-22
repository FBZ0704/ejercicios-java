import java.util.Scanner;

/* Hacer un programa que imprima el nombre de un artículo, clave, precio original y su precio con descuento.
   El descuento lo hace en base a la clave, si la clave es 01 el descuento es del 10% y si la clave es 02
   el descuento en del 20% (solo existen dos claves).
*/

public class DescuentoArticulo {
    public static void main(String[] args) {

        // Variables
        double descuento;
        double total;
        

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Por Favor Diga Nombre Del Articulo: ");
        String articulo = Scanner.nextLine();

        Scanner Scanner2 = new Scanner(System.in);
        System.out.println("Por Favor Indique El Precio: ");
        int precio = Scanner2.nextInt();

        Scanner Scanner3 = new Scanner(System.in);
        System.out.println("Por Favor Digite La Clave: ");
        int clave = Scanner3.nextInt();

        if (clave == 1) {
            descuento = precio * 0.10;
            total = precio - descuento;
            System.out.println("Articulo: " + articulo);
            System.out.println("clave: " + clave);
            System.out.println("Precio Normal: " + precio);
            System.out.println("Precio Con Descuento: " + total);
        }else if (clave == 2) {
            descuento = precio * 0.20;
            total = precio - descuento;
            System.out.println("Articulo: " + articulo);
            System.out.println("clave: " + clave);
            System.out.println("Precio Normal: " + precio);
            System.out.println("Precio Con Descuento: " + total);
        }
        Scanner.close();
        Scanner2.close();
        Scanner3.close();
    }
}