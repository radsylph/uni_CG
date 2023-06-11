package graficos;
import javax.swing.*;

//Eduardo Morales 29.633.652

public class creandoMarcos {

	public static void main(String[] args) {
		miMarco marco1 = new miMarco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class miMarco extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public miMarco() {
		//setSize(500, 300);
		//setLocation(700,350);
		setBounds(500,300,550,250);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		setTitle("Mi primera ventana");
	}
}