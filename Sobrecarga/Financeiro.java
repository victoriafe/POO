import java.util.*;
public class Financeiro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scan.nextLine();
        System.out.print("Digite a renda do cliente");
        Double renda = scan.nextDouble();

        Emprestimo emprestimo = new Emprestimo(nomeCliente, renda);

        System.out.print("\nChamada sem parametro: "+emprestimo.calculaEmprestimo());
		System.out.print("\nChamada com parametro inteiro 5: "+emprestimo.calculaEmprestimo(5));
		System.out.print("\nChamada com parametro Double 5: "+emprestimo.calculaEmprestimo(5.0));

    }
}