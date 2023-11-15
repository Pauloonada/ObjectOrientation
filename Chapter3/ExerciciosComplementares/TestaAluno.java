package ObjectOrientation.Chapter3.ExerciciosComplementares;

public class TestaAluno{
    public static void main(String[] args){
        Aluno a1 = new Aluno();
        a1.nome = "Paulo";
        a1.rg = "458.395.728-94";
        a1.dataDeNascimento = "29/12/2000";

        Aluno a2 = new Aluno();
        a2.nome = "Pedro";
        a2.rg = "465.345.296-09";
        a2.dataDeNascimento = "29/12/2007";

        System.out.println("Dados do primeiro aluno");
        System.out.println("Nome: " + a1.nome);
        System.out.println("RG: " + a1.rg);
        System.out.println("Data de nascimento: " + a1.dataDeNascimento);

        System.out.println("----------------------------------------");

        System.out.println("Dados do segundo aluno");
        System.out.println("Nome: " + a2.nome);
        System.out.println("RG: " + a2.rg);
        System.out.println("Data de nascimento: " + a2.dataDeNascimento);
    }
}
