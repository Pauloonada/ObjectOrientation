package ObjectOrientation.Chapter6.ExerciciosComplementares;

public class Conta{
    private String nome;
    private double saldo;
    static int contador;
    private int numero;

    public Conta(){
        contador++;
        this.numero = contador;
    }

    public String getNome(){
        return this.nome;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
