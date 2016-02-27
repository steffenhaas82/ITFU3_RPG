package classes;
public class PlayerClass
{
  private String name;
  private double[] BonusStats;
  // [0] strength
  // [1] dexterity
  // [2] Constitution
  // [3] wisdom
  // [4] inteligent
  // [5] charisma
  // [6] movement
  // [7] health (calculated)
  
  public PlayerClass()
  {
	setName("PlayerClass");
	BonusStats = new double[8];
	for(int i = 0; i < BonusStats.length; i++)
	{
	  BonusStats[i] = 0;
	}
  }
  
  public PlayerClass(Object[] input)
  {
	setName((String) input[0]);
	setStatsBonus((double[]) input[1]);	
  }
  
  public PlayerClass(Warrior input)
  {
	setName(input.getName());
	setStatsBonus(input.getStatsBonus());
  }
  
  public PlayerClass(Cleric input)
  {
	setName(input.getName());
	setStatsBonus(input.getStatsBonus());
  }
  
  public PlayerClass(Ranger input)
  {
	setName(input.getName());
	setStatsBonus(input.getStatsBonus());
  }
  
  public double[] getStatsBonus(){
	return BonusStats;
  }
  public void setStatsBonus(double[] input){
	BonusStats = input;
  }
  public String getName(){
	return name;
  }
  public void setName(String name){
	this.name = name;
  }
}
