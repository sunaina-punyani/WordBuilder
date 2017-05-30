package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import main.*;

public class Welcome extends JPanel {
	final WordBuilder outer;
	
	JButton instructions;
	JButton tnc;
	JButton dev;
	JButton play;
	CardLayout layout;
	JPanel mainPanel;
	
	public Welcome(WordBuilder outer) {
		this.outer = outer;
		setLayout(null);
		instructions = new JButton("Instructions");
		instructions.setBounds(22, 386, 157, 23);
		add(instructions);
		instructions.addActionListener(new InstListener());
		
		tnc = new JButton("T&C");
		tnc.setBounds(279, 386, 185, 23);
		add(tnc);
		tnc.addActionListener(new TermsCondListener());
		
		dev = new JButton("Devs");
		dev.setBounds(571, 386, 213, 23);
		add(dev);
		dev.addActionListener(new DevListener());
		
		play = new JButton(new ImageIcon("src/resources/play.jpg"));
		play.setBounds(414, 229, 79, 70);
		add(play);
		play.addActionListener(new PlayListener());
	}
	
	
	public void paintComponent(Graphics g) {
		Toolkit tool = Toolkit.getDefaultToolkit();  
        Image background = tool.getImage("src/resources/first.jpg");
        g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
	}
	
	class InstListener implements ActionListener
	{
	    public void actionPerformed(ActionEvent event)
	    {
	    	JFrame frame = new JFrame();
			frame.setResizable(false);
			frame.setBounds(100, 100, 1000, 800);
			frame.getContentPane().setLayout(null);
			
			JTextArea txtrWordBuilderGame = new JTextArea();
			txtrWordBuilderGame.setOpaque(false);
			txtrWordBuilderGame.setEditable(false);
			txtrWordBuilderGame.setText("                                                             WORD BUILDER\r\n                                                              Game Rules\r\n                                                            For 2 Players\r\nOBJECT : \r\n                   In the Word Builder game, players are to form words using the 26 alphabets .\r\n                   There are in total 5 rounds in the game.\r\n                   Each player competes to win maximum rounds in order to win the game.\r\nGAMEPLAY : \r\n1. The two players of the game Player 1 and Player 2 are assigned characters i.e. BOB and WENDY respectively.\r\n    (Hereby in the instructions Player 1 and Player 2 will be referred to as BOB and Wendy respectively)\r\n2. The first turn in the game is of BOB and the second turn is of WENDY.\r\n3. As a round begins, BOB has to enter an alphabet with which he/she can form a valid word.\r\n    (Check the note at the end of the instructions)\r\n    Then WENDY has to enter the second alphabet corresponding to the first alphabet entered by BOB to make a vaild word.\r\n4. After entering a word the turns changes between BOB and WENDY.\r\n5. If a player, either BOB or WENDY, is unable to enter next alphabet i.e. if he/she is not able to continue the entered word, then the player,\r\n    either BOB or WENDY, can press the \"PASS\" button to skip his/her turn and the next player gets the chance.\r\n6. END OF A ROUND :\r\n                       A round ends in the following situations : \r\n                       i. If both the players are unable to continue the word and both of them press the \"PASS\" button.\r\n                      ii. If according to the dictionary a word cannot be further continued.\r\n                     iii. \r\n7. END OF THE GAME : \r\n                       After completion of 5 rounds, the game ends.\r\n                       The game can be terminated in between by pressing the \"EXIT\" button.\r\nSCORING : \r\n1. Scores are given on the basis of number of rounds won by a particular player.\r\n2. One point is awarded when one round is won.\r\n3. The scores are given following these cases : \r\n    Case 1 : When BOB enters the last alphabet and there is no more possible word, then WENDY wins the round.\r\n    Case 2 : When WENDY enters the last alphabet and there is no more possible word, then BOB wins the round.\r\n    Case 3 : When BOB enters the last alphabet and\r\n                   Case i : On the next turn WENDY enters an alphabet that leads to formation of a correct word according to the dictionary, then the game\r\n                                will continue.\r\n                  Case ii : On the next turn WENDY is unable to think of the word and presses the \"PASS\" button then the turn passes to BOB. Now if\r\n                                 Case a : BOB also presses the \"PASS\" button, then WENDY wins the respective round.\r\n                                 Case b : BOB enters the alphabet that leads to formation of a correct word according to the dictionary, then BOB wins the\r\n                                                respective round.\r\nHOW TO WIN : \r\n        The player, either BOB or WENDY, with the highest number of rounds won wins the game.\r\n\r\nNOTE : \r\n        Words with special characters like '@' , '$' , '%' , '&', etc. , are not allowed.                                            ");
			txtrWordBuilderGame.setBounds(0, 0, 984, 782);
			frame.getContentPane().add(txtrWordBuilderGame);
			frame.setVisible(true);
	    }
	}

	class TermsCondListener implements ActionListener
	{
	    public void actionPerformed(ActionEvent event)
	    {
	    	JFrame frame = new JFrame("Terms & Conditions");
			frame.setResizable(false);
			frame.setBounds(100, 100, 1000, 500);
			frame.getContentPane().setLayout(null);
			
			JTextArea txtrTermsAndConditions = new JTextArea();
			txtrTermsAndConditions.setOpaque(false);
			txtrTermsAndConditions.setEditable(false);
			txtrTermsAndConditions.setText("                                                                       TERMS AND CONDITIONS\r\n\r\n1.The current terms and conditions which are described in this document govern the conduct of participating in \"Word Builder\".\r\n\r\n2.The game is specially designed as a PC version, and following terms and conditions are to be satisfied.\r\n\r\n3.The developers of this game have the whole and sole authority to change the terms and conditions at any time.\r\n\r\n4.It is the sole responsibility of the players to review these terms and conditions including the Game instructions.\r\n\r\n5.This game belongs to the developers and the distribution of this game without the permission of the developers is illegal and this may lead to imposing of a fine.");
			txtrTermsAndConditions.setBounds(0, 0, 984, 462);
			frame.getContentPane().add(txtrTermsAndConditions);
			frame.setVisible(true);
	    }
	}

	class DevListener implements ActionListener
	{
	    public void actionPerformed(ActionEvent event)
	    {
	    	JFrame frame = new JFrame();
			frame.setResizable(false);
			frame.setBounds(100, 100, 1000, 500);
			frame.getContentPane().setLayout(null);
			
			JTextArea txtrTheDevelopers = new JTextArea();
			txtrTheDevelopers.setOpaque(false);
			txtrTheDevelopers.setEditable(false);
			txtrTheDevelopers.setText("                                                                                                                   The Developers\r\n\r\n1. Apeksha Gothawal\r\n    S.Y. Btech. Computer Engineering\r\n    ID : 151071003\r\n    Email Id : apekshagothawal56@gmail.com\r\n\r\n2. Sunaina Punyani\r\n    S.Y. Btech. Computer Engineering\r\n    ID : 151071006\r\n    Email Id : punyanisunaina38@gmail.com\r\n\r\n3. Arpita Karkera\r\n    S.Y. Btech. Computer Engineering\r\n    ID : 151071041\r\n    Email Id : karkeraarpita@gmail.com\r\n\r\n4. Kiranmayi Gandikota\r\n    S.Y. Btech. Computer Engineering\r\n    ID : 151081023\r\n    Email Id : gkiranmayi97@gmail.com  ");
			txtrTheDevelopers.setBounds(0, 0, 980, 462);
			frame.getContentPane().add(txtrTheDevelopers);
			frame.setVisible(true);
	    }
	}

	class PlayListener implements ActionListener
	{
	    public void actionPerformed(ActionEvent event)
	    {
	    	outer.layout.show(outer.mainPanel, "2");
	    }
	}
}