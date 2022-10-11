package exam02;

public class KumhoTire extends Tire {
	public KumhoTire(String location,int maxRotation) {
		super(location, maxRotation);
	}
	@Override //오버라이딩을 통해 roll 재정의
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"KumhoTire 수명 : "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}
		else {
			System.out.println("***"+location+"KumhoTire 펑크 ***");
			return false;
		}
	}
}
