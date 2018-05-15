import javax.swing.JFrame;


public class Frame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public Frame(String title)  { 
		JFrame fenetre = new JFrame("Calculateur de Moyenne");
		setTitle("Calculator");
		setSize(400, 500);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		add(new Panel());
	}
}
