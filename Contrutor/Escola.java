import java.util.*;
public class Escola {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número da matrícula do aluno:");
        int matricula = scan.nextInt();
		scan.nextLine();
        System.out.print("Digite o nome do aluno:");
        String nome = scan.nextLine();
        System.out.print("Digite o CPF do aluno:");
        String cpf = scan.nextLine();
        System.out.print("Digite o endereço do aluno:");
        String endereco = scan.nextLine();

        Aluno aluno1 = new Aluno(matricula, nome, cpf, endereco);

        System.out.print("Digite o número da matrícula do aluno:");
        matricula = scan.nextInt();
        scan.nextLine();
        System.out.print("Digite o nome do aluno:");
        nome = scan.nextLine();
        System.out.print("Digite o CPF do aluno:");
        cpf = scan.nextLine();
        System.out.print("Digite o endereço do aluno:");
        endereco = scan.nextLine();

        Aluno aluno2 = new Aluno(matricula, nome, cpf, endereco);
        System.out.println(aluno1.toString());
        System.out.println(aluno2.toString());
    }
}
