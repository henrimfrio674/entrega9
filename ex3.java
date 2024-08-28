import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Código do Produto: ");
        int codigo = scanner.nextInt();
        
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        
        double preco = 0;
        String produto = "";
        
        switch (codigo) {
            case 1:
                produto = "Cachorro Quente";
                preco = 10.00;
                break;
            case 2:
                produto = "X-Salada";
                preco = 15.00;
                break;
            case 3:
                produto = "X-Bacon";
                preco = 18.00;
                break;
            case 4:
                produto = "Bauru";
                preco = 12.00;
                break;
            case 5:
                produto = "Refrigerante";
                preco = 8.00;
                break;
            case 6:
                produto = "Suco de laranja";
                preco = 13.00;
                break;
            default:
                System.out.println("Código do produto inválido!");
                System.exit(0);
        }
        
        double valorTotal = quantidade * preco;
        System.out.println("Produto: " + produto);
        System.out.println("Valor total: R$ " + String.format("%.2f", valorTotal));
        
        scanner.close();
    }
}
