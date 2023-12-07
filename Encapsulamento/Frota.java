
import java.util.*;
public class Frota {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite a quantidade de combustivel inicial: ");
            Double combustivel = scan.nextDouble();

            Carro carro = new Carro(combustivel);

            System.out.printf("\nQuilometragem: %.1f\nAutonomia: %.1f",carro.getQuilometragem(),carro.autonomia());

            System.out.print("\nDigite a quantidade de combustivel abastecida:");
            combustivel = scan.nextDouble();

            carro.abastecer(combustivel);

            System.out.printf("\nQuilometragem: %.1f\nAutonomia: %.1f",carro.getQuilometragem(),carro.autonomia());

            System.out.print("\nDigite a distancia percorrida: ");
            int distancia = scan.nextInt();

            carro.percorrerDistancia(distancia);
            
            System.out.printf("\nQuilometragem: %.1f\nAutonomia: %.1f\nQuantidade combustivel restante: %.1fL",carro.getQuilometragem(),carro.autonomia(), carro.getCombustivel());
        }

    }
}
