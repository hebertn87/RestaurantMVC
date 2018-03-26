package view;

import javax.swing.*;
import java.awt.*;

public class RestaurantView {
	
	final static boolean shouldFill = true;
	final static boolean shouldWeightX = true;
	final static boolean RIGHT_TO_LEFT = false;
	
	public static void addComponents(Container pane) {
		
			if(RIGHT_TO_LEFT) {
				pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
			}
			
			JButton button;
			
			pane.setLayout(new GridBagLayout());
			
			GridBagConstraints c = new GridBagConstraints();
			if (shouldFill) {
				//c.fill = GridBagConstraints.BOTH;
			}
			
			button = new JButton("Table 1");
			if (shouldWeightX) {
				
			}
			c.ipady = 50;
		    c.ipadx = 50;
		    c.gridx = 0;
		    c.gridy = 0;
		    c.weightx = 1;
		    c.weighty = 3;
		    pane.add(button, c);
		 
		    button = new JButton("Table 2");
		    c.gridx = 5;
		    c.gridy = 0;
		    pane.add(button, c);
		 
		    button = new JButton("Table 3");
		    c.gridx = 0;
		    c.gridy = 1;
		    pane.add(button, c);
		 
		    button = new JButton("Table 4");
		    //c.fill = GridBagConstraints.BOTH;
		    c.gridx = 5;
		    c.gridy = 1;
		    pane.add(button, c);
		    
		    button = new JButton("                  Banquet 1                  ");
		    c.gridx = 0;
		    c.gridy = 2;
		    pane.add(button, c);
		    
		    button = new JButton("                  Banquet 2                  ");
		    c.gridx = 5;
		    c.gridy = 2;
		    pane.add(button, c);
		 
		    button = new JButton("Busboy");
		    c.fill = GridBagConstraints.BOTH;   
		    c.anchor = GridBagConstraints.PAGE_END; 
		    c.gridx = 0; 
		    c.gridy = 4; 
		    c.gridwidth = 10;
		    pane.add(button, c);
		    
		    
		    pane.add(new JTextField(), c);
		    
	    }
	
	public static void createAndShowGUI() {
		JFrame frame = new JFrame("Restaurant View");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setMinimumSize(new java.awt.Dimension(1000, 600));
		addComponents(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
		
	}
}

