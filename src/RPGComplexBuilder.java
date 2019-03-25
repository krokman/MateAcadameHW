public class RPGComplexBuilder {
	private RPGCharacterBuilder rpgCharacterBuilder;

	public void setRPGCharacterBuilder(RPGCharacterBuilder rpgCharacterBuilder){
		this.rpgCharacterBuilder = rpgCharacterBuilder;
	}

	public RPGCharacter getRPGCharacter(){
		return rpgCharacterBuilder.getRpgCharacter();
	}

	public void constructRPGCharacter(){
		rpgCharacterBuilder.createNewRPGCharacter();
		rpgCharacterBuilder.buildRace();
		rpgCharacterBuilder.buildRPGCharacterClass();
		rpgCharacterBuilder.buildSex();
	}
}