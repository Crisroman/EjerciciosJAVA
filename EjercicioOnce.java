/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioonce;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioOnce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String datoAux;
        Double valorHora;
        Double cantHoras;
        Double sueldo;
        Double sueldoFinal;
        Double descuentoAportes;
        
        Scanner miScanner=new Scanner(System.in);
        System.out.println("Ingrese el valor en $ de la hora trabajada: ");
        datoAux=miScanner.next();
        valorHora=Double.parseDouble(datoAux);
        
        System.out.println("Ingrese cantidad de horas trabajadas: ");
        datoAux=miScanner.next();
        cantHoras=Double.parseDouble(datoAux); 
        
        sueldo= valorHora*cantHoras;
        descuentoAportes= sueldo*0.15;
        sueldoFinal=sueldo-descuentoAportes;
        
        System.out.println("El sueldo final es de: "+sueldoFinal);
        
        // TODO code application logic here
    }
    
}
