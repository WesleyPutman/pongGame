import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyAdapter;
import java.util.*;
import javax.swing.*;

public class Gframe extends JFrame {

    Gpanel panel;
    
    Gframe(){
        panel  = new Gpanel();
        this.add(panel);
        this.setTitle("PongGame");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        




    }
}
