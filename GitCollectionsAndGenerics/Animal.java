package Collections;

public class Animal {
	String name;
	int age;

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}

}
