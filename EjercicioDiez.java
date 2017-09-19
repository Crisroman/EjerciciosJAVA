/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodiez;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioDiez {

    /**
     * @param args the command line arguments
     * se ingresa la cantidad de ganadores de la loterria nacional
     * y el monto total del premio, informar cuanto le corresponde a cada
     * uno.
     */
    public static void main(String[] args) {
        String datoAux;
        Integer cantGanadores;
        Double premioTotal;
        Double dineroPcU;
        
        Scanner miScanner=new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de ganadores de la loteria nacional: ");
        datoAux=miScanner.next();
        cantGanadores= Integer.parseInt(datoAux); 
        
        System.out.println("Ingrese el monto total del premio de la loteria: ");
        datoAux=miScanner.next();
        premioTotal= Double.parseDouble(datoAux); 
        
        dineroPcU= premioTotal/cantGanadores;
        System.out.println("El dinero que le corresponde a cada uno es: "+dineroPcU);
            
        
        
        
        
        // TODO code application logic here
    }
    
}
