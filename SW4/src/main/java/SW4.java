import java.util.Scanner;

public class SW4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dgitite um letra maiúscula ou minúscula: ");
        char letra = scanner.next().charAt(0);
        switch (letra) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante");
        }
        scanner.close();
    }
}

