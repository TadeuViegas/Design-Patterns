package questao_05;

public class Notade10 extends Manipulador {
    public Notade10(Manipulador nextManipulador) {
        super(nextManipulador);
    }

    @Override
    protected int getValorNota() {
        return 10;
    }
}
