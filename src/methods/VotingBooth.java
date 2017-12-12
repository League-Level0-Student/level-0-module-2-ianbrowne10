package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	
	String age = JOptionPane.showInputDialog("What is your age? (YEARS)");
	int duck = Integer.parseInt(age);
	
	if(duck>18) {
		JOptionPane.showMessageDialog(null, "Who should the next president be?");
	}
	
	else {
		JOptionPane.showMessageDialog(null, "Sorry my friend, you are not old enough to vote.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
