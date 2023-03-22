package questao_06_07;

public class ProcessadorCSV extends Processador {
    @Override
    public void processa(Requisicao requisicao, Conta conta) {
        if (requisicao.getFormato() == Formato.CSV) {
            String csv = conta.getTitular() + "%" + conta.getSaldo();
            System.out.println(csv);
        } else {
            sucessor.processa(requisicao, conta);
        }
    }
}
