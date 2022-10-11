package exam06;

public class computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("2 실행");
		return 3.1415926534*r*r;
	}
}
