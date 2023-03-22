package questao_06_07;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(1500, "Tadeu");
        //Formato recebe as constantes passadas no Enum
        Requisicao requisicao = new Requisicao(Formato.XML);
        chain(requisicao, conta);
    }

    public static void chain(Requisicao requisicao, Conta conta){
        Processador processadorXML = new ProcessadorXML();
        Processador processadorCSV = new ProcessadorCSV();
        Processador processadorJSON = new ProcessadorJSON();

        processadorJSON.setSucessor(processadorXML);
        processadorXML.setSucessor(processadorCSV);
        processadorCSV.setSucessor(new ProcessadorPORCENTO());

        processadorJSON.processa(requisicao, conta);
    }
}
