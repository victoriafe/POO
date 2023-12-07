import java.util.*;

public class Calculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Retangulo calculo = new Retangulo();
		
		calculo.comprimento = 1;
		calculo.largura = 1;
		
        System.out.println("Perimetro: "+calculo.perimetro());
        System.out.println("Área: "+calculo.area());
        
        System.out.println("Digite o comprimento:");
        calculo.comprimento = scan.nextInt();

        System.out.println("Digite a largura:");
        calculo.largura = scan.nextInt();

        System.out.println("Perimetro: "+calculo.perimetro());
        System.out.println("Área: "+calculo.area());
    }
}
