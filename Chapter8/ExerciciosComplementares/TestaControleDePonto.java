package ObjectOrientation.Chapter8.ExerciciosComplementares;

public class TestaControleDePonto{
    public static void main(String[] args){
        ControleDePonto controle = new ControleDePonto();

        Gerente g = new Gerente();
        g.setNome("Pedro Pereira");
        g.setSalario(13000);
        g.setUsuario("pedro.pereira");
        g.setSenha("Yesthepassword");

        Telefonista t = new Telefonista();
        t.setNome("Júlia Almeida");
        t.setSalario(7000);
        t.setEstacaoDeTrabalho(405);

        controle.entradaFuncionario(g);
        controle.entradaFuncionario(t);
        controle.saidaFuncionario(g);
        controle.saidaFuncionario(t);
    }
}
