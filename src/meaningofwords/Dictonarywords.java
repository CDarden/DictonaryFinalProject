package meaningofwords;

import java.util.Scanner;

public class Dictonarywords {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String word = userInput.next();
		doesFileExist(word);

	}
	
	public static void doesFileExist(String path) {
		if(path.equalsIgnoreCase("Apple")) {
			System.out.println("Word1: Apple");
			System.out.println("Meaning1: a fruit");
			System.out.println("Meaning2: a tech firm");
		}
		else if(path.equalsIgnoreCase("Table")) {
			System.out.println("Word2: Table");
			System.out.println("Meaning1: an Object");
			System.out.println("Meaning2: Contains rows and columns when used in context of computer");
		}
		else {
			System.out.println("File does not exist");	
		}
	}

}
