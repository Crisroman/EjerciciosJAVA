/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocinco;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioCinco {

    /**
     * @param args the command line arguments
     * se necesita pedir dos numeros y sumarlos, mostrar el resultado
     */
    public static void main(String[] args) {
        int numUno;
        int numDos;
        int suma;
        
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero.");
        numUno= miScanner.nextInt();
        System.out.println("Ingrese el segundo numero.");
        numDos= miScanner.nextInt();
        suma = numUno+numDos;
        
        System.out.println("La suma es: " + suma + ".");
             
        }
    
}
