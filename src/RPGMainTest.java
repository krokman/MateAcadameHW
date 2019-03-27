/*
2.1 Написать паттерн Builder
 */
public class RPGMainTest {
	public static void main(String[] args) {
		RPGConstructorOfHeroes constructorOfHeroes = new RPGConstructorOfHeroes();

		RPGCharacterBuilder rpgBuilder = new RPGCharacterBuilder();

		constructorOfHeroes.constructHumanMageMale(rpgBuilder);
		RPGCharacter Stan = rpgBuilder.getRPGCharacter();

		constructorOfHeroes.constructElfRangerMale(rpgBuilder);
		RPGCharacter Hyspan = rpgBuilder.getRPGCharacter();

		System.out.println(Hyspan.toString() + " " + Stan.toString());
	}
}