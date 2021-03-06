import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;

public class DicServerFrame extends JFrame {
	    private JTextField eng = new JTextField(10);
	    private JTextField kor = new JTextField(10);
	    private JButton saveBtn = new JButton("저장");
	    private	JButton searchBtn = new JButton("찾기");
	    private JTextArea ta = new JTextArea(7, 25);
	    private HashMap<String, String> dic = new HashMap<String, String>();
        public DicServerFrame() {
                super("Dic Server");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setSize(350, 300);
                Container c = getContentPane();
                c.setLayout(new FlowLayout());
                c.add(new JLabel("영어"));
                c.add(eng);
                c.add(new JLabel("한글"));
                c.add(kor);
                c.add(saveBtn);
                c.add(searchBtn);
                
                saveBtn.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						    ta.append("삽입 ("+eng.getText()+"." +kor.getText()
						    
						    dic.put(eng.getText(), kor.getText());
					}
                });
				searchBtn.addActionListener(new ActionListener) {		    
						    
					}