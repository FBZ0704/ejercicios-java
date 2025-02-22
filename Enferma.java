import java.util.Scanner;

/* Una persona enferma, que pesa 70 Kg, se encuentra en reposo y desea saber cuantas calorías consume su
    cuerpo durante todo el tiempo que realice una misma actividad. Las actividades que tiene permitido realizar son
    únicamente dormir o estar sentado en reposo. Los datos que tiene son que estando dormido consume 1,08
    calorías por minuto y estando sentado en reposo consume 1,66 calorías por minuto.
*/

public class Enferma {
    public static void main(String[] args) {
        // Variables
        double dormir = 1.08;
        double sentado = 1.66;
        double calorias = 0.0;

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Por Favor Indique La Actividad A Realiar: \n1 - Para Dormir\n2 - Para Estar Sentado");
        int actividad = Scanner.nextInt();

        Scanner Scanner2 = new Scanner(System.in);
        System.out.println("Por Favor Indique Cuantos Minutos Va A Realizar En La Actividad: ");
        int tiempo = Scanner2.nextInt();
        
        if (actividad == 1) {
            calorias = dormir * tiempo;
            System.out.println("Consumo De: " + calorias + " Calorias Al Dormir " + tiempo + " Minutos");
        }else if (actividad == 2) {
            calorias = sentado * tiempo;
            System.out.println("Consumo De " + calorias + " Calorias Al Estar Sentado " + tiempo + " Minutos");
        }
        Scanner.close();
        Scanner2.close();
    }
}