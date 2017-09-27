/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infonumerica;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class InfoNumerica {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
       /**se brinda la informacion sobre un numero ingresado
        * modulo%
        * DEMOSTRACION DE FUNCIONAMIENTO DEL MODULO
       */
       /*Integer numeroUno;
       Integer numeroDos;
       Integer resultado;
       numeroUno=2;
       numeroDos=10;
       resultado=2%10;
       System.out.println("el resultado de 2%10 es:"+resultado);
       resultado=10%2;
       System.out.println("el resultado de 10 %2 es:"+resultado);*/
       Integer numeroIngresado;
       String datoAux;
       Scanner miScanner = new Scanner(System.in);
       System.out.println("Ingrese un numero: ");
       datoAux= miScanner.next();
       numeroIngresado=Integer.parseInt(datoAux);
       
       if (numeroIngresado>100)
          {
              System.out.println("El numero ingresado es mayor a cien.");
          }else {
                    if (numeroIngresado<100)
                    {
                        System.out.println("el numero ingresado es menor a cien");
                    }
                
                }
            if(numeroIngresado>0)
                {
                    System.out.println("es positivo");
                }else 
                 {
                     if (numeroIngresado<0)
                     {
                        System.out.println("es negativo");
                     }
                     
                 }
            if(numeroIngresado%2==0)
                {
                    System.out.println("El numero ingresado es par.");
                }else 
                {
                System.out.println("El numero ingresado es impar.");
                }
    }
}
//1-INFORMAR SI ES MAYOR O MENOR A 100
//2-DEVOLVER SI ES POSITIVO O NEGATIVO
//3-INFORMAR SI ES PAR
       