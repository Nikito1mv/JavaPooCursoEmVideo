package aula11B;
public abstract class Pessoa {
    
    // Atribultos
    
    protected String nome;
    protected int idade;
    protected String sexo;
    
    // Métodos
    
    public void fazerAniv() {
        this.idade ++;
    }
    
    // Métodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
}