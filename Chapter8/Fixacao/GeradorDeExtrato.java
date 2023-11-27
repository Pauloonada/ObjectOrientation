package ObjectOrientation.Chapter8.Fixacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GeradorDeExtrato{
    public void imprimeExtratoBasico(Conta c){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();

        System.out.println("Date: " + sdf.format(agora));
        System.out.println("Saldo: " + c.getSaldo());
    }
}
