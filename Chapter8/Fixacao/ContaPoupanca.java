package ObjectOrientation.Chapter8.Fixacao;

public class ContaPoupanca extends Conta{
    private int diaDoAniversario;

    public int getDiaDoAniversario(){
        return this.diaDoAniversario;
    }

    public void setDiaDoAniversario(int diaDoAniversario){
        this.diaDoAniversario = diaDoAniversario;
    }
}
