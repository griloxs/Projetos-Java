package com.mycompany.calculator2;
import java.util.Scanner;

public class CalculatorTENTATIVA2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int num1 = teclado.nextInt();
        
        System.out.println("Escolha a função (+ para adição, - para subtração, * para multiplicação, / para divisão):");
        char func = teclado.next().charAt(0);

        System.out.println("Digite o segundo número");
        int num2 = teclado.nextInt();

        int resultado = calculate(func, num1, num2);
        System.out.println("O resultado é: " + resultado);
    }

    public static int calculate(char operation, int num1, int num2) {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero!");
                    return 0;
                }
                return num1 / num2;
            default:
                System.out.println("Operação inválida!");
                return 0;
        }
    }
}