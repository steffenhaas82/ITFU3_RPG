package character.item.armor;

import enums.Proficiency;

public class Leather extends Armor
{
  public Leather()
  {
    this.setName(this.getClass().getSimpleName());
    this.setType(this.getClass().getSimpleName());
    this.setArmorValue(11);
    this.setCat(Proficiency.LIGHT_ARMOR);
  }
  
  public Leather(String inputName, int inputArmorValue)
  {
    this();
    this.setName(inputName);
    this.setArmorValue(inputArmorValue);
  }
}
