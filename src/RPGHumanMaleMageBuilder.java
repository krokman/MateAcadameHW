public class RPGHumanMaleMageBuilder extends RPGCharacterBuilder {
	@Override
	public void buildSex() {
		rpgCharacter.setSex(true);
	}

	@Override
	public void buildRace() {
		rpgCharacter.setRace("Human");
	}

	@Override
	public void buildRPGCharacterClass() {
		rpgCharacter.setCharacterClass("Mage");
	}
}