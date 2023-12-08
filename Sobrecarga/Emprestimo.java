public class Emprestimo {
    private String nomeCliente;
    private Double renda;  

    public Double calculaEmprestimo(){
        return renda * 4;
    }

    public Double calculaEmprestimo(int fator){
        if(fator >=2 && fator <= 10){
            return renda * fator;
        }
        return 0.0;
    }
    
    public Double calculaEmprestimo(Double taxa){
        if(taxa >=1 && taxa <= 15){
            Double valor;
            valor = renda * 5;
            valor -= valor * taxa/100;
            return valor;
        }
        return 0.0;
    }

    public Emprestimo(){
        
    }

    public Emprestimo(String nomeCliente, Double renda){
        this.nomeCliente = nomeCliente;
        this.renda = renda;
    }

    //gets e sets

    public void setNomeCLiente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    public String getNomeCliente(){
        return nomeCliente;
    }
    public void setRenda(Double renda){
        this.renda = renda;
    }
    public Double getRenda(){
        return renda;
    }
}
