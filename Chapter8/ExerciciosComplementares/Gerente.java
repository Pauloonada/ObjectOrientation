package ObjectOrientation.Chapter8.ExerciciosComplementares;

public class Gerente extends Funcionario{
    private String usuario;
    private String senha;

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
