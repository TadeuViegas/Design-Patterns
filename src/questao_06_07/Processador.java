package questao_06_07;

public abstract class Processador {
    protected Processador sucessor;

    public void setSucessor(Processador sucessor) {
        this.sucessor = sucessor;
    }

    public abstract void processa(Requisicao requisicao, Conta conta);
}
