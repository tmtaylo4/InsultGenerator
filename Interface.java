/*
 * CS633 Boston University
 * Insult Generator
 * 2015 - Copyright and All Rights Reserved
 * _______________________________________________________________________________
 * 11/13/2015	-	Initial Creation	-	Thor Taylor
 * 
 * 
 * 
 * _______________________________________________________________________________
 */



package InsultGenerator;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;

public class Interface {

	protected static final String[] args = null;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final TextArea textArea = new TextArea();
		textArea.setEditable(false);
		frame.getContentPane().add(textArea, BorderLayout.CENTER);
		
		Button button = new Button("Insult me!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append( Test.main(args)+ "\n");
			}
		});
		frame.getContentPane().add(button, BorderLayout.SOUTH);
		
	}

}
