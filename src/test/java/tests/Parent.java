package tests;

public class Parent {
	
	public void m1() {
		System.out.println("parent method");
	}

}

class child1 extends Parent {
	
	
	public void m1() {
		System.out.println("parent method....override");
	}
	
	public void m2() {
		super.m1();
		
	}
}
