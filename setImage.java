

import java.awt.*;
import javax.swing.*;



public class setImage {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Image");
        frame.setSize(400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setContentPane(new Panel());
        frame.setVisible(true);

    }



}

