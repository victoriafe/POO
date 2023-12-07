import java.util.*;

public class Triangulo {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tamanho da base do retangulo:");
		int base = scan.nextInt();
		System.out.println("Digite o tamanho da altura do retangulo:");
		int altura = scan.nextInt();
		int area = base*altura;
		System.out.println("O valor da área do retangulo é: "+area);
	}
}

