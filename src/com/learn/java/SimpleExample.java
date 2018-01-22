package com.learn.java;

import javax.swing.*;
import java.awt.*;

public class SimpleExample extends JFrame {


  public SimpleExample() {

    initUI();

  }


  public void initUI() {

    setLocationRelativeTo(null);
    setSize(300, 300);
    setTitle("Simple Application");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

  }

  public static void main(String[] args){

    EventQueue.invokeLater(() -> {
      SimpleExample simpleExample = new SimpleExample();
      simpleExample.setVisible(true);
    });

  }

}
