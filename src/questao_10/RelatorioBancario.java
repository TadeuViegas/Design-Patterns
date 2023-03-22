package questao_10;

import java.util.List;

public abstract class RelatorioBancario {

    public void gerarRelatorio(List<Conta> contas) {
        imprimirCabecalho();
        imprimirContas(contas);
        imprimirRodape();
    }

    protected abstract void imprimirCabecalho();

    protected abstract void imprimirRodape();

    protected abstract void imprimirDadosConta(Conta conta);

    private void imprimirContas(List<Conta> contas) {
        for (Conta conta : contas) {
            imprimirDadosConta(conta);
        }
    }

}