package aula06A;
public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        //c.setVolume(50);
        c.ligar();
        c.aumentarVolume();
        c.ligarMudo();
        c.abrirMenu();
        c.fecharMenu();
    }
}
