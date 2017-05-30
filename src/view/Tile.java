/**
 * Word Builder Game
 * Team - Apeksha Gothawal, Sunaina Punyani, Arpita Karkera and Kiranmayi Gandikota
 * Sem III S. Y. Btech. Computer Engineering VJTI
 * @author Kiranmayi Gandikota
 * @date 31 October, 2016
 */

package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Tile extends JLabel {
	public Tile(){
		super();
		setHorizontalAlignment(SwingConstants.CENTER);
		setVerticalAlignment(SwingConstants.CENTER);
		setOpaque(true);
		Color magenta1 = new Color(202,0,78);//Hike Color
	    setBackground(magenta1);
	    setForeground(Color.white);
	    setFont(new Font("Lucida Console", Font.BOLD, 40));
}
}