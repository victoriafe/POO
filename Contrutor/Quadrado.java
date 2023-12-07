public class Quadrado {
    Double lado;

    public Double calculaArea(){
        return lado * lado;
    }

    public Double calculaPerimetro(){
        return lado * 4;
    }

    public Quadrado(Double lado){
        this.lado = lado;
    }
}
