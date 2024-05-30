package com.mycompany.negativooupositivo;
import java.util.Scanner;
public class NegativoOuPositivo {
    public static void main(String[] args) {
   
    Scanner teclado = new Scanner(System.in);
    
    int num1;
    num1 = teclado.nextInt();
    
   if ( num1 > 0 ){
       System.out.println("positivo");
   }
   else{
   if (num1 == -4){
       System.out.println("definitivamente -4");
   }
   else{
    System.out.println("negativo");
           }}
   
    }
}
