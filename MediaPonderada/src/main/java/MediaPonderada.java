import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCasosTeste = 3;

        for (int i = 0; i < numCasosTeste; i++) {
            System.out.println("Digite os três valores reais para o caso de teste " + (i + 1) + ":");
            double valor1 = scanner.nextDouble();
            double valor2 = scanner.nextDouble();
            double valor3 = scanner.nextDouble();

            double mediaPonderada = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10.0;

            System.out.println("Média ponderada para o caso de teste" + (i + 1) + ": " + mediaPonderada);
        }
        scanner.close();
    }
}