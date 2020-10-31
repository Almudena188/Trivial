import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class trivial {

	public static void main(String[] args) {
		
		int contPuntos = 0;
		int numPreg = 0;
		String srt;
		String respuesta;

		// PRIMERA PREGUNTA
		 amarillo();
		srt = JOptionPane.showInputDialog("CATEGORIA DE HISTORIA:\n"
				+ "¿ Quién fue el primer presidente de la democracia española tras el franquismo?");
		respuesta = srt;
		numPreg++; // contamos la pregunta

		if (respuesta.equalsIgnoreCase("Adolfo Suarez") == true) {

			contPuntos++;
			JOptionPane.showMessageDialog(null, "Respuesta correcta.\nTus puntos son: " + contPuntos, "BIEN!",
					JOptionPane.INFORMATION_MESSAGE);
		}

		else {
			JOptionPane.showMessageDialog(null, "Respuesta incorrecta.\nTus puntos son: " + contPuntos, "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}

		// SEGUNDA PREGUNTA
		azul();
		srt = JOptionPane.showInputDialog("CATEGORIA DE GEOGRAFÍA:\n" + "¿Cuál es la capital de Brasil?");
		respuesta = srt;
		numPreg++;
		if (respuesta.equalsIgnoreCase("Brasilia") == true) {

			contPuntos++;
			JOptionPane.showMessageDialog(null, "Respuesta correcta.\nTus puntos son: " + contPuntos, "BIEN!",
					JOptionPane.INFORMATION_MESSAGE);
		}

		else {
			JOptionPane.showMessageDialog(null, "Respuesta incorrecta.\nTus puntos son: " + contPuntos, "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}

		// TERCERA PREGUNTA
		rosa();
		srt = JOptionPane.showInputDialog("CATEGORIA DE ARTE Y LITERATURA:\n"
				+ "¿Qué gran artista es conocido por haber pintado la Capilla Sixtina?");
		respuesta = srt;
		numPreg++;
		if (respuesta.equalsIgnoreCase("Miguel Angel") == true) {

			contPuntos++;
			JOptionPane.showMessageDialog(null, "Respuesta correcta.\nTus puntos son: " + contPuntos, "BIEN!",
					JOptionPane.INFORMATION_MESSAGE);
		}

		else {
			JOptionPane.showMessageDialog(null, "Respuesta incorrecta.\nTus puntos son: " + contPuntos, "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}

		// CUARTA PREGUNTA
		rojo();
		srt = JOptionPane.showInputDialog("CATEGORIA DE ENTRETENIMIENTO:\n"
				+ "¿Cómo se llama la madre de Simba en la película de Disney “El Rey León”? ");
		respuesta = srt;
		numPreg++;
		if (respuesta.equalsIgnoreCase("Sarabi") == true) {

			contPuntos++;
			JOptionPane.showMessageDialog(null, "Respuesta correcta.\nTus puntos son: " + contPuntos, "BIEN!",
					JOptionPane.INFORMATION_MESSAGE);
		}

		else {
			JOptionPane.showMessageDialog(null, "Respuesta incorrecta.\nTus puntos son: " + contPuntos, "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		// QUINTA PREGUNTA
		verde();
		srt = JOptionPane.showInputDialog("CATEGORIA DE NATURALEZA Y CIENCIA:\n"
				+ "¿Cómo se llama la planta a partir de la cual suele ser elaborado el tequila?");
		respuesta = srt;
		numPreg++;
		if (respuesta.equalsIgnoreCase("Agave") == true) {

			contPuntos++;
			JOptionPane.showMessageDialog(null, "Respuesta correcta.\nTus puntos son: " + contPuntos, "BIEN!",
					JOptionPane.INFORMATION_MESSAGE);
		}

		else {
			JOptionPane.showMessageDialog(null, "Respuesta incorrecta.\nTus puntos son: " + contPuntos, "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		// SEXTA PREGUNTA
		naranja();
		srt = JOptionPane.showInputDialog("CATEGORIA DE DEPORTE Y PASATIEMPOS:\n"
				+ "¿Qué arte marcial de origen sudamericano fue desarrollado para parecerse a un baile?");
		respuesta = srt;
		numPreg++;
		if (respuesta.equalsIgnoreCase("Capoeira") == true) {

			contPuntos++;
			JOptionPane.showMessageDialog(null, "Respuesta correcta.\nTus puntos son: " + contPuntos, "BIEN!",
					JOptionPane.INFORMATION_MESSAGE);
		}

		else {
			JOptionPane.showMessageDialog(null, "Respuesta incorrecta.\nTus puntos son: " + contPuntos, "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}

		// como solo existen 6 categorias le damos paso al usario para que elija las
		// preguntas siguientes hasta que se hagan 10 preguntas en total
		gris();
		for (; numPreg < 10; numPreg++) {
			int categoria;
			// pido la opción
			srt = JOptionPane.showInputDialog("Elija la categoría siguiente" + "\n 1: HISTORIA"
					+ "\n 2: DEPORTE Y PASATIEMPOS" + "\n 3: NATURALEZA Y CIENCIA" + "\n 4: ENTRETENIMIENTO"
					+ "\n 5: ARTE Y LITERATURA" + "\n 6: GEOGRAFÍA");
			categoria = Integer.parseInt(srt);
			// comparamos la opción
			switch (categoria) {
			case 1: {
				amarillo();
				srt = JOptionPane.showInputDialog(
						"CATEGORIA DE HISTORIA:\n" + "¿En qué año el hombre pisó la Luna por primera vez?");
				respuesta = srt;

				if (respuesta.equalsIgnoreCase("1969") == true) {

					contPuntos++;
					JOptionPane.showMessageDialog(null, "Respuesta correcta.\nTus puntos son: " + contPuntos, "BIEN!",
							JOptionPane.INFORMATION_MESSAGE);
				}

				else {
					JOptionPane.showMessageDialog(null, "Respuesta incorrecta.\nTus puntos son: " + contPuntos, "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
				break;
			}

			case 2: {
				naranja();
				srt = JOptionPane.showInputDialog("CATEGORIA DE DEPORTE Y PASATIEMPOS:\n"
						+ "¿Quién es considerado el mejor jugador de baloncesto de todos los tiempos?");
				respuesta = srt;

				if (respuesta.equalsIgnoreCase("Michael Jordan") == true) {

					contPuntos++;
					JOptionPane.showMessageDialog(null, "Respuesta correcta.\nTus puntos son: " + contPuntos, "BIEN!",
							JOptionPane.INFORMATION_MESSAGE);
				}

				else {
					JOptionPane.showMessageDialog(null, "Respuesta incorrecta.\nTus puntos son: " + contPuntos, "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
				break;
			}

			case 3: {
				verde();
				srt = JOptionPane
						.showInputDialog("CATEGORIA DE NATURALEZA Y CIENCIA:\n" + "¿Cuál es la velocidad de la luz?");
				respuesta = srt;

				if (respuesta.equalsIgnoreCase("300000000 km/s") == true) {

					contPuntos++;
					JOptionPane.showMessageDialog(null, "Respuesta correcta.\nTus puntos son: " + contPuntos, "BIEN!",
							JOptionPane.INFORMATION_MESSAGE);
				}

				else {
					JOptionPane.showMessageDialog(null, "Respuesta incorrecta.\nTus puntos son: " + contPuntos, "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
				break;
			}

			case 4: {
				rojo();
				srt = JOptionPane.showInputDialog(
						"CATEGORIA DE ENTRETENIMIENTO:\n" + "¿A quién interpretaba John Travolta en “Grease”?");
				respuesta = srt;

				if (respuesta.equalsIgnoreCase("Danny Zuko") == true) {

					contPuntos++;
					JOptionPane.showMessageDialog(null, "Respuesta correcta.\nTus puntos son: " + contPuntos, "BIEN!",
							JOptionPane.INFORMATION_MESSAGE);
				}

				else {
					JOptionPane.showMessageDialog(null, "Respuesta incorrecta.\nTus puntos son: " + contPuntos, "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
				break;
			}

			case 5: {
				rosa();
				srt = JOptionPane.showInputDialog("CATEGORIA DE ARTE Y LITERATURA:\n" + "¿Quién pintó el “Guernica”?");
				respuesta = srt;

				if (respuesta.equalsIgnoreCase("Pablo Picasso") == true) {

					contPuntos++;
					JOptionPane.showMessageDialog(null, "Respuesta correcta.\nTus puntos son: " + contPuntos, "BIEN!",
							JOptionPane.INFORMATION_MESSAGE);
				}

				else {
					JOptionPane.showMessageDialog(null, "Respuesta incorrecta.\nTus puntos son: " + contPuntos, "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
				break;
			}

			case 6: {
				azul();
				srt = JOptionPane
						.showInputDialog("CATEGORIA DE GEOGRAFÍA:\n" + "¿Cuál es el río más caudaloso del mundo?");
				respuesta = srt;

				if (respuesta.equalsIgnoreCase("Amazonas") == true) {

					contPuntos++;
					JOptionPane.showMessageDialog(null, "Respuesta correcta.\nTus puntos son: " + contPuntos, "BIEN!",
							JOptionPane.INFORMATION_MESSAGE);
				}

				else {
					JOptionPane.showMessageDialog(null, "Respuesta incorrecta.\nTus puntos son: " + contPuntos, "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
				break;
			}
			default:
				JOptionPane.showMessageDialog(null, "OPCIÓN NO CORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}
		gris();
		JOptionPane.showMessageDialog(null, "TRIVIAL TERMINADO\n" + "Sus puntos obtenidos son: " + contPuntos + " de " + numPreg + " preguntas" , "FIN",
				JOptionPane.QUESTION_MESSAGE);
	}
	
	//METODOS PARA PONER EL COLOR
	public static void azul() {
		UIManager UI = new UIManager();
		Object azul = UI.put("OptionPane.background", Color.cyan);
		 UI.put("Panel.background", Color.cyan);
	}
	
	public static void rosa() {
		UIManager UI = new UIManager();
		Object rosa = UI.put("OptionPane.background", Color.pink);
		 UI.put("Panel.background", Color.pink);
	}
	
	public static void amarillo () {
		UIManager UI = new UIManager();
		Object amarillo = UI.put("OptionPane.background", Color.yellow);
		 UI.put("Panel.background", Color.yellow);
	}
	
	public static void rojo () {
		UIManager UI = new UIManager();
		Object rojo = UI.put("OptionPane.background", Color.red);
		 UI.put("Panel.background", Color.red);
	}
	
	public static void verde () {
		UIManager UI = new UIManager();
		Object verde = UI.put("OptionPane.background", Color.green);
		 UI.put("Panel.background", Color.green);
	}
	
	public static void naranja () {
		UIManager UI = new UIManager();
		Object naranja = UI.put("OptionPane.background", Color.orange);
		 UI.put("Panel.background", Color.orange);
	}
	
	public static void gris () {
		UIManager UI = new UIManager();
		Object magenta = UI.put("OptionPane.background", Color.lightGray);
		UI.put("Panel.background", Color.lightGray);
	}
}
