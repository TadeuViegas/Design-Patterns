package questao_05;

public class NotaDe100 extends Manipulador {
    public NotaDe100(Manipulador nextManipulador) {
        super(nextManipulador);
    }

    @Override
    protected int getValorNota() {
        return 100;
    }
}
