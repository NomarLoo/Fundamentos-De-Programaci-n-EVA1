/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eav1_14_formula.general;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EAV1_14_FORMULAGENERAL {
    
     
    public static void main(String[] args) {
        //Creamos las variables 
        int Num_a, Num_b, Num_c, x1, x2;
        
        //Introducion y recopilacion de datos de usuario 
        Scanner cap = new Scanner(System.in);
        System.out.println("Introdusca el valor (A):  ");
        Num_a = cap.nextInt();
        System.out.println("Introdusca el valor (B):  ");
        Num_b = cap.nextInt();
        System.out.println("Introdusca el valor (C):  ");
        Num_c = cap.nextInt();
        
        //Hacer el calculo 
        x1 = ((Num_b * -1) - (Math.round((Num_b * Num_b) - (4 * Num_a * Num_c)))) / (2 * Num_a);
        x2 = ((Num_b * -1) + (Math.round((Num_b * Num_b) - (4 * Num_a * Num_c)))) / (2 * Num_a);
        
        //Dar el resultado 
        System.out.println("X1 (-)= " + x1);
        System.out.println("X2 (+)= " + x2);
        
        
        
        
        
  
        // TODO code application logic here
    }
    
}
