package ObjectOrientation.Chapter3.ExerciciosComplementares;

public class TestaMetodosFuncionario{
    public static void main(String[] args){
        Funcionario f1 = new Funcionario();
        f1.nome = "Geraldo";
        f1.salario = 6000;

        Funcionario f2 = new Funcionario();
        f2.nome = "Alisson";
        f2.salario = 3000;

        // Aumentando o salário dos funcionários
        f1.aumentaSalario(300);
        f2.aumentaSalario(1350);

        // Consultando os dados dos funcionários
        f1.consultaDados();
        System.out.println("--------------------------------------");
        f2.consultaDados();
    }
}
