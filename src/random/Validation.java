//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. OPTIONAL: Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		
		int randomNumber = new Random().nextInt(5);
		
		// 2. On paper, write all the numbers that get printed when you run this class 10 times
		
		System.out.println(randomNumber);

		// 3. Use each value of randomNumber to give the user a random compliment.

		for (int i = 0; i < 10 ; i++) {
			
			
		
		
if(randomNumber==0) {
	JOptionPane.showMessageDialog(null, "You, you are a great big goat");
}
		
else if(randomNumber==1) {
	JOptionPane.showMessageDialog(null, "You, you have an amazing finger!");
}

else if(randomNumber==2) {
	JOptionPane.showMessageDialog(null, "You, you are not going to slip on a banana peel in the next one second!");
}
else if(randomNumber==3) {
	JOptionPane.showMessageDialog(null, "You, you won't die tommorow! Do you want to know why? It's becuase you'll already be dead!");
}

else if(randomNumber==4) {
	JOptionPane.showMessageDialog(null, "You, you are a grandfather clock.");
}

else if(randomNumber==5) {
	JOptionPane.showMessageDialog(null, "You, you are not Andrew.");
}
// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	
	
	
	
	
	
	
		}
	}
}
//4 3 2 3 4 1 4 3 4 1