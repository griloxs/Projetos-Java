package com.mycompany.exerciciodowhile;

import java.util.Scanner;

public class _CalculadoraMultiplicacao{
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = teclado.nextInt();
        System.out.println("digite o segundo número: ");
        int num2 = teclado.nextInt();
        
        System.out.println("a soma é: " + multiplicacao (num1, num2));
        
    }
    
    public static int multiplicacao (int num1, int num2){
        return num1 * num2;
    }
    
    
}
