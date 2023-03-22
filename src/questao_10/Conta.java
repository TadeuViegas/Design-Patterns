package questao_10;

public class Conta {
    private double saldo;
    private String titular;
    private String numero;
    private String agencia;

    public Conta(double saldo, String titular, String numero, String agencia) {
        this.saldo = saldo;
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }
}