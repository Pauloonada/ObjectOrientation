package ObjectOrientation.Chapter6;

public class Funcionario{
    private double salario;

    void aumentaSalario(double aumento){
        this.salario += aumento;
    }

    public double getSalario(){
        return this.salario;
    }
}
