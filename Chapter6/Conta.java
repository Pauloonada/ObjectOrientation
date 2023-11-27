package ObjectOrientation.Chapter6;

class Conta{
    private double saldo;

    public void deposita(double valor){
        this.saldo += valor;
        this.descontaTarifa();
    }

    public void saca(double valor){
        this.saldo -= valor;
        this.descontaTarifa();
    }

    private void descontaTarifa(){
        this.saldo -= 0.1;
    }

    public double getSaldo(){
        return this.saldo;
    }
}
