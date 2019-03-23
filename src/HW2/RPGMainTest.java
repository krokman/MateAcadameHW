package HW2;
/*
2.1 Написать паттерн Builder
 */
public class RPGMainTest {

	public static void main(String[] args){
		RPGComplexBuilder rpgComplexBuilder = new RPGComplexBuilder();
		RPGHumanMaleMageBuilder rpgHumanMaleMageBuilder = new RPGHumanMaleMageBuilder();

		rpgComplexBuilder.setRPGCharacterBuilder(rpgHumanMaleMageBuilder);
		rpgComplexBuilder.constructRPGCharacter();

		RPGCharacter rpgCharacter1 = rpgComplexBuilder.getRPGCharacter();

		System.out.println(rpgCharacter1.isSex() + rpgCharacter1.getRace() + rpgCharacter1.getCharacterClass());
	}
}
