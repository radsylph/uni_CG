package graficos;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;;

// Eduardo Morales 29.633.652

public class escribiendoEnMarco {

	public static void main(String[] args) {
		marcoConTexto miMarco = new marcoConTexto();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class marcoConTexto extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public marcoConTexto() {
		setVisible(true);
		setSize(600, 450);
		setLocation(400, 200);
		setTitle("Primer Texto");
		
		lamina miLamina = new lamina();
		add(miLamina);
	}
}

class lamina extends JPanel {

	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics graphic) {
		
		super.paintComponent(graphic);
		graphic.drawString("Hola Mundo", 100, 100);
		
	}
}