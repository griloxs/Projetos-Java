package com.mycompany.entradadedados;
import java.util.Scanner;

public class EntradadeDados {

    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in); //inserir algum dado
                
        String x, y, z;
        int w;
        //int y;
       // double z;
        
        
       // System.out.println("Digite uma PALAVRA, um NÚMERO COM PONTO e uma LETRA  ");
       
        /*string x = teclado.nextLine();
        x = teclado.nextLine();
        y = teclado.nextInt();
        z = teclado.nextDouble();
        char w = teclado.next().charAt(0);*/
        
        w = teclado.nextInt();
        teclado.nextLine();
        x = teclado.nextLine();
        y = teclado.nextLine();
        z = teclado.nextLine();
        
        
        
        System.out.println("Dados digitdos:");
        
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        
        //System.out.println(w);
        
        teclado.close();


    }
}
