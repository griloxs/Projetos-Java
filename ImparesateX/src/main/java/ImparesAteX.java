import java.util.Scanner;

public class ImparesAteX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro X: ");
        int x = scanner.nextInt();

        System.out.println("Números ímpares de 1 até " + x + ":");
        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}