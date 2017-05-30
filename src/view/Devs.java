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

public class Devs extends JFrame{

	public Devs()
	{
		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1000, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrTheDevelopers = new JTextArea();
		txtrTheDevelopers.setOpaque(false);
		txtrTheDevelopers.setEditable(false);
		txtrTheDevelopers.setText("                                                                                                                   The Developers\r\n\r\n1. Apeksha Gothawal\r\n    S.Y. Btech. Computer Engineering\r\n    ID : 151071003\r\n    Email Id : apekshagothawal56@gmail.com\r\n\r\n2. Sunaina Punyani\r\n    S.Y. Btech. Computer Engineering\r\n    ID : 151071006\r\n    Email Id : punyanisunaina38@gmail.com\r\n\r\n3. Arpita Karkera\r\n    S.Y. Btech. Computer Engineering\r\n    ID : 151071041\r\n    Email Id : karkeraarpita@gmail.com\r\n\r\n4. Kiranmayi Gandikota\r\n    S.Y. Btech. Computer Engineering\r\n    ID : 151081023\r\n    Email Id : gkiranmayi97@gmail.com  ");
		txtrTheDevelopers.setBounds(0, 0, 980, 462);
		frame.getContentPane().add(txtrTheDevelopers);
	}
}
