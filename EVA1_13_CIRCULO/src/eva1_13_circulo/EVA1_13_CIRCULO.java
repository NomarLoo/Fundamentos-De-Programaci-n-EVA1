/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_circulo;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_13_CIRCULO {

    /**static final double PI = 3.1416; //Variable bloqueada, ya no puede cambira, se combierte en una constante 
    static final String ME = "Radio"; //Una constante que tiene como valor un texto

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos las variables
        double rad, peri, area, vol;
        
        //Introducion
        System.out.println("Valor de radio en (cm): ");
        
        //Capturamos los valores de las variables
        Scanner cap = new Scanner(System.in);
       
        rad = cap.nextDouble();
        
        //Imprime el valor de pi con mas precicion
        System.out.println(Math.PI);
        
        //Con la funcion "Math" se puede poner al exponente
        System.out.println(Math.powExact(2, 2));
        
        //Hacemos calculo
        peri = (2 * PI) * rad;
        area = PI * (rad * rad);
        vol = (4/3.0) * PI * (rad * rad * rad);
        
        
        //Imprimimos los resultados
        System.out.println("El perimeto: " + peri + "cm" );
        System.out.println("El Area: " + area + "cm^2");
        System.out.println("El volumen: " + vol + "cm^3");
        
        // TODO code application logic here
    }
  
    }
    

