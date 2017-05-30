/**
 * Word Builder Game
 * Team - Apeksha Gothawal, Sunaina Punyani, Arpita Karkera and Kiranmayi Gandikota
 * Sem III S. Y. Btech. Computer Engineering VJTI
 * @author Arpita Karkera
 * @date 29 October, 2016
 */

package dictionary;

import java.io.*;

public class Trie implements Serializable {
	private TrieNode root;

	/*
	 * Constructor
	 */
	public Trie() {
		root = new TrieNode();
	}

	/*
	 * Add word to the Trie
	 * @param (String)word
	 */
	public void insert(String word) {
		if (word != "" && word != null) {	// check if word is empty or null
			word = word.toLowerCase();	// all words are stored in lower case in the Trie
			int wordLen = word.length();	// length of word
			TrieNode trav = root;	// trav works as iterator
			for (int i = 0; i < wordLen; ++i) {
				char c = word.charAt(i);
				int charPos = c - 'a';	// index of character in TrieNode
				if (trav.getChild(charPos) == null) {
					TrieNode newNode = new TrieNode(c);
					trav.setChild(newNode, charPos);
					trav.resetIsLeaf();
					trav = newNode;
				}
				else {
					trav = trav.getChild(charPos);
				}
			}
		}
	}
	
	/*
	 * Check if the specified character exists in the word. If yes, then return it's reference
	 * @param (TrieNode)prev, (char)character
	 * @return (TrieNode)child
	 */
	public TrieNode isMore(char character, TrieNode prev) {
		if (prev == null)
			prev = root;
		if (prev.getIsLeaf())
			return null;
		else {
			int charPos = character - 'a';
			return prev.getChild(charPos);
		}
	}
}
