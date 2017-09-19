/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodoce;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioDoce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String datoAux;
        Double importe;
        Double total;
        Double impuesto;
         
        Scanner miScanner=new Scanner(System.in);
        System.out.println("Ingrese el importe del producto: ");
        datoAux=miScanner.next();
        importe= Double.parseDouble(datoAux);
        
        impuesto= importe*0.35;
        
        total= importe+impuesto;
        
        System.out.println("El total es: "+total);
        
        
        // TODO code application logic here
    }
    
}
