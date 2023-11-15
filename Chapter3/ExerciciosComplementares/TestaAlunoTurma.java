package ObjectOrientation.Chapter3.ExerciciosComplementares;

public class TestaAlunoTurma {
    public static void main(String[] args){
        Aluno a = new Aluno();
        Turma t = new Turma();

        a.nome = "Paulo";
        a.rg = "398-573-584-01";
        a.dataDeNascimento = "29/12/2000";

        t.periodo = "Noite";
        t.serie = 1;
        t.sigla = "1A";
        t.tipoDeEnsino = "Técnico";

        System.out.println("Dados da Turma");
        System.out.println("Período: " + t.periodo);
        System.out.println("Série: " + t.serie);
        System.out.println("Sigla: " + t.sigla);
        System.out.println("Tipo de ensino: " + t.tipoDeEnsino);

        System.out.println("-------------------------------");

        System.out.println("Dados do Aluno");
        System.out.println("Nome: " + a.nome);
        System.out.println("RG: " + a.rg);
        System.out.println("Data de nascimento: " + a.dataDeNascimento);

        System.out.println("-------------------------------");

        a.turma = t;

        System.out.println("Dados do aluno obtidos através da turma");
        System.out.println("Período: " + a.turma.periodo);
        System.out.println("Série: " + a.turma.serie);
        System.out.println("Sigla: " + a.turma.sigla);
        System.out.println("Tipo de ensino: " + a.turma.tipoDeEnsino);
    }
}
