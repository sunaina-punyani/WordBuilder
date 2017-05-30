/**
 * Word Builder Game
 * Team - Apeksha Gothawal, Sunaina Punyani, Arpita Karkera, Kiranmayi Gandikota
 * Sem III S.Y. Btech. Computer Engineering VJTI
 * @author Apeksha Gothawal
 * @date 2 November, 2016.
 * */
package view;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TNC extends JFrame{

	public TNC()
	{
		JFrame frame = new JFrame("Terms & Conditions");
		frame.setResizable(false);
		frame.setBounds(100, 100, 1000, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrTermsAndConditions = new JTextArea();
		txtrTermsAndConditions.setOpaque(false);
		txtrTermsAndConditions.setEditable(false);
		txtrTermsAndConditions.setText("                                                                       TERMS AND CONDITIONS\r\n\r\n1.The current terms and conditions which are described in this document govern the conduct of participating in \"Word Builder\".\r\n\r\n2.The game is specially designed as a PC version, and following terms and conditions are to be satisfied.\r\n\r\n3.The developers of this game have the whole and sole authority to change the terms and conditions at any time.\r\n\r\n4.It is the sole responsibility of the players to review these terms and conditions including the Game instructions.\r\n\r\n5.This game belongs to the developers and the distribution of this game without the permission of the developers is illegal and this may lead to imposing of a fine.");
		txtrTermsAndConditions.setBounds(0, 0, 984, 462);
		frame.getContentPane().add(txtrTermsAndConditions);
	}
}
