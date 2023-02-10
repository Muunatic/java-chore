package main;

import java.awt.*;
import javax.swing.JPanel;

public class MainList extends JPanel {

    MainList() {
        GridLayout layout = new GridLayout(10, 1);
        layout.setVgap(5);

        this.setLayout(layout);
        this.setBackground(Color.white);
    }
    
}
