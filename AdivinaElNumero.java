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
        Integer diferencia;
        Integer numeroSecreto;
        String datoAux;
        String datoAuxDos;
        Scanner miScanner = new Scanner(System.in);
        Random aleatorio = new Random(System.currentTimeMillis());
         
        System.out.println("Ingrese el numero");
        datoAux=miScanner.next();
        numeroSecreto=Integer.parseInt(datoAux);
        
        int intAleatorio =aleatorio.nextInt(10);
        aleatorio.setSeed(System.currentTimeMillis());
        System.out.println("El numero secreto es: "+intAleatorio); 
         
        if (intAleatorio==numeroSecreto) 
        {            
            System.out.println("Ganaste!");
        }else 
            {
                if (intAleatorio>numeroSecreto)
                {
                    System.out.println("Te falto");
                    diferencia=intAleatorio-numeroSecreto;
                }else
                {
                    System.out.println("Te pasaste");
                    diferencia=numeroSecreto-intAleatorio;
                }
                switch (diferencia)
                {
                    
                    case 1 :
                          System.out.println("Casi casi.");
                          break;
                    case 2 : 
                        System.out.println("Cerca");
                        break;
                    case 3 :
                        System.out.println("Ni cerca");
                        break;
                    case 4 :
                        System.out.println("Bien lejos");
                        break;
                    default : 
                        System.out.println("Sos horrible en este juego");
                        break;
                }
            }
    }
}
    

