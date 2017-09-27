/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteracionwhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class IteracionWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String clave;
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese clave: ");
        clave=miScanner.next();
        
        while (!clave.equals("1234"))
        {
            System.out.println("Clave incorrecta. Reingrese clave: ");
            clave=miScanner.next();
        }
        System.out.println("Bienvenido.");
             
        Integer miContador=0;
        
        while (miContador<10)
        {
            System.out.println( miContador+"... Contando");
            miContador=miContador+1;
        }
        System.out.println("Terminé");
        
        // TODO code application logic here
    }
    
}
