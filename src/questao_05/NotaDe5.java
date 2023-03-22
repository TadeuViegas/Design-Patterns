package questao_05;

public class NotaDe5 extends Manipulador {
    public NotaDe5(Manipulador nextManipulador) {
        super(nextManipulador);
    }

    @Override
    protected int getValorNota() {
        return 5;
    }
}
