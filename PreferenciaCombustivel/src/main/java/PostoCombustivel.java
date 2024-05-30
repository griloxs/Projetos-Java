import java.util.Scanner;

public class PostoCombustivel {
    public static void main(String[] args) {
   
    Scanner scanner = new Scanner(System.in);
    
    int alcool = 0;
    int gasolina = 0;
    int diesel = 0;
    
    int codigo;
    
    do {
        System.out.println("Digite o código do combustível (1.Álcool 2.Gasolina 3.diesel 4.Fim): ");
        codigo = scanner.nextInt();
        
        switch (codigo) {
        case 1 -> alcool = alcool + 1;
        case 2 -> gasolina = gasolina + 1;
        case 3 -> diesel = diesel + 1;
        case 4 -> {    
        }
        default -> System.out.println(" Código inválido. Digite novamente.");
    }
        
} while (codigo != 4);        
        
        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + alcool + "cliente(s)");
        System.out.println("Gasolina: " + gasolina + "cliente(s)");
        System.out.println("Diesel: " + diesel + "cliente(s)");
        
        scanner.close();
    }
    }

