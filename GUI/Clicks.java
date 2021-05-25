// Graphical User Interface
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Clicks implements ActionListener {
	private int clicks = 0;
	private JLabel label = new JLabel("Number of clicks: 0");
	private JFrame frame = new JFrame();
	public Clicks() {
		// the clickable button
		JButton buttonCM = new JButton("Click Me");
		JButton buttonCMT = new JButton("Click Me Too");
		buttonCM.addActionListener(this);
		buttonCMT.addActionListener(this);
		// the panel with the buttons + text
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		panel.setLayout(new FlowLayout());
		panel.add(buttonCM);
		panel.add(buttonCMT);
		panel.add(label);
		// text field example
		// setBounds(x, y, width, height)
		JTextField text1, text2;
		text1 = new JTextField("Text Field 1");
		text1.setBounds(0, 100, 100, 40);
		text2 = new JTextField("Text Field 2");
		text2.setBounds(100, 100, 100, 40);
		// text area example
		JTextArea textA, textB;
		textA = new JTextArea();
		textA.setBounds(200, 100, 100, 40);
		textB = new JTextArea();
		textB.setBounds(300, 100, 100, 40);
		// set up + display the frame
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Clicks Java Example");
		frame.pack();
		frame.add(text1);
		frame.add(text2);
		frame.add(textA);
		frame.add(textB);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	// process the button clicks
	public void actionPerformed(ActionEvent e) {
		clicks++;
		label.setText("Number of Clicks: " + clicks);
	}
	// create one Frame
	public static void main(String[] args) {
		new Clicks();
	}
	/*
	Sources
		https://introcs.cs.princeton.edu/java/15inout/GUI.java.html
		https://www.youtube.com/watch?v=5o3fMLPY7qY
	 */
}