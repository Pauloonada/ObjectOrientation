package ObjectOrientation.Chapter7.ExerciciosComplementares;

public class TestaFuncionarios{
    public static void main(String[] args){
        Gerente g = new Gerente();
        g.setNome("José Katsugai");
        g.setSalario(2000);
        g.setUsuario("jose.katsugai");
        g.setSenha("1234kkklol");

        Telefonista t = new Telefonista();
        t.setNome("Tatiane Andrade");
        t.setSalario(1000);
        t.setEstacaoDeTrabalho(22);

        Secretaria s = new Secretaria();
        s.setNome("Alessandra Andrade");
        s.setSalario(1500);
        s.setRamal(198);

        g.mostraDados();

        System.out.println("------------------------");

        t.mostraDados();

        System.out.println("------------------------");

        s.mostraDados();
    }
}
