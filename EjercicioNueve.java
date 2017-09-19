/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionueve;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioNueve {

    /**
     * @param args the command line arguments
     * se ingresa la cantidad y precio de un producto
     * y se informa el total a pagar.
     * 
     */
    public static void main(String[] args) {
        String datoAux;
        Integer cantidad;
        Double precio; 
        Double total;
        
        Scanner miScanner=new Scanner(System.in);
        System.out.println("Ingrese cantidad: ");
        datoAux=miScanner.next();
        cantidad= Integer.parseInt(datoAux);
        
        System.out.println("Ingrese precio: ");
        datoAux=miScanner.next(); 
        precio=Double.parseDouble(datoAux);
                             
        total= precio*cantidad;
        
        System.out.println("El total a pagar es de : "+total);
        
        // TODO code application logic here
    }
    
}
