public class Carro {
    private Double combustivel;
    private Double quilometragem;

    public void abastecer(Double litros){
        this.combustivel += litros;
    }
    public Double autonomia(){
        return 12 * combustivel;
    }

    public void percorrerDistancia(int distancia){
        if(this.autonomia() > distancia){
            this.quilometragem += distancia;
            this.combustivel -= distancia/12;
        }
        else{
            System.out.print("Não a combustivel suficiente");
        }
    }

    public Carro(Double combustivel){
        this.combustivel = combustivel;
        this.quilometragem = 0.0;
    }

    //Sets e gets

    public void setCombustivel(Double combustivel){
        this.combustivel = combustivel;
    }
    public Double getCombustivel(){
        return this.combustivel;
    }
    public void setQuilometragem(Double quilometragem){
        this.quilometragem = quilometragem;
    }
    public Double getQuilometragem(){
        return this.quilometragem;
    }
}
