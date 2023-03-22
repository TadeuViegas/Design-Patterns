package questao_02;

public class ImageManager {
    private ImageRender renderer;

    public void setRenderer(ImageRender renderer) {
        this.renderer = renderer;
    }

    public void show() {
        renderer.showImagemDevice();
    }
}
