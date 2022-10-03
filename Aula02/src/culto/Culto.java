package culto;
public class Culto {
    String religiao;
    int lideres;
    int seguidores;
    String local;
    float horaInicio;
    float horaTermino;
    boolean musicaTocando;
    boolean acontecendo;
    
    void status() {
        System.out.println("A religião é "+ this.religiao);
        System.out.println("O culto esta acontecendo agora? " +this.acontecendo);
        System.out.println("Existe "+this.lideres+ " Líderes e " + this.seguidores+ " seguidores");
        System.out.println("O culto acontece no/na " +this.local+ " começa as " +this.horaInicio+ " horas e termina as " +this.horaTermino+ " horas");
        System.out.println("Tem musica tocando? " +this.musicaTocando);
    }
    
    void comecar() {
        this.acontecendo = true;
        System.out.println("O culto começou");
    }
    
    void terminar() {
        this.acontecendo = false;
        System.out.println("O culto terminou");
    }
    
    void entrarLider() {
        this.lideres += 1;
    }
    
    void sairLider() {
        if(this.lideres > 1) {
            this.lideres -= 1;
        } else {
            System.out.println("Não é possivel o lider sair pois so existe ele");
        }
    }
    
    void entrarSeguidor() {
        this.seguidores += 1;
    }
    
    void sairSeguidor() {
        if(this.seguidores > 1) {
            this.lideres -= 1;
        } else if (this.seguidores == 1) {
            this.seguidores = 0;
            System.out.println("O culto não tem mais seguidores");
        } else {
            System.out.println("Não é possivel sair um seguidor");
        }
    }
    
    void tocarMusica() {
        if (this.acontecendo) {
            this.musicaTocando = true;
            System.out.println("A música está tocando");
        } else {
            System.out.println("Não foi possivel tocar a música pois o culto não começou ainda");
        }
    }
    
    void pararMusica() {
        if (this.acontecendo) {
            this.musicaTocando = false;
            System.out.println("A música parou de tocar");
        }
    }
}
