package com.learn.java;

import javax.swing.*;
import java.awt.*;

public class IconExample extends JFrame {

  public IconExample() {
    initUI();
  }

  private void initUI() {

    ImageIcon imageIcon = new ImageIcon("TotalRentReceipt.png");

    setIconImage(imageIcon.getImage());

    setTitle ("Icon");
    setSize(300,300);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    EventQueue.invokeLater( () -> {
      IconExample iconExample = new IconExample();
      iconExample.setVisible(true);
    });
  }

}
