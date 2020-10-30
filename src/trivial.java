import javax.swing.JOptionPane;

public class trivial {
	
	public static final String ANSI_CYAN = "\u001B[36m";
	
	public static void main(String[] args) {
		// CONTADOR PUNTOS
		// MENSAJE ACIERTO/ERROR POR PREGUNTA
		// MENSAJE FINAL PUNTOS
		// MINIMO 10 PREGUNTAS (MISMA TEMÁTICA)
		
		int contPuntos = 0;
		
		String srt;
		String respuesta;
		
		//PRIMERA PREGUNTA
		srt = JOptionPane.showInputDialog("CATEGORIA DE HISTORIA:\n"
				+ "¿ Quién fue el primer presidente de la democracia española tras el franquismo?") ;
		respuesta = srt;

		if (respuesta.equalsIgnoreCase("Adolfo Suarez") == true) {
			
			contPuntos++;
			JOptionPane.showMessageDialog(null, "Respuesta correcta.\nTus puntos son: " + contPuntos, "BIEN!", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Respuesta incorrecta.\nTus puntos son: " + contPuntos, "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
		//SEGUNDA PREGUNTA
		srt = JOptionPane.showInputDialog("CATEGORIA DE GEOGRAFÍA:\n"
				+ "¿Cuál es la capital de Brasil?") ;
		respuesta = srt;

		if (respuesta.equalsIgnoreCase("Brasilia") == true) {
			
			contPuntos++;
			JOptionPane.showMessageDialog(null, "Respuesta correcta.\nTus puntos son: " + contPuntos, "BIEN!", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Respuesta incorrecta.\nTus puntos son: " + contPuntos, "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
		// TERCERA PREGUNTA
		srt = JOptionPane.showInputDialog("CATEGORIA DE ARTE Y LITERATURA:\n"
				+ "¿Qué gran artista es conocido por haber pintado la Capilla Sixtina?") ;
		respuesta = srt;

		if (respuesta.equalsIgnoreCase("Miguel Angel") == true) {
			
			contPuntos++;
			JOptionPane.showMessageDialog(null, "Respuesta correcta.\nTus puntos son: " + contPuntos, "BIEN!", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Respuesta incorrecta.\nTus puntos son: " + contPuntos, "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
		//CUARTA PREGUNTA  
		srt = JOptionPane.showInputDialog("CATEGORIA DE ENTRETENIMIENTO:\n"
				+ "¿Cómo se llama la madre de Simba en la película de Disney “El Rey León”? ") ;
		respuesta = srt;

		if (respuesta.equalsIgnoreCase("Sarabi") == true) {
			
			contPuntos++;
			JOptionPane.showMessageDialog(null, "Respuesta correcta.\nTus puntos son: " + contPuntos, "BIEN!", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Respuesta incorrecta.\nTus puntos son: " + contPuntos, "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		//QUINTA PREGUNTA
		srt = JOptionPane.showInputDialog("CATEGORIA DE NATURALEZA Y CIENCIA:\n"
				+ "¿Cómo se llama la planta a partir de la cual suele ser elaborado el tequila?") ;
		respuesta = srt;

		if (respuesta.equalsIgnoreCase("Agave") == true) {
			
			contPuntos++;
			JOptionPane.showMessageDialog(null, "Respuesta correcta.\nTus puntos son: " + contPuntos, "BIEN!", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Respuesta incorrecta.\nTus puntos son: " + contPuntos, "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		//SEXTA PREGUNTA
		srt = JOptionPane.showInputDialog("CATEGORIA DE DEPORTE Y PASATIEMPOS:\n"
				+ "¿Qué arte marcial de origen sudamericano fue desarrollado para parecerse a un baile?") ;
		respuesta = srt;

		if (respuesta.equalsIgnoreCase("Capoeira") == true) {
			
			contPuntos++;
			JOptionPane.showMessageDialog(null, "Respuesta correcta.\nTus puntos son: " + contPuntos, "BIEN!", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Respuesta incorrecta.\nTus puntos son: " + contPuntos, "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		//SEPTIMA PREGUNTA
		
		//OCTAVA PREGUNTA
		
		//NOVENA PREGUNTA
		
		//DECIMA PREGUNTA

	}

}
