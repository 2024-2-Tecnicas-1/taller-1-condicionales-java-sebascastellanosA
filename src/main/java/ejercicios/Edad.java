
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;
import java.time.LocalDate;
/**
 *
 * @author danielsanchez
 */
public class Edad {
    public static String evaluar(int dia, int mes, int anno) {
        LocalDate currentDate = LocalDate.now();
        int a_day = currentDate.getDayOfMonth();
        int a_mes = currentDate.getMonthValue();
        int a_year = currentDate.getYear();
        
        int dif = a_year - anno;

        if (a_mes < mes && a_day < dia) {
            dif -= 1;
        }

        return "Usted tiene " + dif + " años";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}
