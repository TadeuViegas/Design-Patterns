package questao_10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Conta> contas = criarConta();

        System.out.println("\n--- Relatório Simples ---\n");
        RelatorioBancario relatorioSimples = new RelatorioSimples();
        relatorioSimples.gerarRelatorio(contas);

        System.out.println("\n--- Relatório Complexo ---\n");
        RelatorioBancario relatorioComplexo = new RelatorioComplexo();
        relatorioComplexo.gerarRelatorio(contas);
    }

    public static List<Conta> criarConta(){
        String[][] dadosContas = {
                { "1000.0", "João Pinheiro", "12345", "001" },
                { "2000.0", "Tadeu Viegas", "56789", "002" },
                { "3000.0", "Renilson Martins", "98765", "003" }
        };

        List<Conta> contas = new ArrayList<>();
        for (String[] dadosConta : dadosContas) {
            double saldo = Double.parseDouble(dadosConta[0]);
            String titular = dadosConta[1];
            String numero = dadosConta[2];
            String agencia = dadosConta[3];
            Conta conta = new Conta(saldo, titular, numero, agencia);
            contas.add(conta);
        }

        return contas;
    }
}
