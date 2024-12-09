import javax.swing.*;
import java.awt.*;



    public class Panel extends JPanel {
        public void paintComponent(Graphics g)
        {
            ImageIcon image = new ImageIcon("D:\\EDUCATION\\MatchCardGame\\src\\img\\fairy.jpg");
            g.drawImage(image.getImage(),10,20,Color.black,null);
        }

    }


