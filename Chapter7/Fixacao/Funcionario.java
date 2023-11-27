package ObjectOrientation.Chapter7.Fixacao;

public class Funcionario{
    private String nome;
    private double salario;

    public double calculaBonificacao(){
        return this.salario * 0.1;
    }

    public String getNome(){
        return this.nome;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
}
