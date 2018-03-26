package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class RestaurantView implements Observer {
	
	final static boolean shouldFill = true;
	final static boolean shouldWeightX = true;
	final static boolean RIGHT_TO_LEFT = false;
	
	public static void AddComponentsToPanel(Container pane) {
			
			JButton button1;
			JButton button2;
			JButton button3;
			JButton button4;
			JButton button5;
			JButton button6;
			JButton button7;
			
			pane.setLayout(new GridBagLayout());
			GridBagConstraints c = new GridBagConstraints();
			
			button1 = new JButton("Table 1");
			button1.setBackground(Color.CYAN);
			
			button1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
						//Send to controller method where it gets handled
					
					}	
			});
			
			c.ipady = 50;
		    c.ipadx = 50;
		    c.gridx = 0;
		    c.gridy = 0;
		    c.weightx = 1;
		    c.weighty = 3;
		    pane.add(button1, c);
		 
		    button2 = new JButton("Table 2");
		    button2.setBackground(Color.CYAN);
		    
		    button2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
						//Send to controller method where it gets handled
					
					}	
			});
		    
		    c.gridx = 5;
		    c.gridy = 0;
		    pane.add(button2, c);
		 
		    button3 = new JButton("Table 3");
		    button3.setBackground(Color.CYAN);
		    
		    button3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
						//Send to controller method where it gets handled
					
					}	
			});
		    c.gridx = 0;
		    c.gridy = 1;
		    pane.add(button3, c);
		 
		    button4 = new JButton("Table 4");
		    button4.setBackground(Color.CYAN);
		    
		    button4.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
						//Send to controller method where it gets handled
					
					}	
			});
		    c.gridx = 5;
		    c.gridy = 1;
		    pane.add(button4, c);
		    
		    button5 = new JButton("                  Banquet 1                  ");
		    button5.setBackground(Color.CYAN);
		    
		    button5.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
						//Send to controller method where it gets handled
					
					}	
			});
		    c.gridx = 0;
		    c.gridy = 2;
		    pane.add(button5, c);
		    
		    button6 = new JButton("                  Banquet 2                  ");
		    button6.setBackground(Color.CYAN);
		    
		    button6.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
						//Send to controller method where it gets handled
					
					}	
			});
		    c.gridx = 5;
		    c.gridy = 2;
		    pane.add(button6, c);
		 
		    button7 = new JButton("Busboy");
		    button7.setBackground(Color.GRAY);
		    
		    button7.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
						//Send to controller method where it gets handled
					
					}	
			});
		    
		    c.fill = GridBagConstraints.BOTH;   
		    c.anchor = GridBagConstraints.PAGE_END; 
		    c.gridx = 0; 
		    c.gridy = 4; 
		    c.gridwidth = 10;
		    pane.add(button7, c);
		    
		  
	        JTextArea textArea;
	        JScrollPane jScrollPanel;
	        
	        textArea = new JTextArea("History Log:");
	        textArea.setColumns(20);
	        c.gridx = 6;
	        c.gridy = 0;
	        c.gridheight = 5;
	        c.gridwidth = GridBagConstraints.RELATIVE;
	        jScrollPanel = new JScrollPane(textArea);
	        
	        pane.add(textArea,c);
	        
	        
	}
	
	public static void createAndShowGUI() {
		
	
		JFrame frame = new JFrame("Restaurant View");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setMinimumSize(new java.awt.Dimension(1600, 900));
		AddComponentsToPanel(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
		
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
	//public 
	
}

