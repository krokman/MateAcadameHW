package HW2;

import java.util.*;
/*
2.2 По одной задаче на каждый из видов классов: анонимный класс, вложенный, внутренний, локальный.
 */
public class ClassesTypesExample { //exc 1.2

	public static void main(String[] args) {

		List<User> userList = Arrays.asList(
				new User("Axe ", 23),
				new User("Nick ", 25),
				new User("Alex ", 21));

		// Anonymous Inner Class
		Collections.sort(userList, new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		userList.stream().forEach(obj -> System.out.println(obj.getName() + obj.getAge() + " "));
		//Nested Inner classes
		ClassesTypesExample.NestedInner inner = new ClassesTypesExample().new NestedInner();
		inner.show();

		//Local Inner classes
		ClassesTypesExample classesTypesExample = new ClassesTypesExample();
		classesTypesExample.outerMethod();

	}

	//Nested Inner classes
	class NestedInner {
		public void show() {
			System.out.println("Method of Nested inner class");
		}
	}

	//Method of Local Inner classes
	public void outerMethod() {
		System.out.println("Outer Method");
		class LocalInner {
			public void innerMethod() {
				System.out.println("Method of local-inner class");
			}
		}
		LocalInner local = new LocalInner();
		local.innerMethod();
	}
}
