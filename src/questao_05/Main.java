package questao_05;

public class Main {
    public static void main(String[] args) {
        RequisicaoCaixaEletronico requisicaoCaixaEletronico = new RequisicaoCaixaEletronico();
        /*usando o valor de exemplo da R$ 475, que deve entregar:
        ● 4 notas de R$100
        ● 1 nota de R$50
        ● 1 nota de R$20
        ● 1 nota de R$5*/
        requisicaoCaixaEletronico.sacar(475);
    }
}
