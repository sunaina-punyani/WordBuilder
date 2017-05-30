/**
 * Word Builder Game
 * Team - Apeksha Gothawal, Sunaina Punyani, Arpita Karkera and Kiranmayi Gandikota
 * Sem III S. Y. Btech. Computer Engineering VJTI
 */

package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import main.*;

public class EndGame extends JPanel {
	final WordBuilder outer;
JButton play_again;
JButton exit;
JLabel game_over;
JLabel won;

public EndGame(WordBuilder outer) {
	this.outer = outer;
	setLayout(null);
	play_again = new JButton(new ImageIcon("src/resources/replay.jpg"));
	play_again.setBounds(25,360,70,60);
	add(play_again);
	play_again.addActionListener(new PAgainListener());
	
	exit = new JButton(new ImageIcon("src/resources/home.jpg"));
	exit.setBounds(705,360,70,60);
	add(exit);
	exit.addActionListener(new ExitListener());

	won = new JLabel(Player.winner);
	//won.setOpaque(true);
	won.setHorizontalAlignment(SwingConstants.CENTER);
	won.setVerticalAlignment(SwingConstants.CENTER);
	//Color magenta1 = new Color(202,0,78);
	//won.setBackground(magenta1);
	won.setForeground(Color.white);
	won.setBounds(120, 150, 600, 50);
	won.setFont(new Font("Trebuchet MS", Font.BOLD, 50));
	add(won);
	
	game_over = new JLabel("GAME OVER");
	//game_over.setOpaque(true);
	game_over.setHorizontalAlignment(SwingConstants.CENTER);
	game_over.setVerticalAlignment(SwingConstants.CENTER);
	//Color magenta1 = new Color(202,0,78);
	//game_over.setBackground(magenta1);
	game_over.setForeground(Color.white);
	game_over.setBounds(270, 100, 300, 50);
	game_over.setFont(new Font("Trebuchet MS", Font.BOLD, 50));
	add(game_over);
	
	}

public void paintComponent(Graphics g) {
	won.setText(Player.winner);
	Toolkit tool = Toolkit.getDefaultToolkit();  
    Image background = tool.getImage("src/resources/last.jpg");
    g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
}

class PAgainListener implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
    	outer.resetAll();
        outer.layout.show(outer.mainPanel, "2");
    }
}

class ExitListener implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
    	outer.resetAll();
    	outer.layout.show(outer.mainPanel, "1");
    }
}

}
