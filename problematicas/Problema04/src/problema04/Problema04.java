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
        int contadorSigno = 1;
        double resultadoFinal = 0;
                
        String signo="";
        
        while (contador <= 15 ) {
            
             resultado = (contador+1);
            
            if (contadorSigno % 2==0){
              signo = "-";
              resultado = -(resultado);
            }else{
                signo = "+";
                resultado = +(resultado);
            }
            
           
            mensaje = String.format("%s%s%d/%.0f ",mensaje,signo,numerador,resultado);
            
            
        
            resultadoFinal = resultadoFinal + numerador/resultado;
            
            contador = contador + 2;
            contadorSigno = contadorSigno +1;
        }
    System.out.printf("%s\nRESULTADO: %.4f",mensaje,resultadoFinal);
    }

}
