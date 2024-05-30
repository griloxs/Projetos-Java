  package com.mycompany.canetaazul;
import java.util.Scanner;
public class Caneta {


        String marca;
        String cor;
        double ponta;
        int carga;
        boolean tampada;
        
        void estado(){
            System.out.println("Informação da Caneta: ");
            System.out.println("Marca: " + this.cor);
            System.out.println("Marca: " + this.marca);
            System.out.println("Ponta: " + this.ponta);
            System.out.println("Carga: " + this.carga);
            System.out.println("Ela está tampada?\n" + (this.tampada ? "Sim" : "Não"));
        }
        
        void escrever(){
            if(this.tampada == true){
                System.out.println("Não posso escrever\n");
            }else
                System.out.println("A caneta está destampada!\n");
                
        } 
         
        void tampar(){
        this.tampada = true;
        
        }
        void destampar(){
        this.tampada = false;    
        }
        
           boolean perguntarTampada(){
            Scanner teclado2 = new Scanner(System.in);
            System.out.println("A caneta está tampada? (Sim/Não) ");
            String resposta = teclado2.nextLine().toLowerCase();
            
            if(resposta.equals("sim")) {
                return true;
            }else if (resposta.equals("não") || resposta.equals("nao")){
               return false;
            }else{
                  System.out.println("Resposta inválida. Por favor, digite 'Sim' ou 'Não'.");  
                     return perguntarTampada();
            }
        
                
}
}