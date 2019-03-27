/*
2.4 Создать immutable класс
 */
// make this class final, no one can extend this class
public final class ImmutableExample {
	private final String name;

	public ImmutableExample(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// no setter
	public static void main(String[] args) {
		ImmutableExample obj = new ImmutableExample("Immutable");
		System.out.println(obj.getName());
		// there is no way to update the name after the object is created.
		// obj.setName("new mkyong");
		// System.out.println(obj.getName());
	}
}