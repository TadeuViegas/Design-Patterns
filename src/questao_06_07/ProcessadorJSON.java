package questao_06_07;

public class ProcessadorJSON extends Processador {
    @Override
    public void processa(Requisicao requisicao, Conta conta) {
        if (requisicao.getFormato() == Formato.JSON) {
            String json = "{ numero: " + conta.getTitular() + ", saldo:" + conta.getSaldo() + " }";
            System.out.println(json);
        } else {
            sucessor.processa(requisicao, conta);
        }
    }
}
