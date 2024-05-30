package com.mycompany.vereficarsenha;

import java.util.Scanner;

public class VereficarSenha {

    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int senhaCorreta = 2002;
    
    while (true){
        System.out.println("Digite a senha: ");
        int senhadigitada = scanner.nextInt();
        
        if (senhadigitada == senhaCorreta){
            System.out.println("Acesso Permitido");
            break;
        }else {
            System.out.println("Senha Invalida");
        }
    }
    
    
    
    
    }
}
