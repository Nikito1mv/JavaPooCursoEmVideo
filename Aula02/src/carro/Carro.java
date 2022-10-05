package carro;
public class Carro {
    String placa;
    String modelo;
    String cor;
    float combustivel;
    boolean ligado;
    float kilometragem;
    boolean dentro;
    
    void entrar() {
        this.dentro = true;
        System.out.println("Você entrou no carro");
    }
    
    void sair() {
        if (this.ligado) {
            System.out.println("Você precisa desligar o carro para sair");
        } else {
            this.dentro = false;
            System.out.println("Você saiu do carro");
        }
    }
    
    void ligar() {
        if (this.dentro) {
            this.ligado = true;
            System.out.println("O carro ligou");
        } else {
            System.out.println("Não foi possivel ligar o carro pois você não está dentro dele");
        }
    }
    
    void desligar() {
        this.ligado = false;
        System.out.println("O carro desligou");
    }
    
    void acelerar() {
        this.kilometragem += 1;
        System.out.println("O carro andou 1km");
    }
    
    void freiar() {
        System.out.println("O carro está freiando");
    }
    
    void abastecer() {
        this.combustivel = 100;
        System.out.println("O tanque encheu");
    }
}
