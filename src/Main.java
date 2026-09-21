package src;

public class Main {

    public static void main(String[] args) {
        Conexao.inicializarBanco();

        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
    }
}