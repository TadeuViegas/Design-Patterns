package questao_05;

public abstract class Manipulador {
    private Manipulador nextManipulador;

    public Manipulador(Manipulador nextManipulador) {
        this.nextManipulador = nextManipulador;
    }

    public void manipula(int valor) {
        int qtdNotas = valor / getValorNota();
        if (qtdNotas > 0) {
            System.out.printf("%d nota(s) de R$ %d\n", qtdNotas, getValorNota());
        }
        int valorResto = valor % getValorNota();
        if (valorResto > 0 && nextManipulador != null) {
            nextManipulador.manipula(valorResto);
        }
    }

    protected abstract int getValorNota();
}
