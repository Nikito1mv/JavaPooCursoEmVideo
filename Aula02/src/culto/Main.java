package culto;
public class Main {
    public static void main(String[] args) {
        Culto c1 = new Culto();
        c1.religiao = "Evangélica";
        c1.lideres = 3;
        c1.seguidores = 70;
        c1.local = "Igreja";
        c1.horaInicio = 19.0f;
        c1.horaTermino = 21.0f;
        c1.status();
        c1.tocarMusica();
        c1.comecar();
        c1.tocarMusica();
        c1.status();
    }
}
