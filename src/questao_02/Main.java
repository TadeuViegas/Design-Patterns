package questao_02;
//Strategy tem como base o OCP (Open Closed Principle)

public class Main {
    public static void main(String[] args) {
        ImageManager imageManager = new ImageManager();

        TVRender tvRender = new TVRender();
        imageManager.setRenderer(tvRender);
        imageManager.show();

        SmartphoneRender smartphoneRender = new SmartphoneRender();
        imageManager.setRenderer(smartphoneRender);
        imageManager.show();

        LaptopRender laptopRender = new LaptopRender();
        imageManager.setRenderer(laptopRender);
        imageManager.show();
    }
}
