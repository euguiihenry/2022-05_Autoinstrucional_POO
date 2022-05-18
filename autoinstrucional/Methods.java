import java.util.*;

import javax.swing.JOptionPane;

public class Methods extends Interfaces{
	// Variables:
		private int comboBoxIndex;
		private String generated;
		
	// Getters and Setters:
		public int getComboBoxIndex() {
			return comboBoxIndex;
		}

		public void setComboBoxIndex(int comboBoxIndex) {
			this.comboBoxIndex = comboBoxIndex;
		}
		
	// Method for generate index number for dynamic choice:
		public int indexNumber() {
			int index;
			
			index = 1;
			index = (int) new Random().nextInt(10);
			
			return index;
		}

	// Method for Generate Decision:
		public String generateDecision() {
			if(getComboBoxIndex() == 1) {
				do {
					setComboBoxIndex((int) new Random().nextInt(7));
				}while(getComboBoxIndex() == 2);
			}
			
			switch(getComboBoxIndex()) {
				case 0:
					String[] comidas = {"Bai�o de Dois", "Sururu ao Coco", "Camar�o no Bafo", "Tambaqui Assado", "Acaraj�", "Moqueca", "Empad�o", "Arroz de Cux�", "Arroz Maria Isabel", "Frango com Quiabo"};
					
					JOptionPane.showMessageDialog(null, "A comida sugerida �:");
					
					generated = comidas[indexNumber()];
					
					return generated;
				case 2:
					generated = "3";
					
					return generated;
				case 3:
					generated = "4";
					
					return generated;
				case 4:
					generated = "5";
					
					return generated;
				case 5:
					generated = "6";
					
					return generated;
				case 6:
					generated = "7";
					
					return generated;
			}
			
			return null;
		}
}