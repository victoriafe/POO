import java.util.*;

public class Notas{
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do aluno 1:");
		String nome = scan.nextLine();
		System.out.println("Digite a nota do aluno 1:");
		int nota1 = scan.nextInt();
		System.out.println("Digite o nome do aluno 2:");
		String nome1 = scan.nextLine();
		System.out.println("Digite a nota do aluno 2:");
		int nota2 = scan.nextInt();
		System.out.println("Digite o nome do aluno 3:");
		String nome2 = scan.nextLine();
		System.out.println("Digite a nota do aluno 3:");
		int nota3 = scan.nextInt();
		
		int soma = nota1+nota2+nota3;
		
		float media = soma/3;
		
		System.out.println("A media das notas foram:"+media);
	}
}

