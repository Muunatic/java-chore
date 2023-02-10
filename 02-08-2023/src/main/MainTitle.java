package main;

import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainTitle extends JPanel {

    MainTitle() {
        this.setPreferredSize(new Dimension(400, 50));
        this.setBackground(Color.decode("#25282b"));

        JLabel titleTxt = new JLabel("Production");
        titleTxt.setForeground(Color.white);
        titleTxt.setPreferredSize(new Dimension(200, 40));
        titleTxt.setHorizontalAlignment(JLabel.CENTER);

        this.add(titleTxt);
    }
    
}
