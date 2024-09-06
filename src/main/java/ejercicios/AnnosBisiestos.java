
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class AnnosBisiestos {
    public static String evaluar(int anno){
        int year = anno;

        if (year >= 1582) {
            if (year % 100 == 0 && year % 400 != 0) {
                return year + " no es bisiesto";
            } else if (year % 4 == 0) {
                return year + " es bisiesto";
            } else {
                return year + " no es bisiesto";
            }
        } else {
            if (year % 4 == 0) {
                return year + " es bisiesto";
            } else {
                return year + " no es bisiesto";
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(anno);
        System.out.println(respuesta);
    }
            
}
