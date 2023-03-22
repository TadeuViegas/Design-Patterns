package questao_06_07;

public class ProcessadorXML extends Processador {
    @Override
    public void processa(Requisicao requisicao, Conta conta) {
        if (requisicao.getFormato() == Formato.XML) {
            String xml = "<conta> <numero>" + conta.getTitular() + "</numero> <saldo>" + conta.getSaldo() + "</saldo></conta>";
            System.out.println(xml);
        } else {
            sucessor.processa(requisicao, conta);
        }
    }
}
