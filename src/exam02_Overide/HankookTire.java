package exam02;

public class HankookTire extends Tire{
	public HankookTire(String location,int maxRotation) {
		super(location, maxRotation);
	}
	@Override //오버라이딩을 통해 roll 재정의
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"HankookTire 수명 : "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}
		else {
			System.out.println("***"+location+"HankookTire 펑크 ***");
			return false;
		}
	}
}
