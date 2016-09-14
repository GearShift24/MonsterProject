package monster.controller;

import monster.model.MarshMallowMonster;

public class MonsterController
{

	private MarshMallowMonster spook;
	
	public MonsterController()
	{
		spook = new MarshMallowMonster("SpookThulu",
												 2,
												    4,
													 false,
													   3,
													     0
														  );
	}
		
	public void start()
	
	{
		System.out.println("Here is my monster: " + spook);
		System.out.println("My monster has this many legs " + spook.getlegCount());
		if(spook.getlegCount() < 2)
		{
			System.out.println("Hot dang you cant even move --- OH NOOOO!!!!");
		}
		
		System.out.println("As well, he has " + spook.geteyeCount() + "Eyes!");
		System.out.println("Some people think he has a belly button, but in reality that statement is" + spook.gethasBellyButton());
		System.out.println( "for his number of arms, it looks like he has a total of "+ spook.getarmCount());
		System.out.println( "Finally he has "+ spook.getnoseCount() + " noses! ");
	}
}
