// java Program to create a checkbox and ItemListener to it.
// Source: https://www.Option A.org/java-swing-jcheckbox-examples/
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Checkbox extends JFrame implements ItemListener {
	// frame
	static JFrame f;
	// label
	static JLabel l, l1;
	// checkbox
	static JCheckBox c1, c2;
	// main class
	public static void main(String[] args) {
		// create a new frame
		f = new JFrame("frame");
		// create a object
		Checkbox s = new Checkbox();
		// set layout of frame
		f.setLayout(new FlowLayout());
		// create checkbox
		c1 = new JCheckBox("Option A", new ImageIcon("f:/gfg.jpg"), false);
		c2 = new JCheckBox("checkbox 2", false);
		// add ItemListener
		c1.addItemListener(s);
		c2.addItemListener(s);
		// create labels
		l = new JLabel("Option A not selected");
		l1 = new JLabel("checkbox2 not selected");
		// set color of text
		l.setForeground(Color.red);
		l1.setForeground(Color.blue);
		// create a new panel
		JPanel p = new JPanel();
		// add checkbox to panel
		p.add(c1);
		p.add(c2);
		p.add(l);
		p.add(l1);
		// add panel to frame
		f.add(p);
		// set the size of frame
		f.setSize(600, 300);
		f.setVisible(true);
	}
	public void itemStateChanged(ItemEvent e) {
		// if the state of checkbox1 is changed
		if (e.getSource() == c1) {
			if (e.getStateChange() == 1)
				l.setText("Option A selected");
			else
				l.setText("Option A not selected");
		}
		// if the state of checkbox2 is changed
		else {
			if (e.getStateChange() == 1)
				l1.setText("checkbox 2 selected");
			else
				l1.setText("checkbox 2 not selected");
		}
	}
}
