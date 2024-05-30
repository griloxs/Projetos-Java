package com.mycompany.canetaazul;
import java.util.Scanner;
public class Canetaazul {
    public static void main(String[] args) {
            
        
        Scanner teclado1 = new Scanner (System.in);
        Scanner teclado2 = new Scanner (System.in);
        
        System.out.println("Digite a marca da caneta:");
        String marcaC1 = teclado1.nextLine();
        System.out.println("Digite a cor da caneta: ");
        String corC1 = teclado1.nextLine();
        System.out.println("Digite a espessura da caneta: ");
        Double pontaC1 = teclado2.nextDouble();
        System.out.println("Digite a carga da caneta: ");
        int cargaC1 = teclado2.nextInt();
        
        Caneta c1 = new Caneta();
          
        c1.marca = marcaC1;
        c1.cor = corC1;
        c1.ponta = pontaC1;
        c1.carga = cargaC1;
     

        boolean respostaTampada = c1.perguntarTampada();
        c1.tampada = respostaTampada;
        
        c1.estado();
        c1.escrever();
                
        //Caneta c2 = new Caneta();
        //c2.marca = "bic"; 
        //c2.cor = "Preta";
        //c2.carga = '1';
        //c2.ponta = 0.5;
        //c2.tampada = false;
        //c2.destampar();
        //c2.estado();
        //c2.escrever();
    }
}