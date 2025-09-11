public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;


    //Métodos get e set (nome)
    public void setNome (String n){
        this.nome = n;
    }
    public String getNome() {
        return this.nome;
    }
    //Métodos get e set (idade)
    public void setIdade (int i){
        this.idade = i;
    }
    public int getIdade() {
        return this.idade;
    }
    //Métodos get e set (sexo)
    public void setSexo (String s) {
        this.sexo = s;
    }
    public String getSexo () {
        return this.sexo;
    }

}