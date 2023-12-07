import java.util.*;
public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor do lado:");
        Double lado = scan.nextDouble();

        Quadrado quadrado1 = new Quadrado(lado);

        System.out.printf("Lado: %.2f\nArea: %.2f Perimetro: %.2f", quadrado1.lado, quadrado1.calculaArea(), quadrado1.calculaPerimetro());
        
		Quadrado quadrado2 = new Quadrado(3.00);
        System.out.printf("\nLado: %.2f\nArea: %.2f Perimetro: %.2f", quadrado2.lado, quadrado2.calculaArea(), quadrado2.calculaPerimetro());
    }
}
