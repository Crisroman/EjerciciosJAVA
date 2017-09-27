/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferreteriaferrete;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class FerreteriaFerrete {

    /**
     * @param args the command line arguments
     *  35- Las lámparas están al mismo precio de $35 pesos final. 
        A. Si compra 6 o más lamparitas bajo consumo tiene un descuento del 50%. 
        B. Si compra 5 lamparitas bajo consumo marca "ArgentinaLuz" se hace un descuento del 
        * 40 % y si es de otra marca el descuento es del 30%. 
        C. Si compra 4 lamparitas bajo consumo marca "ArgentinaLuz" o “FelipeLamparas” se hace un descuento del 25 % 
        * y si es de otra marca el descuento es del 20%. 
        D. Si compra 3 lamparitas bajo consumo marca "ArgentinaLuz" el descuento es del 15%, 
        * si es “FelipeLamparas” se hace un descuento del 10 % y si es de otra marca un 5%. 
        E. Si el importe final con descuento suma más de $120 se debe sumar un 10% de ingresos brutos 
        * e informar del impuesto con el siguiente mensaje:”IIBB Usted pago X”, siendo X el impuesto que se pagó.

     */
    public static void main(String[] args) {
            Integer cantLamparas;
            Integer precioXLampara=35;
            String marca;
            Double descuento;
            Double importeFinal= (double)0;
            String datoAuxCantidad;
            Integer precioBruto;
            
            Scanner miScanner = new Scanner(System.in);
            
            System.out.println("Ingrese la marca: ");
            marca= miScanner.next();
            
            System.out.println("Ingrese la cantidad de lamparas que desea comprar: ");
            datoAuxCantidad=miScanner.next();
            cantLamparas= Integer.parseInt(datoAuxCantidad);
            
            precioBruto=cantLamparas*precioXLampara;
            
            if (cantLamparas>=6)
            {
                importeFinal=precioBruto*0.5;
            }else
            {
                if (cantLamparas==5)
                {
                    if (marca.equals("ArgentinaLuz"))
                    {
                    importeFinal=precioBruto*0.6;
                    }else
                    {
                        importeFinal=precioBruto*0.7;
                    }
                }else
                {
                    if (cantLamparas==4)
                    {
                        if (marca.equals("ArgentinaLuz")|| marca.equals("FelipeLamparas"))
                        {
                            importeFinal=precioBruto*0.75;
                        }else 
                        {
                            importeFinal=precioBruto*0.80;
                        }//LLEGUE HASTA EL PUNTO C
                    }
                }
            }
            
            
            
            
            
            
            
            
            
            
            
            System.out.println("debe pagar: "+importeFinal);
          
    }
    
}
