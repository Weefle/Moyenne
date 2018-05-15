import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel{
	private static final long serialVersionUID = 1L;
	JPanel pan = new JPanel();
	JButton bouton = new JButton("Bouton");
	
	
	public void paintComponent (Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(0, 0, getWidth(), getHeight() );
		
		Font font = new Font("Arial", Font.ITALIC, 20);
		
		g.setFont(font);
		g.setColor(Color.white);
		g.drawString("Service de calcul", 20, 30);

		
		try {
			Image image = ImageIO.read(new File("ressources/icons8_Calculator_96px.png"));
			g.drawImage(image, 295, 0, this);
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}


	public void setContentPane(JPanel pan) {
		pan.add(bouton);
		this.setContentPane(pan);
		this.setVisible(true);
		
	}
	
		
}

	