import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What is your name?");
String score = JOptionPane.showInputDialog("What is your test score?");
Double s = Double.parseDouble(score);
	if(name.equals("Aidan"))
	{
		JOptionPane.showMessageDialog(null, "That sucks.");
	}
	else if(s < 90.0)
	{
		JOptionPane.showMessageDialog(null, "Okay");
	}
	else
	{
		JOptionPane.showMessageDialog(null, "That sucks.");
	}
	
}
}
