public class RPGCharacterBuilder implements RPGBuilder {
	private RPGRace race;
	private RPGClass characterClass;
	private boolean sex;

	@Override
	public void isSex(boolean sex) {
		this.sex = sex;
	}

	@Override
	public void setRace(RPGRace race) {
		this.race = race;
	}

	@Override
	public void setRPGCharacterClass(RPGClass characterClass) {
		this.characterClass = characterClass;
	}

	public RPGCharacter getRPGCharacter() {
		return new RPGCharacter(race, characterClass, sex);
	}
}