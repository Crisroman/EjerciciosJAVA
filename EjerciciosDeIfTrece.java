/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeiftrece;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjerciciosDeIfTrece {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String localidad;
        String color;
        Scanner miScanner = new Scanner(System.in);
                
        System.out.println("Ingrese color: ");
        color=miScanner.nextLine();
        System.out.println("Ingrese localidad: ");
        localidad=miScanner.nextLine();
         
         
        if (color.equals("rojo")&&localidad.equals("avellaneda")||localidad.equals("lanus"))
        {
            System.out.println("sos de independiente");
        }
        else
        {
            System.out.println("no sos de independiente");
        }
    }
}
