package Programas;

import java.lang.Math;
import java.util.Scanner;

public class Programa02{
    public static void main(String[]args){
      
        double catO,catA,H;
        Scanner lectura=new Scanner(System.in);
    
        System.out.println("Ingrese el cateto opuesto: ");
        catO=lectura.nextDouble();
        System.out.println("Ingrese el cateto adyacente: ");
        catA=lectura.nextDouble();
        
       // procesar datos 
       
        H=(double) Math.hypot(catO,catA);
        
          System.out.println("La hipotenusa es : "+H);
        
    }

}