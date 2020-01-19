package chap4;

class Circle{
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}//source

	public int getRadius() {//읽어오기
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}	
}

class CircleManager{//연산만 수행
	public static void copy(Circle src, Circle dest) {
		dest.setRadius(src.getRadius());
	}
	public static boolean equals(Circle a, Circle b) {
		return a.getRadius() == b.getRadius();
	}
	
}

public class TestClass {

	public static void main(String[] args) {
		Circle pizza = new Circle(5);
		Circle waffle = new Circle(10);
		
		boolean res = CircleManager.equals(pizza,waffle);
		if(res == true)
			System.out.println("pizza와 waffle의 크기 같음");
		else
			System.out.println("pizza와 waffle의 크기 다름");
		
		CircleManager.copy(pizza,waffle);//반지름 복사
		res = CircleManager.equals(pizza,waffle); //반지름 비교
		if(res == true) 
			System.out.println("pizza와 waffle의 크기 같음");
		else
			System.out.println("pizza와 waffle의 크기 다름");
	}

}

