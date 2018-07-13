import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happyness = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		HappyPet something = new HappyPet();
		String pet = JOptionPane.showInputDialog("What type of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int repeat = 0; repeat < 10; repeat++) {
			if(happyness >50)
			{
				JOptionPane.showMessageDialog(null, "You win.");
				System.exit(0);
			}
			if (pet.equals("cat")) {
				int optiona = JOptionPane.showOptionDialog(null, "What do you want to do?", "Stuff", 0,
						JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Pet the cat", "Bathe the cat",
								"Give it a mouse", "Give it a fish", "Bring another cat", "Slap the cat" },
						null);
				something.cat(optiona);
				JOptionPane.showMessageDialog(null, happyness);
		
			}
		}
		// else if (pet.equals("dog")) {
		// int optionb = JOptionPane.showOptionDialog(null, "What do you want to do?",
		// "Stuff", 0,
		// JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Pet the dog", "Bathe
		// the dog",
		// "Give it a treat", "Play fetch", "Bring another dog", "Slap the dog" },
		// null);
		// something.dog(optionb);

	}
	// 3. Use showOptionDialog to ask the user what they want to do to make their
	// pet happy
	// (eg: cuddle, food, water, take a walk, groom, clean up poop).
	// Make sure to customize the title and question too.
	// 5. Use user input to call the appropriate method created in step 4.

	// 6. If you determine the happiness level is large enough, tell the
	// user that he loves his pet and use break; to exit for loop.
	

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	public void cat(int p) {
		if (p == 0) {
			JOptionPane.showMessageDialog(null, "purr");
			happyness += 10;
		} else if (p == 1) {
			JOptionPane.showMessageDialog(null, "The cat screeches.");
			happyness -= 10;
		} else if (p == 2) {
			JOptionPane.showMessageDialog(null, "purr");
			happyness -= 10;
		} else if (p == 3) {
			JOptionPane.showMessageDialog(null, "purr");
			happyness += 10;
		} else if (p == 4) {
			JOptionPane.showMessageDialog(null, "The cat is happy");
			happyness += 10;
		} else if (p == 5) {
			JOptionPane.showMessageDialog(null, "Screech");
			happyness -= 10;
		}

	}

}