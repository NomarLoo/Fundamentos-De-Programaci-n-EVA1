/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_temperatura3;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_12_TEMPERATURA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear variables 
        double tem, cel, fah;
        
        //Introducion
        System.out.println("Temperatura en Kelvin: ");
        
        //Capturar datos del usuario
        Scanner captu = new Scanner(System.in);
        tem = captu.nextDouble();
        
        //Hacer las operaciones 
        cel = tem - 273.15;
        fah = 1.8 * (tem - 273.15) + 32;
        
        //Soltar los esultados 
        System.out.println(tem + "K  " + cel + "C  ");
        System.out.println(tem + "K  " + fah + "F  ");
 
    }
    
}
