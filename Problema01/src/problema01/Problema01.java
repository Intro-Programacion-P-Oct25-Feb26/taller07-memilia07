/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USER_ASUS
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String posicion;
        double estatura;
        int edad;
        double edadProm = 0;
        double estaturaProm = 0;
        String mensaje = "";
        int contador = 1;
        String listadoe = "";

        while (contador <= 6) {
            System.out.println("Ingrese nombres");
            nombre = entrada.nextLine();

            System.out.println("Ingrese posicion de juego");
            posicion = entrada.nextLine();

            System.out.println("Ingrese edad");
            edad = entrada.nextInt();

            System.out.println("Ingrese estatura");
            estatura = entrada.nextDouble();
            
            edadProm = edadProm + edad;
            estaturaProm = estaturaProm + estatura;
            
            mensaje = String.format("%s%d.%s-%s-,edad%d,estatura %.2f\n",mensaje,
                    contador,nombre,posicion,edad,
                    estatura);
            
            listadoe = String.format("%s%d\n",listadoe,edad);
            
            entrada.nextLine();
            contador = contador + 1;

        }
        
        estaturaProm = estaturaProm / (contador -1);
        edadProm = edadProm / (contador-1);
        
        System.out.printf("Listado Jugadores\n%s\nListado de edades\n%s\nPromedio"
                + " de edades: %.1f\nPromedio de Estaturas: %.1f",mensaje,listadoe,edadProm,estaturaProm);
        
      

    }

}
