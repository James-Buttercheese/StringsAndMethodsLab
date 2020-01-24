import java.util.Scanner;

public class StringLab {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		StringMethods m = new StringMethods();
		
		System.out.print("Please enter a word to be capitalized:");
		String word = scnr.next();
		System.out.println(m.capitalize(word));
		
		scnr.nextLine();
		System.out.print("Please enter a phrase so I can find Waldo:");
		String phrase = scnr.nextLine();
		System.out.println(m.wheresWaldo(phrase));
		
		System.out.print("Enter two words to alphabetize them:");
		String word1 = scnr.next();
		String word2 = scnr.next();
		System.out.println(m.firstThingFirst(word1,word2));
		
		System.out.print("Enter a word to get it reversed:");
		String reversed = scnr.next();
		System.out.println(m.reverse(reversed));
		
		System.out.print("Enter two words to see which is larger:");
		String wordBigger = scnr.next();
		String wordBiggerer = scnr.next();
		m.soLong(wordBigger,wordBiggerer);
		
		scnr.nextLine();
		System.out.print("Enter a phrase about math:");
		String mathy = scnr.nextLine();
		System.out.println(m.afterMath(mathy));
		
		
		System.out.print("Enter a word to see it get really tall:");
		String g = scnr.next();
		m.letterize(g);
		
		scnr.nextLine();
		System.out.println("Enter a phrase for camel case:");
		String h = scnr.nextLine();
		m.camelCase(h);		
		
		System.out.println("Thank you for your participation, goodbye.");
	}

	
	
	
}

