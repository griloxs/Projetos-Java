package com.mycompany.exerciciodowhile;

import java.util.Scanner;

public class Funcoes {
    
    public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 3 números:");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
           
        int maior = numeros (a,b,c);
        MostrarResultado(maior);
        
        
        
        
        
       /* if (a > b && a > c){
            System.out.println("O número mairo é:" + a);
        } else if (b > c){
            System.out.println("O maior número é:" + b);
        }else{
            System.out.println("O maior número é:" + c);
        } */
       
    }
       public static int numeros(int x, int y, int z){
           int aux;
       
           if(x > y && x > z){
               aux = x;
           }else if (y > z){
               aux = y;
           }else{
               aux = z;
           }
       return aux;
       }
       
       public static void MostrarResultado(int numMaior) {
           System.out.println("O número maior é: " + numMaior);
    }
       
       
     //   teclado.close();
        
    }

