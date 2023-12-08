import java.util.*;
public class Financeiro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o código do boleto: ");
        int codigo = scan.nextInt();
        scan.nextLine();
        System.out.print("Digite a descrição do boleto: ");
        String descricao = scan.nextLine();
        System.out.print("Digite o dia do vencimento do boleto: ");
        int diaDeVencimento = scan.nextInt();
        System.out.print("Digite o valor do boleto: ");
        Double valor = scan.nextDouble();

        Boleto boleto1 = new Boleto(codigo, descricao, diaDeVencimento, valor);

        System.out.print("Digite o código do boleto: ");
        codigo = scan.nextInt();
        scan.nextLine();
        System.out.print("Digite a descrição do boleto: ");
        descricao = scan.nextLine();
        System.out.print("Digite o dia do vencimento do boleto: ");
        diaDeVencimento = scan.nextInt();
        System.out.print("Digite o valor do boleto: ");
        valor = scan.nextDouble();

        Boleto boleto2 = new Boleto(codigo, descricao, diaDeVencimento, valor);

        System.out.println(boleto1.exibir());
        System.out.println(boleto2.exibir());

        System.out.print("Digite o dia do pagamento do boleto: ");
        int dia1 = scan.nextInt();
        System.out.print("Digite o valor do desconto: ");
        Double desconto1 = scan.nextDouble();
        System.out.print("Digite o valor a ser pago:");
        Double valorPago1 = scan.nextDouble();

        if(boleto1.pagar(dia1, desconto1, valorPago1)){
            System.out.print("Boleto 1 pago com sucesso!\n");
        }
        else{
            System.out.print("Pagamento do boleto não realizado!\n");
        }

        System.out.print("Digite o dia do pagamento do boleto: ");
        int dia2 = scan.nextInt();
        System.out.print("Digite o valor do desconto: ");
        Double desconto2 = scan.nextDouble();
        System.out.print("Digite o valor a ser pago:");
        Double valorPago2 = scan.nextDouble();

        if(boleto1.pagar(dia2, desconto2, valorPago2)){
            System.out.print("Boleto 1 pago com sucesso!\n");
        }
        else{
            System.out.print("Pagamento do boleto não realizado!\n");
        }
        System.out.println(boleto1.exibir());
        System.out.println(boleto2.exibir());
    }
}

