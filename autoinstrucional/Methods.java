import java.util.*;

import javax.swing.JOptionPane;

public class Methods extends Interfaces {
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

		index = (int) new Random().nextInt(10);

		return index;
	}

	// Method for Generate Decision:
	public String generateDecision() {
		if (getComboBoxIndex() == 1) {
			do {
				setComboBoxIndex((int) new Random().nextInt(8));
			} while (getComboBoxIndex() == 1);

		}

		switch (getComboBoxIndex()) {
		case 0:
			String[] comidas = { "Bai�o de Dois", "Sururu ao Coco", "Camar�o no Bafo", "Tambaqui Assado", "Acaraj�",
					"Moqueca", "Empad�o", "Arroz de Cux�", "Arroz Maria Isabel", "Frango com Quiabo" };

			generated = comidas[indexNumber()];

			JOptionPane.showMessageDialog(null, "A comida sugerida �:");

			return generated;
		case 2:

			String[] documentario = { "Nosso Planeta (2019) IMDB: 9,3", "O Dilema das Redes (2020) IMDB: 7,6",
					"Making a Murderer (2015-) IMDB: 8,6", "Abstract: The Art of Design (2017-) IMDB: 8,4",
					"Winter on Fire: Ukraine's Fight for Freedom (2015)", "A 13� Emenda (2016)",
					"Dan�a dos P�ssaros (2019)", "Wild Wild Country (2018)" };

			generated = documentario[indexNumber()];

			JOptionPane.showMessageDialog(null, "O documentario sugerido �:");

			return generated;

		case 3:
			String[] filme = { "The Tree of Life (2011), Terrence Malick",
					"Brilho Eterno de uma Mente Sem Lembran�as (2004)", "Memento (Amn�sia) (2001)",
					"Clube da Luta (1999)", "O Poderoso Chef�o (1972)", "A Chegada (2016)",
					"Fragmentado (2016)A M�o de Deus (2021), Paolo Sorrentino", "As Fotos Vazadas (2021)",
					"Ataque dos C�es (2021)", "M�es Paralelas (2021)" };

			generated = filme[indexNumber()];

			JOptionPane.showMessageDialog(null, "O filme sugerido �:");

			return generated;

		case 4:
			String[] lazer = { "Caminhar", "Andar de bicicleta", "Skate", "Patins", "Caminhar", "Fotografar",
					"Ler livros", "Ir a bares ou restaurantes", "Praticar esportes", "Ir ao cinema",
					"Fazer piqueniques", "Viajar" };

			generated = lazer[indexNumber()];

			JOptionPane.showMessageDialog(null, "A atividade de lazer sugerido �:");

			return generated;
		case 5:

			String[] livro = { "Odisseia, Homero", "A cabana do Pai Tom�s - Harriet Beecher Stowe",
					"Frankenstein, Mary Shelley", "1984, George Orwell", "O Mundo se Despeda�a - Chinua Achebe",
					"As Mil e Uma Noites, diversos autores", "Dom Quixote, Miguel de Cervantes",
					"A culpa � das estrelas, de John Green", "As vantagens de ser invis�vel, de Stephen Chbosky",
					"Quem � voc�, Alasca?, de John Green", "A rainha vermelha, de Victoria Aveyard",
					"Bonsai, de Alejandro Zambra" };

			generated = livro[indexNumber()];

			JOptionPane.showMessageDialog(null, "O livro sugerido �:");

			return generated;
		case 6:
			String[] serie = { "Breaking Bad", "Avatar: A Lenda de Aang", "Rick e Morty", "Arcane",
					"O Gambito da Rainha", "Fargo", "Dark", "Stranger Things", "BoJack Horseman", "The Crown" };

			generated = serie[indexNumber()];
			
			JOptionPane.showMessageDialog(null, "A serie sugerida foi:");	
			
			return generated;
			
		case 7:
      	String[] brincaderia = {"Verdade ou mentira", "A bolinha e a ponte", "Estoure o bal�o", "Jogo das m�os.", "Tudo com a mesma letra", "7 pecados", "Corre Cutia"};					


			generated = brincaderia[indexNumber()];
			
			JOptionPane.showMessageDialog(null, "A brincadeira sugerida foi: ");	
			
			return generated;
		}

		return null;
	}
}