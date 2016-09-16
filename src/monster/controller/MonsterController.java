package monster.controller;

import monster.model.MarshMallowMonster;

import java.util.Scanner;

public class MonsterController
{

	private MarshMallowMonster spook;
	private Scanner keyboardInput;
	
	public MonsterController()
	{
		spook = new MarshMallowMonster("SpookThulu",
												 2,
												    4,
													 false,
													   3,
													     0
														  );
		keyboardInput = new Scanner(System.in);
	}
		
	public void start()
	
	{
		System.out.println("Here is my monster: " + spook);
		System.out.println("My monster has this many legs " + spook.getlegCount());
//		if(spook.getlegCount() < 2)
//		{
//			System.out.println("Hot dang you can't even move --- OH NOOOO!!!!");
//		}
		
//		System.out.println("As well, he has " + spook.geteyeCount() + "Eyes!");
//		System.out.println("Some people think he has a belly button, but in reality that statement is" + spook.gethasBellyButton());
//		System.out.println( "for his number of arms, it looks like he has a total of "+ spook.getarmCount());
//		System.out.println( "Finally he has "+ spook.getnoseCount() + " noses! ");
		
		System.out.println("Do you want to change my name?");
		String answer = keyboardInput.nextLine();
		
		
		if (answer.equalsIgnoreCase("yes") )
		{
			System.out.println("What do you want my new name to be?");
			String newName = keyboardInput.nextLine();
			spook.setname(newName);
		}
		else
		{
			System.out.println("I HATED YOU ANYWAYS, GO AWAY THEN RAWR");
		}
		System.out.println(spook);
	}
}