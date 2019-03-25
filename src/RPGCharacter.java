public class RPGCharacter {
	private String race = null;
	private String characterClass = null;
	private boolean sex = false;

	public void setSex(boolean sex){
		this.sex = sex;
	}

	public void setRace(String race){
		this.race = race;
	}

	public void setCharacterClass(String characterClass){
		this.characterClass = characterClass;
	}

	public String getRace() {
		return race;
	}

	public String getCharacterClass() {
		return characterClass;
	}

	public boolean isSex() {
		return sex;
	}
}
