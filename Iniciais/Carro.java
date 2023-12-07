import java.util.*;

public class Carro {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o custo de fábrica do carro:");
		double custoFabrica = scan.nextDouble();
		double percentualDistribuidor = custoFabrica * 0.28;
		double percentualImposto = custoFabrica * 0.48;
		
		double custoFinal = custoFabrica + percentualDistribuidor + percentualImposto;
		
		System.out.println("O custo final é de: "+custoFinal);
	}
}

