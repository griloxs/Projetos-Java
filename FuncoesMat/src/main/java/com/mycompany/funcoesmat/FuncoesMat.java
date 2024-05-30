package com.mycompany.funcoesmat;
public class FuncoesMat {
    public static void main(String[] args) {
   
    
   double x = 3.0;
   double y = 4.0;
   double z = -5.0;
   double a, b, c;
   
   //RAIZ QUANDRADA
   /*
   Estamos cauculando a raiz quandrada dos valores de x, y e 25.0 usando o
   metodo Math.sqrt(), que retorna a raiz quadrada de valor passado como argumento.
   */
    
    a = Math.sqrt(x);
    b = Math.sqrt(y);
    c = Math.sqrt(25.0);
    
        System.out.println("RESULTADO EM RAIZ QUADRADA");
        System.out.println("Raiz quadrada de" + x + " = " + a);
        System.out.println("Raiz quadrada de" + y + " = " + b);
        System.out.println("Raiz quadrada de 25 = " + c);
        
        //POTENCIA
        a = Math.pow (x, y);
        b = Math.pow (x, 2.0);
        c = Math.pow (5.0, 2.0);
        
        System.out.println("\n RESULTADO EM POTENCIA");
        System.out.println(x + "elevado a " + y + " = "+ a);
        System.out.println(x + "elevado ao quadrado =" + b);
        System.out.println("5 elevado ao quadrado = " + c);
        
        //VALOR ABSOLUTO
        /*
        O valor absoluto de um número ao seu valor próprio, independente da 
        posição que ocupa no número. Por exemplo, no número 257, o valor absoluto
        do 7 ao 7, do 5 ao 5 e do 2 ao 2. Alem disso, o valor absoluto de um 
        número também representa a sua distancia ação zero numa reta numerica. A
        sempre um valor positivo. Por exemplo, a distancia entre zero e atrção ao
        3, e a distancia entre -3 e zero tabém ao 3.
        */
        a = Math.abs(y);
        b = Math.abs(z);
        
        System.out.println("/nRESULTADO EM VALOR ABSOLUTO");
        System.out.println("valor absoluto de " + y + " = " + a);
        System.out.println("Valor absoluto de " + z + " = " + b);
 
    
    }
}
