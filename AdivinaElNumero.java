/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnumero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class AdivinaElNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer numeroSecreto;
        String datoAux;
        Scanner miScanner = new Scanner(System.in);
        Random aleatorio = new Random(System.currentTimeMillis());
        
        int intAleatorio =aleatorio.nextInt(10);
        aleatorio.setSeed(System.currentTimeMillis());
        
        System.out.println("Ingrese el numero");
        datoAux=miScanner.next();
        numeroSecreto=Integer.parseInt(datoAux);
        if (intAleatorio==numeroSecreto) 
        {            
            System.out.println("Ganaste!");
        }
         
        else {
                System.out.println("Intente de nuevo");
                if (intAleatorio>numeroSecreto){
                    System.out.println("Te falto");
                }else{
                        System.out.println("Te pasaste");
                     }
             }
    }
}    