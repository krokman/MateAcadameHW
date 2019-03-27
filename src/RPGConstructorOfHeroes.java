public class RPGConstructorOfHeroes {
	public void constructHumanMageMale(RPGBuilder rpgBuilder) {
		rpgBuilder.setRace(RPGRace.HUMAN);
		rpgBuilder.setRPGCharacterClass(RPGClass.MAGE);
		rpgBuilder.isSex(true);
	}

	public void constructOrcWarriorFemale(RPGBuilder rpgBuilder) {
		rpgBuilder.setRace(RPGRace.ORC);
		rpgBuilder.setRPGCharacterClass(RPGClass.WARRIOR);
		rpgBuilder.isSex(false);
	}

	public void constructElfRangerMale(RPGBuilder rpgBuilder) {
		rpgBuilder.setRace(RPGRace.ELF);
		rpgBuilder.setRPGCharacterClass(RPGClass.RANGER);
		rpgBuilder.isSex(true);
	}
}
