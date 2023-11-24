package ObjectOrientation.Chapter5.ExerciciosComplementares;

public class TestaFuncionario{
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();
        System.out.println("Vale refeição do funcionario: " + Funcionario.valorValeRefeicao);

        funcionario.reajustaValeRefeicaoDiario(0.2);
        System.out.println("Novo valor do vale refeição do funcionário: " + Funcionario.valorValeRefeicao);
    }
}
