public class RPGCharacter {
	private final RPGRace race;
	private final RPGClass characterClass;
	private final boolean sex;

	public RPGCharacter(RPGRace race, RPGClass characterClass, boolean sex) {
		this.race = race;
		this.characterClass = characterClass;
		this.sex = sex;
	}

	public RPGRace getRace() {
		return race;
	}

	public RPGClass getCharacterClass() {
		return characterClass;
	}

	public boolean isSex() {
		return sex;
	}

	@Override
	public String toString() {
		String sex = isSex() ? "Male" : "Female";
		return String.format("%s %s %s", getRace(), getCharacterClass(), sex);
	}
}
