package MVCPresentationLayer.Views;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class Login {
    public static String show(){
        JPasswordField loginPassword = new JPasswordField(10);
        loginPassword.setEchoChar('*');
        JLabel rotulo = new JLabel("Entre com a senha:");
        JPanel entUsuario = new JPanel();
        entUsuario.add(rotulo);
        entUsuario.add(loginPassword);
        JOptionPane.showMessageDialog(null, entUsuario, "Acesso restrito", JOptionPane.PLAIN_MESSAGE);
        return String.valueOf(loginPassword.getPassword());
    }
    
}
