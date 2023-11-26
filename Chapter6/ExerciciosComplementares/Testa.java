package ObjectOrientation.Chapter6.ExerciciosComplementares;

public class Testa{
    public static void main(String[] args){
        Conta c1 = new Conta();
        Conta c2 = new Conta();

        System.out.println("Dados da primeira conta");

        System.out.println("------------------------------------");

        c1.setNome("Paulo Rodrigues");
        System.out.println("Nome: " + c1.getNome());

        c1.setSaldo(6000);
        System.out.println("Saldo: " + c1.getSaldo());

        System.out.println("Número: " + c1.getNumero());

        System.out.println("------------------------------------");

        System.out.println("Dados da segunda conta");

        System.out.println("------------------------------------");

        c2.setNome("Pedro Pereira");
        System.out.println("Nome: " + c2.getNome());

        c2.setSaldo(100);
        System.out.println("Saldo: " + c2.getSaldo());

        System.out.println("Número: " + c2.getNumero());
    }
}
