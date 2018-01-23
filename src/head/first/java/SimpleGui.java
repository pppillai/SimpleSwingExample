package head.first.java;

import javax.swing.*;

public class SimpleGui {

  public static void main(String[] args) {

    JFrame jFrame =  new JFrame();

    JButton jButton = new JButton("ClickMe!");

    jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    jFrame.getContentPane().add(jButton);

    jFrame.setSize(300, 300);

    jFrame.setVisible(true);

  }

}
