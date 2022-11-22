package sec01.exam02;

public class A {
	class B{}
	static class C {}
	
	B field1 = new B();
	C field2 = new C();
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	//static B field3 = new B(); // Class a 가 있고 B 가 존재해야함
	static C field4 = new C();// C는 정적맴버클래스 설정
	
	static void method2() {
		//B var1 = new B();-->x
		C var2 = new C();
	}
}
