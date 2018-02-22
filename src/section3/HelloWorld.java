package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
	System.out.println("Hello Cyrus");
	String answer=JOptionPane.showInputDialog(null, "Whats your name?");
	JOptionPane.showMessageDialog(null, "Hello " + answer);
}
}
