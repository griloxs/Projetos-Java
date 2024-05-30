package com.mycompany.verificarprimos;
public class VerificarPrimos {
    public static void main(String[] args) {
   
    int numero = 17;
    boolean numPrimo = true;
    
    for (int i = 2; i <= numero / 2; i++){
        if (numero % i == 0){
            numPrimo = false;
            break;
        }
    }
    if (numPrimo){
        System.out.println(numero + "é um número primo");
    } else {
        System.out.println(numero + "não é um número primo");
    }
    
     
    
    
    
    
    
    
    }
}
