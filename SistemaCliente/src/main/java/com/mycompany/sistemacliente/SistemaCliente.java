package com.mycompany.sistemacliente;
import java.util.Scanner;
public class SistemaCliente {
    public static void main(String[] args) {
   
    /* Crie um programa que registre clientes em uma loja, o sistema precia pedir:
       nome, endereço, cpf, idade, sexo e no final mostrar na tela 
        */
    /*
    String nome = "José";
    String endereco = "Rua Sargento Geraldo Santana 1715";
    String cpf ="00000000000";
    int idade = 20;
    char genero = 'M';
    
       // System.out.printf("%s, %s, %s, %d, %c", nome, endereco, cpf, idade, genero);
        */
       Scanner sc = new Scanner (System.in);
       
       String nome, endereco;
       double cpf;
       int idade;
       char genero;
       
        System.out.println("digite seu nome");
        nome = sc.nextLine();
        System.out.println("digite seu endereco");
        endereco = sc.nextLine();
        System.out.println("");
        
        System.out.println("");
       
    
    
    }
}
