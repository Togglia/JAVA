package exam06;

public class ComputerExample {
	public static void main(String[] args) {
		int r =10;
		
		Calculator calculator = new Calculator();
		System.out.println("calculator.areaCircle(r)"+calculator.areaCircle(r));
		System.out.println();
		
		computer Computer = new computer();
		System.out.println(Computer.areaCircle(r));
	}

}
