public class ObjectDeepClone implements Cloneable{
	private String name;
	private int age;
	private DeepClone deepClone;

	public ObjectDeepClone(String name, int age, DeepClone deepClone){

		this.name = name;
		this.age = age;
		this.deepClone = deepClone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public ObjectDeepClone clone() throws CloneNotSupportedException{
		ObjectDeepClone cloneObj = (ObjectDeepClone) super.clone();
		cloneObj.deepClone = this.deepClone.clone();
		return cloneObj;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {
		return name + " " + age + " " + deepClone;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this){
			return true;
		}
		if(!(obj instanceof ObjectDeepClone)){
			return false;
		}
		ObjectDeepClone objectDeepClone = (ObjectDeepClone) obj;
		return (objectDeepClone.age == this.age && objectDeepClone.name == this.name && objectDeepClone.deepClone == this.deepClone);
	}
}
