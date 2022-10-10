package aulaA7;

import java.util.Random;

public class Luta {
    
    // Atribultos
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    // Métodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
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
    
    public void marcarLuta(Lutador l1, Lutador l2, int rounds) {
        this.setRounds(rounds);
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiante(l1);
            this.setDesafiado(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    }
    
    public void lutar() {
        if (this.isAprovada()) {
            System.out.println("### Desafiante ###");
            this.desafiante.apresentar();
            System.out.println("");
            System.out.println("### Desafiado ###");
            this.desafiado.apresentar();
            System.out.println("");
            
            System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
            
            float xp1 = desafiante.getVitorias() + desafiante.getDerrotas() + desafiante.getEmpates();
            float vi1 = desafiante.getVitorias() / xp1;
            float tamanho1 = desafiante.getAltura() * desafiante.getPeso();
            Random random = new Random();
            int sorte1 = random.nextInt(151);
            float over1 = 0;
            if (desafiante.getIdade() < 22) {
                over1 = 0.75f;
            } else if (desafiante.getIdade() < 28) {
                over1 = 1;
            } else if (desafiante.getIdade() < 34) {
                over1 = 1.5f;
            } else if (desafiante.getIdade() < 37) {
                over1 = 1.25f;
            } else if (desafiante.getIdade() < 41) {
                over1 = 1;
            } else {
                over1 = 0.5f;
            }
            
            float xp2 = desafiado.getVitorias() + desafiado.getDerrotas() + desafiado.getEmpates();
            float vi2 = desafiado.getVitorias() / xp2;
            float tamanho2 = desafiado.getAltura() * desafiado.getPeso();
            int sorte2 = random.nextInt(151);
            float over2 = 0;
            if (desafiado.getIdade() < 22) {
                over2 = 0.75f;
            } else if (desafiado.getIdade() < 28) {
                over2 = 1;
            } else if (desafiado.getIdade() < 34) {
                over2 = 1.5f;
            } else if (desafiado.getIdade() < 37) {
                over2 = 1.25f;
            } else if (desafiado.getIdade() < 41) {
                over2 = 1;
            } else {
                over2 = 0.5f;
            }
            
            System.out.println("### Desafiante ###");
            System.out.println("Experiência: " + (xp1 * 3));
            System.out.println("Percentual de vitórias: "+ (vi1*400));
            System.out.println("Físico: "+ tamanho1);
            System.out.println("Sorte: "+ sorte1);
            System.out.println("Capacidade de idade: "+ over1);
            
            System.out.println("");
            
            System.out.println("### Desafiado ###");
            System.out.println("Experiência: " + (xp2 * 3));
            System.out.println("Percentual de vitórias: "+ (vi2*400));
            System.out.println("Físico: "+ tamanho2);
            System.out.println("Sorte: "+ sorte2);
            System.out.println("Capacidade de idade: "+ over2);
            
            System.out.println("");
            float probabilidade1 = ((xp1 * 3) + (vi1 * 400) + tamanho1 + sorte1) * over1;
            System.out.println("Desafiante: " + probabilidade1);
            float probabilidade2 = ((xp2 * 3) + (vi2 * 400) + tamanho2 + sorte2) * over2;
            System.out.println("Desafiado: " + probabilidade2);
            System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
            
            System.out.println("RESULTADO DA LUTA");
            
            if(probabilidade1 > probabilidade2) {
                System.out.println("O desafiante " + desafiante.getNome() + " ganhou");
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
            } else if (probabilidade1 < probabilidade2) {
                System.out.println("O desafiado " + desafiado.getNome() + " ganhou");
                this.desafiante.perderLuta();
                this.desafiado.ganharLuta();
            } else {
                System.out.println("A luta empatou");
                this.desafiante.empatarLuta();
                this.desafiado.empatarLuta();
            }
            System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }
}
