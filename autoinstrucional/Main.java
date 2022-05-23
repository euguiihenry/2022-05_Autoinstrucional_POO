import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Main extends Methods {	
	public static void main(String[] args) {
		Interface program = new Interface();
		program.setTitle("Automatizador de Decisões");
		program.setUpButtonListeners();
	}
}