package ObjectOrientation.Chapter8.ExerciciosComplementares;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ControleDePonto{
    public void entradaFuncionario(Funcionario f){
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date now = new Date();

        System.out.println("Data de entrada: " + sdf.format(now));
        System.out.println("Funcionario: " + f.getNome());
    }

    public void saidaFuncionario(Funcionario f){
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date now = new Date();

        System.out.println("Date de saída: " + sdf.format(now));
        System.out.println("Funcionario: " + f.getNome());
    }
}
