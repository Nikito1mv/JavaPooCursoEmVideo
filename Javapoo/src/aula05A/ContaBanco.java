package aula05A;
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual() {
        System.out.println("-----------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    
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
        float v = 0;
        if (getTipo() == "CC") {
            v = 12;
        } else if (getTipo() == "CP") {
            v = 20;
        }
        if (isStatus()) {
            if (getSaldo() >= v) {
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("Saldo isuficiente");
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
