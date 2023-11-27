package ObjectOrientation.Chapter7.Fixacao;

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

        System.out.println("GERENTE");
        System.out.println("Nome: " + g.getNome());
        System.out.println("Salário: " + g.getSalario());
        System.out.println("Usuário: " + g.getUsuario());
        System.out.println("Senha: " + g.getSenha());
        System.out.println("Bonificação: " + g.calculaBonificacao());

        System.out.println("TELEFONISTA");
        System.out.println("Nome: " + t.getNome());
        System.out.println("Salário: " + t.getSalario());
        System.out.println("Estação de trabalho: " + t.getEstacaoDeTrabalho());
        System.out.println("Bonificação: " + t.calculaBonificacao());
        
        System.out.println("SECRETARIA");
        System.out.println("Nome: " + s.getNome());
        System.out.println("Salário: " + s.getSalario());
        System.out.println("Ramal: " + s.getRamal());
        System.out.println("Bonificação: " + s.calculaBonificacao());
    }
}
