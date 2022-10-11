package aula11B;
public class Aluno extends Pessoa{
    
    // Atribultos
    
    protected int matricula;
    protected String curso;
    
    // Métodos
    
    public void pagarMensalidade() {
        System.out.println("Pagando a mensalidade do/a aluno/a " + this.nome);
    }
    
    // Métodos especiais

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
