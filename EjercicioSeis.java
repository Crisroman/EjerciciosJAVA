/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseis;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioSeis {

    /**
     * @param args the command line arguments
     * se piden 3 numeros, informar el promedio.
     */
    public static void main(String[] args) {
        float numeroUno;
        float numeroDos;
        float numeroTres;
        float promedio;
        Scanner miScanner=new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        numeroUno =miScanner.nextFloat();
        System.out.println("Ingrese el segundo numero: ");
        numeroDos= miScanner.nextFloat();
        System.out.println("Ingrese el tercer numero: ");
        numeroTres = miScanner.nextFloat();
        promedio= (numeroUno+numeroDos+numeroTres)/3;
        System.out.println("El promedio es: "+promedio+".");
 

// TODO code application logic here
    }
    
}
