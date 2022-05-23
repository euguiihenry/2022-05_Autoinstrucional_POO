import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends Methods{
	// Variables:
		private JFrame 		frame;
		private JLabel		guideLabel;
		private Image		iconImage;
		private String[]	choices;
		private JComboBox 	categoryList;
		private JButton		btGenerate;
		private JButton 	btExit;
		private JLabel		teamLabel;
		private int			width;
		private int			height;
		
	// Constructor:
		public GUI(int w, int h) {
			// Setting the frame:
				frame = new JFrame();
				
			// Setting the guide text label:
				guideLabel = new JLabel("Escolha uma opção para obter uma sugestão:");
			
			// Setting the program icon:
				iconImage = Toolkit.getDefaultToolkit().getImage("automatizador_icon.png");
				
			// Setting the categoryList and choices:
				choices = new String[] {"Aleatório", "Bricandeira", "Comida", "Documentário", "Filme", "Lazer", "Livro", "Série"};
				categoryList = new JComboBox(choices);
					
			// Setting the buttons:
				btGenerate = new JButton("Gerar Recomendação");
				btExit = new JButton("Sair");
				
			// Setting the team label:
				teamLabel = new JLabel("Made by Guilherme & Matheus");
			
			// Setting width and height:
				width = w;
				height = h;
		}
	
	// Method for set up the GUI:
		public void setUpGUI() {
			// Setting the container and its layout:
				frame.getContentPane().setLayout(null); 
			
			// Setting interface elements:
				// Elements bounds:
					guideLabel.setBounds(60,60,400,20);
					categoryList.setBounds(41,100,290,30);
					btGenerate.setBounds(50,150,160,30);
					btExit.setBounds(220,150,100,30);
					teamLabel.setBounds(100,250,400,20);
					
				// Adding the elements:
					frame.add(guideLabel);
					frame.add(categoryList);
					frame.add(btGenerate);
					frame.add(btExit);
					frame.add(teamLabel);
				
			// Setting GUI settings:
				frame.setBounds(20,20, 300, 300);
				frame.setSize(width, height);
				frame.setTitle("Gerador de Sugestões");
				frame.setIconImage(iconImage);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
		}
		
	// Method for action listeners:
		public void setUpButtonListeners() {
			ActionListener generateSuggestion = new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent ae) {
					Methods method = new Methods();
					method.setComboBoxIndex(categoryList.getSelectedIndex());
					JOptionPane.showMessageDialog(null, method.generateDecision());
				}
			};
			
			btGenerate.addActionListener(generateSuggestion);
			
			ActionListener exitAction = new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent ae) {
					JOptionPane.showMessageDialog(null, "Bye-bye :)");
					System.exit(0);
				}
			};
			
			btExit.addActionListener(exitAction);
		}
}
