package ObjectOrientation.Chapter3.ExerciciosComplementares;

public class Funcionario{
    public String nome;
    public float salario;

    void aumentaSalario(float valor){
        this.salario += valor;
    }

    public void consultaDados(){
        System.out.println("Dados do funcionário");
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
    }
}