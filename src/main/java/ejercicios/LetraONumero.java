
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class LetraONumero {
    public static String evaluar(char caracter) {
        int n = (int) caracter; 

        if (n >= 65 && n <= 90) {
            return "Es letra mayúscula";
        } else if (n >= 97 && n <= 122) {
            return "Es letra minúscula";
        } else if (Character.isDigit(caracter)) {
            return "Es número";
        } else {
            return "No es letra ni número";
        }

    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Caracter:");
        char caracter = lector.next().charAt(0);
        
        String respuesta = evaluar(caracter);
        System.out.println(respuesta);
    }
}
