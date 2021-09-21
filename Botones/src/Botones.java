import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Botones extends JFrame {

	private JLabel etiqueta = new JLabel();
	private Container contentpane = getContentPane();
	private JPanel panel1 = new JPanel();
	private JButton button1 = new JButton("OK");

	public Botones() {
		try {

			/*
			 * Hacemos la ventana visible, definimos el tamano, la posicion, el icono y la
			 * operacion por defecto de la ventana al cerrarla.
			 */

			setTitle("Actions");
			setSize(800, 400);
			setLocationRelativeTo(null);
			setIconImage(new ImageIcon("km mod.png").getImage());
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);

			/*
			 * Definimos como visible el boton, lo posicionamos y hacemos que al hacer clic
			 * se habra un dialog
			 */

			button1.setVisible(true);
			button1.setBounds(340, 300, 120, 30);

			/*
			 * Damos tamaño al label, lo alineamos al centro, le cambiamos la fuente y el
			 * color de la fuente
			 */

			etiqueta.setBounds(225, 0, 350, 50);
			etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
			etiqueta.setFont(new Font("Arial", 0, 15));
			etiqueta.setForeground(Color.BLACK);

			// Definimos el layout del panel y anadimos todos los componentes

			panel1.setLayout(null);
			panel1.add(button1);

			// Anadimos el panel al container

			contentpane.add(panel1);

			// Le damos color de fondo al panel

			panel1.setBackground(Color.ORANGE);

		} catch (Exception ex) {
			ex.printStackTrace();
		} // catch
	} // constructor

	// Programa principal

	public static void main(String[] args) {
		try {
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					new Botones();
				}
			});
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	} // main
} // class