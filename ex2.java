import java.util.Scanner;

public class ParidadeSinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        String paridade = (numero % 2 == 0) ? "par" : "ímpar";
        String sinal = (numero >= 0) ? "positivo" : "negativo";
        
        System.out.println("O Número " + numero + " é " + paridade + " e " + sinal + "!");
        
        scanner.close();
    }
}
