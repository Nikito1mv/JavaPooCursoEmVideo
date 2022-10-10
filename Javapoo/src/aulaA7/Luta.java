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
            System.out.println("### Desafiado ###");
            this.desafiado.apresentar();
            
            int v0 = 0;
            int v1 = 0;
            int v2 = 0;
            System.out.println("RESULTADOS DOS ROUNDS");
            for (int i = 1; i <= rounds; i++) {
                Random random = new Random();
                int vencedorRound = random.nextInt(3);
                switch (vencedorRound) {
                    case 0:
                        v0 += 1;
                        System.out.println(i + " round: empate");
                        break;
                    case 1:
                        v1 += 1;
                        System.out.println(i + " round: " + desafiante.getNome() + " Venceu");
                        break;
                    case 2:
                        v2 += 2;
                        System.out.println(i + " round: " + desafiado.getNome() + " venceu");
                        break;
                }
            }
            int vencedor = 0;
            int roundsVencidos[] = {v0, v1, v2};
            int max = roundsVencidos[0];
            for (int i = 0; i < roundsVencidos.length; i++) {
                if (roundsVencidos[i] > max) {
                    max = roundsVencidos[i];
                    vencedor = i;
                }
            }
            
            //System.out.println(vencedor);
            
            System.out.println("VENCEDOR DA LUTA");
            
            switch (vencedor) {
                case 0:
                    System.out.println("A luta empatou");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println("O desafiante " + desafiante.getNome() + " ganhou");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2:
                    System.out.println("O desafiado " + desafiado.getNome() + " ganhou");
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    break;
                }
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }
}
