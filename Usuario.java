import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Usuario extends Pessoa implements AcaoUsuario{       


private String email;

@Override
public String toString() {
    return dados();
}


    private int NLogin;
    private int Senha;
    private Boolean logar;

    private String dados () { 
        return "-------Dados Usuário--------\n" +
               "Nome: " + getNome() + "\n" +
               "Idade: " + getIdade() + "\n" +
               "Sexo: " + getSexo() + "\n" +
               "----------Dados Conta-----------\n" +
               "Email: " + getEmail() + "\n" +
               "Número login: " + getNLogin() + "\n" +
               "Status: " + getLogar() + "\n";
    }


    public Boolean getLogar() {
        return logar;
    }

    
    public void IsLogar(Boolean logar) {
        this.logar = logar;
    }


    public Usuario(String email, int nLogin, int senha, String nome, String Sexo, int idade) {
        this.email = email;
        NLogin = nLogin;
        Senha = senha;
        setNome(nome);
        setSexo(Sexo);
        setIdade(idade);
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getNLogin() {
        return NLogin;
    }
    public void setNLogin(int nLogin) {
        NLogin = nLogin;
    }
    public int getSenha() {
        return Senha;
    }
    public void setSenha(int senha) {
        Senha = senha;
    }
    public void exportar(String conteudo, String caminhoArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            writer.write(conteudo);
            System.out.println("Arquivo salvo em: " + caminhoArquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void imprimir () {
        exportar(dados(), "usuario.txt");
    }

    @Override
    public void logar(int s) {
        if (getSenha() == s) {
            System.out.println("Logado com sucesso!");
            logar = true;
        }
        else {
            System.out.println("Senha incorreta");
        }
    }


    @Override
    public void deslogar() {
      System.out.println("Tchau! Conta deslogada!");
      logar = false;
    }


    @Override
    public void apagarconta() {
        System.out.println("Sua conta já foi apagada!");
    }


    @Override
    public void verconta(int s) {
       if (getSenha() == s) {
         dados();
        }
        else {
            System.out.println("Senha incorreta");
        }
    }


   


}
