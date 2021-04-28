import java.util.*;
class Play
{
	public static void main(String [] args)
	{
		System.out.println("Welcome to Snake and ladder game:");
		//user 1 added position varible
		int position=0;


		Random r=new Random();
		//user4 added the while loop to  continue the game
		while(position<100)
		{


		//user 2 added Random function to roll the dice
		int dice=r.nextInt(6);
		dice=dice+1;

		//user 3 added code for the option .
		int option=r.nextInt(3);

		switch(option) {

		case 0:
			System.out.println("No play");
			System.out.println("current position "+position);
		break;

		case 1:
			System.out.println("Snack");
			if(position>=dice)
			position=position-dice;
			System.out.println("current position "+position); 

		break;

		case 2:
			System.out.println("Ladder");
			//user 5 added code for exact position to be 100.
			if(position<=100-dice)
			position=position+dice;
			System.out.println("current position "+position);
			break;
		}
		System.out.println("current position is "+position +" player won the game");
	}

	}

}
