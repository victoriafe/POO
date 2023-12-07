public class Pedido {
	
	private int codigo;
	private String cliente;
	private Double valor;
	
	public Pedido(int codigo){
		
		this.codigo = codigo;
		
		if(codigo == 1){ //Inicializar valor com 0.0 e cliente com "Não informado".
			valor = 20.00;
		}
		if(codigo == 2){
			valor = 12.00;
		}
		if(codigo == 3){
			valor = 15.00;
		}
	}
	
	public Pedido(int codigo, String cliente){
		this.codigo = codigo;
		this.cliente = cliente;
		
		if(codigo == 1){
			valor = 20.00;
		}
		if(codigo == 2){
			valor = 12.00;
		}
		if(codigo == 3){
			valor = 15.00;
		}
	}
	
	Double valorAdicional; 
	
	public String adiciona(int produto, Double batata){ //Verificar o produto e calcular o valor.
		
		valorAdicional = batata * 0.05;
		valor += valorAdicional;
		return "Pedido "+codigo+" - Cliente: "+cliente+" - Total R$ "+valor;
	}
	public String adiciona(int produto, Double batata, Double refrigerante){ //Verificar o produto e calcular o valor.
		valorAdicional += batata * 0.05;
		valorAdicional += refrigerante * 0.02; //valor não foi atualizado.
		return "Pedido "+codigo+" - Cliente: "+cliente+" - Total R$ "+valor; 
	}
	public String adiciona(int produto, Double batata, int cookie){
		valorAdicional += batata * 0.05;
		valorAdicional += cookie * 2.00;//valor não foi atualizado.
		return "Pedido "+codigo+" - Cliente: "+cliente+" - Total R$ "+valor;
	}
	
	public Pedido(int codigo, String cliente, Double valor){ //Assinatura de construtor incorreta.
		this.codigo = codigo;
		this.cliente = cliente;
		this.valor = valor;
	}
	
	
	
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public int getCodigo(){
		return codigo;
	}
	
	public void setCliente(String cliente){
		this.cliente = cliente;
	}
	
	public String getCliente(){
		return cliente;
	}
	
	public void setValor(Double valor){
		this.valor = valor;
	}
	
	public Double getValor(){
		return valor;
	}
}

