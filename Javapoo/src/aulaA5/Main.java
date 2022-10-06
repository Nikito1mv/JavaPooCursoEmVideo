package aulaA5;
public class Main {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        ContaBanco c2 = new ContaBanco();
        
        c1.setNumConta(1111);
        c1.setDono("Jubileu");
        c1.abrirConta("CC");
        
        c2.setNumConta(2222);
        c2.setDono("Creusa");
        c2.abrirConta("CP");
        
        c1.estadoAtual();
        c2.estadoAtual();
    }
}
