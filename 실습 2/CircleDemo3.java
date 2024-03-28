package chap05;

class Circle {
	double radius;
	static int num0fCircles = 0;
	int numCircles = 0;

	public Circle(double radius) {
		this.radius = radius;
		num0fCircles++;
		numCircles++;
	}
}

public class CircleDemo3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle myCircle = new Circle(10.0);
		Circle yourCircle = new Circle(5.0);

		// print();
		System.out.println("원의 개수 : " + Circle.num0fCircles);
		System.out.println("원의 개수 : " + yourCircle.numCircles);
	}

	void print() {
		System.out.println("인스턴스 메서드입니다.");
	}

}
