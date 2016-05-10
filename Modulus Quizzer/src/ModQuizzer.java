import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.*;

public class ModQuizzer extends JFrame
	{
        static int choice;
        static JFrame frame = new JFrame();
		public static void main(String[] args)
			{
			Scanner userInput =new Scanner (System.in);
			int choice = Integer.parseInt(JOptionPane.showInputDialog("How many questions do you want?"));
			String [] questions = new String [choice];
			int countRight = 0;
			int countWrong = 0;
			for (int i = 0; i < questions.length; i++) 
				{
				if (i == 3)
					{
					int randomNumber4 = (int)(Math.random()*25)+1;
					int randomNumber5 = (int)(Math.random()*50)+25;
					int guess1 = Integer.parseInt(JOptionPane.showInputDialog("What is " + (randomNumber4) + " % " + (randomNumber5) + "="));
					if (randomNumber4 % randomNumber5 == guess1)
					   {
						JOptionPane.showMessageDialog(frame, "Correct");
						countRight++;
					   }
				    else if (randomNumber4 % randomNumber5 != guess1)
					   {
						JOptionPane.showMessageDialog(frame, "Incorrect. The correct answer was " + (randomNumber4 % randomNumber5));
						countWrong++;
					   }
					}
				else if (i == 2)
					{
					int randomNumber3 = (int)(Math.random()*25)+1;
					int guess2 = Integer.parseInt(JOptionPane.showInputDialog("What is " + (randomNumber3) + " % " + (randomNumber3) + "="));
					if (randomNumber3 % randomNumber3 == guess2)
					   {
						JOptionPane.showMessageDialog(frame, "Correct");
						countRight++;
					   }
				    else if (randomNumber3 % randomNumber3 != guess2)
					   {
						JOptionPane.showMessageDialog(frame, "Incorrect. The correct answer was " + (randomNumber3 % randomNumber3));
						countWrong++;
						}
					 }
				else if(i != 3 && i != 2)
					{
					int randomNumber1 = (int)(Math.random()*50)+25;
				    int randomNumber2 = (int)(Math.random()*25)+1;
				    int guess3 = Integer.parseInt(JOptionPane.showInputDialog("What is " + (randomNumber1) + " % " + (randomNumber2) + "="));
				    if (randomNumber1 % randomNumber2 == guess3)
					   {
						JOptionPane.showMessageDialog(frame, "Correct");
						countRight++;
					   }
				    else if (randomNumber1 % randomNumber2 != guess3)
					   {
						JOptionPane.showMessageDialog(frame, "Incorrect. The correct answer was " + (randomNumber1 % randomNumber2));
						countWrong++;
					   }
					}
				}
			JOptionPane.showMessageDialog(frame, "You got " + countRight + " questions right and " + countWrong + " wrong!");
			}

	}
