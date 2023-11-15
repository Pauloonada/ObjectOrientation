package ObjectOrientation.Chapter3;

public class TestaCartãoDeCredito{
    public static void main(String[] args){

        CartaoDeCredito cdc = new CartaoDeCredito();
        Cliente c = new Cliente();

        cdc.cliente = c;

        cdc.cliente.nome = "Paulo Rodrigues";
    }
}
