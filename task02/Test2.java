package htp.home.task02.main;

/*
 * Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор, 
 * инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
 */

public class Test2 {

	private int a;
	private int b;
	
	public Test2(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public Test2() {
		this.a = 2;
		this.b = 3;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public void print() {
		System.out.println("a = " + a + "; b = " + b);
	}
	
		
	public static void main(String[] args) {
		
		Test2 ab2 = new Test2();
		
		ab2.print();
		
		ab2.setA(5);
		ab2.setB(7);
		
		int resa = ab2.getA();
		System.out.println("a = " + resa);
		
		int resb = ab2.getB();
		System.out.println("b = " + resb);

	}

}
