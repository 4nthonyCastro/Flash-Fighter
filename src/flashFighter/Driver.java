package flashFighter;
import javax.swing.*;
import java.awt.*;

public class Driver extends JFrame {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() 
		{
			@Override
			public void run() {
			JFrame window = new Driver();
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.pack();
			window.setLocationRelativeTo(null);
			window.setVisible(true);
			}
		});
	}
	
	
	public Driver() {
		// New Game and Continue Buttons
		JButton buttonNewPlayer = new JButton("New Game");
		JButton buttonContPlayer = new JButton("Continue");
		
		// Creating Panel for Level Entry
		JPanel secondPan = new JPanel();
		JTextField tf = new JTextField(5); // Accepts up to 5 Characters
		JLabel label = new JLabel("Enter Code Level: ");
		JButton enter = new JButton("Submit");
		secondPan.add(label);
		secondPan.add(tf);
		secondPan.add(enter);
		setContentPane(secondPan);
		
		JPanel centerPanel = new JPanel();
		centerPanel.add(BorderLayout.WEST, buttonNewPlayer);
		centerPanel.add(BorderLayout.CENTER, buttonContPlayer);
		centerPanel.add(BorderLayout.EAST, secondPan);
		setContentPane(centerPanel);
	}
}
