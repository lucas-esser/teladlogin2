package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaLogin extends JFrame {

    JTextField campoUsuario = new JTextField(15);
    JPasswordField campoSenha = new JPasswordField(15);
    JButton botaoEntrar = new JButton("Entrar");

    public TelaLogin() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        add(new JLabel("Usuário:"));
        add(campoUsuario);
        add(new JLabel("Senha:"));
        add(campoSenha);
        add(botaoEntrar);

        botaoEntrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                entrar();
            }
        });
    }

    public void entrar() {
        String usuario = campoUsuario.getText();
        String senha = new String(campoSenha.getPassword());

        if (usuario.equals("admin") && senha.equals("1234")) {
            TelaCadastro tela = new TelaCadastro();
            tela.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos!");
            campoSenha.setText("");
        }
    }
}