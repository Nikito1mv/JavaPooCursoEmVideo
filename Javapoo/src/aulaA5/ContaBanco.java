package aulaA5;
public class ContaBanco {
    int numConta;
    String tipo;
    String dono;
    float saldo;
    boolean status;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta() {
        this.status = true;
    }
    
    public void fecharConta() {
        this.status = false;
    }
    
    public void depositar(float valor) {
        if (status) {
            this.saldo += valor;
        } else {
            System.out.println("Error, a conta está fechada");
        }
    }
    
    public void sacar(float valor) {
        if (status) {
            if (valor <= saldo) {
                this.saldo -= valor;
            } else {
                System.out.println("Saldo isuficiente");
            }
        } else {
            System.out.println("Error, a conta está fechada");
        }
    }
    
    public void pagarMensalidade(float valor) {
        if (status) {
            if (valor <= saldo) {
                this.saldo -= valor;
            } else {
                System.out.println("Saldo isuficiente");
            }
        } else {
            System.out.println("Error, a conta está fechada");
        }
    }

    public ContaBanco(int numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        if (this.tipo == "CC") {
            this.saldo = 50;
        } else if (this.tipo == "CP") {
            this.saldo = 150;
        }
        this.dono = dono;
        this.status = true;
    }
}
