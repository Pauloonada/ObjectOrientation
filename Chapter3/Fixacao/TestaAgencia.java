package ObjectOrientation.Chapter3.Fixacao;

public class TestaAgencia{
    public static void main(String[] args){
        Agencia a1 = new Agencia(1234);

        Agencia a2 = new Agencia(5678);

        System.out.println("Dados da primeira agência");
        System.out.println("Número: " + a1.numero);

        System.out.println("--------------------------------");

        System.out.println("Dados da segunda agência");
        System.out.println("Número: " + a2.numero);
    }
}
