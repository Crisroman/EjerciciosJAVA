/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosiete;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioSiete {

    /**
     * @param args the command line arguments
     * se pide la base de un cuadrado y se informa el perimetro
     */
    public static void main(String[] args) {
        int base;
        int perimetro;
        Scanner miScanner=new Scanner(System.in);
        System.out.println("Ingrese base: ");
        base= miScanner.nextInt();
        perimetro= base*4;
        System.out.println("El perimetro del cuadrado es: " + perimetro+".");
        // TODO code application logic here
    }
    
}
