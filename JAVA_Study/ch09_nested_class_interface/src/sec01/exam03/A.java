package sec01.exam03;
//맴버 클래스에서의 사용제한
public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B{
		void method() {
			field1 =10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	static class C{
		void method() {
			//field1 =10;// -->a 객체가 있어야만 사용할수 있음
			//method1();
			
			field2 = 10;
			method2();
		}
	}
}
