/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotres;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioTres {

    /**
     * @param args the command line arguments
     * se debe pedir el nombre y el apellido, luego mostrarlo
     * en el siguiente mensaje:
     * su nombre es:xxx, y xxx es su apellido.
     */
    public static void main(String[] args) {
        String nombre;
        String apellido;
        Scanner miScanner=new Scanner(System.in);
        System.out.println("Ingrese nombre");
        nombre= miScanner.nextLine();
        System.out.println("Ingrese apellido");
        apellido= miScanner.nextLine();
        System.out.println("Su nombre es " +nombre +"," + "y su apellido es "+apellido+".");        
                     
    }
    
}
