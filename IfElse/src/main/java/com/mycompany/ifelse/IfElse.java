package com.mycompany.ifelse;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
   
    /* 
      ESTRUTURA CONDICIONAL SIMPLES:
        if ( condição ) {
             comando 1
             comando 2
        }*/
        
        Scanner teclado = new Scanner (System.in);
        int hora;
    
        System.out.println("Qual o horario");
        hora = teclado.nextInt();
        
        if (hora < 12){
            System.out.println("Bom dia");
        }
        else{
        if(hora < 18){
            System.out.println("boa tarde");
        }
         else{
            System.out.println("Boa noite");
            }
    
        }
    }
}
