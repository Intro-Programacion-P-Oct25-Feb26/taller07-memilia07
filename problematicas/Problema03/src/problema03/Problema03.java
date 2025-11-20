/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USER_ASUS
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double contador = 1;
        double resultado = 0;
        String mensaje = "";
        
        while (contador < 7) {

            resultado = Math.pow(contador, 2) +1;
            
            mensaje = String.format("%s%.0f\n", mensaje, resultado);

            contador = contador + 1;
        }
        System.out.printf("%s\n", mensaje);
    }

}
