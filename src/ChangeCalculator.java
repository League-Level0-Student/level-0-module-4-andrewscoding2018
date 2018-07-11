//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.util.jar.JarOutputStream;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickels = JOptionPane.showInputDialog("How many nickels do you have?");
Double n = (5.0/100)*Double.parseDouble(nickels);


		// Ask the user how many dimes they have, and convert their answer
String quarter = JOptionPane.showInputDialog("How many quarters do you have?");
Double q = (5.0/100)*Double.parseDouble(quarter);
		// Ask the user how many quarters they have, and convert their answer
String dime = JOptionPane.showInputDialog("How many dimes do you have?");
Double d = (5.0/100)*Double.parseDouble(dime);
		// Calculate how much money the user has and save it in a double variable 
double total = n+q+d;
JOptionPane.showMessageDialog(null, "You have " + total + " cents.");
		// Tell the user how much money they have

	}
}

