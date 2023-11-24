package ObjectOrientation.Chapter5.Fixacao;

class Conta{
    public static int contador;

    public int numero;

    public Conta(){
        Conta.contador++;
        this.numero = Conta.contador;
    }

    public static void zeraContador(){
        System.out.println("Valor atual do contador: " + Conta.contador);
        System.out.println("zerando o contador de contas...");
        Conta.contador = 0;
    }
}