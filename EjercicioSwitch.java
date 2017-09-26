/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswitch;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mes;
        String vacaciones;
        Integer edad; 
        String datoAux;
        
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Vas de vacaciones?");
        vacaciones=miScanner.next();
        
        System.out.println("Ingrese edad: ");
        datoAux=miScanner.next();
        edad=Integer.parseInt(datoAux);
        
        if (vacaciones.equals("si"))
        { 
        System.out.println("Ingrese mes del año: ");
        mes=miScanner.next();
        switch (mes)
        {
            case "enero":
            case "febrero":   
                System.out.println("Lindo verano");
                break;
            case "julio": 
               if (edad>80){
               System.out.println("Vacunese contra la gripe."+" Que tenga lindas vacaciones.");
               }break; 
            default:
                System.out.println("No es verano");
                break;
                       
                
        }
        }
    }
        
}
