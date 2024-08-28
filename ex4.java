import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nome do colaborador: ");
        String nome = scanner.nextLine();
        
        System.out.print("Código do Cargo: ");
        int codigoCargo = scanner.nextInt();
        
        System.out.print("Salário: R$ ");
        float salario = scanner.nextFloat();
        
        float percentual = 0;
        String cargo = "";
        
        switch (codigoCargo) {
            case 1:
                cargo = "Gerente";
                percentual = 0.10f;
                break;
            case 2:
                cargo = "Vendedor";
                percentual = 0.07f;
                break;
            case 3:
                cargo = "Supervisor";
                percentual = 0.09f;
                break;
            case 4:
                cargo = "Motorista";
                percentual = 0.06f;
                break;
            case 5:
                cargo = "Estoquista";
                percentual = 0.05f;
                break;
            case 6:
                cargo = "Técnico de TI";
                percentual = 0.08f;
                break;
            default:
                System.out.println("Código do cargo inválido!");
                System.exit(0);
        }
        
        float novoSalario = salario + (percentual * salario);
        System.out.println("Nome do colaborador: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + String.format("%.2f", novoSalario));
        
        scanner.close();
    }
}
