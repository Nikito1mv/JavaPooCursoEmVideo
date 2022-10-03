package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Uma caneta "+this.cor);
        System.out.println("está tampada? "+ this.tampada);
        System.out.println("sua ponta é "+ this.ponta);
        System.out.println("e sua carga é "+ this.carga);
    }
    
    void rabiscar() {
        if(tampada) {
            System.out.println("ERROR caneta tampada");
        } else {
            System.out.println("Estou rabiscando");
        }
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
}
