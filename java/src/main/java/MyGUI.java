import javax.swing.*;
import java.awt.event.*;
import java.util.*;

/**
 * A demo of GUI programming with Swing
 */
public class MyGUI extends JFrame {
	
	public MyGUI() {
		super("Kyle GUI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton theButton = new JButton("Poke Kyle");
		theButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// These are the actions yo
				System.out.println("swiggity swooty");
			}
		});

		JButton theButton2 = new JButton("Pinch Kyle :(");
		theButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// These are the actions yo
				System.out.println("im coming dat booty");
			}
		});

		// Java div
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		container.add(theButton);
		container.add(theButton2);

		JPanel container2 = new JPanel();
		container2.setLayout( new BoxLayout(container2, BoxLayout.X_AXIS));
		container2.add(new JButton("A"));
		container2.add(new JButton("A"));
		container2.add(new JButton("A"));
		container2.add(new JButton("A"));
		container2.add(new JButton("A"));
		container2.add(new JButton("A"));
		container2.add(new JButton("A"));
		container2.add(new JButton("A"));
		container2.add(new JButton("A"));
		container2.add(new JButton("A"));
		container2.add(new JButton("A"));
		container2.add(new JButton("A"));
		container2.add(new JButton("A"));
		container2.add(new JButton("A"));
		container2.add(new JButton("A"));
		container2.add(new JButton("B"));
		container2.add(new JButton("B"));
		container.add(container2);
		this.add(container);

		this.pack();
		// This makes it visible.
		this.setVisible(true);		
	}

	public static void main(String[] args) {
    	new MyGUI(); //create the frame
  	}
}
