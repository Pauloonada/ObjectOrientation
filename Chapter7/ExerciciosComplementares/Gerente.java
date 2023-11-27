package ObjectOrientation.Chapter7.ExerciciosComplementares;

public class Gerente extends Funcionario{
    private String usuario;
    private String senha;

    public double calculaBonificacao(){
        return this.getSalario() * 0.6 + 100;
    }

    public String getUsuario(){
        return this.usuario;
    }

    public String getSenha(){
        return this.senha;
    }

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }
}
