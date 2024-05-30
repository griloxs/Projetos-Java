import java.util.Scanner;

public class SW5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 3: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1 -> { System.out.println("Número é 1"); 
            System.out.println("Número não é maior que 2"); } 
            case 2 -> System.out.println("Número é 2");
            case 3 -> {
                System.out.println("Número é 3");

                if (numero > 2) {
                    System.out.println("Número é maior que 2");
                } else {
                    System.out.println("Número não é maior que 2");
                }
            }
            default -> System.out.println("Número não é 1, 2 ou 3");
        }

        scanner.close();
    }
}