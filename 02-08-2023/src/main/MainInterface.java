package main;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainInterface extends JFrame {

    private MainTitle mainTitle;
    private MainList mainList;
    private MainButton mainBtn;

    private JButton addTask;
    private JButton clearTask;

    MainInterface() {
        this.setSize(400, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        mainTitle = new MainTitle();
        mainList = new MainList();
        mainBtn = new MainButton();

        this.add(mainTitle, BorderLayout.NORTH);
        this.add(mainBtn, BorderLayout.SOUTH);
        this.add(mainList, BorderLayout.CENTER);
    }

}
