import java.util.*;
public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o numero do item:");
        int numero = scan.nextInt();
        scan.nextLine();
        System.out.print("Digite a descrição do item:");
        String descricao = scan.nextLine();
        System.out.print("Digite a quantidade de itens:");
        int quantidade = scan.nextInt();
        System.out.print("Digite o preço do item:");
        Double preco = scan.nextDouble();

        Fatura fatura1 = new Fatura(numero, descricao, quantidade, preco);

        System.out.print("Digite o numero do item:");
        numero = scan.nextInt();
        scan.nextLine();
        System.out.print("Digite a descrição do item:");
        descricao = scan.nextLine();
        System.out.print("Digite a quantidade de itens:");
        quantidade = scan.nextInt();
        System.out.print("Digite o preço do item:");
        preco = scan.nextDouble();

        Fatura fatura2 = new Fatura(numero, descricao, quantidade, preco);

        System.out.println("Valor da Fatura 1: "+ fatura1.getValorDaFatura());
        System.out.println("Valor da Fatura 2: "+ fatura2.getValorDaFatura());
    }
}
