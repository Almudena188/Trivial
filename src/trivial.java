import java.awt.TrayIcon.MessageType;

import javax.swing.JOptionPane;

public class trivial {

	public static void main(String[] args) {
		// CONTADOR PUNTOS
		// MENSAJE ACIERTO/ERROR POR PREGUNTA
		// MENSAJE FINAL PUNTOS
		// MINIMO 10 PREGUNTAS (MISMA TEMÁTICA)
		
		int contPuntos = 0;
		
		String srt;
		String respuesta;
		
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
		
	}

}
