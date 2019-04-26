import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContenPaneEx extends JFrame{
        public ContenPaneEx(){
        	    setTitle("Content Pane and JFrame");
        	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	    
        	    Container contentPane = getContentPane();
        	    contentPane.setBackground(Color.RED);
        	    contentPane.setLayout(new FlowLayout());
        	    
        	    contentPane.add(new JButton("OK"));
        		contentPane.add(new JButton("CANCEL"));
        		contentPane.add(new JButton("IGNORE"));
        	    
        		setSize(300, 200);
        		setVisible(true);
        		
        }
        
        public static void main(String[] args) {
        	new ContenPaneEx();
        }
}
