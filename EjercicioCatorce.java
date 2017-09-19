/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocatorce;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioCatorce {

    /**
     * @param args the command line arguments
     * se pide ingresar una clave, si es "utn750", se mostrara el mensaje
     * bienvenido, de lo contrario, el mensaje sera clave erronea.
     */
    public static void main(String[] args) {
        String clave;
        
        Scanner miScanner=new Scanner(System.in);
        System.out.println("Ingrese clave: ");
        clave=miScanner.next();
        boolean respuesta;
        respuesta=clave.equals("utn750");
        /*
        15- se ingresa un importe, si supera los $100, se le suma un 23%, si es menor a $100,
        se le descuenta el 50%.
        16- se ingresa el importe de un pasaje de avion, y el mes de viaje, si es enero
        se le descuenta un 10% por temporada baja
        */
        if(clave.equals("utn750"))
        {
            System.out.println("Bienvenido.");        
        }else
        {
            System.out.println("Clave erronea.");
        }
}