/**
 * Word Builder Game
 * Team - Apeksha Gothawal, Sunaina Punyani, Arpita Karkera and Kiranmayi Gandikota
 * Sem III S. Y. Btech. Computer Engineering VJTI
 * @author Arpita Karkera
 * @date 29 October, 2016
 */

package dictionary;

import java.io.*;

public class TrieNode implements Serializable {
	private char character;
	private TrieNode[] children;
	private boolean isLeaf;

	/*
	 * Constructor for root node
	 */
	public TrieNode() {
		children = new TrieNode[26];
		isLeaf = true;
	}

	/*
	 * Constructor for child node
	 * @param (char)character
	 */
	public TrieNode(char character) {
		this();
		this.character = character;
	}

	/*
	 * Get the node's character
	 * @return (char)character
	 */
	public char getCharacter() {
		return character;
	}
	
	/*
	 * Set the isLeaf
	 */
	public void setIsLeaf() {
		isLeaf = true;
	}
	
	public void resetIsLeaf() {
		isLeaf = false;
	}

	/*
	 * Check if it's a leaf node
	 * @return (boolean)isLeaf
	 */
	public boolean getIsLeaf() {
		return isLeaf;
	}

	/*
	 * Set a child
	 * @param (TrieNode)nextNode, (int)charPos
	 */
	public void setChild(TrieNode nextNode, int charPos) {
		children[charPos] = nextNode;
	}
	
	/*
	 * Get a child
	 * @return (TrieNode)
	 */
	public TrieNode getChild(int charPos) {
		return children[charPos];
	}
}
