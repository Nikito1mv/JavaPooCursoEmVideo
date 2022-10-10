package aulaB9;
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Micael", 20, "Masculino");
        Livro l1 = new Livro("Do mil ao milhão", "Thiago Nigro", 192, p1);
        System.out.println(l1.toString());
    }
}
