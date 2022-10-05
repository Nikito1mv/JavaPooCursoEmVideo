package caneta;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampada = true;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    
    public void status() {
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ponta: " + ponta);
        System.out.println("Tampada: " + tampada);
    }
    
    public void tampar() {
        tampada = true;
    }
    
    public void destampar() {
        tampada = false;
    }
}
