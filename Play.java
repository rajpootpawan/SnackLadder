import java.util.*;
class Play
{
	public static void main(String [] args)
	{
		System.out.println("Welcome to Snake and ladder game:");
		//user 1 added position varible
		int player1=0;
		int player2=0;
		Random r=new Random();

		while(player1<100 && player2<100 )
		{
			int option=r.nextInt(3);
			int dice=r.nextInt(6);
			dice=dice+1;
			System.out.println("Player1 is roling dice..");
			player1=ludoPlay(player1,option,dice);
			while(option==2 && player2<100)
			{
				option=r.nextInt(3);
				dice=r.nextInt(6);
				dice=dice+1;
				System.out.println("Player1 is roling dice..");
				player1=ludoPlay(player1,option,dice);

			}

			if(player1!=100)
			{
				option=r.nextInt(3);
				dice=r.nextInt(6);
				dice=dice+1;
				System.out.println("Player2 is rolling dice..");
				player2=ludoPlay(player2,option,dice);
				while(option==2 && player1<100)
				{
					option=r.nextInt(3);
					dice=r.nextInt(6);
					dice=dice+1;
					System.out.println("Player2 is roling dice..");
					player1=ludoPlay(player2,option,dice);

				}

			}

			else
				break;

		}

		if(player1==100)
			System.out.println("Hurrah!Player1 won the game..");
		else
			System.out.println("Hurrah!Player2 won the game");


	}



	//user 3 added code for the option .
	public static int ludoPlay(int position,int option,int dice)
	{

		switch(option) {

		case 0:
			System.out.println("No play");
			//user 6 added code for showing the current position
			System.out.println("current position "+position);
			return position;

		case 1:
			System.out.println("Snack");
			if(position>=dice)
				position=position-dice;
			System.out.println("current position "+position);
			return position;


		case 2:
			System.out.println("Ladder");
			//user 5 added code for exact position to be 100.
			if(position<=100-dice)
				position=position+dice;
			System.out.println("current position "+position);
			return position;
		}
		return position;

	}

}


