package com.mycompany.tabuada;

import java.util.Scanner;

public class Tabuada {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
   
    Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite um numero para a tabuada: ");
        int numero = scanner.nextInt();
    
        System.out.println("Tabuada de " + numero + ";");
    
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
    }
        scanner.close();
        
        
        
    }
}
