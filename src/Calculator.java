import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Calculator {
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			new Frame("Calculateur de moyenne");
			}
		});	
	}	
}	
	