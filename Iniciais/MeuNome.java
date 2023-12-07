import java.util.*;
public class MeuNome {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o seu nome completo: ");
		String nome = scan.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Nome: "+nome+" Idade: "+idade);
	}
}

