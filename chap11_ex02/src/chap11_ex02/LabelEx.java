package chap11_ex02;

import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame {
         public LabelEx() {
        	     setTitle("~~");
        	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	     Container c = getContentPane();
        	     c.setLayout(new FlowLayout());
        	     
        	     JLabel textLabel = new JLabel("감사합니다");
        	     
        	     ImageIcon beauty = new ImageIcon("images/beauty.jpg");
        	     JLabel imageLabel = new JLabel(beauty);
        	     
        	     ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
        	     JLabel label = new JLabel("전화하세요",
        	    		 normalIcon, SwingConstants.CENTER);
        	     
        	     c.add(textLabel);
        	     c.add(imageLabel);
        	     c.add(label);
        	     
        	     setSize(400,600);
        	     setVisible(true);
        	     
        	
         }

         public static void main(String [] args) {
        	     new LabelEx();
         }
}
