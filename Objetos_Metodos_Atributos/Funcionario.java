public class Funcionario {
    String nome;
    Double horasTrabalhadas;
    Double valorDaHora;

    public Double salariofinal(){
        return (horasTrabalhadas * valorDaHora) * 0.11;
    }

}
