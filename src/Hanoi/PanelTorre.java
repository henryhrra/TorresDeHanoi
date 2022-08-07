package Hanoi;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
 

 
public class PanelTorre extends JPanel {
    private Image background;
    String imagen;
      PanelTorre(String fondo){
          this.imagen = fondo;  
      }
        @Override
	public void paintComponent(Graphics g) {
		int width = this.getSize().width;
		int height = this.getSize().height;
		if (this.background != null) {
			g.drawImage(this.background, 0, 0, width, height, null);
		}
 
		super.paintComponent(g);
                this.setOpaque(false);
                this.background = new ImageIcon(this.imagen).getImage();
                repaint();
	}
 
}