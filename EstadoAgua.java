import java.util.Scanner;

// Determinar en que estado está el agua en función de su temperatura.
// Si es negativa el estado será sólido, si es menor que 100 será líquido y si es mayor que 100 será gas.
// Pedir al usuario el valor de la temperatura. 

public class EstadoAgua {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Por Favor Indique A Que Temperatura Esta El Agua?");
        
        int temperatura = Scanner.nextInt();
        if (temperatura <= 0) {
          System.out.println("El Agua Esta A: " + temperatura + " Grados Centigrados, Por Lo Tanto El Agua Esta En Estado Solido");
        }else if (temperatura > 0 && temperatura < 100) {
          System.out.println("El Agua Esta A: " + temperatura + "Grados Centigrados, Por Lo Tanto El Agua Esta En Estado Liquido");
        }if (temperatura >= 100) {
          System.out.println("El Agua Esta En Estado Gaseoso");
        }

        Scanner.nextInt();
        Scanner.close();
      }
}
