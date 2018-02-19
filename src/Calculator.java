import java.awt.Dimension;
import javax.swing.*;

public class Calculator extends JFrame {
    private JPanel container = new JPanel();
    private JLabel ecran = new JLabel();
    private Dimension dim = new Dimension(50, 40);
    private Dimension dim2 = new Dimension(50, 31);
    private double chiffre1;
    private boolean clicOperateur = false, update = false;
    private String operateur = "";
    JLabel l = new JLabel("Hey");
    
    //here is the main calculator

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