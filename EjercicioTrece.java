/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotrece;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioTrece {

    /**
     * @param args the command line arguments
     * se ingresa una edad, y se informa si es mayor de edad
     */
    public static void main(String[] args) {
        Integer edad;
        String datoAux; 
        
        Scanner miScanner=new Scanner(System.in);
        System.out.println("Ingrese edad: ");
        datoAux=miScanner.next();
        edad=Integer.parseInt(datoAux);
        
         if (edad>17)
         {
             System.out.println("Es mayor de edad.");          
         }
         else
         {
             System.out.println("Es menor");
         }
