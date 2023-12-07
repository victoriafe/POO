public class Aluno {
    private String nome;
    private int matricula;
    private Double media;
    private String situacao;



    private void verificaSituacao(){
        if(this.media >= 6){
            situacao = "APROVADO";
        }
        else{
            situacao = "REPROVADO";
        }
    }

    public String resultadoFinal(){
        return "\nNome :"+nome+"\nMatrícula: "+matricula+"\nMédia: "+media+"\nSituação: "+situacao;
    }


    public Aluno(String nome, int matricula, Double media){
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
        verificaSituacao();
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public int getMatricula(){
        return matricula;
    }
    public void setMedia(Double media){
        this.media = media;
        verificaSituacao();
    }
    public Double getMedia(){
        return media;
    }
}
