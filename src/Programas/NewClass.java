package Programas;

import java.util.Scanner;


public class NewClass {
  
    public static void main(String[] args) {
       int num1,num2,aux;
       
       Scanner lectura=new Scanner (System.in);
       
       System.out.println("Ingrese numero 1");
       num1=lectura.nextInt();
       
       System.out.println("Ingrese numero 2");
       num2=lectura.nextInt();
       
       System.out.println("antes:"+num1);
       System.out.println(num2);
       
       aux=num2;
       num2=num1;
       num1=aux;
        
         System.out.println("despues"+num1);
       System.out.println(num2);
    }
}
