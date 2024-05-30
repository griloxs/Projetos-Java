import java.util.Scanner;

public class SW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número de 1 a 4: ");
        int numero = scanner.nextInt();
        switch (numero) {
       
            case 1 -> System.out.println("Verão");
            case 2 -> System.out.println("Outono");
            case 3 -> System.out.println("Inverno");
            case 4 -> System.out.println("Primavera");
            default -> System.out.println("Número inválido. Insira um número de 1 a 4.");
       
        }
        scanner.close();
    }
}