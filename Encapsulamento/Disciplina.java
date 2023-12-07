import java.util.*;
public class Disciplina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do Aluno: ");
        String nome = scan.nextLine();

        System.out.print("Digite o número da matrícula: ");
        int matricula = scan.nextInt();

        System.out.print("Digite a média do aluno: ");
        Double media = scan.nextDouble();
		
        Aluno aluno1 = new Aluno(nome, matricula, media);
        
        scan.nextLine();
        System.out.print("\nDigite o nome do Aluno: ");
		nome = scan.nextLine();

        System.out.print("Digite o número da matrícula: ");
        matricula = scan.nextInt();

        System.out.print("Digite a média do aluno: ");
        media = scan.nextDouble();

        Aluno aluno2 = new Aluno(nome, matricula, media);

        System.out.println("\n\n-----Resultado Final-----\n"+aluno1.resultadoFinal());
        System.out.println("\n\n-----Resultado Final-----\n"+aluno2.resultadoFinal());
    }
}
