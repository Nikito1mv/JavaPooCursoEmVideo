package aulaB9;
public class Livro implements IPublicacao{
    // Atribultos
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // Métodos especiais

    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ",\n autor=" + autor + ",\n totPag=" + totPag + ",\n pagAtual=" + pagAtual + ",\n aberto=" + aberto + ",\n leitor=" + leitor.getNome() + '}';
    }
    
    // Métodos interface

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        this.setPagAtual(0);
    }

    @Override
    public void folhear(int p) {
        if(this.isAberto() && p >= 0 && p <= this.getTotPag()) {
            this.setPagAtual(p);
        } else {
            System.out.println("Error");
        }
    }

    @Override
    public void avancarPag() {
        if(this.isAberto() && this.getPagAtual() < this.getTotPag()){
            this.setPagAtual(this.getPagAtual() + 1);
        } else {
            System.out.println("Error");
        }
    }

    @Override
    public void voltarPag() {
        if(this.isAberto() && this.getPagAtual() > 0){
            this.setPagAtual(this.getPagAtual() - 1);
        } else {
            System.out.println("Error");
        }
    }
    
    // Métodos operacionais
    
    public void detalhes() {
        System.out.println("---------------------------------");
        System.out.println("Título: " + this.getTitulo() +
        "\nAutor: " + this.getAutor() +
        "\nTotal de páginas: " + this.totPag +
        "\nPágina atual: " + this.pagAtual +
        "\nAberto: " + this.isAberto() +
        "\nLeitor: " + this.getLeitor().getNome());
    }

}
