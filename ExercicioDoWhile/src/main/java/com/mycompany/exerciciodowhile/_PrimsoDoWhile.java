package com.mycompany.exerciciodowhile;

import java.util.Scanner;

public class _PrimsoDoWhile{
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número limite: ");
        teclado.nextInt();
        
        int limite = 5;
        int numero = 2;
        boolean primo;
        
        do {
            primo = true;
            for(int i = 2; i <= numero / 2; i++);
            if(numero % 1 == 0){
                primo = false;
                
                break;
            
        }
        
        if (primo){
            System.out.println(numero);
            
        }
        numero++;
    } while(numero <= limite); 
    }
}
