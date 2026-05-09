import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("JFrame title goes here"); // sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application when close button is clicked
        this.setResizable(false); // prevent frame from being resized
        this.setSize(420, 420);  // sets the x-dimension, and y-dimension of the frame
        this.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("image.png"); // create an ImageIcon
        this.setIconImage(image.getImage()); // change icon of frame
        this.getContentPane().setBackground(new Color(123, 50 , 250)); // change color of background

    }
}
