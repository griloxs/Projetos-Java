package com.mycompany.exercicio_while;
import java.util.Scanner;
public class Exercicio_While {
    public static void main(String[] args) {
   
       
    Scanner teclado  = new Scanner(System.in);
    
    int x = teclado.nextInt();
    double soma = 0;
    
    while(x != 0){
        soma += x;
        x = teclado.nextInt();
        
        
        
    }
    teclado.close();
        System.out.println("A soma de todos os números é = "+ soma);
    
   
    
   
   
   
    
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    }
}
