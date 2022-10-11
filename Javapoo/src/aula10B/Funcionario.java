package aula10B;
public class Funcionario extends Pessoa{
    
    // Atribultos
    
    private String setor;
    private boolean trabalhando;
    
    // Métodos
    
    public void mudarTrabalho(String novoTrabalho) {
        this.trabalhando = ! this.trabalhando;
    }
    
    // Métodos especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

}
