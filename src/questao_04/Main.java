package questao_04;

public class Main {
    public static void main(String[] args) {
        /*O atributo promoção vai dizer qual desconto será aplicado
        se for true vai ser aplicado o desconto da loja
            ● Livros, Revistas Físicos e Jogos de Tabuleiro: 30% de desconto.
            ● Livros e Revistas digitais: 15% de desconto.
            ● Não há desconto para Jogos de Videogame.
        se for false sera aplicado um desconto especial de promoção durante o ano*/

        Jogo jogo = new Jogo("Counter Strike","valve",true,false, 100.0);
        Revista revista = new Revista("Forum", "LTDA", true, false, 100.0);
        Livro livro = new Livro("Codigo Limpo", "Uncle Bob", false, true, 100.0);

        System.out.println("--- VALOR DO DESCONTO ---");
        System.out.println("Desconto do jogo: R$" + jogo.calculaDesconto());
        System.out.println("Desconto da revista: R$" + revista.calculaDesconto());
        System.out.println("Desconto do livro: R$" + livro.calculaDesconto());
    }
}
