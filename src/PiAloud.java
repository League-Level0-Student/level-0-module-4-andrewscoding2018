//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PiAloud {

	// 1. Make a main method and make sure your program can run
public static void main(String[] args) {
	String pi = "3.1415926535897932384626433832795028841971693"
			+ "9937510582097494459230781640628620899862803482534211706"
			+ "798214808651328230664709384460955058223172535940812848111745028410270193852110555964462294895493038196442881"
			+ "097566593344612847564823378678316527120190914564856692346034861045432664821339360726024914127372458700660631558817488"
			+ "152092096282925409171536436789259036001133053054882046652138414695194151160943305727036575959195309218611738193"
			+ "261179310511854807446237996274956735188575272489122793818301194912983367336244065664308602139494639522473719070217"
			+ "9860943702770539217176293176752384674818467669405132000568127145263560827785771342757789609173637178721468440901224";
String first = JOptionPane.showInputDialog("Write the first digit of Pie.");
if(first.equals("3"))
{
for(int repeat = 1; repeat < pi.length(); repeat++)
{
String next  = JOptionPane.showInputDialog("What is the next digit of Pi?");
if(next.equals(Character.toString(pi.charAt(repeat))))
		{
	JOptionPane.showMessageDialog(null, "You are right.");
		}
else
{
	JOptionPane.showMessageDialog(null, "You are wrong.");
}
}
}
else 
{
	JOptionPane.showMessageDialog(null, "Wrong.");
}
}



	// 2. Make a String variable to hold the value of Pi. You could use http://www.piday.org/million/ for the value.

	// 3. Print out some digits of Pi. The first value is "pi.charAt(0)", the second is "pi.charAt(1)"

	// 4. Print ALL the digits of of Pi (hint: use a loop)

	// 5. Use the speak() method to speak all the digits of Pi.

	// [ADVANCED]
	// *6. Get a character from the user using the getInputFromUser() method
	// *7. Compare the users' char to the next digit of Pi
	// *8. If they are correct, print out "correct". If they are not, print "incorrect" to System.err.println

	static void speak(char characterToSpeak) {
		try {
			Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}


