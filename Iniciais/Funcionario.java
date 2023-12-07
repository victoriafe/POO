public class Funcionario {
	
	String nome;
	double horasTrabalhadas;
	double valorDaHora;
	
	public double salarioFinal(){
		double salario = horasTrabalhadas * valorDaHora;
		salario = salario - (salario * 0.11);
		return salario;
	}
}

