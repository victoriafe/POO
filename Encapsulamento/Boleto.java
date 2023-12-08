public class Boleto {
    private int codigo;
    private String descricao;
    private int diaDeVencimento;
    private Double valor;
    private boolean status;
    
    public boolean pagar(int dia, Double desconto, Double valorPago){
        if(status){
            return false;
        }
        Double valorPagar;
        if(dia>diaDeVencimento){
            valorPagar = valor * 1.1;
        }
        else{
            valorPagar = valor - desconto;
        }
        if(valorPago >= valorPagar){
            status = true;
            return true;
        }
        return false;
    }
    
    public String exibir(){
        String resposta = "-----Dados do Boleto-----\nCódigo: "+codigo+"\nDescrição: "+descricao+"\nDia de Vencimento: "+diaDeVencimento+"\nValor: "+valor+"\nStatus: ";
        if(status){
            resposta += "Boleto Pago\n";
        }
        else{
            resposta += "Boleto Pendente\n";
        }
        return resposta;
    }
    
    public Boleto(int codigo, String descricao, int diaDeVencimento, Double valor){
        this.codigo = codigo;
        this.descricao = descricao;
        this.diaDeVencimento = diaDeVencimento;
        this.valor = valor;
        this.status = false;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDiaDeVencimento(int diaDeVencimento){
        this.diaDeVencimento = diaDeVencimento;
    }
    public int getDiaDeVencimento(){
        return diaDeVencimento;
    }
    public boolean getStatus(){
        return status;
    }
}
