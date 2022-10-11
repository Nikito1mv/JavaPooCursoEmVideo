package aula11B;
public class Bolsista extends Aluno{
    
    // Atribultos
    
    protected float bolsa;
    
    // Métodos
    
    public void renovarMensalidade() {
        System.out.println("Renovando a bolsa de " + this.nome);
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista! Pagamento facilitado");
    }
    
    // Métodos especiais

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
