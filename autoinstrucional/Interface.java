import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface extends JFrame {
	// Variables:
		private JFrame		frame;
		protected JButton 	btGenerate;
		protected JButton 	btExit;
		protected JLabel	question;
		protected Image 	iconImage;
		protected String[]	stringChoices = {"Comida", "Aleatória", "Documentário", "Filme", "Lazer", "Livro", "Série","Bricandeiras"};
		protected JComboBox categoryList = new JComboBox(stringChoices);
	
	// Methods:
		public Interface() {
			frame = new JFrame();
			getContentPane().setLayout(null); 
			
			// Question:
				question = new JLabel();
				question.setText("Escolha uma opção para obter uma recomendação:");
				question.setBounds(40,60,400,20);
				question.setOpaque (true);
				
			// Program Icon:
				iconImage = Toolkit.getDefaultToolkit().getImage("automatizador_icon.png");
			
			// Setting the ComboBox:
				categoryList.setBounds(41,90,290,30);
				categoryList.setOpaque (true);
				//categoryList.setBackground ( Color.white );
	
				
			// Action Buttons:
				// Generate Button:
					btGenerate = new JButton();
					btGenerate.setText("Gerar Recomendação");
					btGenerate.setBounds(50,130,160,30);
					//btGenerate.addActionListener(this);	
					btGenerate.setOpaque (true);
					btGenerate.setBackground ( Color.WHITE );
					
				// Exit Button:
					btExit = new JButton();
					btExit.setText("Sair");
					btExit.setBounds(220,130,100,30);
					btExit.setOpaque (true);
					btExit.setBackground ( Color.WHITE );
			
			// Adding Objects:
				add(question);
				add(categoryList);
				add(btGenerate);
				add(btExit);
				
			// Setting the settings of interface:
				setBounds(20,20, 300, 300);
				setVisible(true);
				
				setSize(400, 400);
				setLayout(null);
				setLocationRelativeTo(null);
		
		        setResizable(false);
		        setFocusable(true);
				
				setIconImage(iconImage);
				
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		public void setUpButtonListeners() {
			ActionListener btGenerateListener = new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent a) {
					Methods method = new Methods();
					String message;
					
					method.setComboBoxIndex(categoryList.getSelectedIndex());
					message = method.generateDecision();
					
			  	    //setVisible(false);
					JOptionPane.showMessageDialog(null, message);
				}
			};
			
			btGenerate.addActionListener(btGenerateListener);
			
			ActionListener btExitListener = new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent b) {
					String message = "Bye-bye :)";
					JOptionPane.showMessageDialog(null, message);
					System.exit(0);
				}
			};
			
			btExit.addActionListener(btExitListener);
		}
}
