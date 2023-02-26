package br.com.Vitor_Ozorio.Loja_Crud.teste;

import javax.swing.*;

public class LoginScreen extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginScreen() {
        // Configurar a interface gráfica de usuário
        this.setTitle("Login");
        this.setSize(300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel userLabel = new JLabel("Usuário:");
        usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Senha:");
        passwordField = new JPasswordField(20);
        JButton loginButton = new JButton("Login");

        panel.add(userLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        this.add(panel);

        // Adicionar um ouvinte de eventos para o botão de login
        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            // Verificar se o nome de usuário e senha são válidos
            if (authenticate(username, password)) {
                // Redirecionar o usuário para a próxima tela do aplicativo
                JOptionPane.showMessageDialog(this, "Bem-vindo, " + username + "!");
            } else {
                // Exibir uma mensagem de erro se o nome de usuário ou senha forem inválidos
                JOptionPane.showMessageDialog(this, "Nome de usuário ou senha inválidos.", "Erro de Login", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private boolean authenticate(String username, String password) {
        // Substitua este método com sua própria lógica de autenticação
        return username.equals("admin") && password.equals("12345");
    }

    public static void main(String[] args) {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.setVisible(true);
    }
}

