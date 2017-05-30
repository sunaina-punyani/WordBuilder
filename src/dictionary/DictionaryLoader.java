/**
 * Word Builder Game
 * Team - Apeksha Gothawal, Sunaina Punyani, Arpita Karkera and Kiranmayi Gandikota
 * Sem III S. Y. Btech. Computer Engineering VJTI
 * @author Arpita Karkera
 * @date 31 October, 2016
 * 
 * This program loads the dictionary int Trie object and returns it
 */

package dictionary;

import java.io.*;

public class DictionaryLoader {
	private Trie dict;
	
	/*
	 * Constructor
	 * Deserialize dictionary from disk
	 */
	public DictionaryLoader() {
		File dictFile = new File("src/resources/dict.ser");		// serialized dictionary
		ObjectInputStream dictReader = null;	
		try {
			dictReader = new ObjectInputStream(new FileInputStream(dictFile));
			dict = (Trie)dictReader.readObject();	// read the object from file and cast to Trie
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (dictReader != null)
				dictReader.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/*
	 * Return the dictionary
	 * @return (Trie)dict
	 */
	public Trie load() {
		return dict;
	}
}
