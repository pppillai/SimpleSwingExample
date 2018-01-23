package head.first.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGuiActionListener implements ActionListener {
  JButton button;
  public static void main(String[] args) {
    SimpleGuiActionListener simpleGuiActionListener = new SimpleGuiActionListener();
    simpleGuiActionListener.go();
  }

  public void go() {
    JFrame jFrame = new JFrame();
    button = new JButton("ClickMe!");

    button.addActionListener(this);

    jFrame.getContentPane().add(button);
    jFrame.setVisible(true);
    jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    jFrame.setSize(300, 300);
    jFrame.setLocationRelativeTo(null);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    //System.out.println("something happened");
    button.setText("You Clicked Me!");
    if (e.getActionCommand().equalsIgnoreCase("ClickMe!")) {
      button.setText("You Clicked Me !");
    }else {
      button.setText("ClickMe!");
    }
    System.out.println(e.getActionCommand());
    System.out.println(e.paramString());

  }
}
