/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USER_ASUS
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double contador = 0;
        double resultado = 0;
        int numerador = 1;
        String mensaje = "";
        
        
        while (contador <= 15 ) {
            resultado = (contador+1);
            mensaje = String.format("%s-%d/%.0f+ ",mensaje,numerador,resultado);
            contador = contador +2;
        }
    System.out.printf("%s",mensaje);
    }

}
