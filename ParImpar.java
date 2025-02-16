import java.util.Scanner;

public class ParImpar {
    public static void main(String[] arg){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Introduce Un Numero");
        int numero = Scanner.nextInt();
        if (numero%2 == 0) {
            System.out.println("El Numero" + numero + " Es Par");
        }
            else{
                System.out.println("El Numero" + numero + " Es Impar");
            }
        Scanner.nextLine();
        Scanner.close();

    }
}
