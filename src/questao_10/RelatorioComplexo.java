package questao_10;

import java.time.LocalDate;

public class RelatorioComplexo extends RelatorioBancario {

    protected void imprimirCabecalho() {
        System.out.println("Banco ABC, Rua dos Anjos, 123 - (98) 9123-4567");
    }

    protected void imprimirRodape() {
        System.out.println("E-mail: contact@bankabc.com.br");
        System.out.println("Data: " + LocalDate.now());
    }

    protected void imprimirDadosConta(Conta conta) {
        System.out.println("Titular: " + conta.getTitular()
                            + " - Agência: " + conta.getAgencia()
                            + " - Conta: " + conta.getNumero()
                            + " - Saldo: " + conta.getSaldo());
    }
}
