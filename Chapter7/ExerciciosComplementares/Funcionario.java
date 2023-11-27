package ObjectOrientation.Chapter7.ExerciciosComplementares;

public class Funcionario{
    private String nome;
    private double salario;

    public double calculaBonificacao(){
        return this.salario * 0.1;
    }

    public void mostraDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
        System.out.println("Bonificação: " + this.calculaBonificacao());
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
