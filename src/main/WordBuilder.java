/**
 * Word Builder Game
 * Team - Apeksha Gothawal, Sunaina Punyani, Arpita Karkera and Kiranmayi Gandikota
 * Sem III S. Y. Btech. Computer Engineering VJTI
 */

package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import dictionary.*;
import view.*;

public class WordBuilder {
	public CardLayout layout;
	public JPanel mainPanel;
	public Player bob;
	public Player wendy;
	public JFrame mainFrame;
	public String word;
	public char userInput;
	public int pass;
	public static WordBuilder game;
	public boolean gameOver;
	public TrieNode node;

	Trie dict;
	
	public static void main(String[] args) {
		game = new WordBuilder();
		//System.out.println("In Main");
		game.play();
	}

	public void play() {
		// initialise players
		bob = new Player();
		wendy = new Player();
		// this holds the built word;
		reset();

		// load the dictionary
		DictionaryLoader loader = new DictionaryLoader();
		dict = loader.load();
		
		
		// create a frame
		mainFrame = new JFrame("Word Builder");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// get the frame's default panel
		mainPanel = (JPanel)mainFrame.getContentPane();
		layout = new CardLayout();
		mainPanel.setLayout(layout);
		
		Welcome first = new Welcome(game);
		Arena arena = new Arena(game);
		EndGame last = new EndGame(game);
		
		mainPanel.add(first,"1");
		mainPanel.add(arena,"2");
		mainPanel.add(last,"3");
		
		layout.show(mainPanel, "1");
			
		mainFrame.setSize(819,460);
		mainFrame.setResizable(false);
		mainFrame.setVisible(true);	
	}
	
	public void update() {
		node = dict.isMore(userInput, node);
		// the character entered is valid
		if (node != null) {
			// check if the player was challenged
			if (pass == 1) {
				if (Player.turn)
					bob.won();
				else
					wendy.won();
				gameOver = true;
				pass = 0;
			}
			else {
				word = word + Character.toString(Character.toUpperCase(userInput));
			}
		}
		// the character entered is invalid
		else {
			if (Player.turn)		// if bob entered wrong character wendy won
				wendy.won();
			else			// it was wendy who entered wrong character so bob won
				bob.won();
			gameOver = true;
		}
		// check if no more words are possible
		if (!gameOver && node.getIsLeaf()) {
			gameOver = true;
			if (Player.turn)		// bob entered the last character
				wendy.won();
			else		// wendy entered the last character
				bob.won();
		}
		
		Player.turn = !Player.turn;
		if (gameOver) {
			reset();
		}
		if (Player.round == 5) {
			if (wendy.getScore() > bob.getScore())
				Player.winner = "WENDY WINS!!!";
			mainFrame.repaint();
			layout.show(mainPanel,"3");
		}
		
		mainFrame.repaint();
	}
	
	public void reset() {
		node = null;
		word = "";
		gameOver = false;
		pass = 0;
	}
	
	public void resetAll() {
		reset();
		Player.turn = true;
		Player.round = 0;
		Player.roundLabel = "ROUND 1";
		Player.winner = "BOB WINS!!!";
		bob = new Player();
		wendy = new Player();
	}
}
