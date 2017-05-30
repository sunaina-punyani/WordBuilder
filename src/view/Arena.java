/**
 * Word Builder Game
 * Team - Apeksha Gothawal, Sunaina Punyani, Arpita Karkera and Kiranmayi Gandikota
 * Sem III S. Y. Btech. Computer Engineering VJTI
 */

package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import main.*;


public class Arena extends JPanel {
	final WordBuilder outer;
	
	JButton pass;
	JButton replay;
	JButton exit;
	JTextField text;
	JLabel Roundlabel;
	JLabel Turnlabel;
	Tile label;
	int width = 0;
	int x = 0;
	
	public Arena(WordBuilder outer) {
		this.outer = outer;
		setLayout(null);
		
		// pass button
		pass = new JButton("PASS");
		Color green1 = new Color(139,176,19);
        pass.setBackground(green1);
        pass.setForeground(Color.white);
        pass.setBounds(345,340,120,40);
        pass.addActionListener(new Passlistener());
        add(pass);
        
        replay = new JButton(new ImageIcon("src/resources/replay.jpg")); //replay button
        replay.addActionListener(new Replaylistener());
        replay.setBounds(25,360,70,60);
        add(replay);
        
        exit=new JButton(new ImageIcon("src/resources/exit.jpg")); //exit button 
        exit.setBounds(705,360,70,60);
        exit.addActionListener(new Exitlistener());
        add(exit);
        
        text = new JTextField(1);
        text.setBounds(385,290,40,40);
        text.setHorizontalAlignment(SwingConstants.CENTER);
        text.addActionListener(new TextListener());
        add(text);
        
        label = new Tile();
        label.setText(outer.word);
        label.setSize(50, 50);
        add(label);
        
        Roundlabel = new JLabel();
        Roundlabel.setHorizontalAlignment(SwingConstants.CENTER);
        Roundlabel.setVerticalAlignment(SwingConstants.CENTER);
        Roundlabel.setOpaque(true);
		Color bg = new Color(40,48,67);//Hike Color
		Roundlabel.setBackground(bg);
		Roundlabel.setForeground(Color.white);
		Roundlabel.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		Roundlabel.setBounds(300,60,200,50);
		
		
        Turnlabel = new JLabel();
        Turnlabel.setHorizontalAlignment(SwingConstants.CENTER);
		Turnlabel.setVerticalAlignment(SwingConstants.CENTER);
		Turnlabel.setOpaque(true);
		Turnlabel.setForeground(Color.white);
		Turnlabel.setBackground(bg);
		Turnlabel.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		Turnlabel.setBounds(250,140,300,50);
        
        add(Roundlabel);
        add(Turnlabel);
	}

	
	public void paintComponent(Graphics g)
	{
	    Toolkit t=Toolkit.getDefaultToolkit();  
        Image image=t.getImage("src/resources/final.jpg");  
        g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
        int i;
        
        // for bob
        g.setColor(Color.green);
        for (i = 0; i < outer.bob.getScore(); ++i) {
        	g.fillOval(20 + 30*i, 150, 15, 15);
        }
        g.setColor(Color.gray);
        while (i < 5) {
        	g.fillOval(20 + 30 * i, 150 , 15, 15);
        	++i;
        }
        
        // for wendy
        g.setColor(Color.green);
        for (i = 0; i < outer.wendy.getScore(); ++i) {
        	g.fillOval(650 + 30*i, 150, 15, 15);
        }
        g.setColor(Color.gray);
        while (i < 5) {
        	g.fillOval(650 + 30 * i, 150 , 15, 15);
        	++i;
        }        
        
        label.setText(outer.word);
        width = (outer.word.length()*40);
        x = (outer.mainPanel.getWidth()- width)/2;
        label.setBounds(x,200,width,50);
	
        Roundlabel.setText(main.Player.roundLabel);
        
		if(main.Player.turn==true)
		{
			Turnlabel.setText("BOB's TURN");
		}
		else
		{
			Turnlabel.setText("WENDY's TURN");
		}
	}
	
	class Passlistener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
        	outer.pass++;
        	if (outer.pass == 1) {
        		Player.turn = !Player.turn;
        	}
        	else {
        		if (Player.turn)
        			outer.wendy.won();
        		else
        			outer.bob.won();
        		outer.reset();
        	}
        	if (Player.round == 5) {
        		if (outer.wendy.getScore() > outer.bob.getScore())
    				Player.winner = "WENDY WINS!!!";
        		outer.mainFrame.repaint();
        		outer.layout.show(outer.mainPanel, "3");
        	}
        	outer.mainFrame.repaint();
        }
    }

 class Replaylistener implements ActionListener
     {
        public void actionPerformed(ActionEvent event)
        {
        	outer.resetAll();
        	repaint();
        }
    }

 class Exitlistener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
       	{
        	outer.resetAll();
        	outer.layout.show(outer.mainPanel, "1");
       	}
    }
 class TextListener implements ActionListener {
	 public void actionPerformed(ActionEvent event) {
		 
		 String t = text.getText();
		 outer.userInput = Character.toLowerCase(t.charAt(0));
		 text.setText("");
		 outer.update();
	 }
 }

}
