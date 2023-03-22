package questao_04;

public class Jogo implements Desconto{
    private String titulo;
    private String desenvolvedora;
    private boolean digital;
    private boolean aVista;
    private Double preco;

    public Jogo(String titulo, String desenvolvedora, boolean digital, boolean aVista, Double preco) {
        this.titulo = titulo;
        this.desenvolvedora = desenvolvedora;
        this.digital = digital;
        this.aVista = aVista;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public boolean isDigital() {
        return digital;
    }

    public boolean isaVista() {
        return aVista;
    }

    @Override
    public double calculaDesconto() {
        return 0;
        //como jogo digital (video game) nao tem desconto a vista, aqui cabe um desconto especial
    }
}
