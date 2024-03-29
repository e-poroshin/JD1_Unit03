package htp.home.task03.main;

/*
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из 
 * пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и 
 * номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Student {

	private String name;
	private int group;
	private int[] marks;
	
	public Student(String name, int group, int[] marks) {
		this.name = name;
		this.group = group;
		this.marks = marks;
	}
		
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getGroup() {
		return group;
	}


	public void setGroup(int group) {
		this.group = group;
	}


	public int[] getMarks() {
		return marks;
	}


	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	

}
