
package com.mycompany.loja;

/**
 *
 * @author Aluno
 */
public class Loja {

    public static void main(String[] args) {
        System.out.println("Hello World!");
   
    String produto1 = "Computador";
String produto2 = "Mesa de Escritório";

String nomePessoa = "Maria";
int idade = 30;
int código = 5290;
char genero = 'F';

double preco1 = 2.100;
double preco2 = 650.50;
double medidaDaMesa = 53.234567;
   
        System.out.printf("%s está custando R$%.3f\n %s está custando RS%.2f\n Registro de Pessoa: %s\n %d anos\n %d código e sexo: %c\n ",produto1, preco1, produto2, preco2,nomePessoa,idade,código,genero);
        System.out.printf("Medida de mesa com oito casas decimais: %.8f",medidaDaMesa);
        System.out.printf("\nMedida de mesa com três casas decimais: %.3f",medidaDaMesa);
        java.util.Locale.setDefault(java.util.Locale.US);
        System.out.printf("\nMedida de mesa com três casas decimais: %.3f",medidaDaMesa);
    
    
    
    
    
    
    
    }
}

/*
String produto1 = "Computador";
String produto2 = "Mesa de Escritório";

String nomePessoa = "Maria"
int idade = 30;
int código = 5290;
char genero = 'F';

double preco1 = 2.100;
double preco2 = 650.50;
double medidaDaMesa = 53.234567;

TELA:

Produtos:
Computador está custando R$2100,00
Mesa de escritório está custando R$650,50

Registro de pessoa: Maria, 30 anos, código 5290 e sexo: F

Medida da Mesa com oito casas decimais: 53,23456700
Medida da Mesa com três casas decimais: 53,235
Medida da Mesa com Ponto decimal dos EUA: 53.235
*/

