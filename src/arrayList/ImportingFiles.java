package arrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ImportingFiles {

	public static void main(String[] args) throws FileNotFoundException {
		//create an array list of objects that match the type of items
		//found in your file that you plan to import
		ArrayList<String> allWords = new ArrayList<String>();
		//scan in the words, one on each line
		Scanner input = new Scanner(new File("words.txt"));
		while (input.hasNext()) {
		    String word = input.next();
		    allWords.add(word);
		}
		System.out.println(allWords);

		// move each of the plural words to another file
		
		// remove all plural words
	
		
		//filter out the bad words, removing them if they contain parts of
		//other bad words. Create another list of the bad words, and loop over them,
		//instead of looking for each one. This way you can add to the bad word list
		//over time.
	}

}
