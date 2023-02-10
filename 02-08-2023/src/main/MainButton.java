package main;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MainButton extends JPanel {

    private JButton addList;
    private JButton clearList;

    Border emptyList = BorderFactory.createEmptyBorder();

    MainButton() {
        this.setPreferredSize(new Dimension(400, 50));
        this.setBackground(Color.white);
        this.setBorder(BorderFactory.createMatteBorder(-1, -1, -1, -1, Color.black));

        addList = new JButton("Add List");
        addList.setBorder(emptyList);
        this.add(addList);

        clearList = new JButton("Clear completed list");
        clearList.setBorder(emptyList);
        this.add(clearList);
    }

    public JButton getAddList() {
        return addList;
    }

    public JButton getClear() {
        return clearList;
    }

}
