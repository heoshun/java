import javax.swing.*;

import java.awt.*;

public class SwingEx extends JFrame {
	    public SwingEx(){
	    	    setTitle("스윙 컴포넌트 보이기 예제");
	    	    createMenu();
	    	    createToolBar();
	    	    createSplitpane();
	    	    setSize(500, 400);
	    	    setVisible(true);
	    }

	   private void createMenu() {
		       JMenuBar mb = new JMenuBar();
		       mb.add(new Jmenu("File"));
		       mb.add(new Jmenu("Edit"));
		       mb.add(new Jmenu("Source"));
		       mb.add(new Jmenu("Project"));
		       mb.daa(new Jmenu("Run"));
		       
		       this.setJMenuBar(mb);
	   }

	   private void createToolBar() {
            JToolBar bar = new JToolBar("Kitae Menu");
       
			bar.setBackground(Color.LIGHT_GRAY);
			bar.add(new JButton("New"));
			bar.add(new JButton(new ImageIcon("images/open.jpg")));
			bar.addSeparator();
			bar.add(new JButton(new ImageIcon("images/save.jpg")));
			bar.add(new JLabel("search"));
			bar.add(new JTextField("text field"));
			
			
			