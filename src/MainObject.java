public class MainObject {
	public static void main(String[] args) throws CloneNotSupportedException {
		ObjectDeepClone object = new ObjectDeepClone("Tall ", 14, new DeepClone());
		ObjectDeepClone objectClone = object.clone();
		objectClone.setName("Nick ");
		System.out.println(object.hashCode());
		System.out.println(object.toString());
		System.out.println("\n" + object.getName() + object.getAge() + "\n" + objectClone.getName() + objectClone.getAge()); //exc 1.7
	}
}