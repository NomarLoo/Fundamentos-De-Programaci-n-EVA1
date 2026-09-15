/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_operaciones;

/**
 *
 * @author bisonte
 */
public class EVA1_7_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    int suma, val1, val2; //declarp 3 variables del mismo tipo
    
    // = -->asignacion poner el valor
    // == comparación
    val1 = 100; //asignar el valor de 100 en la variable val1
    val2 = 50;
suma = val1 + val2; //exprecion, asignar a la variable suma la operacion entre vval1 y val2 (+)
//+ --> esta enrtre dos enteros, se interpreta como los que debe sumar

System.out.print("val1 =");
System.out.println(val1);
System.out.print("val2 =");
System.out.println(val2);
System.out.print("suma =");
System.out.println(suma);

int multi;
multi = val1 * val2;
System.out.print("Multiplicacion");
System.out.println(multi);
//division
// / --> operador de division

int divi;
divi = val1 / val2;
System.out.print("Division");
System.out.println(divi);
val1 = 10;
val2 = 3;
divi = val1 / val2;
System.out.print("val1 =");
System.out.println(val1);
System.out.print("val2 =");
System.out.println(val2);
System.out.print("Division =");
System.out.println(divi);
double resu;
resu = val1 / val2;
System.out.print("Resu =");
System.out.println(resu);
double val2copia;
val2copia = 3;
resu = val1 / val2copia;
System.out.print("Resu =");
System.out.println(resu);

    }
    
}
