/*
La nota final del curso de Desarrollo de aplicaciones móviles está dividido en 
5 partes: Quices y seguimiento 20%, Prácticas de laboratorio 30%, Exposiciones 
10%, Proyecto I 15% y Proyecto Final el 25%, desarrolle un programa en java que 
permita calcular la nota final de un estudiante del curso. Después de calcular 
la nota final el programa imprimirá lo siguiente dependiendo de la nota:

 */
package punto5laboratorio1;

/**
 *
 * @author sebastian
 */

import java.util.Scanner;

public class Punto5laboratorio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        float nota1, nota2, nota3, nota4, nota5, notafinal;
        
        System.out.println("digite la nota de los quices y seguimiento");
        nota1 = lector.nextFloat();
        
        System.out.println("digite la nota de las practicas de la boratorio");
        nota2 = lector.nextFloat();
        
        System.out.println("digite la nota de las exposiciones");
        nota3 = lector.nextFloat();        

        System.out.println("digite la nota del proyecto inicial");
        nota4 = lector.nextFloat();        

        System.out.println("digite la nota del protecto final");
        nota5 = lector.nextFloat();  
        
        notafinal = (float) (nota1*0.2 + nota2*0.3 + nota3* 0.1+ nota4*0.15+ nota5*0.25);
        
        if (notafinal >= 0 && notafinal <= 1){
            System.out.println("Estas en el lugar equivocado");
        }
        else if (notafinal >= 1.1 && notafinal <= 2){
            System.out.println("Remal");
        }
        
        else if (notafinal >= 2.1 && notafinal <= 3){
            System.out.println("Es posible recuperarse");
        }
        
        else if (notafinal >= 3.1 && notafinal <= 4){
            System.out.println("Normalito");
        }
        else if (notafinal >= 4.1 && notafinal <= 4.5){
            System.out.println("Muy Bien");
        }
        else if (notafinal >= 4.6 && notafinal <= 5){
            System.out.println("Excelente estudiante");
        }
    }
    
}
