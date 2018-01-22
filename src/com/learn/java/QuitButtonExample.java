package com.learn.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class QuitButtonExample extends JFrame {

  public QuitButtonExample() {
    JButton jButton = new JButton("Quit");
    jButton.addActionListener((ActionEvent) -> {
      System.exit(0);
    });

    createlayout(jButton);

    setTitle("Example Quit Button Application");
    setSize(300,300);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
  }


  private void createlayout(JComponent... arg) {
    Container container = getContentPane();
    GroupLayout groupLayout = new GroupLayout(container);
    container.setLayout(groupLayout);

    groupLayout.setAutoCreateContainerGaps(true);

    groupLayout.setHorizontalGroup(groupLayout.createSequentialGroup().addComponent(arg[0]));

    groupLayout.setVerticalGroup(groupLayout.createSequentialGroup().addComponent(arg[0]));
  }


  public static void main(String[] args) {
    EventQueue.invokeLater( () -> {
      QuitButtonExample quitButtonExample = new QuitButtonExample();
      quitButtonExample.setVisible(true);
    });
  }
}
