package character.classes;
import character.item.spells.SpellBook;
import enums.Proficiency;

public class PlayerClass
{
  private String name;
  private int[] BonusStats;
  private SpellBook myBook;
  private int level;
  private int hitDie;
  private Proficiency[] proficiencies;

  public PlayerClass()
  {
    this.setName("None");
    this.BonusStats = new int[8];
    for(int i = 0; i < this.BonusStats.length; i++)
    {
      this.BonusStats[i] = 0;
    }
    this.setMyBook(new SpellBook());
    this.setLevel(1);
    this.setHitDie(1);
    Proficiency[] profs = { Proficiency.NONE };
    this.setProficiencies( profs );
  }

  // ######### Getter / Setter #########
  public int[] getStatsBonus(){
    return BonusStats;
  }
  public void setStatsBonus(int[] input){
    this.BonusStats = input;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public SpellBook getMyBook() {
    return myBook;
  }
  public void setMyBook(SpellBook myBook) {
    this.myBook = myBook;
  }
  public int getLevel() {
    return level;
  }
  public void setLevel(int level) {
    this.level = level;
  }
  public int getHitDie() {
    return hitDie;
  }
  public void setHitDie(int hitDie) {
    this.hitDie = hitDie;
  }
  public Proficiency[] getProficiencies() {
    return proficiencies;
  }
  public void setProficiencies(Proficiency[] proficiencies) {
    this.proficiencies = proficiencies;
  }
}
