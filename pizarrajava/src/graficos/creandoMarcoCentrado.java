package graficos;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.JFrame;

//Eduardo Morales 29.633.652

public class creandoMarcoCentrado {

	public static void main(String[] args) {
		marcoCentrado miMarco = new marcoCentrado();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
		miMarco.setTitle("computacion Grafica");
	}

}

class marcoCentrado extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public marcoCentrado() {
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamañoPantalla = miPantalla.getScreenSize();
		int alturaPantalla = tamañoPantalla.height;
		int anchoPantalla = tamañoPantalla.width;
		setSize(anchoPantalla/2, alturaPantalla/2);
		setLocation(anchoPantalla/4, alturaPantalla/4);
		
		Image miIcono = miPantalla.getImage("Images.png");
		setIconImage(miIcono);
	}
}