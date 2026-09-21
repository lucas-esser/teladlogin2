package src;

import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {

    public TelaCadastro() {
        initComponents();
    }

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String nome = jTxtNome.getText();
            String preco = jTxtPreco.getText();
            String estoque = jTxtEstoque.getText();

            double precoConvertido = Double.parseDouble(preco);
            int estoqueConvertido = Integer.parseInt(estoque);

            Produto produto = new Produto(
                nome,
                precoConvertido,
                estoqueConvertido
            );

            ProdutoDAO dao = new ProdutoDAO();
            dao.cadastrar(produto);

            JOptionPane.showMessageDialog(
                this,
                "Produto cadastrado!"
            );

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                this,
                "Erro: " + e.getMessage()
            );
        }
    }
}
