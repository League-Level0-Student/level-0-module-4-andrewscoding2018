
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday = false, isVacation = false;

		/* You MUST use the above boolean variables in your code */

		/*
		 * Ask the user for these values using a confirm dialog like the one below
		 * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head",
		 * JOptionPane.YES_NO_OPTION);
		 */

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
		 * in”.
		 */
		int something = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head",
				JOptionPane.YES_NO_OPTION);
		int vacation = JOptionPane.showConfirmDialog(null, "Is it a vacation?", "Sleepy Head",
				JOptionPane.YES_NO_CANCEL_OPTION);
		// JOptionPane.showMessageDialog(null, something);
		if (something == 0) {
			isWeekday = true;
		} else if (something == 1) {
			isWeekday = false;
		}
		if (vacation == 0) {
			isVacation = true;
		} else if (vacation == 1) {
			isVacation = false;
		}

		if (isWeekday == true && isVacation == true) {
			JOptionPane.showMessageDialog(null, "Sleep in.");
		} else if (isWeekday == true && isVacation == false) {
			JOptionPane.showMessageDialog(null, "Get up lazybones!");
		} else if (isWeekday == false && isVacation == true) {
			JOptionPane.showMessageDialog(null, "Sleep in.");
		} else {
			JOptionPane.showMessageDialog(null, "Sleep in ");
		}
	}

}
