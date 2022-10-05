package aulaA5;
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public ContaBanco() {
        setSaldo(0);
        setStatus(false);
    }
    
    public void abrirConta(String tipo) {
        setTipo(tipo);
        setStatus(true);
        if (tipo == "CC") {
            setSaldo(50);
        } else if (tipo == "CP") {
            setSaldo(150);
        }
    }
    
    public void fecharConta() {
        if (getSaldo() > 0) {
            System.out.println("Error, a conta tem dinheiro");
        } else if (getSaldo() < 0) {
            System.out.println("Error, a conta está em débito");
        } else {
            setStatus(false);
        }
    }
    
    public void depositar(float valor) {
        if (isStatus()) {
            setSaldo(getSaldo() + valor);
        } else {
            System.out.println("Error, a conta está fechada");
        }
    }
    
    public void sacar(float valor) {
        if (isStatus()) {
            if (valor <= getSaldo()) {
                setSaldo(getSaldo() - valor);
            } else {
                System.out.println("Saldo isuficiente");
            }
        } else {
            System.out.println("Error, a conta está fechada");
        }
    }
    
    public void pagarMensalidade() {
        if (isStatus()) {
            if (getTipo() == "CC") {
                if (12 <= getSaldo()) {
                    setSaldo(getSaldo() - 12);
                }
            } else if (getTipo() == "CP") {
                if (20 <= getSaldo()) {
                    setSaldo(getSaldo() - 20);
                }
            }
        } else {
            System.out.println("Error, a conta está fechada");
        }
    }

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


}
