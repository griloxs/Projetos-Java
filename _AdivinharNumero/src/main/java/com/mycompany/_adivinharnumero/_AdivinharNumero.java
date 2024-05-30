package com.mycompany._adivinharnumero;

import java.util.Scanner;

public class _AdivinharNumero {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        int numeroSecreto = 56;
        int tentativa;

        System.out.println("Adivinhe o número (entre 1 e 100");
        
        do{
           
            tentativa = teclado.nextInt();
            
            if(tentativa > numeroSecreto){
                System.out.println("EROOO!! Tente um número menor");
            } else if (tentativa < numeroSecreto){
                System.out.println("ERROOOO!! Tente um número maior");
            }else {
                System.out.println("ACERTOUUU!! Parabéns, você acertou");
            }
            
        }while (tentativa != numeroSecreto);
        teclado.close();
    }
}
