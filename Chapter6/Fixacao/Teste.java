package ObjectOrientation.Chapter6.Fixacao;

public class Teste{
    public static void main(String[] args){
        Funcionario f = new Funcionario();

        f.setNome("Paulo Rodrigues");
        f.setSalario(6000);

        System.out.println("Nome: " + f.getNome());
        System.out.println("Salário: " + f.getSalario());
    }
}
