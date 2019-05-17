

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class FlyingTextEx extends JFrame {
private static final long serialVersionUID = 1L;
private final int FLYING_UNIT = 10;
  private JLabel la = new JLabel("HELLO");
  public FlyingTextEx() {
	  setTitle("");
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  Container c = getContentPane();
	  c.setLayout(null);
	  c.addKeyListener(new MyKeyListener());
	  
	  la.setLayout(null);
	  la.setSize(100,20);
	  c.add(la);
	  setSize(300,300);
	  setVisible(true);
	  c.setFocusable(true);
	  c.requestFocus();
	  
	  c.addMouseListener(new MouseAdapter() {
		  public void mouseClicked(MouseEvent e) {
			  Component com = (Component)e.getSource();
			  com.setFocusable(true);
			  com.requestFocus();
			  
		  }
	  });
  }