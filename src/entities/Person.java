package entities;

public class Person {
	private String name;
	private int age;
	private double height;
	private boolean minor;

	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public static double average(Person person[])
	{
		int count = 0;
		double total = 0.0;
		for (int i = 0; i < person.length; i++)
		{
			total += person[i].height;
			count++;
		}
		return total / count;
	}
	
	public static double percentageMinor(Person person[])
	{
		int count = 0;
		double percentage = 0.0;
		for (int i = 0; i < person.length; i++)
		{
			if (person[i].age <= 16)
			{
				count++;
				person[i].setMinor(true);
			}
		}
		percentage = (double) count / person.length * 100;
		return percentage;
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
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isMinor() {
		return minor;
	}
	public void setMinor(boolean minor) {
		this.minor = minor;
	}
	public String toString() {
		return "name: " + name + ", age: " + age + ", height: " + height;
	}
	
}
