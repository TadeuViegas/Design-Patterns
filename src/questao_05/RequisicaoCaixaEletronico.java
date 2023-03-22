package questao_05;

public class RequisicaoCaixaEletronico {
    private Manipulador primeiroManipulador;

    public RequisicaoCaixaEletronico() {
        NotaDe100 notaDe100 = new NotaDe100(null);
        NotaDe50 notaDe50 = new NotaDe50(notaDe100);
        NotaDe20 notaDe20 = new NotaDe20(notaDe50);
        Notade10 notade10 = new Notade10(notaDe20);
        NotaDe5 notaDe5 = new NotaDe5(notade10);
        primeiroManipulador = notaDe5;
    }

    public void sacar(int valor) {
        System.out.println("Valor do Saque: R$" + valor);
        primeiroManipulador = new NotaDe100(new NotaDe50(new NotaDe20(new Notade10(new NotaDe5(null)))));
        primeiroManipulador.manipula(valor);
    }
}
