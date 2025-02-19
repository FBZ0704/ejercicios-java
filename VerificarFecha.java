import java.util.Scanner;

/*  Solicitar al usuario una fecha (dd:mm:aaaa) y comprobar si es correcta. Para que una fecha sea
    correcta es necesario:

    · El año debe ser mayor que cero.
    · El mes debe estar entre 1 y 12.
    · Dependiendo del mes que sea, el día debe estar dentro de los límites válidos. Los meses que  
      tienen 31 días son 1, 3, 5, 7, 8, 10 y 12. Los meses de 30 días son 4, 6, 9 y 11. El mes de 28 días es 2, excepto en un año bisiesto que es 29 días. */

public class VerificarFecha {
  public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Por Favor Digita La Fecha (dd:mm:aaaa) Que Deseas verificar");
    String fecha = Scanner.nextLine();

    // Separamos Las fechas
    String[] datos = fecha.split(":");

    // Convertimos los datos de la fecha en valores numericos
    String dia = datos[0];
    String mes = datos[1];
    String año = datos[2];

    int dato1 = Integer.valueOf(dia);
    int dato2 = Integer.valueOf(mes);
    int dato3 = Integer.valueOf(año);

    // Verificamos Fecha Segun Lo Pedido
    if (dato3 > 0 && dato2 >= 1 && dato2 <= 12) {
      switch (dato2) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
          if (dato1 <= 31) {
            System.out.println("Fecha Valida");
          } else if (dato1 > 31) {
            System.out.println("Fecha Invalida");
          }
          break;
        case 4:
        case 6:
        case 9:
        case 11:
          if (dato1 <= 30) {
            System.out.println("Fecha Valida");
          } else if (dato1 > 30) {
            System.out.println("Fecha Invalida");
          }
          break;
        case 2:
          if (dato1 <= 28) {
            System.out.println("Fecha Valida");
          }
          if (dato1 > 29) {
            System.out.println("Fecha Invalida");
          }
          if (dato1 == 29) {
            float bisiesto = dato3;
            if ((bisiesto % 4 == 0 && bisiesto % 100 != 0) || (bisiesto % 400 == 0)) {
              System.out.println("Fecha valida Para Este Año Bisiesto");
            }
          }
      }
      Scanner.close();
    }
  }
}
