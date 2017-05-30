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

public class Instructions extends JFrame{

	public Instructions()
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
    }
}