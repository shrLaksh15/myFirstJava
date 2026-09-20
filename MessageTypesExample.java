import javax.swing.JOptionPane;
public class MessageTypesExample {
public static void main(String[] args) {
JOptionPane.showMessageDialog(
null,
"This is an information message.",
"Information",
JOptionPane.INFORMATION_MESSAGE
);
JOptionPane.showMessageDialog(
null,
"This is a warning message.",
"Warning",
JOptionPane.WARNING_MESSAGE
);
JOptionPane.showMessageDialog(
null,
"Something went wrong!",
"Error",
JOptionPane.ERROR_MESSAGE
);
JOptionPane.showMessageDialog(
null,
"This is a plain message.",
"Plain",
JOptionPane.PLAIN_MESSAGE
);
JOptionPane.showMessageDialog(
null,
"This is a question message.",
"Question",
JOptionPane.QUESTION_MESSAGE
);
}
}