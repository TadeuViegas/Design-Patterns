package questao_05;

public class NotaDe50 extends Manipulador {
    public NotaDe50(Manipulador nextManipulador) {
        super(nextManipulador);
    }

    @Override
    protected int getValorNota() {
        return 50;
    }
}
