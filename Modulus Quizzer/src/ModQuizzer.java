import java.util.Scanner;

public class ModQuizzer
	{

		public static void main(String[] args)
			{
			Scanner userInput =new Scanner (System.in);
			System.out.println("How many questions do you want?");
			int choice = userInput.nextInt();
			String [] questions = new String [choice];
			int countRight = 0;
			int countWrong = 0;
			for (int i = 0; i < questions.length; i++) 
				{
				Scanner userInput2 =new Scanner (System.in);
				if (i == 3)
					{
					int randomNumber4 = (int)(Math.random()*25)+1;
					int randomNumber5 = (int)(Math.random()*50)+25;
					System.out.println("What is " + (randomNumber4) + " % " + (randomNumber5) + "=");
					int guess1 = userInput2.nextInt();
					if (randomNumber4 % randomNumber5 == guess1)
					   {
						System.out.println("Correct!");
						countRight++;
					   }
				    else if (randomNumber4 % randomNumber5 != guess1)
					   {
						System.out.println("Incorrect. The correct answer was " + (randomNumber4 % randomNumber5));
						countWrong++;
					   }
					}
				else if (i == 2)
					{
					int randomNumber3 = (int)(Math.random()*25)+1;
					System.out.println("What is " + (randomNumber3) + " % " + (randomNumber3) + "=");
					int guess2 = userInput2.nextInt();
					if (randomNumber3 % randomNumber3 == guess2)
					   {
						System.out.println("Correct!");
						countRight++;
					   }
				    else if (randomNumber3 % randomNumber3 != guess2)
					   {
						System.out.println("Incorrect. The correct answer was " + (randomNumber3 % randomNumber3));
						countWrong++;
						}
					 }
				else if(i != 3 && i != 2)
					{
					int randomNumber1 = (int)(Math.random()*50)+25;
				    int randomNumber2 = (int)(Math.random()*25)+1;
				    System.out.println("What is " + (randomNumber1) + " % " + (randomNumber2) + "=");
				    int guess3 = userInput2.nextInt();
				    if (randomNumber1 % randomNumber2 == guess3)
					   {
						System.out.println("Correct!");
						countRight++;
					   }
				    else if (randomNumber1 % randomNumber2 != guess3)
					   {
						System.out.println("Incorrect. The correct answer was " + (randomNumber1 % randomNumber2));
						countWrong++;
					   }
					}
				}
			System.out.println("You got " + countRight + " questions right and " + countWrong + " wrong!");
			}

	}
