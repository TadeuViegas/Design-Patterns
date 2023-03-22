package questao_04;

public class Revista implements Desconto {
    private String titulo;
    private String editora;
    private boolean digital;
    private boolean aVista;
    private Double preco;

    public Revista(String titulo, String editora, boolean digital, boolean aVista, Double preco) {
        this.titulo = titulo;
        this.editora = editora;
        this.digital = digital;
        this.aVista = aVista;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditora() {
        return editora;
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
            return preco; //aqui pode ser aplicado um desconto especial durante o ano ex: "return preco * 0.20"
        }
    }
}