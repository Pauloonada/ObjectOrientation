package ObjectOrientation.Chapter5.ExerciciosComplementares;

public class Funcionario{
    public String nome;
    public double salario;

    public static double valorValeRefeicao;

    public Funcionario(){
        Funcionario.valorValeRefeicao = 400;
    }

    void reajustaValeRefeicaoDiario(double taxa){
        Funcionario.valorValeRefeicao += Funcionario.valorValeRefeicao * taxa;
    }
}
