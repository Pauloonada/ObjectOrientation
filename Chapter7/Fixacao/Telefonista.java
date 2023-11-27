package ObjectOrientation.Chapter7.Fixacao;

public class Telefonista extends Funcionario{
    private int estacaoDeTrabalho;

    public int getEstacaoDeTrabalho(){
        return this.estacaoDeTrabalho;
    }

    public void setEstacaoDeTrabalho(int estacao){
        this.estacaoDeTrabalho = estacao;
    }
}
