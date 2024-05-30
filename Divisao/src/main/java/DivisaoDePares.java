  
 import java.util.Scanner;

public class DivisaoDePares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de N: ");
        int N = scanner.nextInt();
        
        for (int i = 0; i < N; i++) {
            System.out.printf("Digite o %dº par de números: ", i+1);
            double numerador = scanner.nextDouble();
            double denominador = scanner.nextDouble();
            
            if (denominador != 0) {
                double resultado = numerador / denominador;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Divisão Impossivel");
            }
        }
        
        scanner.close();
    }
}
