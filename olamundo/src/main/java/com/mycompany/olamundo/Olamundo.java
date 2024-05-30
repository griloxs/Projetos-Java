package com.mycompany.olamundo;

import java.util.Locale;

public class Olamundo {

    public static void main(String[] args) {
        
        String nome = "josé";
        int idade = 18;
        double renda = 15.152;         
        System.out.printf("%s tem %d anos e ganha R$%.3f reais",nome, idade, renda);
        /*
        %f - ponti flutuante (float,double)
        %d - números inteiros (int)
        %s - texto (string)
        */
       /* double x = 10.356547;
        System.out.println(x);  
        System.out.printf("%.2f\n",x);
        System.out.printf("%.4f\n",x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f\n",x);
   
        System.out.println("RESULTADO = "+ x + " METROS");
        System.out.printf("RESULTADO = %.2f METROS \n",x);
        */
    
    
    }
}
