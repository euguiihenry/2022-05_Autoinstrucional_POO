import java.util.*;

import javax.swing.JOptionPane;

public class Methods {
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

		index = (int) new Random().nextInt(7);

		return index;
	}

	// Method for Generate Decision:
	public String generateDecision() {
		if (getComboBoxIndex() == 0) {
			do {
				setComboBoxIndex((int) new Random().nextInt(7));
			} while (getComboBoxIndex() == 0);

		}

		switch (getComboBoxIndex()) {
			case 1:
				String[] brincaderia = {"Verdade ou mentira", "A bolinha e a ponte", "Estoure o balão", "Jogo das mãos.", "Tudo com a mesma letra", "7 pecados", "Corre Cutia"};					
				
				
				generated = brincaderia[indexNumber()];
				
				JOptionPane.showMessageDialog(null, "A brincadeira sugerida foi: ");	
				
				return generated;
				
			case 2:
				String[] comidas = { "Baião de Dois", "Sururu ao Coco", "Camarão no Bafo", "Tambaqui Assado", "Acarajé",
						"Moqueca", "Empadão"};
	
				generated = comidas[indexNumber()];
	
				JOptionPane.showMessageDialog(null, "A comida sugerida é:");
	
				return generated;
				
			case 3:
	
				String[] documentario = { "Nosso Planeta (2019)", "O Dilema das Redes (2020)",
						"Making a Murderer (2015-)", "Abstract: The Art of Design (2017-)",
						"Winter on Fire: Ukraine's Fight for Freedom (2015)", "A 13ª Emenda (2016)",
						"Dança dos Pássaros (2019)"};
	
				generated = documentario[indexNumber()];
	
				JOptionPane.showMessageDialog(null, "O documentario sugerido é:");
	
				return generated;
	
			case 4:
				String[] filme = { "The Tree of Life (2011), Terrence Malick",
						"Brilho Eterno de uma Mente Sem Lembranças (2004)", "Memento (Amnésia) (2001)",
						"Clube da Luta (1999)", "O Poderoso Chefão (1972)", "A Chegada (2016)",
						"Fragmentado (2016)"};
	
				generated = filme[indexNumber()];
	
				JOptionPane.showMessageDialog(null, "O filme sugerido é:");
	
				return generated;
	
			case 5:
				String[] lazer = { "Caminhar", "Andar de bicicleta", "Skate", "Patins", "Caminhar", "Fotografar",
						"Ler livros"};
	
				generated = lazer[indexNumber()];
	
				JOptionPane.showMessageDialog(null, "A atividade de lazer sugerido é:");
	
				return generated;
			case 6:
	
				String[] livro = { "Odisseia, Homero", "A cabana do Pai Tomás - Harriet Beecher Stowe",
						"Frankenstein, Mary Shelley", "1984, George Orwell", "O Mundo se Despedaça - Chinua Achebe",
						"As Mil e Uma Noites, diversos autores", "Dom Quixote, Miguel de Cervantes",};
	
				generated = livro[indexNumber()];
	
				JOptionPane.showMessageDialog(null, "O livro sugerido é:");
	
				return generated;
			case 7:
				String[] serie = { "Breaking Bad", "Avatar: A Lenda de Aang", "Rick e Morty", "Arcane",
						"O Gambito da Rainha", "Fargo", "Dark"};
	
				generated = serie[indexNumber()];
				
				JOptionPane.showMessageDialog(null, "A serie sugerida foi:");	
				
				return generated;
		}

		return null;
	}
}