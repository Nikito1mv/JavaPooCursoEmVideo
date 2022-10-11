package aula09B;
public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Micael", 20, "Masculino");
        p[1] = new Pessoa("Geovana", 25, "Feminino");
        
        l[0] = new Livro("Do mil ao milhão", "Thiago Nigro", 192, p[0]);
        l[1] = new Livro("Aprendendo Java", "José da Silva", 300, p[1]);
        l[2] = new Livro("Java avançado", "Maria Candido", 800, p[0]);
        
        l[0].abrir();
        l[0].folhear(190);
        l[0].avancarPag();
        l[0].voltarPag();
        
        System.out.println(l[0].toString());
        l[1].detalhes();
        l[2].detalhes();
    }
}
