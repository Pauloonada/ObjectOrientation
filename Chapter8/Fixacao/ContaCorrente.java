package ObjectOrientation.Chapter8.Fixacao;

public class ContaCorrente extends Conta{
    private double limite;

    public double getLimite(){
        return this.limite;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }
}
