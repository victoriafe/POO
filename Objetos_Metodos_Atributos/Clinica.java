import java.util.*;
public class Clinica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Paciente paciente1 = new Paciente();
        Paciente paciente2 = new Paciente();

        System.out.print("Digite o nome do paciente:");
        paciente1.nome = scan.nextLine();
        System.out.print("Digite o sexo do paciente:");
        paciente1.sexo = scan.nextLine();
        System.out.print("Digite a altura do paciente:");
        paciente1.altura = scan.nextDouble();
        System.out.print("Digite o peso do paciente:");
        paciente1.peso = scan.nextDouble();
        System.out.printf("\nNome: %s\nSexo: %s\nAltura: %.2f\nPeso: %.2f\nIMC: %.2f\n", paciente1.nome, paciente1.sexo, paciente1.altura, paciente1.peso, paciente1.calcularIMC());
		
		scan.nextLine();
        System.out.print("\nDigite o nome do paciente:");
        paciente2.nome = scan.nextLine();
        System.out.print("Digite o sexo do paciente:");
        paciente2.sexo = scan.nextLine();
        System.out.print("Digite a altura do paciente:");
        paciente2.altura = scan.nextDouble();
        System.out.print("Digite o peso do paciente:");
        paciente2.peso = scan.nextDouble();
        System.out.printf("\nNome: %s\nSexo: %s\nAltura: %.2f\nPeso: %.2f\nIMC: %.2f\n", paciente2.nome, paciente2.sexo, paciente2.altura, paciente2.peso, paciente2.calcularIMC());

    }
}
