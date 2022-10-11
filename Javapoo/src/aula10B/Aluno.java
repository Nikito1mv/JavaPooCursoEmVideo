package aula10B;
public class Aluno extends Pessoa {
    
    // Atribultos
    
    private int matricula;
    private String curso;

    // Métodos
    
    public void cancelarMatricula() {
        System.out.println("Matricula cancelada");
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
