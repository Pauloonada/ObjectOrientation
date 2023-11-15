package ObjectOrientation.Chapter3.Fixacao;

public class Conta{
    public int numero;
    public double saldo;
    public double limite = 100;
    public Agencia agencia;

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca(double valor){
        this.saldo -= valor;
    }

    public void imprimeExtrato(){
        System.out.println("Saldo: " + this.saldo);
    }

    public double colsultaSaldoDisponivel(){
        return this.saldo + this.limite;
    }
}
