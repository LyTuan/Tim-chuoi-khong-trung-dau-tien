package Collector;

public class Student {
	private String name;
	private int age;
	Student(String name, int age){
		this.name = name;
		this.age  = age;
	}
	Student(){
		this.name= "noname";
		this.age = 0;
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
	
}
