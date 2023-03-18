/*Desarrollar un algoritmo,donde muestre la suma de los primeros numeros naturales
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma_for_java;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Suma_for_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0;
        Scanner sm = new Scanner (System.in);
        System.out.println("Por favor ingrese un numero:");
        numero = sm.nextInt();
        int suma = 0;
        for(int i=0;i<=numero;i++)
        suma = suma + i;
        {
        System.out.println("la suma de los numeros es :" + suma);
            
        }
        
        
       
    }
    
}
