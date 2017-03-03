import sun.nio.ch.sctp.SctpNet;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by josh on 3/2/17.
 */
public class Main {
	//creating a global char array of letters and characters
	private char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',};
	private char[] specialChars = {'?','!','@','#','$','%','^','&','*','(',')','-','[',']','{','~','{','}','\\','/'};

	//creating a global String array of words
	private String[] wordList= {"Hello","World","Zoom","Wave","Hide","Define","Hook","Crook","Chop","slap","sally","peter","pepper","Sliders",
			"apple","Peak","ahoy","lung","tuck","wade","rain","wood","goo","paddy", "pen","slime"};

	public static void main(String[] args) {
		//Starting a new instance of Main to use non static methods
		Main program = new Main();
		//Starting the private method start()
		program.start();
	}
	//method that starts the interaction with the console
	private void start(){
		//starting a new scanner to allow the console to get input from the user
		Scanner read = new Scanner(System.in);
		String input;
		boolean dowork =false;
		//While loop that continuously shows the menu until you type 3  or quit
		while(!dowork){
			System.out.print("\nPick one: Type 1, 2, or 3" +
					"\n\t\t1. View Quick 10 Expressions" +
					"\n\t\t2. More Complex Expressions" +
					"\n\t\t3. Quit" +
					"\nChoice: ");
			input = read.next();
			if(Integer.parseInt(input) == 1){
				System.out.println();
				//starts quick15 method that enters a for loop
				quick15();
			}else if(Integer.parseInt(input) == 2){
				System.out.println();
				//starts the complex method that prints out returns for others methods
				complex();
			}else if(Integer.parseInt(input) == 3 || input.toLowerCase().equals("quit")){
				System.out.println();
				// returns true and breaks the while loop to exit program
				dowork = true;
			}
		}
	}
	private void quick15(){
		for(int i = 10; i <= 14; i++){
			//shows product of 2 integers
			for(int x = 5; x < 8; x++ ){
				System.out.println("this is the product of "+i+" and "+x +": "+(i * x));
			}
		}
	}
	private void complex (){
		// prints out string of two words concatenated together from word list
		System.out.println(combineTwoStrings(wordList[(int)(Math.random()* wordList.length)],wordList[(int)(Math.random()* wordList.length)]));
		//compares two random generated numbers
		System.out.println(compareTwoNumbers((int)(Math.random()*100),(int)(Math.random()*100)));
		//finds sum of two random Doubles
		System.out.println(sumOfTwoDoubles((Double) (Math.random()*1000),(Double) (Math.random()*1000)));
		//returns true or false if character is a vowel
		System.out.println(isVowel(letters[(int)(Math.random()*letters.length)]));
		//returns the product of an integer and a double
		System.out.println(multiplyTwoNumbers((int)(Math.random()*100),(Double)(Math.random()*100)));
		//subtracting 3 random Integer numbers
		System.out.print(subtractThreeNumbers((int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100)));
		//checking the remainder of 2 integers
		System.out.print(remainderOf((int)(Math.random()*100),(int)(Math.random()*100)));
		//makes super random string with integers, doubles, Strings, Chars, and subtracting integer and double together
		System.out.println(randomString(letters[(int)(Math.random()*letters.length)],specialChars[(int)(Math.random()*specialChars.length)],wordList[(int)(Math.random()* wordList.length)],
				wordList[(int)(Math.random()* wordList.length)],(int)(Math.random()*50),(Double) (Math.random()*50)));
		//math with order of operations using adding, subtracting, remainder, multiplication, and division
		System.out.println("\nmath with order of operations using adding, subtracting, remainder, multiplication, and division");
		System.out.println(93*(3.34*6.54)-(7%4)+(34/7));
	}
	//returns a string of two random words from a string array
	private String combineTwoStrings(String string1, String string2){
		System.out.println("Combining two random words");
		return string1+string2;
	}
	//returns a boolean
	private boolean isVowel(char character){
		//Creates a new ArrayList
		ArrayList<Character> vowels = new ArrayList<>();
		// adds vowels to the array list vowels
		vowels.addAll(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		//prints to the console what letter/character it is checking
		System.out.println("\nIs '"+character+"' a vowel? ");
		//checks to see if the letter/character is in array vowels and returns true or false
		if(vowels.contains(character)){
			return true;
		}else{
			return false;
		}
	}
	//compares two integer numbers and returns the higher one
	private int compareTwoNumbers(int number1, int number2){
		System.out.println("\nComparing two numbers to see which one is greater: " +number1+" and "+number2 );
		//compares two numbers and returns the one that higher
		if(number1 > number2){
			return number1;
		}else if (number1 < number2){
			return number2;
		}//if both numbers are the same then system will return this issue
		else{
			System.out.println("\nSorry both numbers are the same, with the value of ");
			return number1;
		}
	}
	// sum of 2 doubles
	private Double sumOfTwoDoubles(Double double1, Double double2){
		System.out.println("\nCreating Sum for two doubles");
		//adding two doubles together and returning answer
		return double1 + double2;
	}
	//Product of a integer and a double
	private Double multiplyTwoNumbers(Integer intNumber,Double doubleNumber){
		System.out.println("\nLets Multiple and Integer and a Double:");
		//multiplying and returning answer
		return  intNumber * doubleNumber;
	}
	//subtracts 3 numbers
	private int subtractThreeNumbers(int number1, int number2,int number3){
		System.out.print("\nRunning equation: \n"+number1+" - "+number2+" - "+number3 +" = ");
		//subtracting and returning answer
		return number1 - number2 - number3;
	}
	//getting the remainder of 2 integers
	private int remainderOf(int number1,int number2){
		System.out.println("\n\nTime to check the remainder of");
		//finding out what number is greater to put highest number first then returning the remainder
		if(number1 > number2){
			System.out.print(number1 + " % "+ number2 + " = ");
			return number1 % number2;
		}else{
			System.out.print(number2 + " % "+ number1 + " = ");
			return number2 % number1;
		}
	}
	//Makes long string with char, strings, integers, doubles and subtraction
	private String randomString(char letter, char specialCharacter, String word1, String word2,int number1, Double number2){
		System.out.println("\n\nThis could be your next super secure password:");
		return String.valueOf(letter)+number1+word1.toUpperCase()+(number2-number1)+word2.toLowerCase()+specialCharacter+ String.valueOf(letter).toUpperCase();
	}

}
