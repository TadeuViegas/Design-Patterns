package questao_05;

public class NotaDe20 extends Manipulador {
    public NotaDe20(Manipulador nextManipulador) {
        super(nextManipulador);
    }

    @Override
    protected int getValorNota() {
        return 20;
    }
}
