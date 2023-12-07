import java.util.*;

public class Eleitores {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o total de números de eleitores:");
		int numeroTotal = scan.nextInt();
		System.out.println("Digite o numeros total de votos brancos:");
		int votosBrancos = scan.nextInt();
		System.out.println("Digite o número total votos nulos:");
		int votosNulos = scan.nextInt();
		System.out.println("Digite o número total de votos validos:");
		int votosValidos = scan.nextInt();
		
		int percentualVotosBrancos = (numeroTotal*votosBrancos)/100;
		int percentualVotosNulos = (numeroTotal*votosNulos)/100;
		int percentualVotosValidos = (numeroTotal*votosValidos)/100;
		
		System.out.println("Percentual\nVotos Brancos: "+percentualVotosBrancos+"%"+"\nVotos Nulos: "+percentualVotosNulos+"%"+"\nVotos Validos: "+percentualVotosValidos+"%");
	}
}

