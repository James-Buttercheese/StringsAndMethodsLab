
public class StringMethods {

	public static void main(String[] args) {
		
	}
	
	public static String capitalize (String word) {
		word = (word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase());
		return word;
	}
	
	public static int wheresWaldo (String phrase) {
		int indx = phrase.lastIndexOf("Waldo");
		return indx;
	}
	
	public static String firstThingFirst (String a, String b) {
		String endString = "";
		char a2 = a.toLowerCase().charAt(0);
		char b2 = b.toLowerCase().charAt(0);
		int a3 = a2;
		int b3 = b2;
		if (a3 < b3) { 
			endString = (a + " " + b);
		} else {
			endString = (b + " " + a);
		}
		return endString;
	}
	
	public static String reverse (String a) {
		String reverse = "";
		for (int i = (a.length() - 1); i >= 0; i--) {
			reverse = (reverse + "" + (a.charAt(i)));
		}
		return reverse;
	}
	
	public static void soLong (String a, String b) {
		int a2 = a.length();
		int b2 = b.length();
		
		if (a2 > b2) {
			System.out.println(a);
		} else if (b2 > a2) {
			System.out.println(b);
		} else if (b2 == a2) {
			System.out.println(a + " " + b);
		} else {
			System.out.println("Your words suck.");
		}
	}
		
	public static String afterMath (String phrase) {
		String phrase2 = phrase.toLowerCase();
		String phrase3 = "";
		int indx = phrase2.indexOf("math");
		if (indx < 0) {
			phrase3 ="dud";
		} else {
			phrase3 = (phrase.substring(indx));
		}
		return phrase3;
	}

	public static void letterize (String word) {
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		System.out.println();
		
	}
	
	
	public static void camelCase (String phrase) {
	int length = phrase.length();
	int i = 0;
	phrase = phrase.toLowerCase();
	String phrase2 = "";
	
	for (i=0 ; i < length ; i++) {
		
		if (phrase.substring(i,i+1).contentEquals(" ")) {
			phrase2 = phrase2 + phrase.toUpperCase().substring(i+1,i+2);
			i += 1;			
		} else {
			phrase2 = phrase2 + phrase.substring(i,i+1);
			}
			}
	System.out.println(phrase2);
	}
}