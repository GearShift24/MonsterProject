package monster.controller;

import monster.model.MarshMallowMonster;

public class MonsterController
{

	private MarshMallowMonster spook;
	
	public MonsterController()
	{
		spook = new MarshMallowMonster("SpookThulu",
												 2.0,
												    4,
													 false,
													   3,
													     0
														  );
	}
		
	public void start()
	
	{
		System.out.println("Here is my monster: " + spook);
	}
}
