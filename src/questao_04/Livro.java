package questao_04;

public class Livro implements Desconto {
    private String titulo;
    private String autor;
    private boolean digital;
    private boolean aVista;
    private Double preco;

    public Livro(String titulo, String autor, boolean digital, boolean aVista, Double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.digital = digital;
        this.aVista = aVista;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDigital() {
        return digital;
    }

    public boolean isaVista() {
        return aVista;
    }

    @Override
    public double calculaDesconto() {
        if(aVista && !digital){
            return this.preco * 0.3;
        } else if (digital){
            return this.preco * 0.15;
        } else {
            return preco;
            //aqui pode ser aplicado um desconto especial durante o ano ex: "return preco * 0.20"
        }
    }
}
