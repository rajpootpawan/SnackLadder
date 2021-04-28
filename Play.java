import java.util.*;
class Play
{
	public static void main(String [] args)
	{
		System.out.println("Welcome to Snake and ladder game:");
		//user 1 added position varible
		int position=0;

		//user 2 added Random function to roll the dice
		Random r=new Random();
		int dice=r.nextInt(6);
		dice=dice+1;

		//user 3 added code for the option .
		int option=r.nextInt(3);

		switch(option) {

		case 0:
			System.out.println("No play");
		break;

		case 1:
			System.out.println("Snack");
		break;

		case 2:
			System.out.println("Ladder");
		break;
		}


	}

}
