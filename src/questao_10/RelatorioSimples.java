package questao_10;

public class RelatorioSimples extends RelatorioBancario {

    protected void imprimirCabecalho() {
        System.out.println("Banco ABC");
    }

    protected void imprimirRodape() {
        System.out.println("(98) 9123-4567");
    }

    protected void imprimirDadosConta(Conta conta) {
        System.out.println("Titular: " + conta.getTitular()
                            + " - Saldo: " + conta.getSaldo());
    }
}
