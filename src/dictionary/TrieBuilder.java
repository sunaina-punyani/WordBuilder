/**
 * Word Builder Game
 * Team - Apeksha Gothawal, Sunaina Punyani, Arpita Karkera and Kiranmayi Gandikota
 * Sem III S. Y. Btech. Computer Engineering VJTI
 * @author Arpita Karkera
 * @date 30 October, 2016
 * 
 * This program build the Trie data structure object from the words listed in
 * words.txt file and saves that object
 */

package dictionary;

import java.io.*;

public class TrieBuilder {

	public static void main(String[] args) {
		// input and output files
		File wordFile = new File("src/resources/words.txt");	// input file
		File dictFile = new File("src/resources/dict.ser");		// output file
		
		// reader and writer
		BufferedReader wordReader = null;
		ObjectOutputStream dictWriter = null;
		
		// dictionary (Trie object) to be stored
		Trie dict = new Trie();
		
		try {
			wordReader = new BufferedReader(new FileReader(wordFile));	// reader (reads from words.txt)
			dictWriter = new ObjectOutputStream(new FileOutputStream(dictFile));	// writer (writes object i.e. Trie to dict.ser)
			
			// read words from text file and insert into the Trie
			String word = null;
			while((word = wordReader.readLine()) != null) {		// read single lines till words are there
				word = word.replaceAll("'", "");	// replace any aphostophes (because they cause exceptions to occur)
				dict.insert(word); // add the word to Trie object
			}
			
			// save the Trie
			dictWriter.writeObject(dict);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (wordReader != null)
				wordReader.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
			try {
				if (dictWriter != null)
				dictWriter.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
