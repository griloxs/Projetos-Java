import java.util.Scanner;

public class VerificarIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores inteiros N: ");
        int n = scanner.nextInt();

        int dentroIntervalo = 0;
        int foraIntervalo = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor inteiro X #" + (i + 1) + ": ");
            int x = scanner.nextInt();
            
            if (x >= 10 && x <= 20) {
                dentroIntervalo++;
            } else {
                foraIntervalo++;
            }
        }

        System.out.println("Quantidade de valores dentro do intervalo: " + dentroIntervalo);
        System.out.println("Quantidade de valores fora do intervalo: " + foraIntervalo);

        scanner.close();
    }
}