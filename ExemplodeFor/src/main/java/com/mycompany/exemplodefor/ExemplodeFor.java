package com.mycompany.exemplodefor;

import java.util.Scanner;

public class ExemplodeFor {
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner (System.in);
        System.out.println("Digite quantos número quer somar:");
    int n = teclado.nextInt();
    
    int soma = 0;
        System.out.println("Quais números gostaria de somar?\n Digite um número por linha:");
    for (int i=0; i <n; i++){
        int x = teclado.nextInt();
        soma += x;
    }
        System.out.println("A soma de todos os números digitados é:" + soma);  
        teclado.close();
        
        
        
        
        
        
    
     
    
    
    
    
    
    
    
    }
}
