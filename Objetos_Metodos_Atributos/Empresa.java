import java.util.*;

public class Empresa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        System.out.print("Digite o nome do funcionario:");
        funcionario1.nome = scan.nextLine();
        System.out.print("Digite as horas trabalhadas:");
        funcionario1.horasTrabalhadas = scan.nextDouble();
        System.out.print("Digite o valor da hora:");
        funcionario1.valorDaHora = scan.nextDouble();

        System.out.println("Nome: "+funcionario1.nome+"\nHoras Trabalhadas: "+funcionario1.horasTrabalhadas+"\nValor da Hora: "+funcionario1.valorDaHora+"\nSalário: "+funcionario1.salariofinal());

        scan.nextLine();
        System.out.print("Digite o nome do funcionario:");
        funcionario2.nome = scan.nextLine();
        System.out.print("Digite as horas trabalhadas:");
        funcionario2.horasTrabalhadas = scan.nextDouble();
        System.out.print("Digite o valor da hora:");
        funcionario2.valorDaHora = scan.nextDouble();

        System.out.println("Nome: "+funcionario2.nome+"\nHoras Trabalhadas: "+funcionario2.horasTrabalhadas+"\nValor da Hora: "+funcionario2.valorDaHora+"\nSalário: "+funcionario2.salariofinal());
    
        scan.nextLine();
        System.out.print("Digite o nome do funcionario:");
        funcionario3.nome = scan.nextLine();
        System.out.print("Digite as horas trabalhadas:");
        funcionario3.horasTrabalhadas = scan.nextDouble();
        System.out.print("Digite o valor da hora:");
        funcionario3.valorDaHora = scan.nextDouble();

        System.out.println("Nome: "+funcionario3.nome+"\nHoras Trabalhadas: "+funcionario3.horasTrabalhadas+"\nValor da Hora: "+funcionario3.valorDaHora+"\nSalário: "+funcionario3.salariofinal());
    }    
}
