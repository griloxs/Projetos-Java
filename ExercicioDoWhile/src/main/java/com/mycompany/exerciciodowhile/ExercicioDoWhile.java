package com.mycompany.exerciciodowhile;

import java.util.Scanner;

public class ExercicioDoWhile {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite um número limite");
        
        int limite = 20;  
        int numero = 0;

        do {
            System.out.println(numero);
            teclado.nextInt();
            numero +=2;
        } while (numero <= limite);

        teclado.close();


    }
}
