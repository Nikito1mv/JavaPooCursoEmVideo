package aulaA7;
public class Luta {
    
    // Atribultos
    
    private String desafiado;
    private String desafiante;
    private int rounds;
    private boolean aprovada;
    
    // Métodos especiais

    public Luta(String desafiado, String desafiante, int rounds, boolean aprovada) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.rounds = rounds;
        this.aprovada = aprovada;
    }

    public String getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(String desafiado) {
        this.desafiado = desafiado;
    }

    public String getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(String desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    // Métodos
    
    public void marcarLuta() {
        
    }
    
    public void lutar() {
        
    }
}
