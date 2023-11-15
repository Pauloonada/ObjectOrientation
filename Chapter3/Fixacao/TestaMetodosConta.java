package ObjectOrientation.Chapter3.Fixacao;

public class TestaMetodosConta{
    public static void main(String[] args){
        Conta c = new Conta();

        System.out.println("Chamando o método deposita passando o valor 1000");
        c.deposita(1000);
        c.imprimeExtrato();

        System.out.println("---------------------------------------------------");

        System.out.println("Chamando o método saca passando o valor 100");
        c.saca(100);
        c.imprimeExtrato();

        System.out.println("---------------------------------------------------");

        double saldoDisponivel = c.colsultaSaldoDisponivel();
        System.out.println("SALDO DISPONíVEL: " + saldoDisponivel);
    }
}
