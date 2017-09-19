/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuatro;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioCuatro {

    /**
     * @param args the command line arguments
     * al ingresar la edad y el nombre mostrar
     * el siguiente mensaje usted se llama xxx y tiene xx años de edad
     */
    public static void main(String[] args) {
        String nombre;
        int edad;
        Scanner miScanner=new Scanner(System.in);
        System.out.println("Ingrese nombre");
        nombre= miScanner.nextLine();
        System.out.println("Ingrese edad");
        edad= miScanner.nextInt();
        System.out.println("Su nombre es " +nombre +"," + "y su edad es "+edad+"."); 
        
        // TODO code application logic here
    }
    
}
