package ObjectOrientation.Chapter3.Fixacao;

public class TestaCartaoDeCredito{
    public static void main(String[] args){
        CartaoDeCredito cdc1 = new CartaoDeCredito();
        cdc1.numero = 1111;
        cdc1.dataDeValidade = "05/09/2024";

        CartaoDeCredito cdc2 = new CartaoDeCredito();
        cdc2.numero = 2222;
        cdc2.dataDeValidade = "05/09/2025";

        System.out.println("Dados do primeiro cartão");
        System.out.println("Número: " + cdc1.numero);
        System.out.println("Data de validade: " + cdc1.dataDeValidade);

        System.out.println("-----------------------------------");
        
        System.out.println("Dados do segundo cartão");
        System.out.println("Número: " + cdc2.numero);
        System.out.println("Data de validade: " + cdc2.dataDeValidade);
    }
}
