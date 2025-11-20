/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USER_ASUS
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int contador =1;
        String mensaje = "";
        int resultado;
        
        
        while(contador<=10){
            
            resultado = contador*(contador+1);
            mensaje = String.format("%s%d\n",mensaje,resultado);
            
            contador = contador + 1;
            
        }
        System.out.printf("%s",mensaje);
    }
    
}
