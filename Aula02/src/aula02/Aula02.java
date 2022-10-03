package aula02;

import java.util.Scanner;

public class Aula02 {
    
    public static void main(String[] args) {
        Scanner tecl = new Scanner(System.in, "UTF-8");
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        Caneta c2 = new Caneta();
        c2.cor = "vermelha";
        c2.tampada = true;
        c2.destampar();
        c2.rabiscar();
    }
    
}
