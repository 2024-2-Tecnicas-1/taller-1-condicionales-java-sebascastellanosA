package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        int a = numVictoriasA;
        int b = numVictoriasB;

        if (a >= 6 || b >= 6) {
            if (a < 7 && b < 7 && a == b) {
                return "Aún no termina";
            } else if (a == 6 && b + 2 <= a) {
                return "Ganó A";
            } else if (b == 6 && a + 2 <= b) {
                return "Ganó B";
            } else if ((b == 6 && a + 1 == b) || (a == 6 && b + 1 == a)) {
                return "Aún no termina";
            } else {
                if ((a == 7 && b == 6) || (a == 7 && b == 5)) {
                    return "Ganó A";
                } else if ((b == 7 && a == 5) || (b == 7 && a == 6)) {
                    return "Ganó B";
                } else {
                    return "Inválido";
                }
            }
        } else {
            return "Aún no termina";
        }
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();
        
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
