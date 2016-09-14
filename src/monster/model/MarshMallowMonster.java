package monster.model;

public class MarshMallowMonster
{

	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasBellyButton;
	private int armCount;
	private int noseCount;
	
	public MarshMallowMonster()
	{
		this.name = "no name here";
		this.legCount = -23242.554;
		this.eyeCount = -23424;
		this.hasBellyButton = false;
		this.armCount = -3245;
		this.noseCount = -434;
		
	}
	public MarshMallowMonster(String name, 
									   double legCount, 
									   				int eyeCount, 
									   							boolean hasBellyButton, 
									   											int armCount, 
									   														int noseCount)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasBellyButton = hasBellyButton;
		this.armCount = armCount;
		this.noseCount = noseCount;
	}
	
	/* 
	name = SpookThulu
  * 5 tentacles
  *  3 feet
  *    4 eyes
  *      2 ears
  *        1 back
  *          2 fatSlabs
 */
	
}

