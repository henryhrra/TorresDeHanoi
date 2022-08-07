/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hanoi;

//import java.util.Random;
import java.awt.Image;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Henry Hrra
 */
public class Aros extends JLabel{
    //Random rand = new Random();
    int w,x,y;
    int randomNum;

    public Aros(int X, int whith,int Y) {
        this.x = X;
        this.w = whith;
        this.y = Y;
    }
    
    public JLabel CrearAros(){
        randomNum = ThreadLocalRandom.current().nextInt(1, 5) + 1;
        this.setBounds(this.x, this.y, this.w, 15);
        JOptionPane.showMessageDialog(null, this.x +","+ this.y+","+this.w);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setVisible(true);
        Image img = new ImageIcon("src/Imagenes/" + randomNum + ".png").getImage();
        ImageIcon img2 = new ImageIcon(img.getScaledInstance(w, 15, Image.SCALE_SMOOTH));
        this.setIcon(img2);  ;
        return this;
    }
   
}
