package HW2;

public abstract class RPGCharacterBuilder {
	protected RPGCharacter rpgCharacter;

	public RPGCharacter getRpgCharacter(){
		return rpgCharacter;
	}

	public void createNewRPGCharacter(){
		rpgCharacter = new RPGCharacter();
	}

	public abstract void buildSex();
	public abstract void buildRace();
	public abstract void buildRPGCharacterClass();
}
