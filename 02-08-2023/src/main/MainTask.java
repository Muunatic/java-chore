package main;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainTask extends JPanel {
    
    private JLabel index;
    private JTextField taskName;
    private JButton taskDone;
    private boolean taskChecked;

    MainTask() {
        this.setPreferredSize(new Dimension(40, 20));
        this.setBackground(Color.green);

        this.setLayout(new BorderLayout());

        taskChecked = false;
        index = new JLabel("");
        index.setPreferredSize(new Dimension(20, 20));
        index.setHorizontalAlignment(JLabel.CENTER);

        this.add(index, BorderLayout.WEST);

        taskName = new JTextField("Empty Task");
        taskName.setBorder(BorderFactory.createEmptyBorder());
        taskName.setBackground(Color.red);

        this.add(taskName, BorderLayout.CENTER);

        taskDone = new JButton("Done");
        taskDone.setPreferredSize(new Dimension(40, 20));
        taskDone.setBorder(BorderFactory.createEmptyBorder());

        this.add(taskDone, BorderLayout.EAST);
    }

}
