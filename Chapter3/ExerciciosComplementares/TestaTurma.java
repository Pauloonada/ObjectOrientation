package ObjectOrientation.Chapter3.ExerciciosComplementares;

public class TestaTurma{
    public static void main(String[] args){
        Turma t1 = new Turma();
        t1.periodo = "Manhã";
        t1.serie = 1;
        t1.sigla = "1B";
        t1.tipoDeEnsino = "Técnico";

        Turma t2 = new Turma();
        t2.periodo = "Tarde";
        t2.serie = 3;
        t2.sigla = "3C";
        t2.tipoDeEnsino = "Médio";

        System.out.println("Dados da primeira turma");
        System.out.println("Período: " + t1.periodo);
        System.out.println("Série: " + t1.serie);
        System.out.println("Sigla: " + t1.sigla);
        System.out.println("Tipo de ensino: " + t1.tipoDeEnsino);

        System.out.println("------------------------------------");

        System.out.println("Dados da segunda turma");
        System.out.println("Período: " + t2.periodo);
        System.out.println("Série: " + t2.serie);
        System.out.println("Sigla: " + t2.sigla);
        System.out.println("Tipo de ensino: " + t2.tipoDeEnsino);
    }
}
