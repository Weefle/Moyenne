import java.awt.Dimension;
import javax.swing.*;

@SuppressWarnings("serial")
public class Calculator extends JFrame {
    private JPanel container = new JPanel();
    @SuppressWarnings("unused")
	private JLabel ecran = new JLabel();
    @SuppressWarnings("unused")
	private Dimension dim = new Dimension(50, 40);
    @SuppressWarnings("unused")
	private Dimension dim2 = new Dimension(50, 31);
    @SuppressWarnings("unused")
	private double chiffre1;
    @SuppressWarnings("unused")
	private boolean clicOperateur = false, update = false;
    @SuppressWarnings("unused")
	private String operateur = "";
    JLabel l = new JLabel("Hey");
    
    //ici le calculateur graphique

    public Calculator() {
        this.setSize(400, 400);
        this.setTitle("Calculator");
        this.add(container);
        container.add(l);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setContentPane(container);
        this.setVisible(true);
    }

}