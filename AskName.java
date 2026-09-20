import javax.swing.JOptionPane;

public class AskName {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to my project!");
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
    }
}

