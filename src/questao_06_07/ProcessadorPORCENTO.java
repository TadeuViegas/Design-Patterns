package questao_06_07;

public class ProcessadorPORCENTO extends Processador {
    @Override
    public void processa(Requisicao requisicao, Conta conta) {
        if (requisicao.getFormato() == Formato.PORCENTO) {
            String porcento = conta.getTitular() + "%" + conta.getSaldo();
            System.out.println(porcento);
        } else {
            System.out.println("Formato de requisição inválido.");
        }
    }
}
