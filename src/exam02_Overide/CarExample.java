package exam02;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car(); //Car 객체 생성
		
		for (int i=1;i<=5;i++) {
			int problemLocation = car.run(); // run 매소드를 5번 실행하여 그값을 problemLocation에 저장
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 hankook 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire 교체");
				car.frontrightTire = new KumhoTire("앞왼쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 hankook 교체");
				car.backLeftTire = new HankookTire("앞왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire 교체");
				car.backrightTire = new KumhoTire("앞왼쪽", 17);
				break;
			}
			System.out.println("-==============================-");
		}
	}
}