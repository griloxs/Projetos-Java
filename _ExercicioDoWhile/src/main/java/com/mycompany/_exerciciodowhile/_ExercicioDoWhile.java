package com.mycompany._exerciciodowhile;

import java.util.Scanner;

public class _ExercicioDoWhile {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digit um número para fazer a contagem regressiva");
        int contador = teclado.nextInt();

        do{
            System.out.println(contador);
            contador --;
        }while (contador >= 1);
        System.out.println("FINAL DA CONTAGEM");
    }
}
